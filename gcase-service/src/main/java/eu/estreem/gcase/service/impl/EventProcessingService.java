package eu.estreem.gcase.service.impl;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.mapper.GrossCreditAndSchemeFeesEventMapper;
import eu.estreem.gcase.model.SchemeDeesDetail;
import eu.estreem.gcase.model.SchemeFeeTypeDTO;
import eu.estreem.gcase.model.SchemeFeesDTO;
import eu.estreem.gcase.service.kafka.EventPublisherService;
import eu.estreem.model.v1.AmountType;
import eu.estreem.model.v1.DICOOBJETJSONSchemeFees;
import eu.estreem.model.v1.DICOOBJETJSONTransactionContext;
import eu.estreem.model.v1.SchemeFeesType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventProcessingService {

    private final GrossCreditAndSchemeFeesEventMapper mapper;
    private final EventPublisherService publisherService;

    // Cache pour stocker les événements en attente d'enrichissement
    private final Map<String, GrossCreditAndSchemeFeesEvent> pendingEvents = new ConcurrentHashMap<>();

    // Cache pour stocker les événements de traçabilité reçus
    private final Map<String, TracabilityEvent> tracabilityEvents = new ConcurrentHashMap<>();

    public void processPrecompEvent(PrecompEvent precompEvent) {
        String transactionId = precompEvent.getTransactionId();
        log.info("Processing PrecompEvent with ID: {}", transactionId);

        // Mapper l'événement précomp vers l'événement de crédit brut
        GrossCreditAndSchemeFeesEvent event = mapper.fromPrecompEvent(precompEvent);

        // Vérifier si nous avons déjà reçu l'événement de traçabilité correspondant
        String tracabilityId = precompEvent.getTracabilityEventId();
        if (tracabilityId != null && tracabilityEvents.containsKey(tracabilityId)) {
            // Enrichir l'événement avec les données de traçabilité
            enrichWithTracabilityData(event, tracabilityEvents.get(tracabilityId));

            // Publier l'événement enrichi
            publishEvent(event);
        } else {
            // Stocker l'événement en attente de l'événement de traçabilité
            pendingEvents.put(tracabilityId, event);
            log.info("Event stored in pending cache waiting for tracability data: {}", tracabilityId);
        }
    }

    public void processTracabilityEvent(TracabilityEvent tracabilityEvent) {
        String tracabilityId = tracabilityEvent.getEventId();
        log.info("Processing TracabilityEvent with ID: {}", tracabilityId);

        // Stocker l'événement de traçabilité
        tracabilityEvents.put(tracabilityId, tracabilityEvent);

        // Vérifier si nous avons un événement en attente correspondant
        if (pendingEvents.containsKey(tracabilityId)) {
            GrossCreditAndSchemeFeesEvent event = pendingEvents.get(tracabilityId);

            // Enrichir l'événement avec les données de traçabilité
            enrichWithTracabilityData(event, tracabilityEvent);

            // Publier l'événement enrichi
            publishEvent(event);

            // Supprimer l'événement du cache des événements en attente
            pendingEvents.remove(tracabilityId);
        }
    }

    private void enrichWithTracabilityData(GrossCreditAndSchemeFeesEvent event, TracabilityEvent tracabilityEvent) {
        // Enrichir l'événement avec les détails des frais schemes
        DICOOBJETJSONSchemeFees schemeFees = new DICOOBJETJSONSchemeFees();

        // Mapping du montant total des frais schemes
        AmountType totalAmount = new AmountType();
        totalAmount.setAmount(tracabilityEvent.getTotalSchemeFeesAmount());
        totalAmount.setCurrency(tracabilityEvent.getSchemeFeeCurrency());
        schemeFees.setTotalAmount(totalAmount);

        // Mapping des détails des frais schemes
        List<SchemeFeesType> schemeFeesDetails = tracabilityEvent.getSchemeFeesDetails().stream()
                .map(this::mapSchemeFeesDetail)
                .collect(Collectors.toList());

        schemeFees.setSchemeFeesDetails(schemeFeesDetails);
        event.setSchemeFees(schemeFees);

        // Ajouter l'identifiant de l'événement de traçabilité au contexte de transaction
        if (event.getTransactionContext() == null) {
            DICOOBJETJSONTransactionContext context = new DICOOBJETJSONTransactionContext();
            context.setTracabilityEventID(tracabilityEvent.getEventId());
            event.setTransactionContext(context);
        } else {
            event.getTransactionContext().setTracabilityEventID(tracabilityEvent.getEventId());
        }
    }

    private SchemeFeesType mapSchemeFeesDetail(SchemeFeeTypeDTO detail) {
        SchemeFeesType schemeFeesType = new SchemeFeesType();

        // Mapping des propriétés du détail des frais schemes
        AmountType amount = new AmountType();
        amount.setAmount(detail.getAmount().getAmount());
        amount.setCurrency(detail.getAmount().getCurrency());
        schemeFeesType.setAmount(amount);

        schemeFeesType.setRechargeable(detail.getRechargeable());
        schemeFeesType.setBillingId(detail.getBillingId());
        schemeFeesType.setSchemeFeesLabel(detail.getSchemeFeesLabel());
        schemeFeesType.setSchemeFeesGroup(detail.getSchemeFeesGroup());

        return schemeFeesType;
    }

    private void publishEvent(GrossCreditAndSchemeFeesEvent event) {
        try {
            publisherService.publishEvent(event);
            log.info("Successfully published event to SID");
        } catch (Exception e) {
            log.error("Error publishing event to SID: {}", e.getMessage(), e);
            // Implémentation d'une stratégie de retry ou stockage pour traitement ultérieur
        }
    }
}
