package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

/**
 * RegionFeeDTO pour un frais par region
 */
@Value
@Builder
public class RegionFeeTypeDTO implements SchemeDeesDetail {


    String category = "Region-based";
    IRateOrAmount rateOrAmount;
}
