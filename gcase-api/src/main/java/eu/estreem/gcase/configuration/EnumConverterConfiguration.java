package eu.estreem.gcase.configuration;

import eu.estreem.model.v1.MessageFunctionCodeset;
import org.springframework.core.convert.converter.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "eu.estreem.configuration.EnumConverterConfiguration.messageFunctionCodesetConverter")
    Converter<String, MessageFunctionCodeset> messageFunctionCodesetConverter() {
        return new Converter<String, MessageFunctionCodeset>() {
            @Override
            public MessageFunctionCodeset convert(String source) {
                return MessageFunctionCodeset.fromValue(source);
            }
        };
    }
}
