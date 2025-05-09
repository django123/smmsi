package eu.estreem.gcase.service.impl;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;
import eu.estreem.gcase.mapper.GrossCreditAndSchemeFeesEventMapper;
import eu.estreem.model.v1.SchemeFeesType;
import junit.framework.TestCase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for EventProcessingServiceImpl.
 */
public class EventProcessingServiceImplTest extends TestCase {

    private EventProcessingServiceImpl eventProcessingService;
    private MockEventPublisherService publisherService;

    /**
     * Set up the test case
     */
    public void setUp() {
        publisherService = new MockEventPublisherService();
        eventProcessingService = new EventProcessingServiceImpl(publisherService);
    }

    /**
     * Test processing a precomp event when tracability event is already available
     */
    public void testProcessPrecompEventWithExistingTracabilityEvent() {
        // Create test events
        String tracabilityId = "TRACE123";
        String operationId = "OP123";

        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId(tracabilityId)
                .operationId(operationId)
                .build();

        List<SchemeFeesType> schemeFeesDetails = new ArrayList<>();
        SchemeFeesType schemeFeesType = new SchemeFeesType();
        schemeFeesDetails.add(schemeFeesType);

        TracabilityEvent tracabilityEvent = TracabilityEvent.builder()
                .eventId(tracabilityId)
                .totalSchemeFeesAmount("50.00")
                .schemeFeeCurrency("EUR")
                .operationId(operationId)
                .precompEventId("EVENT123")
                .merchantId("MERCH123")
                .build();

        // Store the tracability event first
        eventProcessingService.processTracabilityEvent(tracabilityEvent);

        // Reset the mock to verify only the calls from processing the precomp event
        publisherService.reset();

        // Process the precomp event
        eventProcessingService.processPrecompEvent(precompEvent);

        // Verify the publisher service was called with the correct parameters
        assertTrue("Publisher service should have been called", publisherService.wasCalled);
        assertEquals("Event ID should match", tracabilityId, publisherService.eventId);
        assertNotNull("Event should not be null", publisherService.event);
    }

    /**
     * Test processing a tracability event when precomp event is already available
     */
    public void testProcessTracabilityEventWithExistingPrecompEvent() {
        // Create test events
        String tracabilityId = "TRACE123";
        String operationId = "OP123";

        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId(tracabilityId)
                .operationId(operationId)
                .build();

        List<SchemeFeesType> schemeFeesDetails = new ArrayList<>();
        SchemeFeesType schemeFeesType = new SchemeFeesType();
        schemeFeesDetails.add(schemeFeesType);

        TracabilityEvent tracabilityEvent = TracabilityEvent.builder()
                .eventId(tracabilityId)
                .totalSchemeFeesAmount("50.00")
                .schemeFeeCurrency("EUR")
                .operationId(operationId)
                .precompEventId("EVENT123")
                .merchantId("MERCH123")
                .build();

        // Store the precomp event first
        eventProcessingService.processPrecompEvent(precompEvent);

        // Reset the mock to verify only the calls from processing the tracability event
        publisherService.reset();

        // Process the tracability event
        eventProcessingService.processTracabilityEvent(tracabilityEvent);

        // Verify the publisher service was called with the correct parameters
        assertTrue("Publisher service should have been called", publisherService.wasCalled);
        assertEquals("Event ID should match", tracabilityId, publisherService.eventId);
        assertNotNull("Event should not be null", publisherService.event);
    }

    /**
     * Test storing a precomp event when tracability event is not yet available
     */
    public void testStorePrecompEvent() {
        // Create a test precomp event
        String tracabilityId = "TRACE123";
        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId(tracabilityId)
                .operationId("OP123")
                .build();

        // Process the precomp event
        eventProcessingService.processPrecompEvent(precompEvent);

        // Verify the publisher service was not called
        assertFalse("Publisher service should not have been called", publisherService.wasCalled);

        // Now process a matching tracability event
        List<SchemeFeesType> schemeFeesDetails = new ArrayList<>();
        SchemeFeesType schemeFeesType = new SchemeFeesType();
        schemeFeesDetails.add(schemeFeesType);

        TracabilityEvent tracabilityEvent = TracabilityEvent.builder()
                .eventId(tracabilityId)
                .totalSchemeFeesAmount("50.00")
                .schemeFeeCurrency("EUR")
                .operationId("OP123")
                .precompEventId("EVENT123")
                .merchantId("MERCH123")
                .build();

        // Process the tracability event
        eventProcessingService.processTracabilityEvent(tracabilityEvent);

        // Verify the publisher service was called with the correct parameters
        assertTrue("Publisher service should have been called", publisherService.wasCalled);
        assertEquals("Event ID should match", tracabilityId, publisherService.eventId);
        assertNotNull("Event should not be null", publisherService.event);
    }

    /**
     * Test cleanup of expired events
     */
    public void testCleanupExpiredEvents() {
        // Create and store a precomp event
        String tracabilityId = "TRACE123";
        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId(tracabilityId)
                .operationId("OP123")
                .build();

        eventProcessingService.processPrecompEvent(precompEvent);

        // Verify no events are cleaned up with a long expiration time
        int cleanedUp = eventProcessingService.cleanupPendingPrecompEvents(60);
        assertEquals("No events should be cleaned up", 0, cleanedUp);

        // Verify events are cleaned up with a short expiration time
        cleanedUp = eventProcessingService.cleanupPendingPrecompEvents(0);
        assertEquals("One event should be cleaned up", 1, cleanedUp);
    }

    /**
     * Mock implementation of EventPublisherServiceImpl for testing
     */
    private static class MockEventPublisherService extends EventPublisherServiceImpl {
        boolean wasCalled = false;
        String eventId;
        GrossCreditAndSchemeFeesEvent event;

        public MockEventPublisherService() {
            super(null); // RestTemplate is not used in this mock
        }

        @Override
        public void publishEvent(String eventId, GrossCreditAndSchemeFeesEvent event) {
            this.wasCalled = true;
            this.eventId = eventId;
            this.event = event;
        }

        public void reset() {
            this.wasCalled = false;
            this.eventId = null;
            this.event = null;
        }
    }
}
