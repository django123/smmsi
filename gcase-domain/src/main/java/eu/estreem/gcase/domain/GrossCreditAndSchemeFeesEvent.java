package eu.estreem.gcase.domain;

import eu.estreem.model.v1.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GrossCreditAndSchemeFeesEvent implements Serializable {

    private DICOOBJETJSONHeaderFunctionalInfo headerFunctionalInfo;
    private DICOOBJETJSONAcquirer acquirer;
    private DICOOBJETJSONCard card;
    private DICOOBJETJSONInterchange interchange;
    private DICOOBJETJSONSchemeFees schemeFees;
    private DICOOBJETJSONMerchant merchant;
    private DICOOBJETJSONTransactionContext transactionContext;
    private DICOOBJETJSONTransactionIdentification transactionIdentification;
    private DICOOBJETJSONTransactionDetails transactionDetails;
}
