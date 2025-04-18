package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

/**
 * AmountTypeDTO
 */
@Value
@Builder
public class AmountTypeDTO {

    BigDecimal amount;
    String currency;
}
