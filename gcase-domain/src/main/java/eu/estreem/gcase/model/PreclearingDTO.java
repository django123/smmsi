package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

/**
 * PreclearingDTO pour la pré-compensation
 */
@Value
@Builder
public class PreclearingDTO {

    String referenceID;
    String dateTime;
}
