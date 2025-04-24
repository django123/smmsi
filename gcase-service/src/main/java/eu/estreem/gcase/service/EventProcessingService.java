package eu.estreem.gcase.service;

import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;

public interface EventProcessingService {
    void processPrecompEvent(PrecompEvent precompEvent);

    void processTracabilityEvent(TracabilityEvent tracabilityEvent);

    int cleanupPendingPrecompEvents(long eventExpirationMinutes);
    
    int cleanupPendingTraceabilityEvent(long eventExpirationMinutes);
}
