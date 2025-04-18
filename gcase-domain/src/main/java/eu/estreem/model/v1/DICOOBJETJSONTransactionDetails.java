
package eu.estreem.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountFromUsage",
    "accountToUsage",
    "accountUsage",
    "additionalAmount",
    "additionnalInformationForImmediateAction",
    "agreementId",
    "applicationTransactionCounter",
    "authorizedAmount",
    "billingAmount",
    "cardBrandApplied",
    "cardBrandForcingIndicator",
    "cardholderAuthenticationValue",
    "cardholderTotalAmount",
    "cardholderVerificationMethodResult",
    "cardSecurityCodeVerificationResultsOrigin",
    "cardSecurityCodeVerificationResultsText",
    "contactlessTerminalProcessingResults",
    "disputeAuditTrailTransactionEligibilityIndicator",
    "disputeTechnicalInternalId",
    "duplicateProcessedIndicator",
    "ecommerceIndicator",
    "encryptedPinBlock",
    "fileNumber",
    "immediateAction",
    "initialGmtDateTime",
    "internalPricing",
    "IssuerProprietaryData",
    "lowValueExemptionIndicator",
    "microchipProcessingResult",
    "multiplePaymentValidityDate",
    "nextAction",
    "nonrefundReason",
    "originalUniqueIdentifier",
    "preclearingTransactionNature",
    "productQuantity",
    "receivingId",
    "recoveryMode",
    "refundIndicator",
    "refundNature",
    "reversalReason",
    "saleReference",
    "schemeFeesAmount",
    "settlementDate",
    "splitPaymentNumber",
    "splitPaymentTotalNumber",
    "statusCode",
    "statusLabel",
    "storedData ",
    "terminalTransactionQualifiers",
    "tokenAuthenticationVerificationValue",
    "totalAmount",
    "vrolTransactionReference"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONTransactionDetails implements Serializable
{

    @JsonProperty("accountFromUsage")
    private List<AccountUsageCodeset> accountFromUsage = new ArrayList<AccountUsageCodeset>();
    @JsonProperty("accountToUsage")
    private List<AccountUsageCodeset> accountToUsage = new ArrayList<AccountUsageCodeset>();
    @JsonProperty("accountUsage")
    private List<AccountUsageCodeset> accountUsage = new ArrayList<AccountUsageCodeset>();
    @JsonProperty("additionalAmount")
    private AmountType additionalAmount;
    @JsonProperty("additionnalInformationForImmediateAction")
    private List<AdditionnalInformationForImmediateActionCodeset> additionnalInformationForImmediateAction = new ArrayList<AdditionnalInformationForImmediateActionCodeset>();
    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("agreementId")
    @JsonPropertyDescription("4 alphanumeric  and special characters")
    private String agreementId;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)
     * 
     */
    @JsonProperty("applicationTransactionCounter")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)")
    private String applicationTransactionCounter;
    @JsonProperty("authorizedAmount")
    private AmountType authorizedAmount;
    @JsonProperty("billingAmount")
    private AmountType billingAmount;
    @JsonProperty("cardBrandApplied")
    private List<BrandCodeset> cardBrandApplied = new ArrayList<BrandCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardBrandForcingIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean cardBrandForcingIndicator;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("cardholderAuthenticationValue")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)")
    private String cardholderAuthenticationValue;
    @JsonProperty("cardholderTotalAmount")
    private AmountType cardholderTotalAmount;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)
     * 
     */
    @JsonProperty("cardholderVerificationMethodResult")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)")
    private String cardholderVerificationMethodResult;
    @JsonProperty("cardSecurityCodeVerificationResultsOrigin")
    private List<CardSecurityCodeVerificationResultsOriginCodeset> cardSecurityCodeVerificationResultsOrigin = new ArrayList<CardSecurityCodeVerificationResultsOriginCodeset>();
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("cardSecurityCodeVerificationResultsText")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)")
    private String cardSecurityCodeVerificationResultsText;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)
     * 
     */
    @JsonProperty("contactlessTerminalProcessingResults")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)")
    private String contactlessTerminalProcessingResults;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("disputeAuditTrailTransactionEligibilityIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean disputeAuditTrailTransactionEligibilityIndicator;
    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("disputeTechnicalInternalId")
    @JsonPropertyDescription("Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.")
    private String disputeTechnicalInternalId;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("duplicateProcessedIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean duplicateProcessedIndicator;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("ecommerceIndicator")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits")
    private String ecommerceIndicator;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("encryptedPinBlock")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)")
    private String encryptedPinBlock;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 12 characters
     * 
     */
    @JsonProperty("fileNumber")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 12 characters")
    private String fileNumber;
    @JsonProperty("immediateAction")
    private List<ImmediateActionCodset> immediateAction = new ArrayList<ImmediateActionCodset>();
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("initialGmtDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String initialGmtDateTime;
    /**
     * Rate expressed as a percentage
     * 
     */
    @JsonProperty("internalPricing")
    @JsonPropertyDescription("Rate expressed as a percentage")
    private String internalPricing;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)
     * 
     */
    @JsonProperty("IssuerProprietaryData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)")
    private String issuerProprietaryData;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("lowValueExemptionIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String lowValueExemptionIndicator;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("microchipProcessingResult")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String microchipProcessingResult;
    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("multiplePaymentValidityDate")
    @JsonPropertyDescription("Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).")
    private String multiplePaymentValidityDate;
    @JsonProperty("nextAction")
    private List<NextActionCodeset> nextAction = new ArrayList<NextActionCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("nonrefundReason")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String nonrefundReason;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("originalUniqueIdentifier")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 50 characters")
    private String originalUniqueIdentifier;
    @JsonProperty("preclearingTransactionNature")
    private List<PreclearingTransactionNatureCodeset> preclearingTransactionNature = new ArrayList<PreclearingTransactionNatureCodeset>();
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("productQuantity")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String productQuantity;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("receivingId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String receivingId;
    @JsonProperty("recoveryMode")
    private List<RecoveryModeCodeset> recoveryMode = new ArrayList<RecoveryModeCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("refundIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean refundIndicator;
    @JsonProperty("refundNature")
    private List<RefundNatureCodeset> refundNature = new ArrayList<RefundNatureCodeset>();
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 5 digits
     * 
     */
    @JsonProperty("reversalReason")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 5 digits")
    private String reversalReason;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("saleReference")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String saleReference;
    @JsonProperty("schemeFeesAmount")
    private FeesType schemeFeesAmount;
    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("settlementDate")
    @JsonPropertyDescription("Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).")
    private String settlementDate;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("splitPaymentNumber")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String splitPaymentNumber;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("splitPaymentTotalNumber")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String splitPaymentTotalNumber;
    @JsonProperty("statusCode")
    private List<StatusCodeCodeset> statusCode = new ArrayList<StatusCodeCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("statusLabel")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String statusLabel;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8000 characters
     * 
     */
    @JsonProperty("storedData ")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 8000 characters")
    private String storedData;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)
     * 
     */
    @JsonProperty("terminalTransactionQualifiers")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)")
    private String terminalTransactionQualifiers;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("tokenAuthenticationVerificationValue")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)")
    private String tokenAuthenticationVerificationValue;
    @JsonProperty("totalAmount")
    private AmountType totalAmount;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("vrolTransactionReference")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.")
    private String vrolTransactionReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8835992940366259169L;

    @JsonProperty("accountFromUsage")
    public List<AccountUsageCodeset> getAccountFromUsage() {
        return accountFromUsage;
    }

    @JsonProperty("accountFromUsage")
    public void setAccountFromUsage(List<AccountUsageCodeset> accountFromUsage) {
        this.accountFromUsage = accountFromUsage;
    }

    public DICOOBJETJSONTransactionDetails withAccountFromUsage(List<AccountUsageCodeset> accountFromUsage) {
        this.accountFromUsage = accountFromUsage;
        return this;
    }

    @JsonProperty("accountToUsage")
    public List<AccountUsageCodeset> getAccountToUsage() {
        return accountToUsage;
    }

    @JsonProperty("accountToUsage")
    public void setAccountToUsage(List<AccountUsageCodeset> accountToUsage) {
        this.accountToUsage = accountToUsage;
    }

    public DICOOBJETJSONTransactionDetails withAccountToUsage(List<AccountUsageCodeset> accountToUsage) {
        this.accountToUsage = accountToUsage;
        return this;
    }

    @JsonProperty("accountUsage")
    public List<AccountUsageCodeset> getAccountUsage() {
        return accountUsage;
    }

    @JsonProperty("accountUsage")
    public void setAccountUsage(List<AccountUsageCodeset> accountUsage) {
        this.accountUsage = accountUsage;
    }

    public DICOOBJETJSONTransactionDetails withAccountUsage(List<AccountUsageCodeset> accountUsage) {
        this.accountUsage = accountUsage;
        return this;
    }

    @JsonProperty("additionalAmount")
    public AmountType getAdditionalAmount() {
        return additionalAmount;
    }

    @JsonProperty("additionalAmount")
    public void setAdditionalAmount(AmountType additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public DICOOBJETJSONTransactionDetails withAdditionalAmount(AmountType additionalAmount) {
        this.additionalAmount = additionalAmount;
        return this;
    }

    @JsonProperty("additionnalInformationForImmediateAction")
    public List<AdditionnalInformationForImmediateActionCodeset> getAdditionnalInformationForImmediateAction() {
        return additionnalInformationForImmediateAction;
    }

    @JsonProperty("additionnalInformationForImmediateAction")
    public void setAdditionnalInformationForImmediateAction(List<AdditionnalInformationForImmediateActionCodeset> additionnalInformationForImmediateAction) {
        this.additionnalInformationForImmediateAction = additionnalInformationForImmediateAction;
    }

    public DICOOBJETJSONTransactionDetails withAdditionnalInformationForImmediateAction(List<AdditionnalInformationForImmediateActionCodeset> additionnalInformationForImmediateAction) {
        this.additionnalInformationForImmediateAction = additionnalInformationForImmediateAction;
        return this;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("agreementId")
    public String getAgreementId() {
        return agreementId;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("agreementId")
    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public DICOOBJETJSONTransactionDetails withAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)
     * 
     */
    @JsonProperty("applicationTransactionCounter")
    public String getApplicationTransactionCounter() {
        return applicationTransactionCounter;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)
     * 
     */
    @JsonProperty("applicationTransactionCounter")
    public void setApplicationTransactionCounter(String applicationTransactionCounter) {
        this.applicationTransactionCounter = applicationTransactionCounter;
    }

    public DICOOBJETJSONTransactionDetails withApplicationTransactionCounter(String applicationTransactionCounter) {
        this.applicationTransactionCounter = applicationTransactionCounter;
        return this;
    }

    @JsonProperty("authorizedAmount")
    public AmountType getAuthorizedAmount() {
        return authorizedAmount;
    }

    @JsonProperty("authorizedAmount")
    public void setAuthorizedAmount(AmountType authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    public DICOOBJETJSONTransactionDetails withAuthorizedAmount(AmountType authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
        return this;
    }

    @JsonProperty("billingAmount")
    public AmountType getBillingAmount() {
        return billingAmount;
    }

    @JsonProperty("billingAmount")
    public void setBillingAmount(AmountType billingAmount) {
        this.billingAmount = billingAmount;
    }

    public DICOOBJETJSONTransactionDetails withBillingAmount(AmountType billingAmount) {
        this.billingAmount = billingAmount;
        return this;
    }

    @JsonProperty("cardBrandApplied")
    public List<BrandCodeset> getCardBrandApplied() {
        return cardBrandApplied;
    }

    @JsonProperty("cardBrandApplied")
    public void setCardBrandApplied(List<BrandCodeset> cardBrandApplied) {
        this.cardBrandApplied = cardBrandApplied;
    }

    public DICOOBJETJSONTransactionDetails withCardBrandApplied(List<BrandCodeset> cardBrandApplied) {
        this.cardBrandApplied = cardBrandApplied;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardBrandForcingIndicator")
    public Boolean getCardBrandForcingIndicator() {
        return cardBrandForcingIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardBrandForcingIndicator")
    public void setCardBrandForcingIndicator(Boolean cardBrandForcingIndicator) {
        this.cardBrandForcingIndicator = cardBrandForcingIndicator;
    }

    public DICOOBJETJSONTransactionDetails withCardBrandForcingIndicator(Boolean cardBrandForcingIndicator) {
        this.cardBrandForcingIndicator = cardBrandForcingIndicator;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("cardholderAuthenticationValue")
    public String getCardholderAuthenticationValue() {
        return cardholderAuthenticationValue;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("cardholderAuthenticationValue")
    public void setCardholderAuthenticationValue(String cardholderAuthenticationValue) {
        this.cardholderAuthenticationValue = cardholderAuthenticationValue;
    }

    public DICOOBJETJSONTransactionDetails withCardholderAuthenticationValue(String cardholderAuthenticationValue) {
        this.cardholderAuthenticationValue = cardholderAuthenticationValue;
        return this;
    }

    @JsonProperty("cardholderTotalAmount")
    public AmountType getCardholderTotalAmount() {
        return cardholderTotalAmount;
    }

    @JsonProperty("cardholderTotalAmount")
    public void setCardholderTotalAmount(AmountType cardholderTotalAmount) {
        this.cardholderTotalAmount = cardholderTotalAmount;
    }

    public DICOOBJETJSONTransactionDetails withCardholderTotalAmount(AmountType cardholderTotalAmount) {
        this.cardholderTotalAmount = cardholderTotalAmount;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)
     * 
     */
    @JsonProperty("cardholderVerificationMethodResult")
    public String getCardholderVerificationMethodResult() {
        return cardholderVerificationMethodResult;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)
     * 
     */
    @JsonProperty("cardholderVerificationMethodResult")
    public void setCardholderVerificationMethodResult(String cardholderVerificationMethodResult) {
        this.cardholderVerificationMethodResult = cardholderVerificationMethodResult;
    }

    public DICOOBJETJSONTransactionDetails withCardholderVerificationMethodResult(String cardholderVerificationMethodResult) {
        this.cardholderVerificationMethodResult = cardholderVerificationMethodResult;
        return this;
    }

    @JsonProperty("cardSecurityCodeVerificationResultsOrigin")
    public List<CardSecurityCodeVerificationResultsOriginCodeset> getCardSecurityCodeVerificationResultsOrigin() {
        return cardSecurityCodeVerificationResultsOrigin;
    }

    @JsonProperty("cardSecurityCodeVerificationResultsOrigin")
    public void setCardSecurityCodeVerificationResultsOrigin(List<CardSecurityCodeVerificationResultsOriginCodeset> cardSecurityCodeVerificationResultsOrigin) {
        this.cardSecurityCodeVerificationResultsOrigin = cardSecurityCodeVerificationResultsOrigin;
    }

    public DICOOBJETJSONTransactionDetails withCardSecurityCodeVerificationResultsOrigin(List<CardSecurityCodeVerificationResultsOriginCodeset> cardSecurityCodeVerificationResultsOrigin) {
        this.cardSecurityCodeVerificationResultsOrigin = cardSecurityCodeVerificationResultsOrigin;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("cardSecurityCodeVerificationResultsText")
    public String getCardSecurityCodeVerificationResultsText() {
        return cardSecurityCodeVerificationResultsText;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("cardSecurityCodeVerificationResultsText")
    public void setCardSecurityCodeVerificationResultsText(String cardSecurityCodeVerificationResultsText) {
        this.cardSecurityCodeVerificationResultsText = cardSecurityCodeVerificationResultsText;
    }

    public DICOOBJETJSONTransactionDetails withCardSecurityCodeVerificationResultsText(String cardSecurityCodeVerificationResultsText) {
        this.cardSecurityCodeVerificationResultsText = cardSecurityCodeVerificationResultsText;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)
     * 
     */
    @JsonProperty("contactlessTerminalProcessingResults")
    public String getContactlessTerminalProcessingResults() {
        return contactlessTerminalProcessingResults;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)
     * 
     */
    @JsonProperty("contactlessTerminalProcessingResults")
    public void setContactlessTerminalProcessingResults(String contactlessTerminalProcessingResults) {
        this.contactlessTerminalProcessingResults = contactlessTerminalProcessingResults;
    }

    public DICOOBJETJSONTransactionDetails withContactlessTerminalProcessingResults(String contactlessTerminalProcessingResults) {
        this.contactlessTerminalProcessingResults = contactlessTerminalProcessingResults;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("disputeAuditTrailTransactionEligibilityIndicator")
    public Boolean getDisputeAuditTrailTransactionEligibilityIndicator() {
        return disputeAuditTrailTransactionEligibilityIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("disputeAuditTrailTransactionEligibilityIndicator")
    public void setDisputeAuditTrailTransactionEligibilityIndicator(Boolean disputeAuditTrailTransactionEligibilityIndicator) {
        this.disputeAuditTrailTransactionEligibilityIndicator = disputeAuditTrailTransactionEligibilityIndicator;
    }

    public DICOOBJETJSONTransactionDetails withDisputeAuditTrailTransactionEligibilityIndicator(Boolean disputeAuditTrailTransactionEligibilityIndicator) {
        this.disputeAuditTrailTransactionEligibilityIndicator = disputeAuditTrailTransactionEligibilityIndicator;
        return this;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("disputeTechnicalInternalId")
    public String getDisputeTechnicalInternalId() {
        return disputeTechnicalInternalId;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("disputeTechnicalInternalId")
    public void setDisputeTechnicalInternalId(String disputeTechnicalInternalId) {
        this.disputeTechnicalInternalId = disputeTechnicalInternalId;
    }

    public DICOOBJETJSONTransactionDetails withDisputeTechnicalInternalId(String disputeTechnicalInternalId) {
        this.disputeTechnicalInternalId = disputeTechnicalInternalId;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("duplicateProcessedIndicator")
    public Boolean getDuplicateProcessedIndicator() {
        return duplicateProcessedIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("duplicateProcessedIndicator")
    public void setDuplicateProcessedIndicator(Boolean duplicateProcessedIndicator) {
        this.duplicateProcessedIndicator = duplicateProcessedIndicator;
    }

    public DICOOBJETJSONTransactionDetails withDuplicateProcessedIndicator(Boolean duplicateProcessedIndicator) {
        this.duplicateProcessedIndicator = duplicateProcessedIndicator;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("ecommerceIndicator")
    public String getEcommerceIndicator() {
        return ecommerceIndicator;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("ecommerceIndicator")
    public void setEcommerceIndicator(String ecommerceIndicator) {
        this.ecommerceIndicator = ecommerceIndicator;
    }

    public DICOOBJETJSONTransactionDetails withEcommerceIndicator(String ecommerceIndicator) {
        this.ecommerceIndicator = ecommerceIndicator;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("encryptedPinBlock")
    public String getEncryptedPinBlock() {
        return encryptedPinBlock;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("encryptedPinBlock")
    public void setEncryptedPinBlock(String encryptedPinBlock) {
        this.encryptedPinBlock = encryptedPinBlock;
    }

    public DICOOBJETJSONTransactionDetails withEncryptedPinBlock(String encryptedPinBlock) {
        this.encryptedPinBlock = encryptedPinBlock;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 12 characters
     * 
     */
    @JsonProperty("fileNumber")
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 12 characters
     * 
     */
    @JsonProperty("fileNumber")
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public DICOOBJETJSONTransactionDetails withFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
        return this;
    }

    @JsonProperty("immediateAction")
    public List<ImmediateActionCodset> getImmediateAction() {
        return immediateAction;
    }

    @JsonProperty("immediateAction")
    public void setImmediateAction(List<ImmediateActionCodset> immediateAction) {
        this.immediateAction = immediateAction;
    }

    public DICOOBJETJSONTransactionDetails withImmediateAction(List<ImmediateActionCodset> immediateAction) {
        this.immediateAction = immediateAction;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("initialGmtDateTime")
    public String getInitialGmtDateTime() {
        return initialGmtDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("initialGmtDateTime")
    public void setInitialGmtDateTime(String initialGmtDateTime) {
        this.initialGmtDateTime = initialGmtDateTime;
    }

    public DICOOBJETJSONTransactionDetails withInitialGmtDateTime(String initialGmtDateTime) {
        this.initialGmtDateTime = initialGmtDateTime;
        return this;
    }

    /**
     * Rate expressed as a percentage
     * 
     */
    @JsonProperty("internalPricing")
    public String getInternalPricing() {
        return internalPricing;
    }

    /**
     * Rate expressed as a percentage
     * 
     */
    @JsonProperty("internalPricing")
    public void setInternalPricing(String internalPricing) {
        this.internalPricing = internalPricing;
    }

    public DICOOBJETJSONTransactionDetails withInternalPricing(String internalPricing) {
        this.internalPricing = internalPricing;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)
     * 
     */
    @JsonProperty("IssuerProprietaryData")
    public String getIssuerProprietaryData() {
        return issuerProprietaryData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)
     * 
     */
    @JsonProperty("IssuerProprietaryData")
    public void setIssuerProprietaryData(String issuerProprietaryData) {
        this.issuerProprietaryData = issuerProprietaryData;
    }

    public DICOOBJETJSONTransactionDetails withIssuerProprietaryData(String issuerProprietaryData) {
        this.issuerProprietaryData = issuerProprietaryData;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("lowValueExemptionIndicator")
    public String getLowValueExemptionIndicator() {
        return lowValueExemptionIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("lowValueExemptionIndicator")
    public void setLowValueExemptionIndicator(String lowValueExemptionIndicator) {
        this.lowValueExemptionIndicator = lowValueExemptionIndicator;
    }

    public DICOOBJETJSONTransactionDetails withLowValueExemptionIndicator(String lowValueExemptionIndicator) {
        this.lowValueExemptionIndicator = lowValueExemptionIndicator;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("microchipProcessingResult")
    public String getMicrochipProcessingResult() {
        return microchipProcessingResult;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("microchipProcessingResult")
    public void setMicrochipProcessingResult(String microchipProcessingResult) {
        this.microchipProcessingResult = microchipProcessingResult;
    }

    public DICOOBJETJSONTransactionDetails withMicrochipProcessingResult(String microchipProcessingResult) {
        this.microchipProcessingResult = microchipProcessingResult;
        return this;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("multiplePaymentValidityDate")
    public String getMultiplePaymentValidityDate() {
        return multiplePaymentValidityDate;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("multiplePaymentValidityDate")
    public void setMultiplePaymentValidityDate(String multiplePaymentValidityDate) {
        this.multiplePaymentValidityDate = multiplePaymentValidityDate;
    }

    public DICOOBJETJSONTransactionDetails withMultiplePaymentValidityDate(String multiplePaymentValidityDate) {
        this.multiplePaymentValidityDate = multiplePaymentValidityDate;
        return this;
    }

    @JsonProperty("nextAction")
    public List<NextActionCodeset> getNextAction() {
        return nextAction;
    }

    @JsonProperty("nextAction")
    public void setNextAction(List<NextActionCodeset> nextAction) {
        this.nextAction = nextAction;
    }

    public DICOOBJETJSONTransactionDetails withNextAction(List<NextActionCodeset> nextAction) {
        this.nextAction = nextAction;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("nonrefundReason")
    public String getNonrefundReason() {
        return nonrefundReason;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("nonrefundReason")
    public void setNonrefundReason(String nonrefundReason) {
        this.nonrefundReason = nonrefundReason;
    }

    public DICOOBJETJSONTransactionDetails withNonrefundReason(String nonrefundReason) {
        this.nonrefundReason = nonrefundReason;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("originalUniqueIdentifier")
    public String getOriginalUniqueIdentifier() {
        return originalUniqueIdentifier;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("originalUniqueIdentifier")
    public void setOriginalUniqueIdentifier(String originalUniqueIdentifier) {
        this.originalUniqueIdentifier = originalUniqueIdentifier;
    }

    public DICOOBJETJSONTransactionDetails withOriginalUniqueIdentifier(String originalUniqueIdentifier) {
        this.originalUniqueIdentifier = originalUniqueIdentifier;
        return this;
    }

    @JsonProperty("preclearingTransactionNature")
    public List<PreclearingTransactionNatureCodeset> getPreclearingTransactionNature() {
        return preclearingTransactionNature;
    }

    @JsonProperty("preclearingTransactionNature")
    public void setPreclearingTransactionNature(List<PreclearingTransactionNatureCodeset> preclearingTransactionNature) {
        this.preclearingTransactionNature = preclearingTransactionNature;
    }

    public DICOOBJETJSONTransactionDetails withPreclearingTransactionNature(List<PreclearingTransactionNatureCodeset> preclearingTransactionNature) {
        this.preclearingTransactionNature = preclearingTransactionNature;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("productQuantity")
    public String getProductQuantity() {
        return productQuantity;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("productQuantity")
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public DICOOBJETJSONTransactionDetails withProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("receivingId")
    public String getReceivingId() {
        return receivingId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("receivingId")
    public void setReceivingId(String receivingId) {
        this.receivingId = receivingId;
    }

    public DICOOBJETJSONTransactionDetails withReceivingId(String receivingId) {
        this.receivingId = receivingId;
        return this;
    }

    @JsonProperty("recoveryMode")
    public List<RecoveryModeCodeset> getRecoveryMode() {
        return recoveryMode;
    }

    @JsonProperty("recoveryMode")
    public void setRecoveryMode(List<RecoveryModeCodeset> recoveryMode) {
        this.recoveryMode = recoveryMode;
    }

    public DICOOBJETJSONTransactionDetails withRecoveryMode(List<RecoveryModeCodeset> recoveryMode) {
        this.recoveryMode = recoveryMode;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("refundIndicator")
    public Boolean getRefundIndicator() {
        return refundIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("refundIndicator")
    public void setRefundIndicator(Boolean refundIndicator) {
        this.refundIndicator = refundIndicator;
    }

    public DICOOBJETJSONTransactionDetails withRefundIndicator(Boolean refundIndicator) {
        this.refundIndicator = refundIndicator;
        return this;
    }

    @JsonProperty("refundNature")
    public List<RefundNatureCodeset> getRefundNature() {
        return refundNature;
    }

    @JsonProperty("refundNature")
    public void setRefundNature(List<RefundNatureCodeset> refundNature) {
        this.refundNature = refundNature;
    }

    public DICOOBJETJSONTransactionDetails withRefundNature(List<RefundNatureCodeset> refundNature) {
        this.refundNature = refundNature;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 5 digits
     * 
     */
    @JsonProperty("reversalReason")
    public String getReversalReason() {
        return reversalReason;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 5 digits
     * 
     */
    @JsonProperty("reversalReason")
    public void setReversalReason(String reversalReason) {
        this.reversalReason = reversalReason;
    }

    public DICOOBJETJSONTransactionDetails withReversalReason(String reversalReason) {
        this.reversalReason = reversalReason;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("saleReference")
    public String getSaleReference() {
        return saleReference;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("saleReference")
    public void setSaleReference(String saleReference) {
        this.saleReference = saleReference;
    }

    public DICOOBJETJSONTransactionDetails withSaleReference(String saleReference) {
        this.saleReference = saleReference;
        return this;
    }

    @JsonProperty("schemeFeesAmount")
    public FeesType getSchemeFeesAmount() {
        return schemeFeesAmount;
    }

    @JsonProperty("schemeFeesAmount")
    public void setSchemeFeesAmount(FeesType schemeFeesAmount) {
        this.schemeFeesAmount = schemeFeesAmount;
    }

    public DICOOBJETJSONTransactionDetails withSchemeFeesAmount(FeesType schemeFeesAmount) {
        this.schemeFeesAmount = schemeFeesAmount;
        return this;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("settlementDate")
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("settlementDate")
    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public DICOOBJETJSONTransactionDetails withSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("splitPaymentNumber")
    public String getSplitPaymentNumber() {
        return splitPaymentNumber;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("splitPaymentNumber")
    public void setSplitPaymentNumber(String splitPaymentNumber) {
        this.splitPaymentNumber = splitPaymentNumber;
    }

    public DICOOBJETJSONTransactionDetails withSplitPaymentNumber(String splitPaymentNumber) {
        this.splitPaymentNumber = splitPaymentNumber;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("splitPaymentTotalNumber")
    public String getSplitPaymentTotalNumber() {
        return splitPaymentTotalNumber;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("splitPaymentTotalNumber")
    public void setSplitPaymentTotalNumber(String splitPaymentTotalNumber) {
        this.splitPaymentTotalNumber = splitPaymentTotalNumber;
    }

    public DICOOBJETJSONTransactionDetails withSplitPaymentTotalNumber(String splitPaymentTotalNumber) {
        this.splitPaymentTotalNumber = splitPaymentTotalNumber;
        return this;
    }

    @JsonProperty("statusCode")
    public List<StatusCodeCodeset> getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(List<StatusCodeCodeset> statusCode) {
        this.statusCode = statusCode;
    }

    public DICOOBJETJSONTransactionDetails withStatusCode(List<StatusCodeCodeset> statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("statusLabel")
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("statusLabel")
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    public DICOOBJETJSONTransactionDetails withStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8000 characters
     * 
     */
    @JsonProperty("storedData ")
    public String getStoredData() {
        return storedData;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8000 characters
     * 
     */
    @JsonProperty("storedData ")
    public void setStoredData(String storedData) {
        this.storedData = storedData;
    }

    public DICOOBJETJSONTransactionDetails withStoredData(String storedData) {
        this.storedData = storedData;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)
     * 
     */
    @JsonProperty("terminalTransactionQualifiers")
    public String getTerminalTransactionQualifiers() {
        return terminalTransactionQualifiers;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)
     * 
     */
    @JsonProperty("terminalTransactionQualifiers")
    public void setTerminalTransactionQualifiers(String terminalTransactionQualifiers) {
        this.terminalTransactionQualifiers = terminalTransactionQualifiers;
    }

    public DICOOBJETJSONTransactionDetails withTerminalTransactionQualifiers(String terminalTransactionQualifiers) {
        this.terminalTransactionQualifiers = terminalTransactionQualifiers;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("tokenAuthenticationVerificationValue")
    public String getTokenAuthenticationVerificationValue() {
        return tokenAuthenticationVerificationValue;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("tokenAuthenticationVerificationValue")
    public void setTokenAuthenticationVerificationValue(String tokenAuthenticationVerificationValue) {
        this.tokenAuthenticationVerificationValue = tokenAuthenticationVerificationValue;
    }

    public DICOOBJETJSONTransactionDetails withTokenAuthenticationVerificationValue(String tokenAuthenticationVerificationValue) {
        this.tokenAuthenticationVerificationValue = tokenAuthenticationVerificationValue;
        return this;
    }

    @JsonProperty("totalAmount")
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalAmount")
    public void setTotalAmount(AmountType totalAmount) {
        this.totalAmount = totalAmount;
    }

    public DICOOBJETJSONTransactionDetails withTotalAmount(AmountType totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("vrolTransactionReference")
    public String getVrolTransactionReference() {
        return vrolTransactionReference;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("vrolTransactionReference")
    public void setVrolTransactionReference(String vrolTransactionReference) {
        this.vrolTransactionReference = vrolTransactionReference;
    }

    public DICOOBJETJSONTransactionDetails withVrolTransactionReference(String vrolTransactionReference) {
        this.vrolTransactionReference = vrolTransactionReference;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DICOOBJETJSONTransactionDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONTransactionDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountFromUsage");
        sb.append('=');
        sb.append(((this.accountFromUsage == null)?"<null>":this.accountFromUsage));
        sb.append(',');
        sb.append("accountToUsage");
        sb.append('=');
        sb.append(((this.accountToUsage == null)?"<null>":this.accountToUsage));
        sb.append(',');
        sb.append("accountUsage");
        sb.append('=');
        sb.append(((this.accountUsage == null)?"<null>":this.accountUsage));
        sb.append(',');
        sb.append("additionalAmount");
        sb.append('=');
        sb.append(((this.additionalAmount == null)?"<null>":this.additionalAmount));
        sb.append(',');
        sb.append("additionnalInformationForImmediateAction");
        sb.append('=');
        sb.append(((this.additionnalInformationForImmediateAction == null)?"<null>":this.additionnalInformationForImmediateAction));
        sb.append(',');
        sb.append("agreementId");
        sb.append('=');
        sb.append(((this.agreementId == null)?"<null>":this.agreementId));
        sb.append(',');
        sb.append("applicationTransactionCounter");
        sb.append('=');
        sb.append(((this.applicationTransactionCounter == null)?"<null>":this.applicationTransactionCounter));
        sb.append(',');
        sb.append("authorizedAmount");
        sb.append('=');
        sb.append(((this.authorizedAmount == null)?"<null>":this.authorizedAmount));
        sb.append(',');
        sb.append("billingAmount");
        sb.append('=');
        sb.append(((this.billingAmount == null)?"<null>":this.billingAmount));
        sb.append(',');
        sb.append("cardBrandApplied");
        sb.append('=');
        sb.append(((this.cardBrandApplied == null)?"<null>":this.cardBrandApplied));
        sb.append(',');
        sb.append("cardBrandForcingIndicator");
        sb.append('=');
        sb.append(((this.cardBrandForcingIndicator == null)?"<null>":this.cardBrandForcingIndicator));
        sb.append(',');
        sb.append("cardholderAuthenticationValue");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationValue == null)?"<null>":this.cardholderAuthenticationValue));
        sb.append(',');
        sb.append("cardholderTotalAmount");
        sb.append('=');
        sb.append(((this.cardholderTotalAmount == null)?"<null>":this.cardholderTotalAmount));
        sb.append(',');
        sb.append("cardholderVerificationMethodResult");
        sb.append('=');
        sb.append(((this.cardholderVerificationMethodResult == null)?"<null>":this.cardholderVerificationMethodResult));
        sb.append(',');
        sb.append("cardSecurityCodeVerificationResultsOrigin");
        sb.append('=');
        sb.append(((this.cardSecurityCodeVerificationResultsOrigin == null)?"<null>":this.cardSecurityCodeVerificationResultsOrigin));
        sb.append(',');
        sb.append("cardSecurityCodeVerificationResultsText");
        sb.append('=');
        sb.append(((this.cardSecurityCodeVerificationResultsText == null)?"<null>":this.cardSecurityCodeVerificationResultsText));
        sb.append(',');
        sb.append("contactlessTerminalProcessingResults");
        sb.append('=');
        sb.append(((this.contactlessTerminalProcessingResults == null)?"<null>":this.contactlessTerminalProcessingResults));
        sb.append(',');
        sb.append("disputeAuditTrailTransactionEligibilityIndicator");
        sb.append('=');
        sb.append(((this.disputeAuditTrailTransactionEligibilityIndicator == null)?"<null>":this.disputeAuditTrailTransactionEligibilityIndicator));
        sb.append(',');
        sb.append("disputeTechnicalInternalId");
        sb.append('=');
        sb.append(((this.disputeTechnicalInternalId == null)?"<null>":this.disputeTechnicalInternalId));
        sb.append(',');
        sb.append("duplicateProcessedIndicator");
        sb.append('=');
        sb.append(((this.duplicateProcessedIndicator == null)?"<null>":this.duplicateProcessedIndicator));
        sb.append(',');
        sb.append("ecommerceIndicator");
        sb.append('=');
        sb.append(((this.ecommerceIndicator == null)?"<null>":this.ecommerceIndicator));
        sb.append(',');
        sb.append("encryptedPinBlock");
        sb.append('=');
        sb.append(((this.encryptedPinBlock == null)?"<null>":this.encryptedPinBlock));
        sb.append(',');
        sb.append("fileNumber");
        sb.append('=');
        sb.append(((this.fileNumber == null)?"<null>":this.fileNumber));
        sb.append(',');
        sb.append("immediateAction");
        sb.append('=');
        sb.append(((this.immediateAction == null)?"<null>":this.immediateAction));
        sb.append(',');
        sb.append("initialGmtDateTime");
        sb.append('=');
        sb.append(((this.initialGmtDateTime == null)?"<null>":this.initialGmtDateTime));
        sb.append(',');
        sb.append("internalPricing");
        sb.append('=');
        sb.append(((this.internalPricing == null)?"<null>":this.internalPricing));
        sb.append(',');
        sb.append("issuerProprietaryData");
        sb.append('=');
        sb.append(((this.issuerProprietaryData == null)?"<null>":this.issuerProprietaryData));
        sb.append(',');
        sb.append("lowValueExemptionIndicator");
        sb.append('=');
        sb.append(((this.lowValueExemptionIndicator == null)?"<null>":this.lowValueExemptionIndicator));
        sb.append(',');
        sb.append("microchipProcessingResult");
        sb.append('=');
        sb.append(((this.microchipProcessingResult == null)?"<null>":this.microchipProcessingResult));
        sb.append(',');
        sb.append("multiplePaymentValidityDate");
        sb.append('=');
        sb.append(((this.multiplePaymentValidityDate == null)?"<null>":this.multiplePaymentValidityDate));
        sb.append(',');
        sb.append("nextAction");
        sb.append('=');
        sb.append(((this.nextAction == null)?"<null>":this.nextAction));
        sb.append(',');
        sb.append("nonrefundReason");
        sb.append('=');
        sb.append(((this.nonrefundReason == null)?"<null>":this.nonrefundReason));
        sb.append(',');
        sb.append("originalUniqueIdentifier");
        sb.append('=');
        sb.append(((this.originalUniqueIdentifier == null)?"<null>":this.originalUniqueIdentifier));
        sb.append(',');
        sb.append("preclearingTransactionNature");
        sb.append('=');
        sb.append(((this.preclearingTransactionNature == null)?"<null>":this.preclearingTransactionNature));
        sb.append(',');
        sb.append("productQuantity");
        sb.append('=');
        sb.append(((this.productQuantity == null)?"<null>":this.productQuantity));
        sb.append(',');
        sb.append("receivingId");
        sb.append('=');
        sb.append(((this.receivingId == null)?"<null>":this.receivingId));
        sb.append(',');
        sb.append("recoveryMode");
        sb.append('=');
        sb.append(((this.recoveryMode == null)?"<null>":this.recoveryMode));
        sb.append(',');
        sb.append("refundIndicator");
        sb.append('=');
        sb.append(((this.refundIndicator == null)?"<null>":this.refundIndicator));
        sb.append(',');
        sb.append("refundNature");
        sb.append('=');
        sb.append(((this.refundNature == null)?"<null>":this.refundNature));
        sb.append(',');
        sb.append("reversalReason");
        sb.append('=');
        sb.append(((this.reversalReason == null)?"<null>":this.reversalReason));
        sb.append(',');
        sb.append("saleReference");
        sb.append('=');
        sb.append(((this.saleReference == null)?"<null>":this.saleReference));
        sb.append(',');
        sb.append("schemeFeesAmount");
        sb.append('=');
        sb.append(((this.schemeFeesAmount == null)?"<null>":this.schemeFeesAmount));
        sb.append(',');
        sb.append("settlementDate");
        sb.append('=');
        sb.append(((this.settlementDate == null)?"<null>":this.settlementDate));
        sb.append(',');
        sb.append("splitPaymentNumber");
        sb.append('=');
        sb.append(((this.splitPaymentNumber == null)?"<null>":this.splitPaymentNumber));
        sb.append(',');
        sb.append("splitPaymentTotalNumber");
        sb.append('=');
        sb.append(((this.splitPaymentTotalNumber == null)?"<null>":this.splitPaymentTotalNumber));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("statusLabel");
        sb.append('=');
        sb.append(((this.statusLabel == null)?"<null>":this.statusLabel));
        sb.append(',');
        sb.append("storedData");
        sb.append('=');
        sb.append(((this.storedData == null)?"<null>":this.storedData));
        sb.append(',');
        sb.append("terminalTransactionQualifiers");
        sb.append('=');
        sb.append(((this.terminalTransactionQualifiers == null)?"<null>":this.terminalTransactionQualifiers));
        sb.append(',');
        sb.append("tokenAuthenticationVerificationValue");
        sb.append('=');
        sb.append(((this.tokenAuthenticationVerificationValue == null)?"<null>":this.tokenAuthenticationVerificationValue));
        sb.append(',');
        sb.append("totalAmount");
        sb.append('=');
        sb.append(((this.totalAmount == null)?"<null>":this.totalAmount));
        sb.append(',');
        sb.append("vrolTransactionReference");
        sb.append('=');
        sb.append(((this.vrolTransactionReference == null)?"<null>":this.vrolTransactionReference));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.fileNumber == null)? 0 :this.fileNumber.hashCode()));
        result = ((result* 31)+((this.recoveryMode == null)? 0 :this.recoveryMode.hashCode()));
        result = ((result* 31)+((this.duplicateProcessedIndicator == null)? 0 :this.duplicateProcessedIndicator.hashCode()));
        result = ((result* 31)+((this.refundNature == null)? 0 :this.refundNature.hashCode()));
        result = ((result* 31)+((this.cardSecurityCodeVerificationResultsText == null)? 0 :this.cardSecurityCodeVerificationResultsText.hashCode()));
        result = ((result* 31)+((this.nextAction == null)? 0 :this.nextAction.hashCode()));
        result = ((result* 31)+((this.disputeAuditTrailTransactionEligibilityIndicator == null)? 0 :this.disputeAuditTrailTransactionEligibilityIndicator.hashCode()));
        result = ((result* 31)+((this.terminalTransactionQualifiers == null)? 0 :this.terminalTransactionQualifiers.hashCode()));
        result = ((result* 31)+((this.microchipProcessingResult == null)? 0 :this.microchipProcessingResult.hashCode()));
        result = ((result* 31)+((this.accountToUsage == null)? 0 :this.accountToUsage.hashCode()));
        result = ((result* 31)+((this.reversalReason == null)? 0 :this.reversalReason.hashCode()));
        result = ((result* 31)+((this.authorizedAmount == null)? 0 :this.authorizedAmount.hashCode()));
        result = ((result* 31)+((this.tokenAuthenticationVerificationValue == null)? 0 :this.tokenAuthenticationVerificationValue.hashCode()));
        result = ((result* 31)+((this.issuerProprietaryData == null)? 0 :this.issuerProprietaryData.hashCode()));
        result = ((result* 31)+((this.splitPaymentTotalNumber == null)? 0 :this.splitPaymentTotalNumber.hashCode()));
        result = ((result* 31)+((this.cardholderVerificationMethodResult == null)? 0 :this.cardholderVerificationMethodResult.hashCode()));
        result = ((result* 31)+((this.billingAmount == null)? 0 :this.billingAmount.hashCode()));
        result = ((result* 31)+((this.additionalAmount == null)? 0 :this.additionalAmount.hashCode()));
        result = ((result* 31)+((this.multiplePaymentValidityDate == null)? 0 :this.multiplePaymentValidityDate.hashCode()));
        result = ((result* 31)+((this.splitPaymentNumber == null)? 0 :this.splitPaymentNumber.hashCode()));
        result = ((result* 31)+((this.cardBrandForcingIndicator == null)? 0 :this.cardBrandForcingIndicator.hashCode()));
        result = ((result* 31)+((this.initialGmtDateTime == null)? 0 :this.initialGmtDateTime.hashCode()));
        result = ((result* 31)+((this.saleReference == null)? 0 :this.saleReference.hashCode()));
        result = ((result* 31)+((this.settlementDate == null)? 0 :this.settlementDate.hashCode()));
        result = ((result* 31)+((this.totalAmount == null)? 0 :this.totalAmount.hashCode()));
        result = ((result* 31)+((this.cardholderAuthenticationValue == null)? 0 :this.cardholderAuthenticationValue.hashCode()));
        result = ((result* 31)+((this.productQuantity == null)? 0 :this.productQuantity.hashCode()));
        result = ((result* 31)+((this.originalUniqueIdentifier == null)? 0 :this.originalUniqueIdentifier.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ecommerceIndicator == null)? 0 :this.ecommerceIndicator.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        result = ((result* 31)+((this.additionnalInformationForImmediateAction == null)? 0 :this.additionnalInformationForImmediateAction.hashCode()));
        result = ((result* 31)+((this.internalPricing == null)? 0 :this.internalPricing.hashCode()));
        result = ((result* 31)+((this.accountFromUsage == null)? 0 :this.accountFromUsage.hashCode()));
        result = ((result* 31)+((this.storedData == null)? 0 :this.storedData.hashCode()));
        result = ((result* 31)+((this.nonrefundReason == null)? 0 :this.nonrefundReason.hashCode()));
        result = ((result* 31)+((this.agreementId == null)? 0 :this.agreementId.hashCode()));
        result = ((result* 31)+((this.cardBrandApplied == null)? 0 :this.cardBrandApplied.hashCode()));
        result = ((result* 31)+((this.immediateAction == null)? 0 :this.immediateAction.hashCode()));
        result = ((result* 31)+((this.refundIndicator == null)? 0 :this.refundIndicator.hashCode()));
        result = ((result* 31)+((this.contactlessTerminalProcessingResults == null)? 0 :this.contactlessTerminalProcessingResults.hashCode()));
        result = ((result* 31)+((this.disputeTechnicalInternalId == null)? 0 :this.disputeTechnicalInternalId.hashCode()));
        result = ((result* 31)+((this.schemeFeesAmount == null)? 0 :this.schemeFeesAmount.hashCode()));
        result = ((result* 31)+((this.lowValueExemptionIndicator == null)? 0 :this.lowValueExemptionIndicator.hashCode()));
        result = ((result* 31)+((this.cardholderTotalAmount == null)? 0 :this.cardholderTotalAmount.hashCode()));
        result = ((result* 31)+((this.statusLabel == null)? 0 :this.statusLabel.hashCode()));
        result = ((result* 31)+((this.cardSecurityCodeVerificationResultsOrigin == null)? 0 :this.cardSecurityCodeVerificationResultsOrigin.hashCode()));
        result = ((result* 31)+((this.accountUsage == null)? 0 :this.accountUsage.hashCode()));
        result = ((result* 31)+((this.vrolTransactionReference == null)? 0 :this.vrolTransactionReference.hashCode()));
        result = ((result* 31)+((this.applicationTransactionCounter == null)? 0 :this.applicationTransactionCounter.hashCode()));
        result = ((result* 31)+((this.encryptedPinBlock == null)? 0 :this.encryptedPinBlock.hashCode()));
        result = ((result* 31)+((this.preclearingTransactionNature == null)? 0 :this.preclearingTransactionNature.hashCode()));
        result = ((result* 31)+((this.receivingId == null)? 0 :this.receivingId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONTransactionDetails) == false) {
            return false;
        }
        DICOOBJETJSONTransactionDetails rhs = ((DICOOBJETJSONTransactionDetails) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.fileNumber == rhs.fileNumber)||((this.fileNumber!= null)&&this.fileNumber.equals(rhs.fileNumber)))&&((this.recoveryMode == rhs.recoveryMode)||((this.recoveryMode!= null)&&this.recoveryMode.equals(rhs.recoveryMode))))&&((this.duplicateProcessedIndicator == rhs.duplicateProcessedIndicator)||((this.duplicateProcessedIndicator!= null)&&this.duplicateProcessedIndicator.equals(rhs.duplicateProcessedIndicator))))&&((this.refundNature == rhs.refundNature)||((this.refundNature!= null)&&this.refundNature.equals(rhs.refundNature))))&&((this.cardSecurityCodeVerificationResultsText == rhs.cardSecurityCodeVerificationResultsText)||((this.cardSecurityCodeVerificationResultsText!= null)&&this.cardSecurityCodeVerificationResultsText.equals(rhs.cardSecurityCodeVerificationResultsText))))&&((this.nextAction == rhs.nextAction)||((this.nextAction!= null)&&this.nextAction.equals(rhs.nextAction))))&&((this.disputeAuditTrailTransactionEligibilityIndicator == rhs.disputeAuditTrailTransactionEligibilityIndicator)||((this.disputeAuditTrailTransactionEligibilityIndicator!= null)&&this.disputeAuditTrailTransactionEligibilityIndicator.equals(rhs.disputeAuditTrailTransactionEligibilityIndicator))))&&((this.terminalTransactionQualifiers == rhs.terminalTransactionQualifiers)||((this.terminalTransactionQualifiers!= null)&&this.terminalTransactionQualifiers.equals(rhs.terminalTransactionQualifiers))))&&((this.microchipProcessingResult == rhs.microchipProcessingResult)||((this.microchipProcessingResult!= null)&&this.microchipProcessingResult.equals(rhs.microchipProcessingResult))))&&((this.accountToUsage == rhs.accountToUsage)||((this.accountToUsage!= null)&&this.accountToUsage.equals(rhs.accountToUsage))))&&((this.reversalReason == rhs.reversalReason)||((this.reversalReason!= null)&&this.reversalReason.equals(rhs.reversalReason))))&&((this.authorizedAmount == rhs.authorizedAmount)||((this.authorizedAmount!= null)&&this.authorizedAmount.equals(rhs.authorizedAmount))))&&((this.tokenAuthenticationVerificationValue == rhs.tokenAuthenticationVerificationValue)||((this.tokenAuthenticationVerificationValue!= null)&&this.tokenAuthenticationVerificationValue.equals(rhs.tokenAuthenticationVerificationValue))))&&((this.issuerProprietaryData == rhs.issuerProprietaryData)||((this.issuerProprietaryData!= null)&&this.issuerProprietaryData.equals(rhs.issuerProprietaryData))))&&((this.splitPaymentTotalNumber == rhs.splitPaymentTotalNumber)||((this.splitPaymentTotalNumber!= null)&&this.splitPaymentTotalNumber.equals(rhs.splitPaymentTotalNumber))))&&((this.cardholderVerificationMethodResult == rhs.cardholderVerificationMethodResult)||((this.cardholderVerificationMethodResult!= null)&&this.cardholderVerificationMethodResult.equals(rhs.cardholderVerificationMethodResult))))&&((this.billingAmount == rhs.billingAmount)||((this.billingAmount!= null)&&this.billingAmount.equals(rhs.billingAmount))))&&((this.additionalAmount == rhs.additionalAmount)||((this.additionalAmount!= null)&&this.additionalAmount.equals(rhs.additionalAmount))))&&((this.multiplePaymentValidityDate == rhs.multiplePaymentValidityDate)||((this.multiplePaymentValidityDate!= null)&&this.multiplePaymentValidityDate.equals(rhs.multiplePaymentValidityDate))))&&((this.splitPaymentNumber == rhs.splitPaymentNumber)||((this.splitPaymentNumber!= null)&&this.splitPaymentNumber.equals(rhs.splitPaymentNumber))))&&((this.cardBrandForcingIndicator == rhs.cardBrandForcingIndicator)||((this.cardBrandForcingIndicator!= null)&&this.cardBrandForcingIndicator.equals(rhs.cardBrandForcingIndicator))))&&((this.initialGmtDateTime == rhs.initialGmtDateTime)||((this.initialGmtDateTime!= null)&&this.initialGmtDateTime.equals(rhs.initialGmtDateTime))))&&((this.saleReference == rhs.saleReference)||((this.saleReference!= null)&&this.saleReference.equals(rhs.saleReference))))&&((this.settlementDate == rhs.settlementDate)||((this.settlementDate!= null)&&this.settlementDate.equals(rhs.settlementDate))))&&((this.totalAmount == rhs.totalAmount)||((this.totalAmount!= null)&&this.totalAmount.equals(rhs.totalAmount))))&&((this.cardholderAuthenticationValue == rhs.cardholderAuthenticationValue)||((this.cardholderAuthenticationValue!= null)&&this.cardholderAuthenticationValue.equals(rhs.cardholderAuthenticationValue))))&&((this.productQuantity == rhs.productQuantity)||((this.productQuantity!= null)&&this.productQuantity.equals(rhs.productQuantity))))&&((this.originalUniqueIdentifier == rhs.originalUniqueIdentifier)||((this.originalUniqueIdentifier!= null)&&this.originalUniqueIdentifier.equals(rhs.originalUniqueIdentifier))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ecommerceIndicator == rhs.ecommerceIndicator)||((this.ecommerceIndicator!= null)&&this.ecommerceIndicator.equals(rhs.ecommerceIndicator))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))))&&((this.additionnalInformationForImmediateAction == rhs.additionnalInformationForImmediateAction)||((this.additionnalInformationForImmediateAction!= null)&&this.additionnalInformationForImmediateAction.equals(rhs.additionnalInformationForImmediateAction))))&&((this.internalPricing == rhs.internalPricing)||((this.internalPricing!= null)&&this.internalPricing.equals(rhs.internalPricing))))&&((this.accountFromUsage == rhs.accountFromUsage)||((this.accountFromUsage!= null)&&this.accountFromUsage.equals(rhs.accountFromUsage))))&&((this.storedData == rhs.storedData)||((this.storedData!= null)&&this.storedData.equals(rhs.storedData))))&&((this.nonrefundReason == rhs.nonrefundReason)||((this.nonrefundReason!= null)&&this.nonrefundReason.equals(rhs.nonrefundReason))))&&((this.agreementId == rhs.agreementId)||((this.agreementId!= null)&&this.agreementId.equals(rhs.agreementId))))&&((this.cardBrandApplied == rhs.cardBrandApplied)||((this.cardBrandApplied!= null)&&this.cardBrandApplied.equals(rhs.cardBrandApplied))))&&((this.immediateAction == rhs.immediateAction)||((this.immediateAction!= null)&&this.immediateAction.equals(rhs.immediateAction))))&&((this.refundIndicator == rhs.refundIndicator)||((this.refundIndicator!= null)&&this.refundIndicator.equals(rhs.refundIndicator))))&&((this.contactlessTerminalProcessingResults == rhs.contactlessTerminalProcessingResults)||((this.contactlessTerminalProcessingResults!= null)&&this.contactlessTerminalProcessingResults.equals(rhs.contactlessTerminalProcessingResults))))&&((this.disputeTechnicalInternalId == rhs.disputeTechnicalInternalId)||((this.disputeTechnicalInternalId!= null)&&this.disputeTechnicalInternalId.equals(rhs.disputeTechnicalInternalId))))&&((this.schemeFeesAmount == rhs.schemeFeesAmount)||((this.schemeFeesAmount!= null)&&this.schemeFeesAmount.equals(rhs.schemeFeesAmount))))&&((this.lowValueExemptionIndicator == rhs.lowValueExemptionIndicator)||((this.lowValueExemptionIndicator!= null)&&this.lowValueExemptionIndicator.equals(rhs.lowValueExemptionIndicator))))&&((this.cardholderTotalAmount == rhs.cardholderTotalAmount)||((this.cardholderTotalAmount!= null)&&this.cardholderTotalAmount.equals(rhs.cardholderTotalAmount))))&&((this.statusLabel == rhs.statusLabel)||((this.statusLabel!= null)&&this.statusLabel.equals(rhs.statusLabel))))&&((this.cardSecurityCodeVerificationResultsOrigin == rhs.cardSecurityCodeVerificationResultsOrigin)||((this.cardSecurityCodeVerificationResultsOrigin!= null)&&this.cardSecurityCodeVerificationResultsOrigin.equals(rhs.cardSecurityCodeVerificationResultsOrigin))))&&((this.accountUsage == rhs.accountUsage)||((this.accountUsage!= null)&&this.accountUsage.equals(rhs.accountUsage))))&&((this.vrolTransactionReference == rhs.vrolTransactionReference)||((this.vrolTransactionReference!= null)&&this.vrolTransactionReference.equals(rhs.vrolTransactionReference))))&&((this.applicationTransactionCounter == rhs.applicationTransactionCounter)||((this.applicationTransactionCounter!= null)&&this.applicationTransactionCounter.equals(rhs.applicationTransactionCounter))))&&((this.encryptedPinBlock == rhs.encryptedPinBlock)||((this.encryptedPinBlock!= null)&&this.encryptedPinBlock.equals(rhs.encryptedPinBlock))))&&((this.preclearingTransactionNature == rhs.preclearingTransactionNature)||((this.preclearingTransactionNature!= null)&&this.preclearingTransactionNature.equals(rhs.preclearingTransactionNature))))&&((this.receivingId == rhs.receivingId)||((this.receivingId!= null)&&this.receivingId.equals(rhs.receivingId))));
    }

}
