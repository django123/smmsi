package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

/**
 * StandardFeeDTO pour un frais standard
 */
@Value
@Builder
public class StandardFeeTypeDTO implements IFeeMode {

    String category = "Standard";
    IRateOrAmount rateOrAmount;
}
