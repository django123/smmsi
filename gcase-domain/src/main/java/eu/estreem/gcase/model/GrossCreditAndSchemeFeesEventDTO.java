package eu.estreem.gcase.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GrossCreditAndSchemeFeesEventDTO {

    private HeaderFunctionalInfoDTO hearderFunctionalInfo;
    private AcquirerDTO acquirer;
    private  CardDTO card;
    private InterchangeDTO interchange;
    private SchemeFeesDTO schemeFees;
    private MerchantDTO merchant;
    private TransactionContextDTO transactionContext;
    private TransactionIdentificationDTO transactionIdentification;
    private TransactionDetailsDTO transactionDetails;

}
