package eu.estreem.gcase.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

/**
 * TransactionIdentificationDTO pour l'identification de la transaction
 */
@Value
@Builder
public class TransactionIdentificationDTO {

    @NotNull
    String localDateTime;

    @NotNull
    String transactionReference;


}
