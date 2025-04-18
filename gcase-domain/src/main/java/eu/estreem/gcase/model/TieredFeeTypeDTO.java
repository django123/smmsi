package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

/**
 * TieredFeeDTO pour un frais par paliers
 */
@Value
@Builder
public class TieredFeeTypeDTO implements SchemeDeesDetail {

    String category = "Tiered-based";
    Integer volume;
    IRateOrAmount rateOrAmount;
    RangeDTO rangeApplied;
}
