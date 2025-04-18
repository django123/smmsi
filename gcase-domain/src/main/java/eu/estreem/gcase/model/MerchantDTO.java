package eu.estreem.gcase.model;

import eu.estreem.model.v1.CompanyRegistrationNumberCategoryCodeset;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * MerchantDTO
 */
@Value
@Builder
public class MerchantDTO {

    @NotNull
    String companyRegistrationNumber;

    List<CompanyRegistrationNumberCategoryCodeset> companyRegistrationNumberCategory = new ArrayList<CompanyRegistrationNumberCategoryCodeset>();

    @NotNull
    String merchantCategoryCode;

    @NotNull
    String countryCode;

    String merchantName;

    @NotNull
    String merchantId;

    List<String> iban;

    String externalId;

    String rootId;
}
