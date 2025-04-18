package eu.estreem.gcase.config;

import com.fasterxml.jackson.databind.JsonSerializable;
import eu.estreem.gcase.model.GrossCreditAndSchemeFeesEventDTO;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {


    @Bean
    public ProducerFactory<String, GrossCreditAndSchemeFeesEventDTO> producerFactory(){
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, Serializable.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializable.class);
        config.put(JsonSerializer.ADD_TYPE_INFO_HEADERS, false);

        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<String, GrossCreditAndSchemeFeesEventDTO> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }


}
