package eu.estreem.gcase.service.impl;

import eu.estreem.gcase.service.EventProcessingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CacheCleanupService {
    private final EventProcessingService eventProcessingService;

    @Value("${cache.event.expiration}")
    private long eventExpirationMinutes;

    /**
     * Nettoie les événements expirés dans le cache toutes les X minutes
     */
    @Scheduled(fixedDelayString = "${cache.event.cleanup-interval:15}000")
    public void cleanupExpiredEvents() {
        log.info("Starting cache cleanup");

        int precompEventsRemoved = eventProcessingService.cleanupPendingPrecompEvents(eventExpirationMinutes);
        int tracabilityEventsRemoved = eventProcessingService.cleanupPendingTraceabilityEvent(eventExpirationMinutes);

        log.info("Cache cleanup completed. Removed {} precomp events and {} tracability events",
                precompEventsRemoved, tracabilityEventsRemoved);
    }
}
