package eu.estreem.gcase.model;


import lombok.Builder;
import lombok.Value;

/**
 * AmountFeeDTO  pour  un frais basé sur un montant
 */
@Value
@Builder
public class AmountFeeDTO implements IRateOrAmount {

    String amountType;
    AmountTypeDTO amount;
}
