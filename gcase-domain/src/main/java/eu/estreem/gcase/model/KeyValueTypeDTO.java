package eu.estreem.gcase.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

/**
 * KeyValue pour les informations additionelles
 */
@Value
@Builder
public class KeyValueTypeDTO {
    @NotNull
    String key;

    @NotNull
    String value;
}
