package eu.estreem.gcase.integration;

import eu.estreem.gcase.controller.GrossCreditAndSchemeFeesEventController;
import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;
import eu.estreem.gcase.service.EventProcessingService;
import eu.estreem.gcase.service.EventPublisherService;
import eu.estreem.gcase.service.impl.EventProcessingServiceImpl;
import eu.estreem.model.v1.SchemeFeesType;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Integration test for the Gross Credit and Scheme Fees flow.
 */
public class GrossCreditAndSchemeFeesIntegrationTest extends TestCase {

    private GrossCreditAndSchemeFeesEventController controller;
    private EventProcessingService eventProcessingService;
    private MockEventPublisherService eventPublisherService;

    /**
     * Set up the test case
     */
    public void setUp() {
        eventPublisherService = new MockEventPublisherService();
        eventProcessingService = new EventProcessingServiceImpl(eventPublisherService);
        controller = new GrossCreditAndSchemeFeesEventController(eventPublisherService);
    }

    /**
     * Test the end-to-end flow from controller to publisher
     */
    public void testEndToEndFlow() {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";

        // Call the controller
        controller.publishGrossCashFlow(eventId, event);

        // Verify the publisher service was called with the correct parameters
        assertTrue("Publisher service should have been called", eventPublisherService.wasCalled);
        assertEquals("Event ID should match", eventId, eventPublisherService.eventId);
        assertEquals("Event should match", event, eventPublisherService.event);
    }

    /**
     * Test the flow from processing service to publisher
     */
    public void testProcessingServiceFlow() {
        // Create test events
        String tracabilityId = "TRACE123";
        String operationId = "OP123";

        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId(tracabilityId)
                .operationId(operationId)
                .build();

        TracabilityEvent tracabilityEvent = TracabilityEvent.builder()
                .eventId(tracabilityId)
                .totalSchemeFeesAmount("50.00")
                .schemeFeeCurrency("EUR")
                .operationId(operationId)
                .precompEventId("EVENT123")
                .merchantId("MERCH123")
                .build();

        // Process the events
        eventProcessingService.processPrecompEvent(precompEvent);

        // Verify the publisher service was not called yet
        assertFalse("Publisher service should not have been called yet", eventPublisherService.wasCalled);

        // Process the tracability event
        eventProcessingService.processTracabilityEvent(tracabilityEvent);

        // Verify the publisher service was called with the correct parameters
        assertTrue("Publisher service should have been called", eventPublisherService.wasCalled);
        assertEquals("Event ID should match", tracabilityId, eventPublisherService.eventId);
        assertNotNull("Event should not be null", eventPublisherService.event);
    }

    /**
     * Test error handling in the integration flow
     */
    public void testErrorHandling() {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";

        // Configure service to throw exception
        eventPublisherService.shouldThrowException = true;

        // Call the controller and expect an exception
        try {
            controller.publishGrossCashFlow(eventId, event);
            fail("Should have thrown an exception");
        } catch (Exception e) {
            // Exception should be caught and handled by the controller
            assertTrue("Exception should be a ResponseStatusException", e instanceof org.springframework.web.server.ResponseStatusException);
        }
    }

    /**
     * Mock implementation of EventPublisherServiceImpl for testing
     */
    private static class MockEventPublisherService extends eu.estreem.gcase.service.impl.EventPublisherServiceImpl {
        boolean wasCalled = false;
        String eventId;
        GrossCreditAndSchemeFeesEvent event;
        boolean shouldThrowException = false;

        public MockEventPublisherService() {
            super(null); // RestTemplate is not used in this mock
        }

        @Override
        public void publishEvent(String eventId, GrossCreditAndSchemeFeesEvent event) {
            if (shouldThrowException) {
                throw new RuntimeException("Test exception");
            }

            this.wasCalled = true;
            this.eventId = eventId;
            this.event = event;
        }
    }
}
