package eu.estreem.gcase.controller;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.model.GrossCreditAndSchemeFeesEventDTO;
import eu.estreem.gcase.service.EventPublisherService;
import junit.framework.TestCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Unit test for GrossCreditAndSchemeFeesEventController.
 */
public class GrossCreditAndSchemeFeesEventControllerTest extends TestCase {
    
    private GrossCreditAndSchemeFeesEventController controller;
    private MockEventPublisherService eventPublisherService;
    
    /**
     * Set up the test case
     */
    public void setUp() {
        eventPublisherService = new MockEventPublisherService();
        controller = new GrossCreditAndSchemeFeesEventController(eventPublisherService);
    }
    
    /**
     * Test successful event publishing
     */
    public void testPublishGrossCashFlowSuccess() {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";
        
        // Call the method under test
        controller.publishGrossCashFlow(eventId, event);
        
        // Verify the service was called with the correct parameters
        assertTrue("Service should have been called", eventPublisherService.wasCalled);
        assertEquals("Event ID should match", eventId, eventPublisherService.eventId);
        assertEquals("Event should match", event, eventPublisherService.event);
    }
    
    /**
     * Test handling of IllegalArgumentException
     */
    public void testPublishGrossCashFlowIllegalArgumentException() {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";
        
        // Configure service to throw IllegalArgumentException
        eventPublisherService.shouldThrowIllegalArgumentException = true;
        
        // Call the method under test and expect a ResponseStatusException with BAD_REQUEST
        try {
            controller.publishGrossCashFlow(eventId, event);
            fail("Should have thrown a ResponseStatusException");
        } catch (ResponseStatusException e) {
            assertEquals("Status code should be BAD_REQUEST", HttpStatus.BAD_REQUEST, e.getStatusCode());
            assertEquals("Error message should match", "Test illegal argument", e.getReason());
        }
    }
    
    /**
     * Test handling of other exceptions
     */
    public void testPublishGrossCashFlowOtherException() {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";
        
        // Configure service to throw RuntimeException
        eventPublisherService.shouldThrowRuntimeException = true;
        
        // Call the method under test and expect a ResponseStatusException with INTERNAL_SERVER_ERROR
        try {
            controller.publishGrossCashFlow(eventId, event);
            fail("Should have thrown a ResponseStatusException");
        } catch (ResponseStatusException e) {
            assertEquals("Status code should be INTERNAL_SERVER_ERROR", HttpStatus.INTERNAL_SERVER_ERROR, e.getStatusCode());
            assertEquals("Error message should match", "Failed to process event", e.getReason());
        }
    }
    
    /**
     * Mock implementation of EventPublisherService for testing
     */
    private static class MockEventPublisherService implements EventPublisherService {
        boolean wasCalled = false;
        String eventId;
        GrossCreditAndSchemeFeesEvent event;
        boolean shouldThrowIllegalArgumentException = false;
        boolean shouldThrowRuntimeException = false;
        
        @Override
        public void publishEvent(String eventId, GrossCreditAndSchemeFeesEvent event) {
            if (shouldThrowIllegalArgumentException) {
                throw new IllegalArgumentException("Test illegal argument");
            }
            if (shouldThrowRuntimeException) {
                throw new RuntimeException("Test runtime exception");
            }
            
            this.wasCalled = true;
            this.eventId = eventId;
            this.event = event;
        }
    }
}