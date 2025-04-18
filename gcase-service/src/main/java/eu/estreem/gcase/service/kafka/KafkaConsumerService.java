package eu.estreem.gcase.service.kafka;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.service.impl.EventMappingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumerService {

    private final EventMappingService eventMappingService;
    private final EventPublisherService eventPublisherService;

    @KafkaListener(topics = "${kafka.topic.precomp}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumePrecompEvent(PrecompEvent precompEvent) {
        log.info("Received PrecompEvent with ID: {}", precompEvent.getId());

        try {
            // Mapper l'événement précomp vers l'événement de crédit brut
            GrossCreditAndSchemeFeesEvent event = eventMappingService.mapPrecompToGrossCreditEvent(precompEvent);

            // Publier l'événement via l'API REST
            eventPublisherService.publishEvent(event);

            log.info("Successfully processed PrecompEvent: {}", precompEvent.getId());
        } catch (Exception e) {
            log.error("Error processing PrecompEvent: {}", e.getMessage(), e);
            // Gestion d'erreur - peut-être envoyer à une DLQ ou réessayer
        }
    }

    @KafkaListener(topics = "${kafka.topic.tracability}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeTracabilityEvent(Object tracabilityEvent) {
        // Traiter l'événement de traçabilité
        // Stocker dans un cache pour enrichir les événements de crédit brut
    }
}
