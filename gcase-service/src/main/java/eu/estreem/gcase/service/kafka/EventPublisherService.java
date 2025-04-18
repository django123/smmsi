package eu.estreem.gcase.service.kafka;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventPublisherService {
    private final RestTemplate restTemplate;

    @Value("${sid.api.url}")
    private String sidApiUrl;

    @Value("${sid.api.token}")
    private String sidApiToken;

    public void publishEvent(GrossCreditAndSchemeFeesEvent event) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(sidApiToken);

            HttpEntity<GrossCreditAndSchemeFeesEvent> requestEntity = new HttpEntity<>(event, headers);

            restTemplate.postForEntity(sidApiUrl + "/event", requestEntity, Void.class);

            log.info("Successfully published event to SID");
        } catch (Exception e) {
            log.error("Error publishing event to SID: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to publish event", e);
        }
    }
}
