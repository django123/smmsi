package eu.estreem.gcase.mapper;




import eu.estreem.gcase.MappingUtils;
import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;
import eu.estreem.gcase.model.*;
import eu.estreem.model.v1.*;

import java.util.List;
import java.util.stream.Collectors;


public class GrossCreditAndSchemeFeesEventMapper {

    public static GrossCreditAndSchemeFeesEvent toKafkaModel(GrossCreditAndSchemeFeesEventDTO dto){
        if (dto == null) return null;
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();

        event.setHeaderFunctionalInfo(mapHeaderFunctionalInfo(dto.getHearderFunctionalInfo()));
        event.setAcquirer(mapAcquirer(dto.getAcquirer()));
        event.setCard(mapCard(dto.getCard()));
        event.setMerchant(mapMerchant(dto.getMerchant()));
        event.setInterchange(mapInterchange(dto.getInterchange()));
        event.setTransactionContext(mapTransactionCtx(dto.getTransactionContext()));
        event.setTransactionDetails(mapTransactionDetails(dto.getTransactionDetails()));
        event.setTransactionIdentification(mapTransactionIdentification(dto.getTransactionIdentification()));
        event.setSchemeFees(mapSchemeFees(dto.getSchemeFees()));

        return event;
    }

    public static DICOOBJETJSONAcquirer mapAcquirer(AcquirerDTO dto){
        if(dto == null) return null;
        DICOOBJETJSONAcquirer acquirer = new DICOOBJETJSONAcquirer();
        acquirer.setAcquirerLeaderInstitutionId(dto.getAcquirerLeaderInstitutionId());
        acquirer.setAcquirerId(dto.getAcquirerId());
        acquirer.setCountryCode(dto.getCountryCode());
        return acquirer;
    }

    public static DICOOBJETJSONMerchant mapMerchant(MerchantDTO dto){
        if (dto == null) return null;
        DICOOBJETJSONMerchant merchant = new DICOOBJETJSONMerchant();
        merchant.setMerchantId(dto.getMerchantId());
        merchant.setMerchantName(dto.getMerchantName());
        merchant.setMerchantCategoryCode(dto.getMerchantCategoryCode());
        merchant.setCompanyRegistrationNumber(dto.getCompanyRegistrationNumber());
        merchant.setCompanyRegistrationNumberCategory(dto.getCompanyRegistrationNumberCategory());

        return merchant;
    }

    public static DICOOBJETJSONCard mapCard(CardDTO dto){
        if (dto == null) return null;
        DICOOBJETJSONCard card = new DICOOBJETJSONCard();
        card.setCardBrand(dto.getCardBrand());
        card.setCardBrandProductCode(dto.getCardBrandProductCode());
        card.setCardIssuerProductCode(dto.getCardIssuerProductCode());
        card.setCountryCode(dto.getCountryCode());
        card.setPrimaryAccountNumber(dto.getPrimaryAccountNumber());
        return card;
    }
    public static DICOOBJETJSONTransactionContext mapTransactionCtx(TransactionContextDTO dto){
        if (dto == null) return null;
        DICOOBJETJSONTransactionContext transactionContext = new DICOOBJETJSONTransactionContext();
        transactionContext.setTracabilityEventID(dto.getTracabilityEventID());
        transactionContext.setTraceabilityService(dto.getTraceabilityService());
        transactionContext.setTransactionNature(dto.getTransactionNature());
        transactionContext.setJurisdiction(dto.getJurisdiction());
        return transactionContext;
    }

    public static DICOOBJETJSONTransactionDetails mapTransactionDetails(TransactionDetailsDTO dto){
        if (dto == null) return null;
        DICOOBJETJSONTransactionDetails transactionDetails = new DICOOBJETJSONTransactionDetails();

        AmountType amountType = new AmountType();
        amountType.setAmount(MappingUtils.fromBigDecimal(dto.getTotalAmount().getAmount()));
        amountType.setCurrency(dto.getTotalAmount().getCurrency());

        transactionDetails.setCardBrandApplied(dto.getCardBrandApplied());
        transactionDetails.setEcommerceIndicator(dto.getEcommerceIndicator());
        transactionDetails.setInitialGmtDateTime(dto.getInitialGmtDateTime());
        transactionDetails.setOriginalUniqueIdentifier(dto.getOriginalUniqueIdentifier());
        transactionDetails.setSettlementDate(dto.getSettlementDate());
        transactionDetails.setTotalAmount(amountType);
        return transactionDetails;
    }

    public static DICOOBJETJSONTransactionIdentification mapTransactionIdentification(TransactionIdentificationDTO dto){
        if (dto == null) return null;
        DICOOBJETJSONTransactionIdentification transactionIdentification = new DICOOBJETJSONTransactionIdentification();
        transactionIdentification.setLocalDateTime(dto.getLocalDateTime());
        transactionIdentification.setTransactionReference(dto.getTransactionReference());
        return transactionIdentification;
    }

    public static  DICOOBJETJSONHeaderFunctionalInfo mapHeaderFunctionalInfo(HeaderFunctionalInfoDTO dto){
        if(dto == null) return null;
        DICOOBJETJSONHeaderFunctionalInfo headerFunctionalInfo = new DICOOBJETJSONHeaderFunctionalInfo();
        headerFunctionalInfo.setMessageFunction(dto.getMessageFunction());
        headerFunctionalInfo.setMessageDescription(dto.getMessageDescription());
        headerFunctionalInfo.setDatetime(dto.getDatetime());
        headerFunctionalInfo.setVacationNumber(dto.getVacationNumber());
        return headerFunctionalInfo;
    }

    public static DICOOBJETJSONInterchange mapInterchange(InterchangeDTO dto){
        if(dto == null) return null;

        DICOOBJETJSONInterchange interchange = new DICOOBJETJSONInterchange();

        AmountType amountType = new AmountType();
        amountType.setAmount(MappingUtils.fromBigDecimal(dto.getAmount().getAmount()));
        amountType.setCurrency(dto.getAmount().getCurrency());
        interchange.setAmount(amountType);

       if(dto.getAdditionalCodes() != null ){
            List<KeyValueType> keyValueTypes = dto.getAdditionalCodes().stream().map(
                    keyValueTypeDTO -> {
                        KeyValueType keyValueType = new KeyValueType();
                        keyValueType.setKey(keyValueTypeDTO.getKey());
                        keyValueType.setValue(keyValueTypeDTO.getValue());
                        return keyValueType;
                    }
            ).collect(Collectors.toList());
            interchange.setAdditionalCode(keyValueTypes.isEmpty() ? null : keyValueTypes.get(0));
        }

        interchange.setRate(dto.getRate());
        interchange.setICScode(dto.getICScode());

        return interchange;
    }

    public static DICOOBJETJSONSchemeFees mapSchemeFees(SchemeFeesDTO dto){
        if (dto == null) return null;
        DICOOBJETJSONSchemeFees schemeFees = new DICOOBJETJSONSchemeFees();

        AmountType amountType = new AmountType();
        amountType.setAmount(dto.getTotalAmount().getAmount());
        amountType.setCurrency(dto.getTotalAmount().getCurrency());
        schemeFees.setTotalAmount(amountType);

        if(dto.getSchemeFeesDetails() != null && !dto.getSchemeFeesDetails().isEmpty()){
            List<SchemeFeesType> schemeFeesTypes = dto.getSchemeFeesDetails().stream().map(
                    schemeFeeTypeDTO -> {
                        SchemeFeesType schemeFeesType = new SchemeFeesType();
                        schemeFeesType.setAmount(schemeFeeTypeDTO.getAmount());
                        schemeFeesType.setRechargeable(schemeFeeTypeDTO.getRechargeable());
                        schemeFeesType.setBillingId(schemeFeeTypeDTO.getBillingId());
                        schemeFeesType.setSchemeFeesLabel(schemeFeeTypeDTO.getSchemeFeesLabel());
                        schemeFeesType.setSchemeFeesGroup(schemeFeeTypeDTO.getSchemeFeesGroup());
                        return schemeFeesType;
                    }
            ).collect(Collectors.toList());

            // Set the first scheme fee detail if available
            if (!schemeFeesTypes.isEmpty()) {
                schemeFees.setSchemeFeesDetails(schemeFeesTypes.get(0));
            }
        }

        return schemeFees;
    }


    // Ajouter cette méthode pour mapper depuis l'événement précomp
    public GrossCreditAndSchemeFeesEvent fromPrecompEvent(PrecompEvent precompEvent) {
        if (precompEvent == null) return null;

        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();

        // Set basic transaction context with tracability event ID
        DICOOBJETJSONTransactionContext transactionContext = new DICOOBJETJSONTransactionContext();
        transactionContext.setTracabilityEventID(precompEvent.getTracabilityEventId());
        event.setTransactionContext(transactionContext);

        // Set basic header info
        DICOOBJETJSONHeaderFunctionalInfo header = new DICOOBJETJSONHeaderFunctionalInfo();
        header.setMessageDescription("PC04 Gross Cash Flow Event");
        header.setProtocolVersion("1.0");
        event.setHeaderFunctionalInfo(header);

        return event;
    }

    public static GrossCreditAndSchemeFeesEvent toEnrichedEvent(PrecompEvent precompEvent, TracabilityEvent tracabilityEvent) {
        if (precompEvent == null || tracabilityEvent == null) {
            return null;
        }

        // Create base event from precomp event
        GrossCreditAndSchemeFeesEvent event = new GrossCreditAndSchemeFeesEvent();

        // Set transaction context with tracability event ID
        DICOOBJETJSONTransactionContext transactionContext = new DICOOBJETJSONTransactionContext();
        transactionContext.setTracabilityEventID(tracabilityEvent.getEventId());
        // TraceabilityService is not set as it requires a List<TraceabilityServiceCodeset>
        event.setTransactionContext(transactionContext);

        // Set header info
        DICOOBJETJSONHeaderFunctionalInfo header = new DICOOBJETJSONHeaderFunctionalInfo();
        header.setMessageDescription("PC04 Gross Cash Flow Event");
        header.setProtocolVersion("1.0");
        event.setHeaderFunctionalInfo(header);

        // Set merchant info
        DICOOBJETJSONMerchant merchant = new DICOOBJETJSONMerchant();
        merchant.setMerchantId(tracabilityEvent.getMerchantId());
        event.setMerchant(merchant);

        // Set scheme fees from tracability event
        DICOOBJETJSONSchemeFees schemeFees = new DICOOBJETJSONSchemeFees();

        // Set total amount
        AmountType totalAmount = new AmountType();
        totalAmount.setAmount(tracabilityEvent.getTotalSchemeFeesAmount());
        totalAmount.setCurrency(tracabilityEvent.getSchemeFeeCurrency());
        schemeFees.setTotalAmount(totalAmount);

        // Set scheme fees details if available
        if (tracabilityEvent.getSchemeFeesDetails() != null && !tracabilityEvent.getSchemeFeesDetails().isEmpty()) {
            schemeFees.setSchemeFeesDetails(tracabilityEvent.getSchemeFeesDetails().get(0));
        }

        event.setSchemeFees(schemeFees);

        // Set operation IDs for linking
        DICOOBJETJSONTransactionIdentification transactionIdentification = new DICOOBJETJSONTransactionIdentification();
        transactionIdentification.setTransactionReference(tracabilityEvent.getOperationId());
        event.setTransactionIdentification(transactionIdentification);

        return event;
    }
}
