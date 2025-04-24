package eu.estreem.gcase.consumer;

import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;
import eu.estreem.gcase.service.EventProcessingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class EventKafkaConsumer {

    private final EventProcessingService eventProcessingService;
    @KafkaListener(
            topics = "${kafka.topic.precomp}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumePrecompEvent(PrecompEvent precompEvent) {
        log.info("Received PrecompEvent with ID: {}", precompEvent.getEventId());
        try {
            eventProcessingService.processPrecompEvent(precompEvent);
        } catch (Exception e) {
            log.error("Error processing PrecompEvent: {}", e.getMessage(), e);
        }
    }

    @KafkaListener(
            topics = "${kafka.topic.tracability}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumeTracabilityEvent(TracabilityEvent tracabilityEvent) {
        log.info("Received TracabilityEvent with ID: {}", tracabilityEvent.getEventId());
        try {
            eventProcessingService.processTracabilityEvent(tracabilityEvent);
        } catch (Exception e) {
            log.error("Error processing TracabilityEvent: {}", e.getMessage(), e);
        }
    }
}
