package eu.estreem.gcase.model;

import eu.estreem.model.v1.TraceabilityServiceCodeset;
import eu.estreem.model.v1.TransactionNatureCodeset;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * TransactionContextDTO pour le contexte de la transaction
 */
@Value
@Builder
public class TransactionContextDTO {

    @NotNull
    String tracabilityEventID;

    List<TraceabilityServiceCodeset> traceabilityService = new ArrayList<>();

    @NotNull
    List<TransactionNatureCodeset> transactionNature;

    @NotNull
    String jurisdiction;
}
