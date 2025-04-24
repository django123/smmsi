package eu.estreem.gcase.service.impl;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;
import eu.estreem.gcase.mapper.GrossCreditAndSchemeFeesEventMapper;
import eu.estreem.gcase.service.EventProcessingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventProcessingServiceImpl implements EventProcessingService {


    private final EventPublisherServiceImpl publisherService;

    // Cache pour stocker les événements précomp en attente d'un événement de traçabilité
    private final Map<String, TimestampedEvent<PrecompEvent>> pendingPrecompEvents = new ConcurrentHashMap<>();

    // Cache pour stocker les événements de traçabilité en attente d'un événement précomp
    private final Map<String, TimestampedEvent<TracabilityEvent>> pendingTracabilityEvents = new ConcurrentHashMap<>();


    /**
     * Traite un événement precomp
     */
    @Override
    public void processPrecompEvent(PrecompEvent precompEvent) {
        String operationId = precompEvent.getOperationId();
        String tracabilityId = precompEvent.getTracabilityEventId();
        log.info("Processing PrecompEvent for operation: {}, tracabilityId: {}", operationId, tracabilityId);

        // Vérifier si nous avons déjà reçu l'événement de traçabilité correspondant
        TracabilityEvent tracabilityEvent = pendingTracabilityEvents.get(tracabilityId).event;

        if (tracabilityEvent != null) {
            // Nous avons les deux événements, créer et publier l'événement enrichi
            processCompleteEvent(precompEvent, tracabilityEvent);

            // Nettoyer le cache
            pendingTracabilityEvents.remove(tracabilityId);
        } else {
            // Stocker l'événement précomp en attendant l'événement de traçabilité
            storePrecompEvent(tracabilityId, precompEvent);
            log.info("PrecompEvent stored waiting for TracabilityEvent. TracabilityId: {}", tracabilityId);
        }
    }

    /**
     * Traite un événement de traçabilité
     */
    @Override
    public void processTracabilityEvent(TracabilityEvent tracabilityEvent) {
        String tracabilityId = tracabilityEvent.getEventId();
        log.info("Processing TracabilityEvent with ID: {}", tracabilityId);

        // Vérifier si nous avons déjà reçu l'événement précomp correspondant
        PrecompEvent precompEvent = pendingPrecompEvents.get(tracabilityId).event;

        if (precompEvent != null) {
            // Nous avons les deux événements, créer et publier l'événement enrichi
            processCompleteEvent(precompEvent, tracabilityEvent);

            // Nettoyer le cache
            pendingPrecompEvents.remove(tracabilityId);
        } else {
            // Stocker l'événement de traçabilité en attendant l'événement précomp
            storeTracabilityEvent(tracabilityId, tracabilityEvent);
            log.info("TracabilityEvent stored waiting for PrecompEvent. TracabilityId: {}", tracabilityId);
        }
    }

    @Override
    public int cleanupPendingPrecompEvents(long eventExpirationMinutes) {
        return cleanupExpiredEvents(pendingPrecompEvents, eventExpirationMinutes);
    }

    @Override
    public int cleanupPendingTraceabilityEvent(long eventExpirationMinutes) {
        return cleanupExpiredEvents(pendingTracabilityEvents,eventExpirationMinutes);
    }

    /**
     * Traite les deux événements complets pour créer l'événement enrichi
     */
    private void processCompleteEvent(PrecompEvent precompEvent, TracabilityEvent tracabilityEvent) {
        log.info("Creating enriched event for tracabilityId: {}", tracabilityEvent.getEventId());

        try {
            // Mapper les deux événements vers l'événement enrichi
            GrossCreditAndSchemeFeesEvent event = GrossCreditAndSchemeFeesEventMapper.toEnrichedEvent(precompEvent, tracabilityEvent);

            // Publier l'événement enrichi
            publisherService.publishEvent(tracabilityEvent.getEventId(), event);

            log.info("Successfully published enriched event for tracabilityId: {}", tracabilityEvent.getEventId());
        } catch (Exception e) {
            log.error("Error creating or publishing enriched event: {}", e.getMessage(), e);
        }
    }

    // Modifier les méthodes d'ajout pour utiliser TimestampedEvent
    private void storePrecompEvent(String tracabilityId, PrecompEvent event) {
        pendingPrecompEvents.put(tracabilityId, new TimestampedEvent<>(event));
    }

    private void storeTracabilityEvent(String tracabilityId, TracabilityEvent event) {
        pendingTracabilityEvents.put(tracabilityId, new TimestampedEvent<>(event));
    }

    // Structure pour stocker les événements avec leur timestamp
    private class TimestampedEvent<T> {
        private final T event;
        private final LocalDateTime timestamp;

        public TimestampedEvent(T event) {
            this.event = event;
            this.timestamp = LocalDateTime.now();
        }

        public T getEvent() {
            return event;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public boolean isExpired(long expirationMinutes) {
            return timestamp.plusMinutes(expirationMinutes).isBefore(LocalDateTime.now());
        }
    }

    private <T> int cleanupExpiredEvents(Map<String, TimestampedEvent<T>> events, long expirationMinutes) {
        Map<String, TimestampedEvent<T>> expiredEvents = new HashMap<>();

        // Identifier les événements expirés
        events.forEach((key, value) -> {
            if (value.isExpired(expirationMinutes)) {
                expiredEvents.put(key, value);
            }
        });

        // Supprimer les événements expirés
        expiredEvents.keySet().forEach(events::remove);

        return expiredEvents.size();
    }
}
