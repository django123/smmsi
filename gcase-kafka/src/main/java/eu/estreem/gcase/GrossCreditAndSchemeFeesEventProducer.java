package eu.estreem.gcase;

import eu.estreem.gcase.constants.CustomKafkaHeaders;
import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.model.GrossCreditAndSchemeFeesEventDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GrossCreditAndSchemeFeesEventProducer {

    private final KafkaTemplate<String, GrossCreditAndSchemeFeesEventDTO> kafkaTemplate;
    private final RetryTemplate retryTemplate;

    private static final String TOPIC_NAME = "gross-credit-scheme-fees-event";

    public GrossCreditAndSchemeFeesEventProducer(KafkaTemplate<String, GrossCreditAndSchemeFeesEventDTO> kafkaTemplate,
                                                 RetryTemplate retryTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.retryTemplate = retryTemplate;
    }

    public void publish(GrossCreditAndSchemeFeesEvent event, String eventId) {
        log.info("[Kafka] Envoi de l'événement sur le topic '{}' avec eventId={}...", TOPIC_NAME, eventId);

        retryTemplate.execute(context -> {
            log.info("[Kafka] Tentative d'envoi (essai #{}) pour eventId={}", context.getRetryCount() + 1, eventId);
            kafkaTemplate.send(
                MessageBuilder.withPayload(event)
                        .setHeader(KafkaHeaders.TOPIC, TOPIC_NAME)
                        .setHeader(CustomKafkaHeaders.MESSAGE_KEY, eventId)
                        .build()
            );
            return null;
        }, context -> {
            log.error("[Kafka] Échec de publication après {} tentatives pour eventId={}", context.getRetryCount(), eventId);
            return null;
        });

        log.info("[Kafka] Publication terminée (succès ou abandon après retry) pour eventId={}", eventId);
    }
}
