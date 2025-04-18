package eu.estreem.gcase.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AcquirerDTO {
    @NotNull
    String acquirerId;
    @NotNull
    String countryCode;
    String acquirerLeaderInstitutionId;
}
