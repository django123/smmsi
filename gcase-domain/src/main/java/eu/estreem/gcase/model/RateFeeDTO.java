package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

/**
 * RateFeeDTO  pour  un frais basé sur un taux
 */
@Value
@Builder
public class RateFeeDTO implements IRateOrAmount{
    String rate;
}
