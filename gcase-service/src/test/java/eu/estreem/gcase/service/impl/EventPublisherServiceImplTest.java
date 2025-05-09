package eu.estreem.gcase.service.impl;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.exception.PublishingException;
import junit.framework.TestCase;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Unit test for EventPublisherServiceImpl.
 */
public class EventPublisherServiceImplTest extends TestCase {

    private EventPublisherServiceImpl eventPublisherService;
    private MockRestTemplate restTemplateMock;
    private String sidApiUrl;
    private String sidApiToken;

    /**
     * Set up the test case
     */
    public void setUp() {
        restTemplateMock = new MockRestTemplate();
        eventPublisherService = new EventPublisherServiceImpl(restTemplateMock);

        // Set private fields using reflection
        try {
            java.lang.reflect.Field sidApiUrlField = EventPublisherServiceImpl.class.getDeclaredField("sidApiUrl");
            sidApiUrlField.setAccessible(true);
            sidApiUrl = "http://test-api.example.com";
            sidApiUrlField.set(eventPublisherService, sidApiUrl);

            java.lang.reflect.Field sidApiTokenField = EventPublisherServiceImpl.class.getDeclaredField("sidApiToken");
            sidApiTokenField.setAccessible(true);
            sidApiToken = "test-token";
            sidApiTokenField.set(eventPublisherService, sidApiToken);
        } catch (Exception e) {
            fail("Failed to set up test: " + e.getMessage());
        }
    }

    /**
     * Test successful event publishing
     */
    public void testPublishEventSuccess() throws PublishingException {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";

        // Call the method under test
        eventPublisherService.publishEvent(eventId, event);

        // Verify the RestTemplate was called with the correct parameters
        assertTrue("RestTemplate should have been called", restTemplateMock.wasCalled);
        assertEquals("URL should match", sidApiUrl + "/event", restTemplateMock.url);

        // Verify the request entity
        HttpEntity<?> requestEntity = restTemplateMock.requestEntity;
        assertNotNull("Request entity should not be null", requestEntity);
        assertEquals("Request body should be the event", event, requestEntity.getBody());

        // Verify headers
        HttpHeaders headers = requestEntity.getHeaders();
        assertNotNull("Headers should not be null", headers);
        assertEquals("Content type should be JSON", MediaType.APPLICATION_JSON, headers.getContentType());
        assertEquals("Bearer token should match", "Bearer " + sidApiToken, headers.getFirst("Authorization"));
        assertEquals("Event ID header should match", eventId, headers.getFirst("eventId"));
    }

    /**
     * Test exception handling
     */
    public void testPublishEventException() {
        // Create a test event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();
        String eventId = "test-event-id";

        // Configure mock to throw exception
        restTemplateMock.shouldThrowException = true;

        // Call the method under test and expect an exception
        try {
            eventPublisherService.publishEvent(eventId, event);
            fail("Should have thrown an exception");
        } catch (RuntimeException e) {
            assertEquals("Failed to publish event", e.getMessage());
            assertNotNull("Exception should have a cause", e.getCause());
            assertEquals("Test exception", e.getCause().getMessage());
        }
    }

    /**
     * Mock implementation of RestTemplate for testing
     */
    private static class MockRestTemplate extends RestTemplate {
        boolean wasCalled = false;
        String url;
        HttpEntity<?> requestEntity;
        boolean shouldThrowException = false;

        @SuppressWarnings("unchecked")
        @Override
        public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType, Object... uriVariables) {
            if (shouldThrowException) {
                throw new RuntimeException("Test exception");
            }

            this.wasCalled = true;
            this.url = url;
            this.requestEntity = (HttpEntity<?>) request;

            return (ResponseEntity<T>) ResponseEntity.noContent().build();
        }
    }
}
