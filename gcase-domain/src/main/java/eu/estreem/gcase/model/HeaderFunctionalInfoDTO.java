package eu.estreem.gcase.model;

import eu.estreem.model.v1.MessageFunctionCodeset;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * HeaderFunctionalInfoDTO
 */
@Value
@Builder
public class HeaderFunctionalInfoDTO {

    String messageDescription;

    @NotNull
    String datetime;

    List<MessageFunctionCodeset> messageFunction = new ArrayList<>();

    @NotNull
    String vacationNumber;

    @NotNull
    String merchantCreditCreIdentification;
}
