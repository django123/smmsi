package eu.estreem.gcase.model;

import eu.estreem.model.v1.BrandCodeset;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
 * TransactionDetailsDTO
 */
@Value
@Builder
public class TransactionDetailsDTO {

    @NotNull
    List<BrandCodeset> cardBrandApplied;

    String ecommerceIndicator;

    String initialGmtDateTime;

    String originalUniqueIdentifier;

    String settlementDate;

    AmountTypeDTO totalAmount;
}
