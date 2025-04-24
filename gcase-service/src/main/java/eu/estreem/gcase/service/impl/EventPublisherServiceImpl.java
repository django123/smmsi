package eu.estreem.gcase.service.impl;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.exception.PublishingException;
import eu.estreem.gcase.service.EventPublisherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventPublisherServiceImpl implements EventPublisherService {
    private final RestTemplate restTemplate;

    @Value("${sid.api.url}")
    private String sidApiUrl;

    @Value("${sid.api.token}")
    private String sidApiToken;

    @Override
    @Retryable(value = PublishingException.class, maxAttempts = 3,
            backoff = @Backoff(delay = 1000, multiplier = 2))
    public void publishEvent(String eventId,GrossCreditAndSchemeFeesEvent event) throws PublishingException{
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(sidApiToken);
            headers.set("eventId", eventId);

            HttpEntity<GrossCreditAndSchemeFeesEvent> requestEntity = new HttpEntity<>(event, headers);

            restTemplate.postForEntity(sidApiUrl + "/event", requestEntity, Void.class);

            log.info("Successfully published event with ID: {}", eventId);
        } catch (Exception e) {
            log.error("Error publishing event to SID: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to publish event", e);
        }
    }
}
