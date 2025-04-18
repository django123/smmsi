
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
    "acceptorAdvice",
    "accountFundingSource",
    "accountNameRequestResult",
    "addServiceReportData",
    "addServiceReportId",
    "applicationCryptogramProcessingInformation",
    "appliedAuthorizationCharacteristicsIndicator",
    "appliedMarketSpecificDataIndicator",
    "cardAuthenticationResultsCode",
    "cardholderAddressCheckingInformation",
    "cardholderBillingCurrencyCode",
    "cardholderBillingCurrencyUnits",
    "cardTypeCode",
    "cryptogramProcessingInformation",
    "destinationCurrencyCode",
    "destinationCurrencyUnits",
    "emailAddressVerificationResult",
    "expenseThreshold",
    "extendedMessageToInitiatorNature",
    "extendedMessageToInitiatorValue",
    "fastFundIndicator",
    "fieldConversionEntitySource",
    "fieldConversionFieldNumber",
    "fieldConversionResponsibleValue",
    "firstNameAccountMatchDecision",
    "fullNameAccountMatchDecision",
    "geoRestrictionIndicator",
    "incorrectFieldErrorCode",
    "incorrectFieldNumber",
    "incorrectSubfield",
    "issuerFunctionalIdentifier",
    "issuerInstitutionCountryCode",
    "lastNameAccountMatchDecision",
    "mastercardMagstripeError",
    "mastercardMagstripeErrorCategory",
    "maximumAmountAuthorisable",
    "maximumNumberReattempts",
    "merchantAdviceCode",
    "messageReasonCode",
    "messageToTransactionInitiatorCtrlCharacter",
    "messageToTransactionInitiatorMessage",
    "middleNameAccountMatchDecision",
    "modifiedElectronicCommerceAuthentification",
    "networkEquipmentIdentifier",
    "octBlocking",
    "onlineGameBlockingIndicator",
    "phoneNumber",
    "phoneNumberVerificationResult",
    "programDowngradeReasonCode",
    "reasonInformationCode",
    "reasonInformationEntitySource",
    "reattemptAllowedDuration",
    "reattemptFrozenPeriod",
    "respondingMachineId",
    "securityErrorField",
    "securityErrorNature",
    "terminalData",
    "uniqueTransactionIdNetworkSource",
    "uniqueTransactionIdValue",
    "validationCode"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONAdditionalResponseData implements Serializable
{

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("acceptorAdvice")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String acceptorAdvice;
    @JsonProperty("accountFundingSource")
    private List<AccountFundingSourceCodeset> accountFundingSource = new ArrayList<AccountFundingSourceCodeset>();
    @JsonProperty("accountNameRequestResult")
    private List<VFNCodeset> accountNameRequestResult = new ArrayList<VFNCodeset>();
    @JsonProperty("addServiceReportData")
    private List<AddServiceReportDataCodeset> addServiceReportData = new ArrayList<AddServiceReportDataCodeset>();
    @JsonProperty("addServiceReportId")
    private List<AddServiceReportIDCodeset> addServiceReportId = new ArrayList<AddServiceReportIDCodeset>();
    @JsonProperty("applicationCryptogramProcessingInformation")
    private List<ApplicationCryptogramProcessingInformationCodeset> applicationCryptogramProcessingInformation = new ArrayList<ApplicationCryptogramProcessingInformationCodeset>();
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("appliedAuthorizationCharacteristicsIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String appliedAuthorizationCharacteristicsIndicator;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("appliedMarketSpecificDataIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String appliedMarketSpecificDataIndicator;
    @JsonProperty("cardAuthenticationResultsCode")
    private List<VFNCodeset> cardAuthenticationResultsCode = new ArrayList<VFNCodeset>();
    @JsonProperty("cardholderAddressCheckingInformation")
    private List<CardholderAddressCheckingInformationCodeset> cardholderAddressCheckingInformation = new ArrayList<CardholderAddressCheckingInformationCodeset>();
    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("cardholderBillingCurrencyCode")
    @JsonPropertyDescription("Code to identify the Currency (ISO 4217)")
    private String cardholderBillingCurrencyCode;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("cardholderBillingCurrencyUnits")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String cardholderBillingCurrencyUnits;
    @JsonProperty("cardTypeCode")
    private List<CardTypeCodeset> cardTypeCode = new ArrayList<CardTypeCodeset>();
    @JsonProperty("cryptogramProcessingInformation")
    private List<CryptogramProcessingInformationCodeset> cryptogramProcessingInformation = new ArrayList<CryptogramProcessingInformationCodeset>();
    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("destinationCurrencyCode")
    @JsonPropertyDescription("Code to identify the Currency (ISO 4217)")
    private String destinationCurrencyCode;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("destinationCurrencyUnits")
    @JsonPropertyDescription("1 alphanumeric character")
    private String destinationCurrencyUnits;
    @JsonProperty("emailAddressVerificationResult")
    private List<VFNCodeset> emailAddressVerificationResult = new ArrayList<VFNCodeset>();
    @JsonProperty("expenseThreshold")
    private List<VFNCodeset> expenseThreshold = new ArrayList<VFNCodeset>();
    @JsonProperty("extendedMessageToInitiatorNature")
    private List<ExtendedMessageNatureCodeset> extendedMessageToInitiatorNature = new ArrayList<ExtendedMessageNatureCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 100 characters.
     * 
     */
    @JsonProperty("extendedMessageToInitiatorValue")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 100 characters.")
    private String extendedMessageToInitiatorValue;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("fastFundIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean fastFundIndicator;
    @JsonProperty("fieldConversionEntitySource")
    private List<FieldConversionEntitySourceCodeset> fieldConversionEntitySource = new ArrayList<FieldConversionEntitySourceCodeset>();
    /**
     *  3 alphanumeric  and special characters
     * 
     */
    @JsonProperty("fieldConversionFieldNumber")
    @JsonPropertyDescription("3 alphanumeric  and special characters")
    private String fieldConversionFieldNumber;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 17 characters.
     * 
     */
    @JsonProperty("fieldConversionResponsibleValue")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 17 characters.")
    private String fieldConversionResponsibleValue;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("firstNameAccountMatchDecision")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String firstNameAccountMatchDecision;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("fullNameAccountMatchDecision")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String fullNameAccountMatchDecision;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("geoRestrictionIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean geoRestrictionIndicator;
    @JsonProperty("incorrectFieldErrorCode")
    private List<IncorrectFieldErrorCodeCodeset> incorrectFieldErrorCode = new ArrayList<IncorrectFieldErrorCodeCodeset>();
    /**
     *  3 alphanumeric  and special characters
     * 
     */
    @JsonProperty("incorrectFieldNumber")
    @JsonPropertyDescription("3 alphanumeric  and special characters")
    private String incorrectFieldNumber;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("incorrectSubfield")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 4 characters")
    private String incorrectSubfield;
    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("issuerFunctionalIdentifier")
    @JsonPropertyDescription("8 alphanumeric characters")
    private String issuerFunctionalIdentifier;
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("issuerInstitutionCountryCode")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String issuerInstitutionCountryCode;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("lastNameAccountMatchDecision")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String lastNameAccountMatchDecision;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("mastercardMagstripeError")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String mastercardMagstripeError;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("mastercardMagstripeErrorCategory")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String mastercardMagstripeErrorCategory;
    @JsonProperty("maximumAmountAuthorisable")
    private AmountType maximumAmountAuthorisable;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("maximumNumberReattempts")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String maximumNumberReattempts;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("merchantAdviceCode")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String merchantAdviceCode;
    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("messageReasonCode")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 4 digits.")
    private String messageReasonCode;
    @JsonProperty("messageToTransactionInitiatorCtrlCharacter")
    private List<MessageToTransactionInitiatorCtrlCharacterCodeset> messageToTransactionInitiatorCtrlCharacter = new ArrayList<MessageToTransactionInitiatorCtrlCharacterCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("messageToTransactionInitiatorMessage")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 20 characters.")
    private String messageToTransactionInitiatorMessage;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("middleNameAccountMatchDecision")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String middleNameAccountMatchDecision;
    @JsonProperty("modifiedElectronicCommerceAuthentification")
    private List<ModifiedElectronicCommerceAuthentificationCodeset> modifiedElectronicCommerceAuthentification = new ArrayList<ModifiedElectronicCommerceAuthentificationCodeset>();
    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("networkEquipmentIdentifier")
    @JsonPropertyDescription("2 alphanumeric  and special characters")
    private String networkEquipmentIdentifier;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("octBlocking")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean octBlocking;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("onlineGameBlockingIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean onlineGameBlockingIndicator;
    /**
     * International phone number E164 standard
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("International phone number E164 standard")
    private String phoneNumber;
    @JsonProperty("phoneNumberVerificationResult")
    private List<VFNCodeset> phoneNumberVerificationResult = new ArrayList<VFNCodeset>();
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("programDowngradeReasonCode")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String programDowngradeReasonCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("reasonInformationCode")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 4 characters")
    private String reasonInformationCode;
    @JsonProperty("reasonInformationEntitySource")
    private List<ReasonInformationEntitySourceCodeset> reasonInformationEntitySource = new ArrayList<ReasonInformationEntitySourceCodeset>();
    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("reattemptAllowedDuration")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 4 digits.")
    private String reattemptAllowedDuration;
    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("reattemptFrozenPeriod")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 4 digits.")
    private String reattemptFrozenPeriod;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("respondingMachineId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String respondingMachineId;
    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("securityErrorField")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 3 digits.")
    private String securityErrorField;
    @JsonProperty("securityErrorNature")
    private List<SecurityErrorCodeset> securityErrorNature = new ArrayList<SecurityErrorCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 26 characters
     * 
     */
    @JsonProperty("terminalData")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 26 characters")
    private String terminalData;
    @JsonProperty("uniqueTransactionIdNetworkSource")
    private List<NetworkCodeset> uniqueTransactionIdNetworkSource = new ArrayList<NetworkCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 49 characters
     * 
     */
    @JsonProperty("uniqueTransactionIdValue")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 49 characters")
    private String uniqueTransactionIdValue;
    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("validationCode")
    @JsonPropertyDescription("4 alphanumeric  and special characters")
    private String validationCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -2413259526417064514L;

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("acceptorAdvice")
    public String getAcceptorAdvice() {
        return acceptorAdvice;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("acceptorAdvice")
    public void setAcceptorAdvice(String acceptorAdvice) {
        this.acceptorAdvice = acceptorAdvice;
    }

    public DICOOBJETJSONAdditionalResponseData withAcceptorAdvice(String acceptorAdvice) {
        this.acceptorAdvice = acceptorAdvice;
        return this;
    }

    @JsonProperty("accountFundingSource")
    public List<AccountFundingSourceCodeset> getAccountFundingSource() {
        return accountFundingSource;
    }

    @JsonProperty("accountFundingSource")
    public void setAccountFundingSource(List<AccountFundingSourceCodeset> accountFundingSource) {
        this.accountFundingSource = accountFundingSource;
    }

    public DICOOBJETJSONAdditionalResponseData withAccountFundingSource(List<AccountFundingSourceCodeset> accountFundingSource) {
        this.accountFundingSource = accountFundingSource;
        return this;
    }

    @JsonProperty("accountNameRequestResult")
    public List<VFNCodeset> getAccountNameRequestResult() {
        return accountNameRequestResult;
    }

    @JsonProperty("accountNameRequestResult")
    public void setAccountNameRequestResult(List<VFNCodeset> accountNameRequestResult) {
        this.accountNameRequestResult = accountNameRequestResult;
    }

    public DICOOBJETJSONAdditionalResponseData withAccountNameRequestResult(List<VFNCodeset> accountNameRequestResult) {
        this.accountNameRequestResult = accountNameRequestResult;
        return this;
    }

    @JsonProperty("addServiceReportData")
    public List<AddServiceReportDataCodeset> getAddServiceReportData() {
        return addServiceReportData;
    }

    @JsonProperty("addServiceReportData")
    public void setAddServiceReportData(List<AddServiceReportDataCodeset> addServiceReportData) {
        this.addServiceReportData = addServiceReportData;
    }

    public DICOOBJETJSONAdditionalResponseData withAddServiceReportData(List<AddServiceReportDataCodeset> addServiceReportData) {
        this.addServiceReportData = addServiceReportData;
        return this;
    }

    @JsonProperty("addServiceReportId")
    public List<AddServiceReportIDCodeset> getAddServiceReportId() {
        return addServiceReportId;
    }

    @JsonProperty("addServiceReportId")
    public void setAddServiceReportId(List<AddServiceReportIDCodeset> addServiceReportId) {
        this.addServiceReportId = addServiceReportId;
    }

    public DICOOBJETJSONAdditionalResponseData withAddServiceReportId(List<AddServiceReportIDCodeset> addServiceReportId) {
        this.addServiceReportId = addServiceReportId;
        return this;
    }

    @JsonProperty("applicationCryptogramProcessingInformation")
    public List<ApplicationCryptogramProcessingInformationCodeset> getApplicationCryptogramProcessingInformation() {
        return applicationCryptogramProcessingInformation;
    }

    @JsonProperty("applicationCryptogramProcessingInformation")
    public void setApplicationCryptogramProcessingInformation(List<ApplicationCryptogramProcessingInformationCodeset> applicationCryptogramProcessingInformation) {
        this.applicationCryptogramProcessingInformation = applicationCryptogramProcessingInformation;
    }

    public DICOOBJETJSONAdditionalResponseData withApplicationCryptogramProcessingInformation(List<ApplicationCryptogramProcessingInformationCodeset> applicationCryptogramProcessingInformation) {
        this.applicationCryptogramProcessingInformation = applicationCryptogramProcessingInformation;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("appliedAuthorizationCharacteristicsIndicator")
    public String getAppliedAuthorizationCharacteristicsIndicator() {
        return appliedAuthorizationCharacteristicsIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("appliedAuthorizationCharacteristicsIndicator")
    public void setAppliedAuthorizationCharacteristicsIndicator(String appliedAuthorizationCharacteristicsIndicator) {
        this.appliedAuthorizationCharacteristicsIndicator = appliedAuthorizationCharacteristicsIndicator;
    }

    public DICOOBJETJSONAdditionalResponseData withAppliedAuthorizationCharacteristicsIndicator(String appliedAuthorizationCharacteristicsIndicator) {
        this.appliedAuthorizationCharacteristicsIndicator = appliedAuthorizationCharacteristicsIndicator;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("appliedMarketSpecificDataIndicator")
    public String getAppliedMarketSpecificDataIndicator() {
        return appliedMarketSpecificDataIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("appliedMarketSpecificDataIndicator")
    public void setAppliedMarketSpecificDataIndicator(String appliedMarketSpecificDataIndicator) {
        this.appliedMarketSpecificDataIndicator = appliedMarketSpecificDataIndicator;
    }

    public DICOOBJETJSONAdditionalResponseData withAppliedMarketSpecificDataIndicator(String appliedMarketSpecificDataIndicator) {
        this.appliedMarketSpecificDataIndicator = appliedMarketSpecificDataIndicator;
        return this;
    }

    @JsonProperty("cardAuthenticationResultsCode")
    public List<VFNCodeset> getCardAuthenticationResultsCode() {
        return cardAuthenticationResultsCode;
    }

    @JsonProperty("cardAuthenticationResultsCode")
    public void setCardAuthenticationResultsCode(List<VFNCodeset> cardAuthenticationResultsCode) {
        this.cardAuthenticationResultsCode = cardAuthenticationResultsCode;
    }

    public DICOOBJETJSONAdditionalResponseData withCardAuthenticationResultsCode(List<VFNCodeset> cardAuthenticationResultsCode) {
        this.cardAuthenticationResultsCode = cardAuthenticationResultsCode;
        return this;
    }

    @JsonProperty("cardholderAddressCheckingInformation")
    public List<CardholderAddressCheckingInformationCodeset> getCardholderAddressCheckingInformation() {
        return cardholderAddressCheckingInformation;
    }

    @JsonProperty("cardholderAddressCheckingInformation")
    public void setCardholderAddressCheckingInformation(List<CardholderAddressCheckingInformationCodeset> cardholderAddressCheckingInformation) {
        this.cardholderAddressCheckingInformation = cardholderAddressCheckingInformation;
    }

    public DICOOBJETJSONAdditionalResponseData withCardholderAddressCheckingInformation(List<CardholderAddressCheckingInformationCodeset> cardholderAddressCheckingInformation) {
        this.cardholderAddressCheckingInformation = cardholderAddressCheckingInformation;
        return this;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("cardholderBillingCurrencyCode")
    public String getCardholderBillingCurrencyCode() {
        return cardholderBillingCurrencyCode;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("cardholderBillingCurrencyCode")
    public void setCardholderBillingCurrencyCode(String cardholderBillingCurrencyCode) {
        this.cardholderBillingCurrencyCode = cardholderBillingCurrencyCode;
    }

    public DICOOBJETJSONAdditionalResponseData withCardholderBillingCurrencyCode(String cardholderBillingCurrencyCode) {
        this.cardholderBillingCurrencyCode = cardholderBillingCurrencyCode;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("cardholderBillingCurrencyUnits")
    public String getCardholderBillingCurrencyUnits() {
        return cardholderBillingCurrencyUnits;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("cardholderBillingCurrencyUnits")
    public void setCardholderBillingCurrencyUnits(String cardholderBillingCurrencyUnits) {
        this.cardholderBillingCurrencyUnits = cardholderBillingCurrencyUnits;
    }

    public DICOOBJETJSONAdditionalResponseData withCardholderBillingCurrencyUnits(String cardholderBillingCurrencyUnits) {
        this.cardholderBillingCurrencyUnits = cardholderBillingCurrencyUnits;
        return this;
    }

    @JsonProperty("cardTypeCode")
    public List<CardTypeCodeset> getCardTypeCode() {
        return cardTypeCode;
    }

    @JsonProperty("cardTypeCode")
    public void setCardTypeCode(List<CardTypeCodeset> cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }

    public DICOOBJETJSONAdditionalResponseData withCardTypeCode(List<CardTypeCodeset> cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
        return this;
    }

    @JsonProperty("cryptogramProcessingInformation")
    public List<CryptogramProcessingInformationCodeset> getCryptogramProcessingInformation() {
        return cryptogramProcessingInformation;
    }

    @JsonProperty("cryptogramProcessingInformation")
    public void setCryptogramProcessingInformation(List<CryptogramProcessingInformationCodeset> cryptogramProcessingInformation) {
        this.cryptogramProcessingInformation = cryptogramProcessingInformation;
    }

    public DICOOBJETJSONAdditionalResponseData withCryptogramProcessingInformation(List<CryptogramProcessingInformationCodeset> cryptogramProcessingInformation) {
        this.cryptogramProcessingInformation = cryptogramProcessingInformation;
        return this;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("destinationCurrencyCode")
    public String getDestinationCurrencyCode() {
        return destinationCurrencyCode;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("destinationCurrencyCode")
    public void setDestinationCurrencyCode(String destinationCurrencyCode) {
        this.destinationCurrencyCode = destinationCurrencyCode;
    }

    public DICOOBJETJSONAdditionalResponseData withDestinationCurrencyCode(String destinationCurrencyCode) {
        this.destinationCurrencyCode = destinationCurrencyCode;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("destinationCurrencyUnits")
    public String getDestinationCurrencyUnits() {
        return destinationCurrencyUnits;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("destinationCurrencyUnits")
    public void setDestinationCurrencyUnits(String destinationCurrencyUnits) {
        this.destinationCurrencyUnits = destinationCurrencyUnits;
    }

    public DICOOBJETJSONAdditionalResponseData withDestinationCurrencyUnits(String destinationCurrencyUnits) {
        this.destinationCurrencyUnits = destinationCurrencyUnits;
        return this;
    }

    @JsonProperty("emailAddressVerificationResult")
    public List<VFNCodeset> getEmailAddressVerificationResult() {
        return emailAddressVerificationResult;
    }

    @JsonProperty("emailAddressVerificationResult")
    public void setEmailAddressVerificationResult(List<VFNCodeset> emailAddressVerificationResult) {
        this.emailAddressVerificationResult = emailAddressVerificationResult;
    }

    public DICOOBJETJSONAdditionalResponseData withEmailAddressVerificationResult(List<VFNCodeset> emailAddressVerificationResult) {
        this.emailAddressVerificationResult = emailAddressVerificationResult;
        return this;
    }

    @JsonProperty("expenseThreshold")
    public List<VFNCodeset> getExpenseThreshold() {
        return expenseThreshold;
    }

    @JsonProperty("expenseThreshold")
    public void setExpenseThreshold(List<VFNCodeset> expenseThreshold) {
        this.expenseThreshold = expenseThreshold;
    }

    public DICOOBJETJSONAdditionalResponseData withExpenseThreshold(List<VFNCodeset> expenseThreshold) {
        this.expenseThreshold = expenseThreshold;
        return this;
    }

    @JsonProperty("extendedMessageToInitiatorNature")
    public List<ExtendedMessageNatureCodeset> getExtendedMessageToInitiatorNature() {
        return extendedMessageToInitiatorNature;
    }

    @JsonProperty("extendedMessageToInitiatorNature")
    public void setExtendedMessageToInitiatorNature(List<ExtendedMessageNatureCodeset> extendedMessageToInitiatorNature) {
        this.extendedMessageToInitiatorNature = extendedMessageToInitiatorNature;
    }

    public DICOOBJETJSONAdditionalResponseData withExtendedMessageToInitiatorNature(List<ExtendedMessageNatureCodeset> extendedMessageToInitiatorNature) {
        this.extendedMessageToInitiatorNature = extendedMessageToInitiatorNature;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 100 characters.
     * 
     */
    @JsonProperty("extendedMessageToInitiatorValue")
    public String getExtendedMessageToInitiatorValue() {
        return extendedMessageToInitiatorValue;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 100 characters.
     * 
     */
    @JsonProperty("extendedMessageToInitiatorValue")
    public void setExtendedMessageToInitiatorValue(String extendedMessageToInitiatorValue) {
        this.extendedMessageToInitiatorValue = extendedMessageToInitiatorValue;
    }

    public DICOOBJETJSONAdditionalResponseData withExtendedMessageToInitiatorValue(String extendedMessageToInitiatorValue) {
        this.extendedMessageToInitiatorValue = extendedMessageToInitiatorValue;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("fastFundIndicator")
    public Boolean getFastFundIndicator() {
        return fastFundIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("fastFundIndicator")
    public void setFastFundIndicator(Boolean fastFundIndicator) {
        this.fastFundIndicator = fastFundIndicator;
    }

    public DICOOBJETJSONAdditionalResponseData withFastFundIndicator(Boolean fastFundIndicator) {
        this.fastFundIndicator = fastFundIndicator;
        return this;
    }

    @JsonProperty("fieldConversionEntitySource")
    public List<FieldConversionEntitySourceCodeset> getFieldConversionEntitySource() {
        return fieldConversionEntitySource;
    }

    @JsonProperty("fieldConversionEntitySource")
    public void setFieldConversionEntitySource(List<FieldConversionEntitySourceCodeset> fieldConversionEntitySource) {
        this.fieldConversionEntitySource = fieldConversionEntitySource;
    }

    public DICOOBJETJSONAdditionalResponseData withFieldConversionEntitySource(List<FieldConversionEntitySourceCodeset> fieldConversionEntitySource) {
        this.fieldConversionEntitySource = fieldConversionEntitySource;
        return this;
    }

    /**
     *  3 alphanumeric  and special characters
     * 
     */
    @JsonProperty("fieldConversionFieldNumber")
    public String getFieldConversionFieldNumber() {
        return fieldConversionFieldNumber;
    }

    /**
     *  3 alphanumeric  and special characters
     * 
     */
    @JsonProperty("fieldConversionFieldNumber")
    public void setFieldConversionFieldNumber(String fieldConversionFieldNumber) {
        this.fieldConversionFieldNumber = fieldConversionFieldNumber;
    }

    public DICOOBJETJSONAdditionalResponseData withFieldConversionFieldNumber(String fieldConversionFieldNumber) {
        this.fieldConversionFieldNumber = fieldConversionFieldNumber;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 17 characters.
     * 
     */
    @JsonProperty("fieldConversionResponsibleValue")
    public String getFieldConversionResponsibleValue() {
        return fieldConversionResponsibleValue;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 17 characters.
     * 
     */
    @JsonProperty("fieldConversionResponsibleValue")
    public void setFieldConversionResponsibleValue(String fieldConversionResponsibleValue) {
        this.fieldConversionResponsibleValue = fieldConversionResponsibleValue;
    }

    public DICOOBJETJSONAdditionalResponseData withFieldConversionResponsibleValue(String fieldConversionResponsibleValue) {
        this.fieldConversionResponsibleValue = fieldConversionResponsibleValue;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("firstNameAccountMatchDecision")
    public String getFirstNameAccountMatchDecision() {
        return firstNameAccountMatchDecision;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("firstNameAccountMatchDecision")
    public void setFirstNameAccountMatchDecision(String firstNameAccountMatchDecision) {
        this.firstNameAccountMatchDecision = firstNameAccountMatchDecision;
    }

    public DICOOBJETJSONAdditionalResponseData withFirstNameAccountMatchDecision(String firstNameAccountMatchDecision) {
        this.firstNameAccountMatchDecision = firstNameAccountMatchDecision;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("fullNameAccountMatchDecision")
    public String getFullNameAccountMatchDecision() {
        return fullNameAccountMatchDecision;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("fullNameAccountMatchDecision")
    public void setFullNameAccountMatchDecision(String fullNameAccountMatchDecision) {
        this.fullNameAccountMatchDecision = fullNameAccountMatchDecision;
    }

    public DICOOBJETJSONAdditionalResponseData withFullNameAccountMatchDecision(String fullNameAccountMatchDecision) {
        this.fullNameAccountMatchDecision = fullNameAccountMatchDecision;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("geoRestrictionIndicator")
    public Boolean getGeoRestrictionIndicator() {
        return geoRestrictionIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("geoRestrictionIndicator")
    public void setGeoRestrictionIndicator(Boolean geoRestrictionIndicator) {
        this.geoRestrictionIndicator = geoRestrictionIndicator;
    }

    public DICOOBJETJSONAdditionalResponseData withGeoRestrictionIndicator(Boolean geoRestrictionIndicator) {
        this.geoRestrictionIndicator = geoRestrictionIndicator;
        return this;
    }

    @JsonProperty("incorrectFieldErrorCode")
    public List<IncorrectFieldErrorCodeCodeset> getIncorrectFieldErrorCode() {
        return incorrectFieldErrorCode;
    }

    @JsonProperty("incorrectFieldErrorCode")
    public void setIncorrectFieldErrorCode(List<IncorrectFieldErrorCodeCodeset> incorrectFieldErrorCode) {
        this.incorrectFieldErrorCode = incorrectFieldErrorCode;
    }

    public DICOOBJETJSONAdditionalResponseData withIncorrectFieldErrorCode(List<IncorrectFieldErrorCodeCodeset> incorrectFieldErrorCode) {
        this.incorrectFieldErrorCode = incorrectFieldErrorCode;
        return this;
    }

    /**
     *  3 alphanumeric  and special characters
     * 
     */
    @JsonProperty("incorrectFieldNumber")
    public String getIncorrectFieldNumber() {
        return incorrectFieldNumber;
    }

    /**
     *  3 alphanumeric  and special characters
     * 
     */
    @JsonProperty("incorrectFieldNumber")
    public void setIncorrectFieldNumber(String incorrectFieldNumber) {
        this.incorrectFieldNumber = incorrectFieldNumber;
    }

    public DICOOBJETJSONAdditionalResponseData withIncorrectFieldNumber(String incorrectFieldNumber) {
        this.incorrectFieldNumber = incorrectFieldNumber;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("incorrectSubfield")
    public String getIncorrectSubfield() {
        return incorrectSubfield;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("incorrectSubfield")
    public void setIncorrectSubfield(String incorrectSubfield) {
        this.incorrectSubfield = incorrectSubfield;
    }

    public DICOOBJETJSONAdditionalResponseData withIncorrectSubfield(String incorrectSubfield) {
        this.incorrectSubfield = incorrectSubfield;
        return this;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("issuerFunctionalIdentifier")
    public String getIssuerFunctionalIdentifier() {
        return issuerFunctionalIdentifier;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("issuerFunctionalIdentifier")
    public void setIssuerFunctionalIdentifier(String issuerFunctionalIdentifier) {
        this.issuerFunctionalIdentifier = issuerFunctionalIdentifier;
    }

    public DICOOBJETJSONAdditionalResponseData withIssuerFunctionalIdentifier(String issuerFunctionalIdentifier) {
        this.issuerFunctionalIdentifier = issuerFunctionalIdentifier;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("issuerInstitutionCountryCode")
    public String getIssuerInstitutionCountryCode() {
        return issuerInstitutionCountryCode;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("issuerInstitutionCountryCode")
    public void setIssuerInstitutionCountryCode(String issuerInstitutionCountryCode) {
        this.issuerInstitutionCountryCode = issuerInstitutionCountryCode;
    }

    public DICOOBJETJSONAdditionalResponseData withIssuerInstitutionCountryCode(String issuerInstitutionCountryCode) {
        this.issuerInstitutionCountryCode = issuerInstitutionCountryCode;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("lastNameAccountMatchDecision")
    public String getLastNameAccountMatchDecision() {
        return lastNameAccountMatchDecision;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("lastNameAccountMatchDecision")
    public void setLastNameAccountMatchDecision(String lastNameAccountMatchDecision) {
        this.lastNameAccountMatchDecision = lastNameAccountMatchDecision;
    }

    public DICOOBJETJSONAdditionalResponseData withLastNameAccountMatchDecision(String lastNameAccountMatchDecision) {
        this.lastNameAccountMatchDecision = lastNameAccountMatchDecision;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("mastercardMagstripeError")
    public String getMastercardMagstripeError() {
        return mastercardMagstripeError;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("mastercardMagstripeError")
    public void setMastercardMagstripeError(String mastercardMagstripeError) {
        this.mastercardMagstripeError = mastercardMagstripeError;
    }

    public DICOOBJETJSONAdditionalResponseData withMastercardMagstripeError(String mastercardMagstripeError) {
        this.mastercardMagstripeError = mastercardMagstripeError;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("mastercardMagstripeErrorCategory")
    public String getMastercardMagstripeErrorCategory() {
        return mastercardMagstripeErrorCategory;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("mastercardMagstripeErrorCategory")
    public void setMastercardMagstripeErrorCategory(String mastercardMagstripeErrorCategory) {
        this.mastercardMagstripeErrorCategory = mastercardMagstripeErrorCategory;
    }

    public DICOOBJETJSONAdditionalResponseData withMastercardMagstripeErrorCategory(String mastercardMagstripeErrorCategory) {
        this.mastercardMagstripeErrorCategory = mastercardMagstripeErrorCategory;
        return this;
    }

    @JsonProperty("maximumAmountAuthorisable")
    public AmountType getMaximumAmountAuthorisable() {
        return maximumAmountAuthorisable;
    }

    @JsonProperty("maximumAmountAuthorisable")
    public void setMaximumAmountAuthorisable(AmountType maximumAmountAuthorisable) {
        this.maximumAmountAuthorisable = maximumAmountAuthorisable;
    }

    public DICOOBJETJSONAdditionalResponseData withMaximumAmountAuthorisable(AmountType maximumAmountAuthorisable) {
        this.maximumAmountAuthorisable = maximumAmountAuthorisable;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("maximumNumberReattempts")
    public String getMaximumNumberReattempts() {
        return maximumNumberReattempts;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("maximumNumberReattempts")
    public void setMaximumNumberReattempts(String maximumNumberReattempts) {
        this.maximumNumberReattempts = maximumNumberReattempts;
    }

    public DICOOBJETJSONAdditionalResponseData withMaximumNumberReattempts(String maximumNumberReattempts) {
        this.maximumNumberReattempts = maximumNumberReattempts;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("merchantAdviceCode")
    public String getMerchantAdviceCode() {
        return merchantAdviceCode;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("merchantAdviceCode")
    public void setMerchantAdviceCode(String merchantAdviceCode) {
        this.merchantAdviceCode = merchantAdviceCode;
    }

    public DICOOBJETJSONAdditionalResponseData withMerchantAdviceCode(String merchantAdviceCode) {
        this.merchantAdviceCode = merchantAdviceCode;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("messageReasonCode")
    public String getMessageReasonCode() {
        return messageReasonCode;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("messageReasonCode")
    public void setMessageReasonCode(String messageReasonCode) {
        this.messageReasonCode = messageReasonCode;
    }

    public DICOOBJETJSONAdditionalResponseData withMessageReasonCode(String messageReasonCode) {
        this.messageReasonCode = messageReasonCode;
        return this;
    }

    @JsonProperty("messageToTransactionInitiatorCtrlCharacter")
    public List<MessageToTransactionInitiatorCtrlCharacterCodeset> getMessageToTransactionInitiatorCtrlCharacter() {
        return messageToTransactionInitiatorCtrlCharacter;
    }

    @JsonProperty("messageToTransactionInitiatorCtrlCharacter")
    public void setMessageToTransactionInitiatorCtrlCharacter(List<MessageToTransactionInitiatorCtrlCharacterCodeset> messageToTransactionInitiatorCtrlCharacter) {
        this.messageToTransactionInitiatorCtrlCharacter = messageToTransactionInitiatorCtrlCharacter;
    }

    public DICOOBJETJSONAdditionalResponseData withMessageToTransactionInitiatorCtrlCharacter(List<MessageToTransactionInitiatorCtrlCharacterCodeset> messageToTransactionInitiatorCtrlCharacter) {
        this.messageToTransactionInitiatorCtrlCharacter = messageToTransactionInitiatorCtrlCharacter;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("messageToTransactionInitiatorMessage")
    public String getMessageToTransactionInitiatorMessage() {
        return messageToTransactionInitiatorMessage;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("messageToTransactionInitiatorMessage")
    public void setMessageToTransactionInitiatorMessage(String messageToTransactionInitiatorMessage) {
        this.messageToTransactionInitiatorMessage = messageToTransactionInitiatorMessage;
    }

    public DICOOBJETJSONAdditionalResponseData withMessageToTransactionInitiatorMessage(String messageToTransactionInitiatorMessage) {
        this.messageToTransactionInitiatorMessage = messageToTransactionInitiatorMessage;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("middleNameAccountMatchDecision")
    public String getMiddleNameAccountMatchDecision() {
        return middleNameAccountMatchDecision;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("middleNameAccountMatchDecision")
    public void setMiddleNameAccountMatchDecision(String middleNameAccountMatchDecision) {
        this.middleNameAccountMatchDecision = middleNameAccountMatchDecision;
    }

    public DICOOBJETJSONAdditionalResponseData withMiddleNameAccountMatchDecision(String middleNameAccountMatchDecision) {
        this.middleNameAccountMatchDecision = middleNameAccountMatchDecision;
        return this;
    }

    @JsonProperty("modifiedElectronicCommerceAuthentification")
    public List<ModifiedElectronicCommerceAuthentificationCodeset> getModifiedElectronicCommerceAuthentification() {
        return modifiedElectronicCommerceAuthentification;
    }

    @JsonProperty("modifiedElectronicCommerceAuthentification")
    public void setModifiedElectronicCommerceAuthentification(List<ModifiedElectronicCommerceAuthentificationCodeset> modifiedElectronicCommerceAuthentification) {
        this.modifiedElectronicCommerceAuthentification = modifiedElectronicCommerceAuthentification;
    }

    public DICOOBJETJSONAdditionalResponseData withModifiedElectronicCommerceAuthentification(List<ModifiedElectronicCommerceAuthentificationCodeset> modifiedElectronicCommerceAuthentification) {
        this.modifiedElectronicCommerceAuthentification = modifiedElectronicCommerceAuthentification;
        return this;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("networkEquipmentIdentifier")
    public String getNetworkEquipmentIdentifier() {
        return networkEquipmentIdentifier;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("networkEquipmentIdentifier")
    public void setNetworkEquipmentIdentifier(String networkEquipmentIdentifier) {
        this.networkEquipmentIdentifier = networkEquipmentIdentifier;
    }

    public DICOOBJETJSONAdditionalResponseData withNetworkEquipmentIdentifier(String networkEquipmentIdentifier) {
        this.networkEquipmentIdentifier = networkEquipmentIdentifier;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("octBlocking")
    public Boolean getOctBlocking() {
        return octBlocking;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("octBlocking")
    public void setOctBlocking(Boolean octBlocking) {
        this.octBlocking = octBlocking;
    }

    public DICOOBJETJSONAdditionalResponseData withOctBlocking(Boolean octBlocking) {
        this.octBlocking = octBlocking;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("onlineGameBlockingIndicator")
    public Boolean getOnlineGameBlockingIndicator() {
        return onlineGameBlockingIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("onlineGameBlockingIndicator")
    public void setOnlineGameBlockingIndicator(Boolean onlineGameBlockingIndicator) {
        this.onlineGameBlockingIndicator = onlineGameBlockingIndicator;
    }

    public DICOOBJETJSONAdditionalResponseData withOnlineGameBlockingIndicator(Boolean onlineGameBlockingIndicator) {
        this.onlineGameBlockingIndicator = onlineGameBlockingIndicator;
        return this;
    }

    /**
     * International phone number E164 standard
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * International phone number E164 standard
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DICOOBJETJSONAdditionalResponseData withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("phoneNumberVerificationResult")
    public List<VFNCodeset> getPhoneNumberVerificationResult() {
        return phoneNumberVerificationResult;
    }

    @JsonProperty("phoneNumberVerificationResult")
    public void setPhoneNumberVerificationResult(List<VFNCodeset> phoneNumberVerificationResult) {
        this.phoneNumberVerificationResult = phoneNumberVerificationResult;
    }

    public DICOOBJETJSONAdditionalResponseData withPhoneNumberVerificationResult(List<VFNCodeset> phoneNumberVerificationResult) {
        this.phoneNumberVerificationResult = phoneNumberVerificationResult;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("programDowngradeReasonCode")
    public String getProgramDowngradeReasonCode() {
        return programDowngradeReasonCode;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("programDowngradeReasonCode")
    public void setProgramDowngradeReasonCode(String programDowngradeReasonCode) {
        this.programDowngradeReasonCode = programDowngradeReasonCode;
    }

    public DICOOBJETJSONAdditionalResponseData withProgramDowngradeReasonCode(String programDowngradeReasonCode) {
        this.programDowngradeReasonCode = programDowngradeReasonCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("reasonInformationCode")
    public String getReasonInformationCode() {
        return reasonInformationCode;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("reasonInformationCode")
    public void setReasonInformationCode(String reasonInformationCode) {
        this.reasonInformationCode = reasonInformationCode;
    }

    public DICOOBJETJSONAdditionalResponseData withReasonInformationCode(String reasonInformationCode) {
        this.reasonInformationCode = reasonInformationCode;
        return this;
    }

    @JsonProperty("reasonInformationEntitySource")
    public List<ReasonInformationEntitySourceCodeset> getReasonInformationEntitySource() {
        return reasonInformationEntitySource;
    }

    @JsonProperty("reasonInformationEntitySource")
    public void setReasonInformationEntitySource(List<ReasonInformationEntitySourceCodeset> reasonInformationEntitySource) {
        this.reasonInformationEntitySource = reasonInformationEntitySource;
    }

    public DICOOBJETJSONAdditionalResponseData withReasonInformationEntitySource(List<ReasonInformationEntitySourceCodeset> reasonInformationEntitySource) {
        this.reasonInformationEntitySource = reasonInformationEntitySource;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("reattemptAllowedDuration")
    public String getReattemptAllowedDuration() {
        return reattemptAllowedDuration;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("reattemptAllowedDuration")
    public void setReattemptAllowedDuration(String reattemptAllowedDuration) {
        this.reattemptAllowedDuration = reattemptAllowedDuration;
    }

    public DICOOBJETJSONAdditionalResponseData withReattemptAllowedDuration(String reattemptAllowedDuration) {
        this.reattemptAllowedDuration = reattemptAllowedDuration;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("reattemptFrozenPeriod")
    public String getReattemptFrozenPeriod() {
        return reattemptFrozenPeriod;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("reattemptFrozenPeriod")
    public void setReattemptFrozenPeriod(String reattemptFrozenPeriod) {
        this.reattemptFrozenPeriod = reattemptFrozenPeriod;
    }

    public DICOOBJETJSONAdditionalResponseData withReattemptFrozenPeriod(String reattemptFrozenPeriod) {
        this.reattemptFrozenPeriod = reattemptFrozenPeriod;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("respondingMachineId")
    public String getRespondingMachineId() {
        return respondingMachineId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("respondingMachineId")
    public void setRespondingMachineId(String respondingMachineId) {
        this.respondingMachineId = respondingMachineId;
    }

    public DICOOBJETJSONAdditionalResponseData withRespondingMachineId(String respondingMachineId) {
        this.respondingMachineId = respondingMachineId;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("securityErrorField")
    public String getSecurityErrorField() {
        return securityErrorField;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("securityErrorField")
    public void setSecurityErrorField(String securityErrorField) {
        this.securityErrorField = securityErrorField;
    }

    public DICOOBJETJSONAdditionalResponseData withSecurityErrorField(String securityErrorField) {
        this.securityErrorField = securityErrorField;
        return this;
    }

    @JsonProperty("securityErrorNature")
    public List<SecurityErrorCodeset> getSecurityErrorNature() {
        return securityErrorNature;
    }

    @JsonProperty("securityErrorNature")
    public void setSecurityErrorNature(List<SecurityErrorCodeset> securityErrorNature) {
        this.securityErrorNature = securityErrorNature;
    }

    public DICOOBJETJSONAdditionalResponseData withSecurityErrorNature(List<SecurityErrorCodeset> securityErrorNature) {
        this.securityErrorNature = securityErrorNature;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 26 characters
     * 
     */
    @JsonProperty("terminalData")
    public String getTerminalData() {
        return terminalData;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 26 characters
     * 
     */
    @JsonProperty("terminalData")
    public void setTerminalData(String terminalData) {
        this.terminalData = terminalData;
    }

    public DICOOBJETJSONAdditionalResponseData withTerminalData(String terminalData) {
        this.terminalData = terminalData;
        return this;
    }

    @JsonProperty("uniqueTransactionIdNetworkSource")
    public List<NetworkCodeset> getUniqueTransactionIdNetworkSource() {
        return uniqueTransactionIdNetworkSource;
    }

    @JsonProperty("uniqueTransactionIdNetworkSource")
    public void setUniqueTransactionIdNetworkSource(List<NetworkCodeset> uniqueTransactionIdNetworkSource) {
        this.uniqueTransactionIdNetworkSource = uniqueTransactionIdNetworkSource;
    }

    public DICOOBJETJSONAdditionalResponseData withUniqueTransactionIdNetworkSource(List<NetworkCodeset> uniqueTransactionIdNetworkSource) {
        this.uniqueTransactionIdNetworkSource = uniqueTransactionIdNetworkSource;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 49 characters
     * 
     */
    @JsonProperty("uniqueTransactionIdValue")
    public String getUniqueTransactionIdValue() {
        return uniqueTransactionIdValue;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 49 characters
     * 
     */
    @JsonProperty("uniqueTransactionIdValue")
    public void setUniqueTransactionIdValue(String uniqueTransactionIdValue) {
        this.uniqueTransactionIdValue = uniqueTransactionIdValue;
    }

    public DICOOBJETJSONAdditionalResponseData withUniqueTransactionIdValue(String uniqueTransactionIdValue) {
        this.uniqueTransactionIdValue = uniqueTransactionIdValue;
        return this;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("validationCode")
    public String getValidationCode() {
        return validationCode;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("validationCode")
    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    public DICOOBJETJSONAdditionalResponseData withValidationCode(String validationCode) {
        this.validationCode = validationCode;
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

    public DICOOBJETJSONAdditionalResponseData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONAdditionalResponseData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acceptorAdvice");
        sb.append('=');
        sb.append(((this.acceptorAdvice == null)?"<null>":this.acceptorAdvice));
        sb.append(',');
        sb.append("accountFundingSource");
        sb.append('=');
        sb.append(((this.accountFundingSource == null)?"<null>":this.accountFundingSource));
        sb.append(',');
        sb.append("accountNameRequestResult");
        sb.append('=');
        sb.append(((this.accountNameRequestResult == null)?"<null>":this.accountNameRequestResult));
        sb.append(',');
        sb.append("addServiceReportData");
        sb.append('=');
        sb.append(((this.addServiceReportData == null)?"<null>":this.addServiceReportData));
        sb.append(',');
        sb.append("addServiceReportId");
        sb.append('=');
        sb.append(((this.addServiceReportId == null)?"<null>":this.addServiceReportId));
        sb.append(',');
        sb.append("applicationCryptogramProcessingInformation");
        sb.append('=');
        sb.append(((this.applicationCryptogramProcessingInformation == null)?"<null>":this.applicationCryptogramProcessingInformation));
        sb.append(',');
        sb.append("appliedAuthorizationCharacteristicsIndicator");
        sb.append('=');
        sb.append(((this.appliedAuthorizationCharacteristicsIndicator == null)?"<null>":this.appliedAuthorizationCharacteristicsIndicator));
        sb.append(',');
        sb.append("appliedMarketSpecificDataIndicator");
        sb.append('=');
        sb.append(((this.appliedMarketSpecificDataIndicator == null)?"<null>":this.appliedMarketSpecificDataIndicator));
        sb.append(',');
        sb.append("cardAuthenticationResultsCode");
        sb.append('=');
        sb.append(((this.cardAuthenticationResultsCode == null)?"<null>":this.cardAuthenticationResultsCode));
        sb.append(',');
        sb.append("cardholderAddressCheckingInformation");
        sb.append('=');
        sb.append(((this.cardholderAddressCheckingInformation == null)?"<null>":this.cardholderAddressCheckingInformation));
        sb.append(',');
        sb.append("cardholderBillingCurrencyCode");
        sb.append('=');
        sb.append(((this.cardholderBillingCurrencyCode == null)?"<null>":this.cardholderBillingCurrencyCode));
        sb.append(',');
        sb.append("cardholderBillingCurrencyUnits");
        sb.append('=');
        sb.append(((this.cardholderBillingCurrencyUnits == null)?"<null>":this.cardholderBillingCurrencyUnits));
        sb.append(',');
        sb.append("cardTypeCode");
        sb.append('=');
        sb.append(((this.cardTypeCode == null)?"<null>":this.cardTypeCode));
        sb.append(',');
        sb.append("cryptogramProcessingInformation");
        sb.append('=');
        sb.append(((this.cryptogramProcessingInformation == null)?"<null>":this.cryptogramProcessingInformation));
        sb.append(',');
        sb.append("destinationCurrencyCode");
        sb.append('=');
        sb.append(((this.destinationCurrencyCode == null)?"<null>":this.destinationCurrencyCode));
        sb.append(',');
        sb.append("destinationCurrencyUnits");
        sb.append('=');
        sb.append(((this.destinationCurrencyUnits == null)?"<null>":this.destinationCurrencyUnits));
        sb.append(',');
        sb.append("emailAddressVerificationResult");
        sb.append('=');
        sb.append(((this.emailAddressVerificationResult == null)?"<null>":this.emailAddressVerificationResult));
        sb.append(',');
        sb.append("expenseThreshold");
        sb.append('=');
        sb.append(((this.expenseThreshold == null)?"<null>":this.expenseThreshold));
        sb.append(',');
        sb.append("extendedMessageToInitiatorNature");
        sb.append('=');
        sb.append(((this.extendedMessageToInitiatorNature == null)?"<null>":this.extendedMessageToInitiatorNature));
        sb.append(',');
        sb.append("extendedMessageToInitiatorValue");
        sb.append('=');
        sb.append(((this.extendedMessageToInitiatorValue == null)?"<null>":this.extendedMessageToInitiatorValue));
        sb.append(',');
        sb.append("fastFundIndicator");
        sb.append('=');
        sb.append(((this.fastFundIndicator == null)?"<null>":this.fastFundIndicator));
        sb.append(',');
        sb.append("fieldConversionEntitySource");
        sb.append('=');
        sb.append(((this.fieldConversionEntitySource == null)?"<null>":this.fieldConversionEntitySource));
        sb.append(',');
        sb.append("fieldConversionFieldNumber");
        sb.append('=');
        sb.append(((this.fieldConversionFieldNumber == null)?"<null>":this.fieldConversionFieldNumber));
        sb.append(',');
        sb.append("fieldConversionResponsibleValue");
        sb.append('=');
        sb.append(((this.fieldConversionResponsibleValue == null)?"<null>":this.fieldConversionResponsibleValue));
        sb.append(',');
        sb.append("firstNameAccountMatchDecision");
        sb.append('=');
        sb.append(((this.firstNameAccountMatchDecision == null)?"<null>":this.firstNameAccountMatchDecision));
        sb.append(',');
        sb.append("fullNameAccountMatchDecision");
        sb.append('=');
        sb.append(((this.fullNameAccountMatchDecision == null)?"<null>":this.fullNameAccountMatchDecision));
        sb.append(',');
        sb.append("geoRestrictionIndicator");
        sb.append('=');
        sb.append(((this.geoRestrictionIndicator == null)?"<null>":this.geoRestrictionIndicator));
        sb.append(',');
        sb.append("incorrectFieldErrorCode");
        sb.append('=');
        sb.append(((this.incorrectFieldErrorCode == null)?"<null>":this.incorrectFieldErrorCode));
        sb.append(',');
        sb.append("incorrectFieldNumber");
        sb.append('=');
        sb.append(((this.incorrectFieldNumber == null)?"<null>":this.incorrectFieldNumber));
        sb.append(',');
        sb.append("incorrectSubfield");
        sb.append('=');
        sb.append(((this.incorrectSubfield == null)?"<null>":this.incorrectSubfield));
        sb.append(',');
        sb.append("issuerFunctionalIdentifier");
        sb.append('=');
        sb.append(((this.issuerFunctionalIdentifier == null)?"<null>":this.issuerFunctionalIdentifier));
        sb.append(',');
        sb.append("issuerInstitutionCountryCode");
        sb.append('=');
        sb.append(((this.issuerInstitutionCountryCode == null)?"<null>":this.issuerInstitutionCountryCode));
        sb.append(',');
        sb.append("lastNameAccountMatchDecision");
        sb.append('=');
        sb.append(((this.lastNameAccountMatchDecision == null)?"<null>":this.lastNameAccountMatchDecision));
        sb.append(',');
        sb.append("mastercardMagstripeError");
        sb.append('=');
        sb.append(((this.mastercardMagstripeError == null)?"<null>":this.mastercardMagstripeError));
        sb.append(',');
        sb.append("mastercardMagstripeErrorCategory");
        sb.append('=');
        sb.append(((this.mastercardMagstripeErrorCategory == null)?"<null>":this.mastercardMagstripeErrorCategory));
        sb.append(',');
        sb.append("maximumAmountAuthorisable");
        sb.append('=');
        sb.append(((this.maximumAmountAuthorisable == null)?"<null>":this.maximumAmountAuthorisable));
        sb.append(',');
        sb.append("maximumNumberReattempts");
        sb.append('=');
        sb.append(((this.maximumNumberReattempts == null)?"<null>":this.maximumNumberReattempts));
        sb.append(',');
        sb.append("merchantAdviceCode");
        sb.append('=');
        sb.append(((this.merchantAdviceCode == null)?"<null>":this.merchantAdviceCode));
        sb.append(',');
        sb.append("messageReasonCode");
        sb.append('=');
        sb.append(((this.messageReasonCode == null)?"<null>":this.messageReasonCode));
        sb.append(',');
        sb.append("messageToTransactionInitiatorCtrlCharacter");
        sb.append('=');
        sb.append(((this.messageToTransactionInitiatorCtrlCharacter == null)?"<null>":this.messageToTransactionInitiatorCtrlCharacter));
        sb.append(',');
        sb.append("messageToTransactionInitiatorMessage");
        sb.append('=');
        sb.append(((this.messageToTransactionInitiatorMessage == null)?"<null>":this.messageToTransactionInitiatorMessage));
        sb.append(',');
        sb.append("middleNameAccountMatchDecision");
        sb.append('=');
        sb.append(((this.middleNameAccountMatchDecision == null)?"<null>":this.middleNameAccountMatchDecision));
        sb.append(',');
        sb.append("modifiedElectronicCommerceAuthentification");
        sb.append('=');
        sb.append(((this.modifiedElectronicCommerceAuthentification == null)?"<null>":this.modifiedElectronicCommerceAuthentification));
        sb.append(',');
        sb.append("networkEquipmentIdentifier");
        sb.append('=');
        sb.append(((this.networkEquipmentIdentifier == null)?"<null>":this.networkEquipmentIdentifier));
        sb.append(',');
        sb.append("octBlocking");
        sb.append('=');
        sb.append(((this.octBlocking == null)?"<null>":this.octBlocking));
        sb.append(',');
        sb.append("onlineGameBlockingIndicator");
        sb.append('=');
        sb.append(((this.onlineGameBlockingIndicator == null)?"<null>":this.onlineGameBlockingIndicator));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("phoneNumberVerificationResult");
        sb.append('=');
        sb.append(((this.phoneNumberVerificationResult == null)?"<null>":this.phoneNumberVerificationResult));
        sb.append(',');
        sb.append("programDowngradeReasonCode");
        sb.append('=');
        sb.append(((this.programDowngradeReasonCode == null)?"<null>":this.programDowngradeReasonCode));
        sb.append(',');
        sb.append("reasonInformationCode");
        sb.append('=');
        sb.append(((this.reasonInformationCode == null)?"<null>":this.reasonInformationCode));
        sb.append(',');
        sb.append("reasonInformationEntitySource");
        sb.append('=');
        sb.append(((this.reasonInformationEntitySource == null)?"<null>":this.reasonInformationEntitySource));
        sb.append(',');
        sb.append("reattemptAllowedDuration");
        sb.append('=');
        sb.append(((this.reattemptAllowedDuration == null)?"<null>":this.reattemptAllowedDuration));
        sb.append(',');
        sb.append("reattemptFrozenPeriod");
        sb.append('=');
        sb.append(((this.reattemptFrozenPeriod == null)?"<null>":this.reattemptFrozenPeriod));
        sb.append(',');
        sb.append("respondingMachineId");
        sb.append('=');
        sb.append(((this.respondingMachineId == null)?"<null>":this.respondingMachineId));
        sb.append(',');
        sb.append("securityErrorField");
        sb.append('=');
        sb.append(((this.securityErrorField == null)?"<null>":this.securityErrorField));
        sb.append(',');
        sb.append("securityErrorNature");
        sb.append('=');
        sb.append(((this.securityErrorNature == null)?"<null>":this.securityErrorNature));
        sb.append(',');
        sb.append("terminalData");
        sb.append('=');
        sb.append(((this.terminalData == null)?"<null>":this.terminalData));
        sb.append(',');
        sb.append("uniqueTransactionIdNetworkSource");
        sb.append('=');
        sb.append(((this.uniqueTransactionIdNetworkSource == null)?"<null>":this.uniqueTransactionIdNetworkSource));
        sb.append(',');
        sb.append("uniqueTransactionIdValue");
        sb.append('=');
        sb.append(((this.uniqueTransactionIdValue == null)?"<null>":this.uniqueTransactionIdValue));
        sb.append(',');
        sb.append("validationCode");
        sb.append('=');
        sb.append(((this.validationCode == null)?"<null>":this.validationCode));
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
        result = ((result* 31)+((this.extendedMessageToInitiatorNature == null)? 0 :this.extendedMessageToInitiatorNature.hashCode()));
        result = ((result* 31)+((this.modifiedElectronicCommerceAuthentification == null)? 0 :this.modifiedElectronicCommerceAuthentification.hashCode()));
        result = ((result* 31)+((this.maximumAmountAuthorisable == null)? 0 :this.maximumAmountAuthorisable.hashCode()));
        result = ((result* 31)+((this.cardAuthenticationResultsCode == null)? 0 :this.cardAuthenticationResultsCode.hashCode()));
        result = ((result* 31)+((this.uniqueTransactionIdValue == null)? 0 :this.uniqueTransactionIdValue.hashCode()));
        result = ((result* 31)+((this.expenseThreshold == null)? 0 :this.expenseThreshold.hashCode()));
        result = ((result* 31)+((this.phoneNumberVerificationResult == null)? 0 :this.phoneNumberVerificationResult.hashCode()));
        result = ((result* 31)+((this.extendedMessageToInitiatorValue == null)? 0 :this.extendedMessageToInitiatorValue.hashCode()));
        result = ((result* 31)+((this.destinationCurrencyCode == null)? 0 :this.destinationCurrencyCode.hashCode()));
        result = ((result* 31)+((this.messageToTransactionInitiatorMessage == null)? 0 :this.messageToTransactionInitiatorMessage.hashCode()));
        result = ((result* 31)+((this.issuerFunctionalIdentifier == null)? 0 :this.issuerFunctionalIdentifier.hashCode()));
        result = ((result* 31)+((this.octBlocking == null)? 0 :this.octBlocking.hashCode()));
        result = ((result* 31)+((this.destinationCurrencyUnits == null)? 0 :this.destinationCurrencyUnits.hashCode()));
        result = ((result* 31)+((this.appliedMarketSpecificDataIndicator == null)? 0 :this.appliedMarketSpecificDataIndicator.hashCode()));
        result = ((result* 31)+((this.respondingMachineId == null)? 0 :this.respondingMachineId.hashCode()));
        result = ((result* 31)+((this.reasonInformationEntitySource == null)? 0 :this.reasonInformationEntitySource.hashCode()));
        result = ((result* 31)+((this.incorrectFieldNumber == null)? 0 :this.incorrectFieldNumber.hashCode()));
        result = ((result* 31)+((this.fastFundIndicator == null)? 0 :this.fastFundIndicator.hashCode()));
        result = ((result* 31)+((this.merchantAdviceCode == null)? 0 :this.merchantAdviceCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.terminalData == null)? 0 :this.terminalData.hashCode()));
        result = ((result* 31)+((this.cardholderAddressCheckingInformation == null)? 0 :this.cardholderAddressCheckingInformation.hashCode()));
        result = ((result* 31)+((this.cardTypeCode == null)? 0 :this.cardTypeCode.hashCode()));
        result = ((result* 31)+((this.cardholderBillingCurrencyUnits == null)? 0 :this.cardholderBillingCurrencyUnits.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applicationCryptogramProcessingInformation == null)? 0 :this.applicationCryptogramProcessingInformation.hashCode()));
        result = ((result* 31)+((this.reattemptFrozenPeriod == null)? 0 :this.reattemptFrozenPeriod.hashCode()));
        result = ((result* 31)+((this.reasonInformationCode == null)? 0 :this.reasonInformationCode.hashCode()));
        result = ((result* 31)+((this.cardholderBillingCurrencyCode == null)? 0 :this.cardholderBillingCurrencyCode.hashCode()));
        result = ((result* 31)+((this.fieldConversionFieldNumber == null)? 0 :this.fieldConversionFieldNumber.hashCode()));
        result = ((result* 31)+((this.fieldConversionEntitySource == null)? 0 :this.fieldConversionEntitySource.hashCode()));
        result = ((result* 31)+((this.fieldConversionResponsibleValue == null)? 0 :this.fieldConversionResponsibleValue.hashCode()));
        result = ((result* 31)+((this.incorrectFieldErrorCode == null)? 0 :this.incorrectFieldErrorCode.hashCode()));
        result = ((result* 31)+((this.emailAddressVerificationResult == null)? 0 :this.emailAddressVerificationResult.hashCode()));
        result = ((result* 31)+((this.incorrectSubfield == null)? 0 :this.incorrectSubfield.hashCode()));
        result = ((result* 31)+((this.validationCode == null)? 0 :this.validationCode.hashCode()));
        result = ((result* 31)+((this.reattemptAllowedDuration == null)? 0 :this.reattemptAllowedDuration.hashCode()));
        result = ((result* 31)+((this.acceptorAdvice == null)? 0 :this.acceptorAdvice.hashCode()));
        result = ((result* 31)+((this.onlineGameBlockingIndicator == null)? 0 :this.onlineGameBlockingIndicator.hashCode()));
        result = ((result* 31)+((this.firstNameAccountMatchDecision == null)? 0 :this.firstNameAccountMatchDecision.hashCode()));
        result = ((result* 31)+((this.issuerInstitutionCountryCode == null)? 0 :this.issuerInstitutionCountryCode.hashCode()));
        result = ((result* 31)+((this.accountFundingSource == null)? 0 :this.accountFundingSource.hashCode()));
        result = ((result* 31)+((this.cryptogramProcessingInformation == null)? 0 :this.cryptogramProcessingInformation.hashCode()));
        result = ((result* 31)+((this.accountNameRequestResult == null)? 0 :this.accountNameRequestResult.hashCode()));
        result = ((result* 31)+((this.geoRestrictionIndicator == null)? 0 :this.geoRestrictionIndicator.hashCode()));
        result = ((result* 31)+((this.appliedAuthorizationCharacteristicsIndicator == null)? 0 :this.appliedAuthorizationCharacteristicsIndicator.hashCode()));
        result = ((result* 31)+((this.mastercardMagstripeError == null)? 0 :this.mastercardMagstripeError.hashCode()));
        result = ((result* 31)+((this.lastNameAccountMatchDecision == null)? 0 :this.lastNameAccountMatchDecision.hashCode()));
        result = ((result* 31)+((this.mastercardMagstripeErrorCategory == null)? 0 :this.mastercardMagstripeErrorCategory.hashCode()));
        result = ((result* 31)+((this.networkEquipmentIdentifier == null)? 0 :this.networkEquipmentIdentifier.hashCode()));
        result = ((result* 31)+((this.maximumNumberReattempts == null)? 0 :this.maximumNumberReattempts.hashCode()));
        result = ((result* 31)+((this.messageToTransactionInitiatorCtrlCharacter == null)? 0 :this.messageToTransactionInitiatorCtrlCharacter.hashCode()));
        result = ((result* 31)+((this.messageReasonCode == null)? 0 :this.messageReasonCode.hashCode()));
        result = ((result* 31)+((this.middleNameAccountMatchDecision == null)? 0 :this.middleNameAccountMatchDecision.hashCode()));
        result = ((result* 31)+((this.addServiceReportData == null)? 0 :this.addServiceReportData.hashCode()));
        result = ((result* 31)+((this.programDowngradeReasonCode == null)? 0 :this.programDowngradeReasonCode.hashCode()));
        result = ((result* 31)+((this.addServiceReportId == null)? 0 :this.addServiceReportId.hashCode()));
        result = ((result* 31)+((this.securityErrorNature == null)? 0 :this.securityErrorNature.hashCode()));
        result = ((result* 31)+((this.securityErrorField == null)? 0 :this.securityErrorField.hashCode()));
        result = ((result* 31)+((this.uniqueTransactionIdNetworkSource == null)? 0 :this.uniqueTransactionIdNetworkSource.hashCode()));
        result = ((result* 31)+((this.fullNameAccountMatchDecision == null)? 0 :this.fullNameAccountMatchDecision.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONAdditionalResponseData) == false) {
            return false;
        }
        DICOOBJETJSONAdditionalResponseData rhs = ((DICOOBJETJSONAdditionalResponseData) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.extendedMessageToInitiatorNature == rhs.extendedMessageToInitiatorNature)||((this.extendedMessageToInitiatorNature!= null)&&this.extendedMessageToInitiatorNature.equals(rhs.extendedMessageToInitiatorNature)))&&((this.modifiedElectronicCommerceAuthentification == rhs.modifiedElectronicCommerceAuthentification)||((this.modifiedElectronicCommerceAuthentification!= null)&&this.modifiedElectronicCommerceAuthentification.equals(rhs.modifiedElectronicCommerceAuthentification))))&&((this.maximumAmountAuthorisable == rhs.maximumAmountAuthorisable)||((this.maximumAmountAuthorisable!= null)&&this.maximumAmountAuthorisable.equals(rhs.maximumAmountAuthorisable))))&&((this.cardAuthenticationResultsCode == rhs.cardAuthenticationResultsCode)||((this.cardAuthenticationResultsCode!= null)&&this.cardAuthenticationResultsCode.equals(rhs.cardAuthenticationResultsCode))))&&((this.uniqueTransactionIdValue == rhs.uniqueTransactionIdValue)||((this.uniqueTransactionIdValue!= null)&&this.uniqueTransactionIdValue.equals(rhs.uniqueTransactionIdValue))))&&((this.expenseThreshold == rhs.expenseThreshold)||((this.expenseThreshold!= null)&&this.expenseThreshold.equals(rhs.expenseThreshold))))&&((this.phoneNumberVerificationResult == rhs.phoneNumberVerificationResult)||((this.phoneNumberVerificationResult!= null)&&this.phoneNumberVerificationResult.equals(rhs.phoneNumberVerificationResult))))&&((this.extendedMessageToInitiatorValue == rhs.extendedMessageToInitiatorValue)||((this.extendedMessageToInitiatorValue!= null)&&this.extendedMessageToInitiatorValue.equals(rhs.extendedMessageToInitiatorValue))))&&((this.destinationCurrencyCode == rhs.destinationCurrencyCode)||((this.destinationCurrencyCode!= null)&&this.destinationCurrencyCode.equals(rhs.destinationCurrencyCode))))&&((this.messageToTransactionInitiatorMessage == rhs.messageToTransactionInitiatorMessage)||((this.messageToTransactionInitiatorMessage!= null)&&this.messageToTransactionInitiatorMessage.equals(rhs.messageToTransactionInitiatorMessage))))&&((this.issuerFunctionalIdentifier == rhs.issuerFunctionalIdentifier)||((this.issuerFunctionalIdentifier!= null)&&this.issuerFunctionalIdentifier.equals(rhs.issuerFunctionalIdentifier))))&&((this.octBlocking == rhs.octBlocking)||((this.octBlocking!= null)&&this.octBlocking.equals(rhs.octBlocking))))&&((this.destinationCurrencyUnits == rhs.destinationCurrencyUnits)||((this.destinationCurrencyUnits!= null)&&this.destinationCurrencyUnits.equals(rhs.destinationCurrencyUnits))))&&((this.appliedMarketSpecificDataIndicator == rhs.appliedMarketSpecificDataIndicator)||((this.appliedMarketSpecificDataIndicator!= null)&&this.appliedMarketSpecificDataIndicator.equals(rhs.appliedMarketSpecificDataIndicator))))&&((this.respondingMachineId == rhs.respondingMachineId)||((this.respondingMachineId!= null)&&this.respondingMachineId.equals(rhs.respondingMachineId))))&&((this.reasonInformationEntitySource == rhs.reasonInformationEntitySource)||((this.reasonInformationEntitySource!= null)&&this.reasonInformationEntitySource.equals(rhs.reasonInformationEntitySource))))&&((this.incorrectFieldNumber == rhs.incorrectFieldNumber)||((this.incorrectFieldNumber!= null)&&this.incorrectFieldNumber.equals(rhs.incorrectFieldNumber))))&&((this.fastFundIndicator == rhs.fastFundIndicator)||((this.fastFundIndicator!= null)&&this.fastFundIndicator.equals(rhs.fastFundIndicator))))&&((this.merchantAdviceCode == rhs.merchantAdviceCode)||((this.merchantAdviceCode!= null)&&this.merchantAdviceCode.equals(rhs.merchantAdviceCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.terminalData == rhs.terminalData)||((this.terminalData!= null)&&this.terminalData.equals(rhs.terminalData))))&&((this.cardholderAddressCheckingInformation == rhs.cardholderAddressCheckingInformation)||((this.cardholderAddressCheckingInformation!= null)&&this.cardholderAddressCheckingInformation.equals(rhs.cardholderAddressCheckingInformation))))&&((this.cardTypeCode == rhs.cardTypeCode)||((this.cardTypeCode!= null)&&this.cardTypeCode.equals(rhs.cardTypeCode))))&&((this.cardholderBillingCurrencyUnits == rhs.cardholderBillingCurrencyUnits)||((this.cardholderBillingCurrencyUnits!= null)&&this.cardholderBillingCurrencyUnits.equals(rhs.cardholderBillingCurrencyUnits))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applicationCryptogramProcessingInformation == rhs.applicationCryptogramProcessingInformation)||((this.applicationCryptogramProcessingInformation!= null)&&this.applicationCryptogramProcessingInformation.equals(rhs.applicationCryptogramProcessingInformation))))&&((this.reattemptFrozenPeriod == rhs.reattemptFrozenPeriod)||((this.reattemptFrozenPeriod!= null)&&this.reattemptFrozenPeriod.equals(rhs.reattemptFrozenPeriod))))&&((this.reasonInformationCode == rhs.reasonInformationCode)||((this.reasonInformationCode!= null)&&this.reasonInformationCode.equals(rhs.reasonInformationCode))))&&((this.cardholderBillingCurrencyCode == rhs.cardholderBillingCurrencyCode)||((this.cardholderBillingCurrencyCode!= null)&&this.cardholderBillingCurrencyCode.equals(rhs.cardholderBillingCurrencyCode))))&&((this.fieldConversionFieldNumber == rhs.fieldConversionFieldNumber)||((this.fieldConversionFieldNumber!= null)&&this.fieldConversionFieldNumber.equals(rhs.fieldConversionFieldNumber))))&&((this.fieldConversionEntitySource == rhs.fieldConversionEntitySource)||((this.fieldConversionEntitySource!= null)&&this.fieldConversionEntitySource.equals(rhs.fieldConversionEntitySource))))&&((this.fieldConversionResponsibleValue == rhs.fieldConversionResponsibleValue)||((this.fieldConversionResponsibleValue!= null)&&this.fieldConversionResponsibleValue.equals(rhs.fieldConversionResponsibleValue))))&&((this.incorrectFieldErrorCode == rhs.incorrectFieldErrorCode)||((this.incorrectFieldErrorCode!= null)&&this.incorrectFieldErrorCode.equals(rhs.incorrectFieldErrorCode))))&&((this.emailAddressVerificationResult == rhs.emailAddressVerificationResult)||((this.emailAddressVerificationResult!= null)&&this.emailAddressVerificationResult.equals(rhs.emailAddressVerificationResult))))&&((this.incorrectSubfield == rhs.incorrectSubfield)||((this.incorrectSubfield!= null)&&this.incorrectSubfield.equals(rhs.incorrectSubfield))))&&((this.validationCode == rhs.validationCode)||((this.validationCode!= null)&&this.validationCode.equals(rhs.validationCode))))&&((this.reattemptAllowedDuration == rhs.reattemptAllowedDuration)||((this.reattemptAllowedDuration!= null)&&this.reattemptAllowedDuration.equals(rhs.reattemptAllowedDuration))))&&((this.acceptorAdvice == rhs.acceptorAdvice)||((this.acceptorAdvice!= null)&&this.acceptorAdvice.equals(rhs.acceptorAdvice))))&&((this.onlineGameBlockingIndicator == rhs.onlineGameBlockingIndicator)||((this.onlineGameBlockingIndicator!= null)&&this.onlineGameBlockingIndicator.equals(rhs.onlineGameBlockingIndicator))))&&((this.firstNameAccountMatchDecision == rhs.firstNameAccountMatchDecision)||((this.firstNameAccountMatchDecision!= null)&&this.firstNameAccountMatchDecision.equals(rhs.firstNameAccountMatchDecision))))&&((this.issuerInstitutionCountryCode == rhs.issuerInstitutionCountryCode)||((this.issuerInstitutionCountryCode!= null)&&this.issuerInstitutionCountryCode.equals(rhs.issuerInstitutionCountryCode))))&&((this.accountFundingSource == rhs.accountFundingSource)||((this.accountFundingSource!= null)&&this.accountFundingSource.equals(rhs.accountFundingSource))))&&((this.cryptogramProcessingInformation == rhs.cryptogramProcessingInformation)||((this.cryptogramProcessingInformation!= null)&&this.cryptogramProcessingInformation.equals(rhs.cryptogramProcessingInformation))))&&((this.accountNameRequestResult == rhs.accountNameRequestResult)||((this.accountNameRequestResult!= null)&&this.accountNameRequestResult.equals(rhs.accountNameRequestResult))))&&((this.geoRestrictionIndicator == rhs.geoRestrictionIndicator)||((this.geoRestrictionIndicator!= null)&&this.geoRestrictionIndicator.equals(rhs.geoRestrictionIndicator))))&&((this.appliedAuthorizationCharacteristicsIndicator == rhs.appliedAuthorizationCharacteristicsIndicator)||((this.appliedAuthorizationCharacteristicsIndicator!= null)&&this.appliedAuthorizationCharacteristicsIndicator.equals(rhs.appliedAuthorizationCharacteristicsIndicator))))&&((this.mastercardMagstripeError == rhs.mastercardMagstripeError)||((this.mastercardMagstripeError!= null)&&this.mastercardMagstripeError.equals(rhs.mastercardMagstripeError))))&&((this.lastNameAccountMatchDecision == rhs.lastNameAccountMatchDecision)||((this.lastNameAccountMatchDecision!= null)&&this.lastNameAccountMatchDecision.equals(rhs.lastNameAccountMatchDecision))))&&((this.mastercardMagstripeErrorCategory == rhs.mastercardMagstripeErrorCategory)||((this.mastercardMagstripeErrorCategory!= null)&&this.mastercardMagstripeErrorCategory.equals(rhs.mastercardMagstripeErrorCategory))))&&((this.networkEquipmentIdentifier == rhs.networkEquipmentIdentifier)||((this.networkEquipmentIdentifier!= null)&&this.networkEquipmentIdentifier.equals(rhs.networkEquipmentIdentifier))))&&((this.maximumNumberReattempts == rhs.maximumNumberReattempts)||((this.maximumNumberReattempts!= null)&&this.maximumNumberReattempts.equals(rhs.maximumNumberReattempts))))&&((this.messageToTransactionInitiatorCtrlCharacter == rhs.messageToTransactionInitiatorCtrlCharacter)||((this.messageToTransactionInitiatorCtrlCharacter!= null)&&this.messageToTransactionInitiatorCtrlCharacter.equals(rhs.messageToTransactionInitiatorCtrlCharacter))))&&((this.messageReasonCode == rhs.messageReasonCode)||((this.messageReasonCode!= null)&&this.messageReasonCode.equals(rhs.messageReasonCode))))&&((this.middleNameAccountMatchDecision == rhs.middleNameAccountMatchDecision)||((this.middleNameAccountMatchDecision!= null)&&this.middleNameAccountMatchDecision.equals(rhs.middleNameAccountMatchDecision))))&&((this.addServiceReportData == rhs.addServiceReportData)||((this.addServiceReportData!= null)&&this.addServiceReportData.equals(rhs.addServiceReportData))))&&((this.programDowngradeReasonCode == rhs.programDowngradeReasonCode)||((this.programDowngradeReasonCode!= null)&&this.programDowngradeReasonCode.equals(rhs.programDowngradeReasonCode))))&&((this.addServiceReportId == rhs.addServiceReportId)||((this.addServiceReportId!= null)&&this.addServiceReportId.equals(rhs.addServiceReportId))))&&((this.securityErrorNature == rhs.securityErrorNature)||((this.securityErrorNature!= null)&&this.securityErrorNature.equals(rhs.securityErrorNature))))&&((this.securityErrorField == rhs.securityErrorField)||((this.securityErrorField!= null)&&this.securityErrorField.equals(rhs.securityErrorField))))&&((this.uniqueTransactionIdNetworkSource == rhs.uniqueTransactionIdNetworkSource)||((this.uniqueTransactionIdNetworkSource!= null)&&this.uniqueTransactionIdNetworkSource.equals(rhs.uniqueTransactionIdNetworkSource))))&&((this.fullNameAccountMatchDecision == rhs.fullNameAccountMatchDecision)||((this.fullNameAccountMatchDecision!= null)&&this.fullNameAccountMatchDecision.equals(rhs.fullNameAccountMatchDecision))));
    }

}
