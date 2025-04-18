package eu.estreem.gcase.model;

import eu.estreem.gcase.enums.Service;
import lombok.Builder;
import lombok.Value;

/**
 * TraceabilityEventDTO
 */
@Value
@Builder
public class TraceabilityEventDTO {

    Service service;
    String eventID;
}
