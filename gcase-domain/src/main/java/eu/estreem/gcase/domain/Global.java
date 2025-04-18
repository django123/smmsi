package eu.estreem.gcase.domain;

import eu.estreem.gcase.enums.FeeMode;
import eu.estreem.gcase.enums.FeeNature;
import eu.estreem.gcase.enums.FeeType;
import eu.estreem.gcase.model.*;
import eu.estreem.model.v1.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Global {
/*
    @Value
    @Builder
    public class AcquirerDTO {
        @NotNull
        String acquirerId;
        @NotNull
        String countryCode;
        String acquirerLeaderInstitutionId;
    }

    *//**
     * AmountFeeDTO  pour  un frais basé sur un montant
     *//*
    @Value
    @Builder
    public class AmountFeeDTO implements IRateOrAmount {

        String amountType;
        AmountTypeDTO amount;
    }

    *//**
     * AmountTypeDTO
     *//*
    @Value
    @Builder
    public class AmountTypeDTO {

        BigDecimal amount;
        String currency;
    }

    *//**
     * CardDTO
     *//*

    @Value
    @Builder
    public class CardDTO {

        @NotNull
        List<BrandCodeset> cardBrand = new ArrayList<>();

        @NotNull
        String cardBrandProductCode;

        @NotNull
        List<CardProductCodeCodeset> cardIssuerProductCode;

        @NotNull
        String countryCode;

        @NotNull
        String primaryAccountNumber;

    }


    *//**
     * HeaderFunctionalInfoDTO
     *//*
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

    *//**
     * Interface pour les différents modes de frais
     *//*
    public interface IFeeMode {
        String getCategory();
    }


    *//**
     * InterchangeDTO
     *//*
    @Value
    @Builder
    public class InterchangeDTO {

        @NotNull @Valid
        @Schema(name = "amountType", requiredMode = Schema.RequiredMode.REQUIRED)
        eu.estreem.gcase.model.AmountTypeDTO amount;

        @NotNull
        @Schema(name = "ICScode", description = "ICS interchange code (refer to ICS Interchange documentation). Examples   Visa FPI 965 (Face to Face Credit transaction)   Mastercard IRD 24 (Merchant UCAF) ", requiredMode = Schema.RequiredMode.REQUIRED)
        String ICScode;

        @NotNull
        @Pattern(regexp = "[0-9]{1,25}(\\.?[0-9]{0,13})?")
        @Schema(name = "rate", description = "Rate expressed as a decimal'", requiredMode = Schema.RequiredMode.REQUIRED)
        String rate;

        @Schema(name = "additionalCode", description = "Name / value pairs (both are literal strings) Examples   'name: 'Mastercard Account Funding Source', value:'Credit'   'name: 'Mastercard Product ID', value='MCG'   'name: 'Mastercard Business Service Arrangement (BSA)', value:'Intra-EEA 050012'   'name: 'Visa Product ID', value: '¨N'   'name: 'Visa Fee Descriptor', value: 'PREMIUM ALT'   'name: 'Visa Reimbursement Attribute', value: 'Reimbursement Attribute = 0 (standard)'' ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @Valid
        List<@Valid KeyValueTypeDTO> additionalCodes = new ArrayList<>();

    }

    *//**
     * Interface pour les taux ou montants
     *//*
    public interface IRateOrAmount {
    }

    *//**
     * KeyValue pour les informations additionelles
     *//*
    @Value
    @Builder
    public class KeyValueTypeDTO {
        @NotNull
        String key;

        @NotNull
        String value;
    }

    *//**
     * MerchantDTO
     *//*
    @Value
    @Builder
    public class MerchantDTO {

        @NotNull
        String companyRegistrationNumber;

        List<CompanyRegistrationNumberCategoryCodeset> companyRegistrationNumberCategory = new ArrayList<CompanyRegistrationNumberCategoryCodeset>();

        @NotNull
        String merchantCategoryCode;

        @NotNull
        String countryCode;

        String merchantName;

        @NotNull
        String merchantId;

        List<String> iban;

        String externalId;

        String rootId;
    }

    *//**
     * SchemeFeesDTO
     *//*
    @Value
    @Builder
    public class SchemeFeesDTO {

        @Valid
        @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @Nullable
        AmountType totalAmount;

        @Schema(name = "schemeFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @Valid
        List<SchemeFeeTypeDTO> schemeFeesDetails = new ArrayList<>();

    }

    *//**
     * SchemeFeeDTO
     *//*
    @Value
    @Builder
    public class SchemeFeeTypeDTO {
        @NotNull
        @Valid
        @Schema(name = "amountType", requiredMode = Schema.RequiredMode.REQUIRED)
        AmountType amount;

        @Schema(name="billingId",description="The billing identifier as defined by the Scheme (and which is figuring in an invoice). e.g. Visa Billing Line 3F3519500, Mastercard Billing Event 2AE49403MCC")
        String billingId;

        @NotNull
        @Schema(name = "rechargeable", description = "true = the billing fee is directly chargeable to the merchant. (e.g. for IC++ merchant, this fee is included in the SF fees, transparently). false = the billing fee is calculated but is not charged to the merchant", requiredMode = Schema.RequiredMode.REQUIRED)
        Boolean rechargeable;

        @Size(min = 4, max = 4)
        @Schema(name = "nature", description = "4 alphanumeric and special characters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @Enumerated(value = EnumType.STRING)
        @Nullable
        List<FeeNature> schemeFeesNature = new ArrayList<>();

        String schemeFeesLabel;

        @NotNull
        String schemeFeesGroup;

        String shortDescription;

        List<SchemeFeesCategoryCodeset> schemeFeesCaterory = new ArrayList<>();

        @Enumerated(value = EnumType.STRING)
        FeeType type;

        @Enumerated(value = EnumType.STRING)
        FeeMode mode;
    }

    *//**
     * TransactionContextDTO pour le contexte de la transaction
     *//*
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
    *//**
     * TransactionDetailsDTO
     *//*
    @Value
    @Builder
    public class TransactionDetailsDTO {

        @NotNull
        List<BrandCodeset> cardBrandApplied;

        String ecommerceIndicator;

        String initialGmtDateTime;

        String originalUniqueIdentifier;

        String settlementDate;

        eu.estreem.gcase.model.AmountTypeDTO totalAmount;
    }
    *//**
     * TransactionIdentificationDTO pour l'identification de la transaction
     *//*
    @Value
    @Builder
    public class TransactionIdentificationDTO {

        @NotNull
        String localDateTime;

        @NotNull
        String transactionReference;


    }
    *//**
     * StandardFeeDTO pour un frais standard
     *//*
    @Value
    @Builder
    public class StandardFeeTypeDTO implements eu.estreem.gcase.model.IFeeMode {

        String category = "Standard";
        eu.estreem.gcase.model.IRateOrAmount rateOrAmount;
    }

    *//**
     * TieredFeeDTO pour un frais par paliers
     *//*
    @Value
    @Builder
    public class TieredFeeTypeDTO implements SchemeDeesDetail {

        String category = "Tiered-based";
        Integer volume;
        eu.estreem.gcase.model.IRateOrAmount rateOrAmount;
        RangeDTO rangeApplied;
    }

    public enum AmountTypeEnum {
        FIXD("Fixed"),
        MINI("Minimum"),
        MAXI("Maximum");

        AmountTypeEnum(String s) {

        }
    }

    public enum FeeMode {

        STANDARD,
        REGION_BASED,
        TIERED_BASED
    }
    public enum FeeNature {
        OPER("Operation"),
        LNCE("Licence"),
        PROC("Processing"),
        SUBS("Subscription"),
        PNLT("Penalties"),;

        FeeNature(String operation) {
        }
    }

    public enum FeeType {

        QNTY,
        AMNT
    }

    public enum JurisdictionType {
        DOMESTIC("Domestic"),
        INTRA_EEA("Intra-EEA"),
        EEA_INTER("EEA-Inter");

        JurisdictionType(String label) {
            this.label = label;
        }

        private final String label;

    }
    public enum RegionApplied {
        ASPA,
        CNDA,
        DMST,
        EUMS,
        EUSE,
        LACA,
        EMEA,
        USAM
    }

    public enum Service {

        QUAL,
        ICCL,
        SFCL;
    }

    public enum Type {
        RATE,
        AMOUNT
    }*/
}



