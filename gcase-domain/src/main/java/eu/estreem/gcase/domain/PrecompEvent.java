package eu.estreem.gcase.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PrecompEvent {

     String id;
     String transactionId;
}
