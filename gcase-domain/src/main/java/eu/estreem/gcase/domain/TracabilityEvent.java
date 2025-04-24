package eu.estreem.gcase.domain;

import eu.estreem.model.v1.SchemeFeesType;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class TracabilityEvent {

    String eventId;
    String totalSchemeFeesAmount;
    String schemeFeeCurrency;
    String operationId;
    String precompEventId;
    String merchantId;
    List<SchemeFeesType> schemeFeesDetails = new ArrayList<>();
}
