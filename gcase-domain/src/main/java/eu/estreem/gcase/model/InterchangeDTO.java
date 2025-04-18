package eu.estreem.gcase.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * InterchangeDTO
 */
@Value
@Builder
public class InterchangeDTO {

    @NotNull @Valid
    @Schema(name = "amountType", requiredMode = Schema.RequiredMode.REQUIRED)
    AmountTypeDTO amount;

    @NotNull
    @Schema(name = "ICScode", description = "ICS interchange code (refer to ICS Interchange documentation). Examples   Visa FPI 965 (Face to Face Credit transaction)   Mastercard IRD 24 (Merchant UCAF) ", requiredMode = Schema.RequiredMode.REQUIRED)
    String ICScode;

    @NotNull
    @Pattern(regexp = "[0-9]{1,25}(\\.?[0-9]{0,13})?")
    @Schema(name = "rate", description = "Rate expressed as a decimal'", requiredMode = Schema.RequiredMode.REQUIRED)
    String rate;

    @Schema(name = "additionalCode", description = "Name / value pairs (both are literal strings) Examples   'name: 'Mastercard Account Funding Source', value:'Credit'   'name: 'Mastercard Product ID', value='MCG'   'name: 'Mastercard Business Service Arrangement (BSA)', value:'Intra-EEA 050012'   'name: 'Visa Product ID', value: '¨N'   'name: 'Visa Fee Descriptor', value: 'PREMIUM ALT'   'name: 'Visa Reimbursement Attribute', value: 'Reimbursement Attribute = 0 (standard)'' ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @Valid
    List<@Valid KeyValueTypeDTO> additionalCodes = new ArrayList<>();

}
