package eu.estreem.gcase.model;

import eu.estreem.gcase.enums.FeeMode;
import eu.estreem.gcase.enums.FeeNature;
import eu.estreem.gcase.enums.FeeType;
import eu.estreem.model.v1.AmountType;
import eu.estreem.model.v1.SchemeFeesCategoryCodeset;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * SchemeFeeDTO
 */
@Value
@Builder
public class SchemeFeeTypeDTO {
    @NotNull
    @Valid
    @Schema(name = "amountType", requiredMode = Schema.RequiredMode.REQUIRED)
    AmountType amount;

    @Schema(name="billingId",description="The billing identifier as defined by the Scheme (and which is figuring in an invoice). e.g. Visa Billing Line 3F3519500, Mastercard Billing Event 2AE49403MCC")
    String billingId;

    @NotNull
    @Schema(name = "rechargeable", description = "true = the billing fee is directly chargeable to the merchant. (e.g. for IC++ merchant, this fee is included in the SF fees, transparently). false = the billing fee is calculated but is not charged to the merchant", requiredMode = Schema.RequiredMode.REQUIRED)
    Boolean rechargeable;

    @Size(min = 4, max = 4)
    @Schema(name = "nature", description = "4 alphanumeric and special characters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @Enumerated(value = EnumType.STRING)
    @Nullable
    List<FeeNature> schemeFeesNature = new ArrayList<>();

    String schemeFeesLabel;

    @NotNull
    String schemeFeesGroup;

    String shortDescription;

    List<SchemeFeesCategoryCodeset> schemeFeesCaterory = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    FeeType type;

    @Enumerated(value = EnumType.STRING)
    FeeMode mode;
}
