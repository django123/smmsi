package eu.estreem.gcase.model;


import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
 * Information sur les montants et flux de trésorerie
 */

@Value
@Builder
public class CashFlowAmountsDTO {

    InterchangeDTO interchange;
    List<SchemeFeesDTO> schemeFees;
    boolean rechargeable;
    double getTotalAmount(){

        // Calculer le montant en fonction des interchange du Système
        return 0.0;
    }
}
