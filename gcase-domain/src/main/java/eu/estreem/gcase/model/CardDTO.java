package eu.estreem.gcase.model;

import eu.estreem.model.v1.BrandCodeset;
import eu.estreem.model.v1.CardProductCodeCodeset;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * CardDTO
 */

@Value
@Builder
public class CardDTO {

    @NotNull
    List<BrandCodeset> cardBrand = new ArrayList<>();

    @NotNull
    String cardBrandProductCode;

    @NotNull
    List<CardProductCodeCodeset> cardIssuerProductCode;

    @NotNull
    String countryCode;

    @NotNull
    String primaryAccountNumber;

}
