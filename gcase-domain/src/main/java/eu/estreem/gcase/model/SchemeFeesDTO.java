package eu.estreem.gcase.model;

import eu.estreem.model.v1.AmountType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * SchemeFeesDTO
 */
@Value
@Builder
public class SchemeFeesDTO {

    @Valid
    @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @Nullable
    AmountType totalAmount;

    @Schema(name = "schemeFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @Valid
    List<SchemeFeeTypeDTO> schemeFeesDetails = new ArrayList<>();

}
