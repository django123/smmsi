
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
    "acceptanceSystemCardProductCode",
    "accountNameVerificationNature",
    "applicationSelectionIndicator",
    "attendanceContext",
    "authenticationAmount",
    "authenticationDate",
    "authenticationProgramIndicator",
    "authorisationUnbundling",
    "blockedRoute",
    "buyingMethod",
    "cardDataEntryMode",
    "cardholderPresent",
    "cardholderVerificationMethod",
    "cardOnFileAction",
    "cardPresent",
    "cardSecurityCodePresence",
    "cardSecurityCodeValue",
    "cardSecurityCodeVerificationInformation",
    "decisionAlgorithmRoute",
    "domainIndicator",
    "dualRoute",
    "electronicCommerceAuthentication",
    "encryptionAlgorithm ",
    "extensionDualRoute",
    "extensionNominalRoute",
    "forwardingId",
    "functionCode",
    "fundsTransferApplicationNature",
    "fundTransferReason",
    "internationalAuthorisationNetwork",
    "issuerAuthenticationData",
    "jurisdiction",
    "kernelId",
    "keySerialNumber",
    "manualIndicator",
    "networkCodeDualRoute",
    "networkCodeNominalRoute",
    "networkService",
    "networkSubService",
    "nominalRoute",
    "paymentUseCase",
    "pointOfServiceConditionCode",
    "reasonsForNotHonouringExemptions",
    "regulatoryAndTechnicalEnvironment",
    "resendCounter",
    "schemeNature",
    "securizationNature",
    "serviceAttribute",
    "serviceIndicator",
    "statusOfMessageDisplayPrintCapability",
    "storedDataCategory ",
    "systemAuthenticatingTheCardholder",
    "tracabilityEventID",
    "traceabilityService",
    "transactionNature",
    "uuidContainerCategory",
    "uuidContainerValue",
    "visaB2BProgramId"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONTransactionContext implements Serializable
{

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("acceptanceSystemCardProductCode")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits")
    private String acceptanceSystemCardProductCode;
    @JsonProperty("accountNameVerificationNature")
    private List<AccountNameVerificationNatureCodeset> accountNameVerificationNature = new ArrayList<AccountNameVerificationNatureCodeset>();
    @JsonProperty("applicationSelectionIndicator")
    private List<ApplicationSelectionIndicatorCodeset> applicationSelectionIndicator = new ArrayList<ApplicationSelectionIndicatorCodeset>();
    @JsonProperty("attendanceContext")
    private List<AttendanceContextCodeset> attendanceContext = new ArrayList<AttendanceContextCodeset>();
    @JsonProperty("authenticationAmount")
    private AmountType authenticationAmount;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("authenticationDate")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String authenticationDate;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("authenticationProgramIndicator")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String authenticationProgramIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("authorisationUnbundling")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean authorisationUnbundling;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("blockedRoute")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean blockedRoute;
    @JsonProperty("buyingMethod")
    private List<BuyingMethodCodeset> buyingMethod = new ArrayList<BuyingMethodCodeset>();
    @JsonProperty("cardDataEntryMode")
    private List<CardDataEntryModeCodeset> cardDataEntryMode = new ArrayList<CardDataEntryModeCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardholderPresent")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean cardholderPresent;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 6 digits. (max of 4 bytes)
     * 
     */
    @JsonProperty("cardholderVerificationMethod")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 6 digits. (max of 4 bytes)")
    private String cardholderVerificationMethod;
    @JsonProperty("cardOnFileAction")
    private List<COFActionCodeset> cardOnFileAction = new ArrayList<COFActionCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardPresent")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean cardPresent;
    @JsonProperty("cardSecurityCodePresence")
    private List<CardSecurityCodePresenceCodeset> cardSecurityCodePresence = new ArrayList<CardSecurityCodePresenceCodeset>();
    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("cardSecurityCodeValue")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 3 digits.")
    private String cardSecurityCodeValue;
    @JsonProperty("cardSecurityCodeVerificationInformation")
    private List<CardSecurityCodeVerificationCodeset> cardSecurityCodeVerificationInformation = new ArrayList<CardSecurityCodeVerificationCodeset>();
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("decisionAlgorithmRoute")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String decisionAlgorithmRoute;
    @JsonProperty("domainIndicator")
    private List<DomainIndicatorCodeset> domainIndicator = new ArrayList<DomainIndicatorCodeset>();
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("dualRoute")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String dualRoute;
    @JsonProperty("electronicCommerceAuthentication")
    private List<ElectronicCommerceAuthenticationNature> electronicCommerceAuthentication = new ArrayList<ElectronicCommerceAuthenticationNature>();
    @JsonProperty("encryptionAlgorithm ")
    private List<EncryptionAlgorithmCodeset> encryptionAlgorithm = new ArrayList<EncryptionAlgorithmCodeset>();
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("extensionDualRoute")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.")
    private String extensionDualRoute;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("extensionNominalRoute")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.")
    private String extensionNominalRoute;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("forwardingId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String forwardingId;
    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("functionCode")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 3 digits.")
    private String functionCode;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("fundsTransferApplicationNature")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits")
    private String fundsTransferApplicationNature;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("fundTransferReason")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String fundTransferReason;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("internationalAuthorisationNetwork")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)")
    private String internationalAuthorisationNetwork;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("issuerAuthenticationData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)")
    private String issuerAuthenticationData;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("jurisdiction")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 50 characters")
    private String jurisdiction;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("kernelId")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)")
    private String kernelId;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 12 and a maxlength of 16 digits. (9 to 12 bytes)
     * 
     */
    @JsonProperty("keySerialNumber")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 12 and a maxlength of 16 digits. (9 to 12 bytes)")
    private String keySerialNumber;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("manualIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean manualIndicator;
    @JsonProperty("networkCodeDualRoute")
    private List<NetworkCodeset> networkCodeDualRoute = new ArrayList<NetworkCodeset>();
    @JsonProperty("networkCodeNominalRoute")
    private List<NetworkCodeset> networkCodeNominalRoute = new ArrayList<NetworkCodeset>();
    @JsonProperty("networkService")
    private List<NetworkServiceCodeset> networkService = new ArrayList<NetworkServiceCodeset>();
    @JsonProperty("networkSubService")
    private List<NetworkSubServiceCodeset> networkSubService = new ArrayList<NetworkSubServiceCodeset>();
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("nominalRoute")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String nominalRoute;
    @JsonProperty("paymentUseCase")
    private List<PaymentUseCaseCodeset> paymentUseCase = new ArrayList<PaymentUseCaseCodeset>();
    @JsonProperty("pointOfServiceConditionCode")
    private List<ServiceConditionCodeCodeset> pointOfServiceConditionCode = new ArrayList<ServiceConditionCodeCodeset>();
    /**
     *  4 alphanumeric characters
     * 
     */
    @JsonProperty("reasonsForNotHonouringExemptions")
    @JsonPropertyDescription("4 alphanumeric characters")
    private String reasonsForNotHonouringExemptions;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("regulatoryAndTechnicalEnvironment")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)")
    private String regulatoryAndTechnicalEnvironment;
    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("resendCounter")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 1 digits.")
    private String resendCounter;
    @JsonProperty("schemeNature")
    private List<NetworkCodeset> schemeNature = new ArrayList<NetworkCodeset>();
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("securizationNature")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String securizationNature;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("serviceAttribute")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String serviceAttribute;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("serviceIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean serviceIndicator;
    @JsonProperty("statusOfMessageDisplayPrintCapability")
    private List<StatusOfMessageDisplayPrintCapabilityCodeset> statusOfMessageDisplayPrintCapability = new ArrayList<StatusOfMessageDisplayPrintCapabilityCodeset>();
    @JsonProperty("storedDataCategory ")
    private List<StoredDataCategoryCodeSet> storedDataCategory = new ArrayList<StoredDataCategoryCodeSet>();
    @JsonProperty("systemAuthenticatingTheCardholder")
    private List<SystemAuthenticatingTheCardholderCodeset> systemAuthenticatingTheCardholder = new ArrayList<SystemAuthenticatingTheCardholderCodeset>();
    /**
     * UUID 
     * 
     */
    @JsonProperty("tracabilityEventID")
    @JsonPropertyDescription("UUID ")
    private String tracabilityEventID;
    @JsonProperty("traceabilityService")
    private List<TraceabilityServiceCodeset> traceabilityService = new ArrayList<TraceabilityServiceCodeset>();
    @JsonProperty("transactionNature")
    private List<TransactionNatureCodeset> transactionNature = new ArrayList<TransactionNatureCodeset>();
    @JsonProperty("uuidContainerCategory")
    private List<UUIDContainerCategoryCodeset> uuidContainerCategory = new ArrayList<UUIDContainerCategoryCodeset>();
    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("uuidContainerValue")
    @JsonPropertyDescription("36 alphanumeric  and special characters")
    private String uuidContainerValue;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 2 characters.
     * 
     */
    @JsonProperty("visaB2BProgramId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 2 characters.")
    private String visaB2BProgramId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7904540822330043094L;

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("acceptanceSystemCardProductCode")
    public String getAcceptanceSystemCardProductCode() {
        return acceptanceSystemCardProductCode;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("acceptanceSystemCardProductCode")
    public void setAcceptanceSystemCardProductCode(String acceptanceSystemCardProductCode) {
        this.acceptanceSystemCardProductCode = acceptanceSystemCardProductCode;
    }

    public DICOOBJETJSONTransactionContext withAcceptanceSystemCardProductCode(String acceptanceSystemCardProductCode) {
        this.acceptanceSystemCardProductCode = acceptanceSystemCardProductCode;
        return this;
    }

    @JsonProperty("accountNameVerificationNature")
    public List<AccountNameVerificationNatureCodeset> getAccountNameVerificationNature() {
        return accountNameVerificationNature;
    }

    @JsonProperty("accountNameVerificationNature")
    public void setAccountNameVerificationNature(List<AccountNameVerificationNatureCodeset> accountNameVerificationNature) {
        this.accountNameVerificationNature = accountNameVerificationNature;
    }

    public DICOOBJETJSONTransactionContext withAccountNameVerificationNature(List<AccountNameVerificationNatureCodeset> accountNameVerificationNature) {
        this.accountNameVerificationNature = accountNameVerificationNature;
        return this;
    }

    @JsonProperty("applicationSelectionIndicator")
    public List<ApplicationSelectionIndicatorCodeset> getApplicationSelectionIndicator() {
        return applicationSelectionIndicator;
    }

    @JsonProperty("applicationSelectionIndicator")
    public void setApplicationSelectionIndicator(List<ApplicationSelectionIndicatorCodeset> applicationSelectionIndicator) {
        this.applicationSelectionIndicator = applicationSelectionIndicator;
    }

    public DICOOBJETJSONTransactionContext withApplicationSelectionIndicator(List<ApplicationSelectionIndicatorCodeset> applicationSelectionIndicator) {
        this.applicationSelectionIndicator = applicationSelectionIndicator;
        return this;
    }

    @JsonProperty("attendanceContext")
    public List<AttendanceContextCodeset> getAttendanceContext() {
        return attendanceContext;
    }

    @JsonProperty("attendanceContext")
    public void setAttendanceContext(List<AttendanceContextCodeset> attendanceContext) {
        this.attendanceContext = attendanceContext;
    }

    public DICOOBJETJSONTransactionContext withAttendanceContext(List<AttendanceContextCodeset> attendanceContext) {
        this.attendanceContext = attendanceContext;
        return this;
    }

    @JsonProperty("authenticationAmount")
    public AmountType getAuthenticationAmount() {
        return authenticationAmount;
    }

    @JsonProperty("authenticationAmount")
    public void setAuthenticationAmount(AmountType authenticationAmount) {
        this.authenticationAmount = authenticationAmount;
    }

    public DICOOBJETJSONTransactionContext withAuthenticationAmount(AmountType authenticationAmount) {
        this.authenticationAmount = authenticationAmount;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("authenticationDate")
    public String getAuthenticationDate() {
        return authenticationDate;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("authenticationDate")
    public void setAuthenticationDate(String authenticationDate) {
        this.authenticationDate = authenticationDate;
    }

    public DICOOBJETJSONTransactionContext withAuthenticationDate(String authenticationDate) {
        this.authenticationDate = authenticationDate;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("authenticationProgramIndicator")
    public String getAuthenticationProgramIndicator() {
        return authenticationProgramIndicator;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("authenticationProgramIndicator")
    public void setAuthenticationProgramIndicator(String authenticationProgramIndicator) {
        this.authenticationProgramIndicator = authenticationProgramIndicator;
    }

    public DICOOBJETJSONTransactionContext withAuthenticationProgramIndicator(String authenticationProgramIndicator) {
        this.authenticationProgramIndicator = authenticationProgramIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("authorisationUnbundling")
    public Boolean getAuthorisationUnbundling() {
        return authorisationUnbundling;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("authorisationUnbundling")
    public void setAuthorisationUnbundling(Boolean authorisationUnbundling) {
        this.authorisationUnbundling = authorisationUnbundling;
    }

    public DICOOBJETJSONTransactionContext withAuthorisationUnbundling(Boolean authorisationUnbundling) {
        this.authorisationUnbundling = authorisationUnbundling;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("blockedRoute")
    public Boolean getBlockedRoute() {
        return blockedRoute;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("blockedRoute")
    public void setBlockedRoute(Boolean blockedRoute) {
        this.blockedRoute = blockedRoute;
    }

    public DICOOBJETJSONTransactionContext withBlockedRoute(Boolean blockedRoute) {
        this.blockedRoute = blockedRoute;
        return this;
    }

    @JsonProperty("buyingMethod")
    public List<BuyingMethodCodeset> getBuyingMethod() {
        return buyingMethod;
    }

    @JsonProperty("buyingMethod")
    public void setBuyingMethod(List<BuyingMethodCodeset> buyingMethod) {
        this.buyingMethod = buyingMethod;
    }

    public DICOOBJETJSONTransactionContext withBuyingMethod(List<BuyingMethodCodeset> buyingMethod) {
        this.buyingMethod = buyingMethod;
        return this;
    }

    @JsonProperty("cardDataEntryMode")
    public List<CardDataEntryModeCodeset> getCardDataEntryMode() {
        return cardDataEntryMode;
    }

    @JsonProperty("cardDataEntryMode")
    public void setCardDataEntryMode(List<CardDataEntryModeCodeset> cardDataEntryMode) {
        this.cardDataEntryMode = cardDataEntryMode;
    }

    public DICOOBJETJSONTransactionContext withCardDataEntryMode(List<CardDataEntryModeCodeset> cardDataEntryMode) {
        this.cardDataEntryMode = cardDataEntryMode;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardholderPresent")
    public Boolean getCardholderPresent() {
        return cardholderPresent;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardholderPresent")
    public void setCardholderPresent(Boolean cardholderPresent) {
        this.cardholderPresent = cardholderPresent;
    }

    public DICOOBJETJSONTransactionContext withCardholderPresent(Boolean cardholderPresent) {
        this.cardholderPresent = cardholderPresent;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 6 digits. (max of 4 bytes)
     * 
     */
    @JsonProperty("cardholderVerificationMethod")
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 6 digits. (max of 4 bytes)
     * 
     */
    @JsonProperty("cardholderVerificationMethod")
    public void setCardholderVerificationMethod(String cardholderVerificationMethod) {
        this.cardholderVerificationMethod = cardholderVerificationMethod;
    }

    public DICOOBJETJSONTransactionContext withCardholderVerificationMethod(String cardholderVerificationMethod) {
        this.cardholderVerificationMethod = cardholderVerificationMethod;
        return this;
    }

    @JsonProperty("cardOnFileAction")
    public List<COFActionCodeset> getCardOnFileAction() {
        return cardOnFileAction;
    }

    @JsonProperty("cardOnFileAction")
    public void setCardOnFileAction(List<COFActionCodeset> cardOnFileAction) {
        this.cardOnFileAction = cardOnFileAction;
    }

    public DICOOBJETJSONTransactionContext withCardOnFileAction(List<COFActionCodeset> cardOnFileAction) {
        this.cardOnFileAction = cardOnFileAction;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardPresent")
    public Boolean getCardPresent() {
        return cardPresent;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cardPresent")
    public void setCardPresent(Boolean cardPresent) {
        this.cardPresent = cardPresent;
    }

    public DICOOBJETJSONTransactionContext withCardPresent(Boolean cardPresent) {
        this.cardPresent = cardPresent;
        return this;
    }

    @JsonProperty("cardSecurityCodePresence")
    public List<CardSecurityCodePresenceCodeset> getCardSecurityCodePresence() {
        return cardSecurityCodePresence;
    }

    @JsonProperty("cardSecurityCodePresence")
    public void setCardSecurityCodePresence(List<CardSecurityCodePresenceCodeset> cardSecurityCodePresence) {
        this.cardSecurityCodePresence = cardSecurityCodePresence;
    }

    public DICOOBJETJSONTransactionContext withCardSecurityCodePresence(List<CardSecurityCodePresenceCodeset> cardSecurityCodePresence) {
        this.cardSecurityCodePresence = cardSecurityCodePresence;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("cardSecurityCodeValue")
    public String getCardSecurityCodeValue() {
        return cardSecurityCodeValue;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("cardSecurityCodeValue")
    public void setCardSecurityCodeValue(String cardSecurityCodeValue) {
        this.cardSecurityCodeValue = cardSecurityCodeValue;
    }

    public DICOOBJETJSONTransactionContext withCardSecurityCodeValue(String cardSecurityCodeValue) {
        this.cardSecurityCodeValue = cardSecurityCodeValue;
        return this;
    }

    @JsonProperty("cardSecurityCodeVerificationInformation")
    public List<CardSecurityCodeVerificationCodeset> getCardSecurityCodeVerificationInformation() {
        return cardSecurityCodeVerificationInformation;
    }

    @JsonProperty("cardSecurityCodeVerificationInformation")
    public void setCardSecurityCodeVerificationInformation(List<CardSecurityCodeVerificationCodeset> cardSecurityCodeVerificationInformation) {
        this.cardSecurityCodeVerificationInformation = cardSecurityCodeVerificationInformation;
    }

    public DICOOBJETJSONTransactionContext withCardSecurityCodeVerificationInformation(List<CardSecurityCodeVerificationCodeset> cardSecurityCodeVerificationInformation) {
        this.cardSecurityCodeVerificationInformation = cardSecurityCodeVerificationInformation;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("decisionAlgorithmRoute")
    public String getDecisionAlgorithmRoute() {
        return decisionAlgorithmRoute;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("decisionAlgorithmRoute")
    public void setDecisionAlgorithmRoute(String decisionAlgorithmRoute) {
        this.decisionAlgorithmRoute = decisionAlgorithmRoute;
    }

    public DICOOBJETJSONTransactionContext withDecisionAlgorithmRoute(String decisionAlgorithmRoute) {
        this.decisionAlgorithmRoute = decisionAlgorithmRoute;
        return this;
    }

    @JsonProperty("domainIndicator")
    public List<DomainIndicatorCodeset> getDomainIndicator() {
        return domainIndicator;
    }

    @JsonProperty("domainIndicator")
    public void setDomainIndicator(List<DomainIndicatorCodeset> domainIndicator) {
        this.domainIndicator = domainIndicator;
    }

    public DICOOBJETJSONTransactionContext withDomainIndicator(List<DomainIndicatorCodeset> domainIndicator) {
        this.domainIndicator = domainIndicator;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("dualRoute")
    public String getDualRoute() {
        return dualRoute;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("dualRoute")
    public void setDualRoute(String dualRoute) {
        this.dualRoute = dualRoute;
    }

    public DICOOBJETJSONTransactionContext withDualRoute(String dualRoute) {
        this.dualRoute = dualRoute;
        return this;
    }

    @JsonProperty("electronicCommerceAuthentication")
    public List<ElectronicCommerceAuthenticationNature> getElectronicCommerceAuthentication() {
        return electronicCommerceAuthentication;
    }

    @JsonProperty("electronicCommerceAuthentication")
    public void setElectronicCommerceAuthentication(List<ElectronicCommerceAuthenticationNature> electronicCommerceAuthentication) {
        this.electronicCommerceAuthentication = electronicCommerceAuthentication;
    }

    public DICOOBJETJSONTransactionContext withElectronicCommerceAuthentication(List<ElectronicCommerceAuthenticationNature> electronicCommerceAuthentication) {
        this.electronicCommerceAuthentication = electronicCommerceAuthentication;
        return this;
    }

    @JsonProperty("encryptionAlgorithm ")
    public List<EncryptionAlgorithmCodeset> getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    @JsonProperty("encryptionAlgorithm ")
    public void setEncryptionAlgorithm(List<EncryptionAlgorithmCodeset> encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public DICOOBJETJSONTransactionContext withEncryptionAlgorithm(List<EncryptionAlgorithmCodeset> encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("extensionDualRoute")
    public String getExtensionDualRoute() {
        return extensionDualRoute;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("extensionDualRoute")
    public void setExtensionDualRoute(String extensionDualRoute) {
        this.extensionDualRoute = extensionDualRoute;
    }

    public DICOOBJETJSONTransactionContext withExtensionDualRoute(String extensionDualRoute) {
        this.extensionDualRoute = extensionDualRoute;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("extensionNominalRoute")
    public String getExtensionNominalRoute() {
        return extensionNominalRoute;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("extensionNominalRoute")
    public void setExtensionNominalRoute(String extensionNominalRoute) {
        this.extensionNominalRoute = extensionNominalRoute;
    }

    public DICOOBJETJSONTransactionContext withExtensionNominalRoute(String extensionNominalRoute) {
        this.extensionNominalRoute = extensionNominalRoute;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("forwardingId")
    public String getForwardingId() {
        return forwardingId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("forwardingId")
    public void setForwardingId(String forwardingId) {
        this.forwardingId = forwardingId;
    }

    public DICOOBJETJSONTransactionContext withForwardingId(String forwardingId) {
        this.forwardingId = forwardingId;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("functionCode")
    public String getFunctionCode() {
        return functionCode;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("functionCode")
    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public DICOOBJETJSONTransactionContext withFunctionCode(String functionCode) {
        this.functionCode = functionCode;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("fundsTransferApplicationNature")
    public String getFundsTransferApplicationNature() {
        return fundsTransferApplicationNature;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("fundsTransferApplicationNature")
    public void setFundsTransferApplicationNature(String fundsTransferApplicationNature) {
        this.fundsTransferApplicationNature = fundsTransferApplicationNature;
    }

    public DICOOBJETJSONTransactionContext withFundsTransferApplicationNature(String fundsTransferApplicationNature) {
        this.fundsTransferApplicationNature = fundsTransferApplicationNature;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("fundTransferReason")
    public String getFundTransferReason() {
        return fundTransferReason;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("fundTransferReason")
    public void setFundTransferReason(String fundTransferReason) {
        this.fundTransferReason = fundTransferReason;
    }

    public DICOOBJETJSONTransactionContext withFundTransferReason(String fundTransferReason) {
        this.fundTransferReason = fundTransferReason;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("internationalAuthorisationNetwork")
    public String getInternationalAuthorisationNetwork() {
        return internationalAuthorisationNetwork;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("internationalAuthorisationNetwork")
    public void setInternationalAuthorisationNetwork(String internationalAuthorisationNetwork) {
        this.internationalAuthorisationNetwork = internationalAuthorisationNetwork;
    }

    public DICOOBJETJSONTransactionContext withInternationalAuthorisationNetwork(String internationalAuthorisationNetwork) {
        this.internationalAuthorisationNetwork = internationalAuthorisationNetwork;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("issuerAuthenticationData")
    public String getIssuerAuthenticationData() {
        return issuerAuthenticationData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("issuerAuthenticationData")
    public void setIssuerAuthenticationData(String issuerAuthenticationData) {
        this.issuerAuthenticationData = issuerAuthenticationData;
    }

    public DICOOBJETJSONTransactionContext withIssuerAuthenticationData(String issuerAuthenticationData) {
        this.issuerAuthenticationData = issuerAuthenticationData;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("jurisdiction")
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("jurisdiction")
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public DICOOBJETJSONTransactionContext withJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("kernelId")
    public String getKernelId() {
        return kernelId;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("kernelId")
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    public DICOOBJETJSONTransactionContext withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 12 and a maxlength of 16 digits. (9 to 12 bytes)
     * 
     */
    @JsonProperty("keySerialNumber")
    public String getKeySerialNumber() {
        return keySerialNumber;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 12 and a maxlength of 16 digits. (9 to 12 bytes)
     * 
     */
    @JsonProperty("keySerialNumber")
    public void setKeySerialNumber(String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }

    public DICOOBJETJSONTransactionContext withKeySerialNumber(String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("manualIndicator")
    public Boolean getManualIndicator() {
        return manualIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("manualIndicator")
    public void setManualIndicator(Boolean manualIndicator) {
        this.manualIndicator = manualIndicator;
    }

    public DICOOBJETJSONTransactionContext withManualIndicator(Boolean manualIndicator) {
        this.manualIndicator = manualIndicator;
        return this;
    }

    @JsonProperty("networkCodeDualRoute")
    public List<NetworkCodeset> getNetworkCodeDualRoute() {
        return networkCodeDualRoute;
    }

    @JsonProperty("networkCodeDualRoute")
    public void setNetworkCodeDualRoute(List<NetworkCodeset> networkCodeDualRoute) {
        this.networkCodeDualRoute = networkCodeDualRoute;
    }

    public DICOOBJETJSONTransactionContext withNetworkCodeDualRoute(List<NetworkCodeset> networkCodeDualRoute) {
        this.networkCodeDualRoute = networkCodeDualRoute;
        return this;
    }

    @JsonProperty("networkCodeNominalRoute")
    public List<NetworkCodeset> getNetworkCodeNominalRoute() {
        return networkCodeNominalRoute;
    }

    @JsonProperty("networkCodeNominalRoute")
    public void setNetworkCodeNominalRoute(List<NetworkCodeset> networkCodeNominalRoute) {
        this.networkCodeNominalRoute = networkCodeNominalRoute;
    }

    public DICOOBJETJSONTransactionContext withNetworkCodeNominalRoute(List<NetworkCodeset> networkCodeNominalRoute) {
        this.networkCodeNominalRoute = networkCodeNominalRoute;
        return this;
    }

    @JsonProperty("networkService")
    public List<NetworkServiceCodeset> getNetworkService() {
        return networkService;
    }

    @JsonProperty("networkService")
    public void setNetworkService(List<NetworkServiceCodeset> networkService) {
        this.networkService = networkService;
    }

    public DICOOBJETJSONTransactionContext withNetworkService(List<NetworkServiceCodeset> networkService) {
        this.networkService = networkService;
        return this;
    }

    @JsonProperty("networkSubService")
    public List<NetworkSubServiceCodeset> getNetworkSubService() {
        return networkSubService;
    }

    @JsonProperty("networkSubService")
    public void setNetworkSubService(List<NetworkSubServiceCodeset> networkSubService) {
        this.networkSubService = networkSubService;
    }

    public DICOOBJETJSONTransactionContext withNetworkSubService(List<NetworkSubServiceCodeset> networkSubService) {
        this.networkSubService = networkSubService;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("nominalRoute")
    public String getNominalRoute() {
        return nominalRoute;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("nominalRoute")
    public void setNominalRoute(String nominalRoute) {
        this.nominalRoute = nominalRoute;
    }

    public DICOOBJETJSONTransactionContext withNominalRoute(String nominalRoute) {
        this.nominalRoute = nominalRoute;
        return this;
    }

    @JsonProperty("paymentUseCase")
    public List<PaymentUseCaseCodeset> getPaymentUseCase() {
        return paymentUseCase;
    }

    @JsonProperty("paymentUseCase")
    public void setPaymentUseCase(List<PaymentUseCaseCodeset> paymentUseCase) {
        this.paymentUseCase = paymentUseCase;
    }

    public DICOOBJETJSONTransactionContext withPaymentUseCase(List<PaymentUseCaseCodeset> paymentUseCase) {
        this.paymentUseCase = paymentUseCase;
        return this;
    }

    @JsonProperty("pointOfServiceConditionCode")
    public List<ServiceConditionCodeCodeset> getPointOfServiceConditionCode() {
        return pointOfServiceConditionCode;
    }

    @JsonProperty("pointOfServiceConditionCode")
    public void setPointOfServiceConditionCode(List<ServiceConditionCodeCodeset> pointOfServiceConditionCode) {
        this.pointOfServiceConditionCode = pointOfServiceConditionCode;
    }

    public DICOOBJETJSONTransactionContext withPointOfServiceConditionCode(List<ServiceConditionCodeCodeset> pointOfServiceConditionCode) {
        this.pointOfServiceConditionCode = pointOfServiceConditionCode;
        return this;
    }

    /**
     *  4 alphanumeric characters
     * 
     */
    @JsonProperty("reasonsForNotHonouringExemptions")
    public String getReasonsForNotHonouringExemptions() {
        return reasonsForNotHonouringExemptions;
    }

    /**
     *  4 alphanumeric characters
     * 
     */
    @JsonProperty("reasonsForNotHonouringExemptions")
    public void setReasonsForNotHonouringExemptions(String reasonsForNotHonouringExemptions) {
        this.reasonsForNotHonouringExemptions = reasonsForNotHonouringExemptions;
    }

    public DICOOBJETJSONTransactionContext withReasonsForNotHonouringExemptions(String reasonsForNotHonouringExemptions) {
        this.reasonsForNotHonouringExemptions = reasonsForNotHonouringExemptions;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("regulatoryAndTechnicalEnvironment")
    public String getRegulatoryAndTechnicalEnvironment() {
        return regulatoryAndTechnicalEnvironment;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("regulatoryAndTechnicalEnvironment")
    public void setRegulatoryAndTechnicalEnvironment(String regulatoryAndTechnicalEnvironment) {
        this.regulatoryAndTechnicalEnvironment = regulatoryAndTechnicalEnvironment;
    }

    public DICOOBJETJSONTransactionContext withRegulatoryAndTechnicalEnvironment(String regulatoryAndTechnicalEnvironment) {
        this.regulatoryAndTechnicalEnvironment = regulatoryAndTechnicalEnvironment;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("resendCounter")
    public String getResendCounter() {
        return resendCounter;
    }

    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("resendCounter")
    public void setResendCounter(String resendCounter) {
        this.resendCounter = resendCounter;
    }

    public DICOOBJETJSONTransactionContext withResendCounter(String resendCounter) {
        this.resendCounter = resendCounter;
        return this;
    }

    @JsonProperty("schemeNature")
    public List<NetworkCodeset> getSchemeNature() {
        return schemeNature;
    }

    @JsonProperty("schemeNature")
    public void setSchemeNature(List<NetworkCodeset> schemeNature) {
        this.schemeNature = schemeNature;
    }

    public DICOOBJETJSONTransactionContext withSchemeNature(List<NetworkCodeset> schemeNature) {
        this.schemeNature = schemeNature;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("securizationNature")
    public String getSecurizationNature() {
        return securizationNature;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("securizationNature")
    public void setSecurizationNature(String securizationNature) {
        this.securizationNature = securizationNature;
    }

    public DICOOBJETJSONTransactionContext withSecurizationNature(String securizationNature) {
        this.securizationNature = securizationNature;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("serviceAttribute")
    public String getServiceAttribute() {
        return serviceAttribute;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("serviceAttribute")
    public void setServiceAttribute(String serviceAttribute) {
        this.serviceAttribute = serviceAttribute;
    }

    public DICOOBJETJSONTransactionContext withServiceAttribute(String serviceAttribute) {
        this.serviceAttribute = serviceAttribute;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("serviceIndicator")
    public Boolean getServiceIndicator() {
        return serviceIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("serviceIndicator")
    public void setServiceIndicator(Boolean serviceIndicator) {
        this.serviceIndicator = serviceIndicator;
    }

    public DICOOBJETJSONTransactionContext withServiceIndicator(Boolean serviceIndicator) {
        this.serviceIndicator = serviceIndicator;
        return this;
    }

    @JsonProperty("statusOfMessageDisplayPrintCapability")
    public List<StatusOfMessageDisplayPrintCapabilityCodeset> getStatusOfMessageDisplayPrintCapability() {
        return statusOfMessageDisplayPrintCapability;
    }

    @JsonProperty("statusOfMessageDisplayPrintCapability")
    public void setStatusOfMessageDisplayPrintCapability(List<StatusOfMessageDisplayPrintCapabilityCodeset> statusOfMessageDisplayPrintCapability) {
        this.statusOfMessageDisplayPrintCapability = statusOfMessageDisplayPrintCapability;
    }

    public DICOOBJETJSONTransactionContext withStatusOfMessageDisplayPrintCapability(List<StatusOfMessageDisplayPrintCapabilityCodeset> statusOfMessageDisplayPrintCapability) {
        this.statusOfMessageDisplayPrintCapability = statusOfMessageDisplayPrintCapability;
        return this;
    }

    @JsonProperty("storedDataCategory ")
    public List<StoredDataCategoryCodeSet> getStoredDataCategory() {
        return storedDataCategory;
    }

    @JsonProperty("storedDataCategory ")
    public void setStoredDataCategory(List<StoredDataCategoryCodeSet> storedDataCategory) {
        this.storedDataCategory = storedDataCategory;
    }

    public DICOOBJETJSONTransactionContext withStoredDataCategory(List<StoredDataCategoryCodeSet> storedDataCategory) {
        this.storedDataCategory = storedDataCategory;
        return this;
    }

    @JsonProperty("systemAuthenticatingTheCardholder")
    public List<SystemAuthenticatingTheCardholderCodeset> getSystemAuthenticatingTheCardholder() {
        return systemAuthenticatingTheCardholder;
    }

    @JsonProperty("systemAuthenticatingTheCardholder")
    public void setSystemAuthenticatingTheCardholder(List<SystemAuthenticatingTheCardholderCodeset> systemAuthenticatingTheCardholder) {
        this.systemAuthenticatingTheCardholder = systemAuthenticatingTheCardholder;
    }

    public DICOOBJETJSONTransactionContext withSystemAuthenticatingTheCardholder(List<SystemAuthenticatingTheCardholderCodeset> systemAuthenticatingTheCardholder) {
        this.systemAuthenticatingTheCardholder = systemAuthenticatingTheCardholder;
        return this;
    }

    /**
     * UUID 
     * 
     */
    @JsonProperty("tracabilityEventID")
    public String getTracabilityEventID() {
        return tracabilityEventID;
    }

    /**
     * UUID 
     * 
     */
    @JsonProperty("tracabilityEventID")
    public void setTracabilityEventID(String tracabilityEventID) {
        this.tracabilityEventID = tracabilityEventID;
    }

    public DICOOBJETJSONTransactionContext withTracabilityEventID(String tracabilityEventID) {
        this.tracabilityEventID = tracabilityEventID;
        return this;
    }

    @JsonProperty("traceabilityService")
    public List<TraceabilityServiceCodeset> getTraceabilityService() {
        return traceabilityService;
    }

    @JsonProperty("traceabilityService")
    public void setTraceabilityService(List<TraceabilityServiceCodeset> traceabilityService) {
        this.traceabilityService = traceabilityService;
    }

    public DICOOBJETJSONTransactionContext withTraceabilityService(List<TraceabilityServiceCodeset> traceabilityService) {
        this.traceabilityService = traceabilityService;
        return this;
    }

    @JsonProperty("transactionNature")
    public List<TransactionNatureCodeset> getTransactionNature() {
        return transactionNature;
    }

    @JsonProperty("transactionNature")
    public void setTransactionNature(List<TransactionNatureCodeset> transactionNature) {
        this.transactionNature = transactionNature;
    }

    public DICOOBJETJSONTransactionContext withTransactionNature(List<TransactionNatureCodeset> transactionNature) {
        this.transactionNature = transactionNature;
        return this;
    }

    @JsonProperty("uuidContainerCategory")
    public List<UUIDContainerCategoryCodeset> getUuidContainerCategory() {
        return uuidContainerCategory;
    }

    @JsonProperty("uuidContainerCategory")
    public void setUuidContainerCategory(List<UUIDContainerCategoryCodeset> uuidContainerCategory) {
        this.uuidContainerCategory = uuidContainerCategory;
    }

    public DICOOBJETJSONTransactionContext withUuidContainerCategory(List<UUIDContainerCategoryCodeset> uuidContainerCategory) {
        this.uuidContainerCategory = uuidContainerCategory;
        return this;
    }

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("uuidContainerValue")
    public String getUuidContainerValue() {
        return uuidContainerValue;
    }

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("uuidContainerValue")
    public void setUuidContainerValue(String uuidContainerValue) {
        this.uuidContainerValue = uuidContainerValue;
    }

    public DICOOBJETJSONTransactionContext withUuidContainerValue(String uuidContainerValue) {
        this.uuidContainerValue = uuidContainerValue;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 2 characters.
     * 
     */
    @JsonProperty("visaB2BProgramId")
    public String getVisaB2BProgramId() {
        return visaB2BProgramId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 2 characters.
     * 
     */
    @JsonProperty("visaB2BProgramId")
    public void setVisaB2BProgramId(String visaB2BProgramId) {
        this.visaB2BProgramId = visaB2BProgramId;
    }

    public DICOOBJETJSONTransactionContext withVisaB2BProgramId(String visaB2BProgramId) {
        this.visaB2BProgramId = visaB2BProgramId;
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

    public DICOOBJETJSONTransactionContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONTransactionContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acceptanceSystemCardProductCode");
        sb.append('=');
        sb.append(((this.acceptanceSystemCardProductCode == null)?"<null>":this.acceptanceSystemCardProductCode));
        sb.append(',');
        sb.append("accountNameVerificationNature");
        sb.append('=');
        sb.append(((this.accountNameVerificationNature == null)?"<null>":this.accountNameVerificationNature));
        sb.append(',');
        sb.append("applicationSelectionIndicator");
        sb.append('=');
        sb.append(((this.applicationSelectionIndicator == null)?"<null>":this.applicationSelectionIndicator));
        sb.append(',');
        sb.append("attendanceContext");
        sb.append('=');
        sb.append(((this.attendanceContext == null)?"<null>":this.attendanceContext));
        sb.append(',');
        sb.append("authenticationAmount");
        sb.append('=');
        sb.append(((this.authenticationAmount == null)?"<null>":this.authenticationAmount));
        sb.append(',');
        sb.append("authenticationDate");
        sb.append('=');
        sb.append(((this.authenticationDate == null)?"<null>":this.authenticationDate));
        sb.append(',');
        sb.append("authenticationProgramIndicator");
        sb.append('=');
        sb.append(((this.authenticationProgramIndicator == null)?"<null>":this.authenticationProgramIndicator));
        sb.append(',');
        sb.append("authorisationUnbundling");
        sb.append('=');
        sb.append(((this.authorisationUnbundling == null)?"<null>":this.authorisationUnbundling));
        sb.append(',');
        sb.append("blockedRoute");
        sb.append('=');
        sb.append(((this.blockedRoute == null)?"<null>":this.blockedRoute));
        sb.append(',');
        sb.append("buyingMethod");
        sb.append('=');
        sb.append(((this.buyingMethod == null)?"<null>":this.buyingMethod));
        sb.append(',');
        sb.append("cardDataEntryMode");
        sb.append('=');
        sb.append(((this.cardDataEntryMode == null)?"<null>":this.cardDataEntryMode));
        sb.append(',');
        sb.append("cardholderPresent");
        sb.append('=');
        sb.append(((this.cardholderPresent == null)?"<null>":this.cardholderPresent));
        sb.append(',');
        sb.append("cardholderVerificationMethod");
        sb.append('=');
        sb.append(((this.cardholderVerificationMethod == null)?"<null>":this.cardholderVerificationMethod));
        sb.append(',');
        sb.append("cardOnFileAction");
        sb.append('=');
        sb.append(((this.cardOnFileAction == null)?"<null>":this.cardOnFileAction));
        sb.append(',');
        sb.append("cardPresent");
        sb.append('=');
        sb.append(((this.cardPresent == null)?"<null>":this.cardPresent));
        sb.append(',');
        sb.append("cardSecurityCodePresence");
        sb.append('=');
        sb.append(((this.cardSecurityCodePresence == null)?"<null>":this.cardSecurityCodePresence));
        sb.append(',');
        sb.append("cardSecurityCodeValue");
        sb.append('=');
        sb.append(((this.cardSecurityCodeValue == null)?"<null>":this.cardSecurityCodeValue));
        sb.append(',');
        sb.append("cardSecurityCodeVerificationInformation");
        sb.append('=');
        sb.append(((this.cardSecurityCodeVerificationInformation == null)?"<null>":this.cardSecurityCodeVerificationInformation));
        sb.append(',');
        sb.append("decisionAlgorithmRoute");
        sb.append('=');
        sb.append(((this.decisionAlgorithmRoute == null)?"<null>":this.decisionAlgorithmRoute));
        sb.append(',');
        sb.append("domainIndicator");
        sb.append('=');
        sb.append(((this.domainIndicator == null)?"<null>":this.domainIndicator));
        sb.append(',');
        sb.append("dualRoute");
        sb.append('=');
        sb.append(((this.dualRoute == null)?"<null>":this.dualRoute));
        sb.append(',');
        sb.append("electronicCommerceAuthentication");
        sb.append('=');
        sb.append(((this.electronicCommerceAuthentication == null)?"<null>":this.electronicCommerceAuthentication));
        sb.append(',');
        sb.append("encryptionAlgorithm");
        sb.append('=');
        sb.append(((this.encryptionAlgorithm == null)?"<null>":this.encryptionAlgorithm));
        sb.append(',');
        sb.append("extensionDualRoute");
        sb.append('=');
        sb.append(((this.extensionDualRoute == null)?"<null>":this.extensionDualRoute));
        sb.append(',');
        sb.append("extensionNominalRoute");
        sb.append('=');
        sb.append(((this.extensionNominalRoute == null)?"<null>":this.extensionNominalRoute));
        sb.append(',');
        sb.append("forwardingId");
        sb.append('=');
        sb.append(((this.forwardingId == null)?"<null>":this.forwardingId));
        sb.append(',');
        sb.append("functionCode");
        sb.append('=');
        sb.append(((this.functionCode == null)?"<null>":this.functionCode));
        sb.append(',');
        sb.append("fundsTransferApplicationNature");
        sb.append('=');
        sb.append(((this.fundsTransferApplicationNature == null)?"<null>":this.fundsTransferApplicationNature));
        sb.append(',');
        sb.append("fundTransferReason");
        sb.append('=');
        sb.append(((this.fundTransferReason == null)?"<null>":this.fundTransferReason));
        sb.append(',');
        sb.append("internationalAuthorisationNetwork");
        sb.append('=');
        sb.append(((this.internationalAuthorisationNetwork == null)?"<null>":this.internationalAuthorisationNetwork));
        sb.append(',');
        sb.append("issuerAuthenticationData");
        sb.append('=');
        sb.append(((this.issuerAuthenticationData == null)?"<null>":this.issuerAuthenticationData));
        sb.append(',');
        sb.append("jurisdiction");
        sb.append('=');
        sb.append(((this.jurisdiction == null)?"<null>":this.jurisdiction));
        sb.append(',');
        sb.append("kernelId");
        sb.append('=');
        sb.append(((this.kernelId == null)?"<null>":this.kernelId));
        sb.append(',');
        sb.append("keySerialNumber");
        sb.append('=');
        sb.append(((this.keySerialNumber == null)?"<null>":this.keySerialNumber));
        sb.append(',');
        sb.append("manualIndicator");
        sb.append('=');
        sb.append(((this.manualIndicator == null)?"<null>":this.manualIndicator));
        sb.append(',');
        sb.append("networkCodeDualRoute");
        sb.append('=');
        sb.append(((this.networkCodeDualRoute == null)?"<null>":this.networkCodeDualRoute));
        sb.append(',');
        sb.append("networkCodeNominalRoute");
        sb.append('=');
        sb.append(((this.networkCodeNominalRoute == null)?"<null>":this.networkCodeNominalRoute));
        sb.append(',');
        sb.append("networkService");
        sb.append('=');
        sb.append(((this.networkService == null)?"<null>":this.networkService));
        sb.append(',');
        sb.append("networkSubService");
        sb.append('=');
        sb.append(((this.networkSubService == null)?"<null>":this.networkSubService));
        sb.append(',');
        sb.append("nominalRoute");
        sb.append('=');
        sb.append(((this.nominalRoute == null)?"<null>":this.nominalRoute));
        sb.append(',');
        sb.append("paymentUseCase");
        sb.append('=');
        sb.append(((this.paymentUseCase == null)?"<null>":this.paymentUseCase));
        sb.append(',');
        sb.append("pointOfServiceConditionCode");
        sb.append('=');
        sb.append(((this.pointOfServiceConditionCode == null)?"<null>":this.pointOfServiceConditionCode));
        sb.append(',');
        sb.append("reasonsForNotHonouringExemptions");
        sb.append('=');
        sb.append(((this.reasonsForNotHonouringExemptions == null)?"<null>":this.reasonsForNotHonouringExemptions));
        sb.append(',');
        sb.append("regulatoryAndTechnicalEnvironment");
        sb.append('=');
        sb.append(((this.regulatoryAndTechnicalEnvironment == null)?"<null>":this.regulatoryAndTechnicalEnvironment));
        sb.append(',');
        sb.append("resendCounter");
        sb.append('=');
        sb.append(((this.resendCounter == null)?"<null>":this.resendCounter));
        sb.append(',');
        sb.append("schemeNature");
        sb.append('=');
        sb.append(((this.schemeNature == null)?"<null>":this.schemeNature));
        sb.append(',');
        sb.append("securizationNature");
        sb.append('=');
        sb.append(((this.securizationNature == null)?"<null>":this.securizationNature));
        sb.append(',');
        sb.append("serviceAttribute");
        sb.append('=');
        sb.append(((this.serviceAttribute == null)?"<null>":this.serviceAttribute));
        sb.append(',');
        sb.append("serviceIndicator");
        sb.append('=');
        sb.append(((this.serviceIndicator == null)?"<null>":this.serviceIndicator));
        sb.append(',');
        sb.append("statusOfMessageDisplayPrintCapability");
        sb.append('=');
        sb.append(((this.statusOfMessageDisplayPrintCapability == null)?"<null>":this.statusOfMessageDisplayPrintCapability));
        sb.append(',');
        sb.append("storedDataCategory");
        sb.append('=');
        sb.append(((this.storedDataCategory == null)?"<null>":this.storedDataCategory));
        sb.append(',');
        sb.append("systemAuthenticatingTheCardholder");
        sb.append('=');
        sb.append(((this.systemAuthenticatingTheCardholder == null)?"<null>":this.systemAuthenticatingTheCardholder));
        sb.append(',');
        sb.append("tracabilityEventID");
        sb.append('=');
        sb.append(((this.tracabilityEventID == null)?"<null>":this.tracabilityEventID));
        sb.append(',');
        sb.append("traceabilityService");
        sb.append('=');
        sb.append(((this.traceabilityService == null)?"<null>":this.traceabilityService));
        sb.append(',');
        sb.append("transactionNature");
        sb.append('=');
        sb.append(((this.transactionNature == null)?"<null>":this.transactionNature));
        sb.append(',');
        sb.append("uuidContainerCategory");
        sb.append('=');
        sb.append(((this.uuidContainerCategory == null)?"<null>":this.uuidContainerCategory));
        sb.append(',');
        sb.append("uuidContainerValue");
        sb.append('=');
        sb.append(((this.uuidContainerValue == null)?"<null>":this.uuidContainerValue));
        sb.append(',');
        sb.append("visaB2BProgramId");
        sb.append('=');
        sb.append(((this.visaB2BProgramId == null)?"<null>":this.visaB2BProgramId));
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
        result = ((result* 31)+((this.attendanceContext == null)? 0 :this.attendanceContext.hashCode()));
        result = ((result* 31)+((this.kernelId == null)? 0 :this.kernelId.hashCode()));
        result = ((result* 31)+((this.cardSecurityCodeValue == null)? 0 :this.cardSecurityCodeValue.hashCode()));
        result = ((result* 31)+((this.functionCode == null)? 0 :this.functionCode.hashCode()));
        result = ((result* 31)+((this.cardholderVerificationMethod == null)? 0 :this.cardholderVerificationMethod.hashCode()));
        result = ((result* 31)+((this.storedDataCategory == null)? 0 :this.storedDataCategory.hashCode()));
        result = ((result* 31)+((this.decisionAlgorithmRoute == null)? 0 :this.decisionAlgorithmRoute.hashCode()));
        result = ((result* 31)+((this.electronicCommerceAuthentication == null)? 0 :this.electronicCommerceAuthentication.hashCode()));
        result = ((result* 31)+((this.encryptionAlgorithm == null)? 0 :this.encryptionAlgorithm.hashCode()));
        result = ((result* 31)+((this.networkService == null)? 0 :this.networkService.hashCode()));
        result = ((result* 31)+((this.networkCodeNominalRoute == null)? 0 :this.networkCodeNominalRoute.hashCode()));
        result = ((result* 31)+((this.visaB2BProgramId == null)? 0 :this.visaB2BProgramId.hashCode()));
        result = ((result* 31)+((this.resendCounter == null)? 0 :this.resendCounter.hashCode()));
        result = ((result* 31)+((this.uuidContainerValue == null)? 0 :this.uuidContainerValue.hashCode()));
        result = ((result* 31)+((this.forwardingId == null)? 0 :this.forwardingId.hashCode()));
        result = ((result* 31)+((this.fundTransferReason == null)? 0 :this.fundTransferReason.hashCode()));
        result = ((result* 31)+((this.regulatoryAndTechnicalEnvironment == null)? 0 :this.regulatoryAndTechnicalEnvironment.hashCode()));
        result = ((result* 31)+((this.nominalRoute == null)? 0 :this.nominalRoute.hashCode()));
        result = ((result* 31)+((this.systemAuthenticatingTheCardholder == null)? 0 :this.systemAuthenticatingTheCardholder.hashCode()));
        result = ((result* 31)+((this.cardholderPresent == null)? 0 :this.cardholderPresent.hashCode()));
        result = ((result* 31)+((this.applicationSelectionIndicator == null)? 0 :this.applicationSelectionIndicator.hashCode()));
        result = ((result* 31)+((this.securizationNature == null)? 0 :this.securizationNature.hashCode()));
        result = ((result* 31)+((this.blockedRoute == null)? 0 :this.blockedRoute.hashCode()));
        result = ((result* 31)+((this.serviceAttribute == null)? 0 :this.serviceAttribute.hashCode()));
        result = ((result* 31)+((this.accountNameVerificationNature == null)? 0 :this.accountNameVerificationNature.hashCode()));
        result = ((result* 31)+((this.traceabilityService == null)? 0 :this.traceabilityService.hashCode()));
        result = ((result* 31)+((this.transactionNature == null)? 0 :this.transactionNature.hashCode()));
        result = ((result* 31)+((this.authenticationAmount == null)? 0 :this.authenticationAmount.hashCode()));
        result = ((result* 31)+((this.keySerialNumber == null)? 0 :this.keySerialNumber.hashCode()));
        result = ((result* 31)+((this.reasonsForNotHonouringExemptions == null)? 0 :this.reasonsForNotHonouringExemptions.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentUseCase == null)? 0 :this.paymentUseCase.hashCode()));
        result = ((result* 31)+((this.acceptanceSystemCardProductCode == null)? 0 :this.acceptanceSystemCardProductCode.hashCode()));
        result = ((result* 31)+((this.extensionNominalRoute == null)? 0 :this.extensionNominalRoute.hashCode()));
        result = ((result* 31)+((this.networkCodeDualRoute == null)? 0 :this.networkCodeDualRoute.hashCode()));
        result = ((result* 31)+((this.buyingMethod == null)? 0 :this.buyingMethod.hashCode()));
        result = ((result* 31)+((this.extensionDualRoute == null)? 0 :this.extensionDualRoute.hashCode()));
        result = ((result* 31)+((this.internationalAuthorisationNetwork == null)? 0 :this.internationalAuthorisationNetwork.hashCode()));
        result = ((result* 31)+((this.cardDataEntryMode == null)? 0 :this.cardDataEntryMode.hashCode()));
        result = ((result* 31)+((this.jurisdiction == null)? 0 :this.jurisdiction.hashCode()));
        result = ((result* 31)+((this.dualRoute == null)? 0 :this.dualRoute.hashCode()));
        result = ((result* 31)+((this.serviceIndicator == null)? 0 :this.serviceIndicator.hashCode()));
        result = ((result* 31)+((this.authorisationUnbundling == null)? 0 :this.authorisationUnbundling.hashCode()));
        result = ((result* 31)+((this.schemeNature == null)? 0 :this.schemeNature.hashCode()));
        result = ((result* 31)+((this.issuerAuthenticationData == null)? 0 :this.issuerAuthenticationData.hashCode()));
        result = ((result* 31)+((this.authenticationDate == null)? 0 :this.authenticationDate.hashCode()));
        result = ((result* 31)+((this.cardOnFileAction == null)? 0 :this.cardOnFileAction.hashCode()));
        result = ((result* 31)+((this.tracabilityEventID == null)? 0 :this.tracabilityEventID.hashCode()));
        result = ((result* 31)+((this.manualIndicator == null)? 0 :this.manualIndicator.hashCode()));
        result = ((result* 31)+((this.cardSecurityCodePresence == null)? 0 :this.cardSecurityCodePresence.hashCode()));
        result = ((result* 31)+((this.uuidContainerCategory == null)? 0 :this.uuidContainerCategory.hashCode()));
        result = ((result* 31)+((this.networkSubService == null)? 0 :this.networkSubService.hashCode()));
        result = ((result* 31)+((this.authenticationProgramIndicator == null)? 0 :this.authenticationProgramIndicator.hashCode()));
        result = ((result* 31)+((this.cardSecurityCodeVerificationInformation == null)? 0 :this.cardSecurityCodeVerificationInformation.hashCode()));
        result = ((result* 31)+((this.domainIndicator == null)? 0 :this.domainIndicator.hashCode()));
        result = ((result* 31)+((this.pointOfServiceConditionCode == null)? 0 :this.pointOfServiceConditionCode.hashCode()));
        result = ((result* 31)+((this.fundsTransferApplicationNature == null)? 0 :this.fundsTransferApplicationNature.hashCode()));
        result = ((result* 31)+((this.statusOfMessageDisplayPrintCapability == null)? 0 :this.statusOfMessageDisplayPrintCapability.hashCode()));
        result = ((result* 31)+((this.cardPresent == null)? 0 :this.cardPresent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONTransactionContext) == false) {
            return false;
        }
        DICOOBJETJSONTransactionContext rhs = ((DICOOBJETJSONTransactionContext) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.attendanceContext == rhs.attendanceContext)||((this.attendanceContext!= null)&&this.attendanceContext.equals(rhs.attendanceContext)))&&((this.kernelId == rhs.kernelId)||((this.kernelId!= null)&&this.kernelId.equals(rhs.kernelId))))&&((this.cardSecurityCodeValue == rhs.cardSecurityCodeValue)||((this.cardSecurityCodeValue!= null)&&this.cardSecurityCodeValue.equals(rhs.cardSecurityCodeValue))))&&((this.functionCode == rhs.functionCode)||((this.functionCode!= null)&&this.functionCode.equals(rhs.functionCode))))&&((this.cardholderVerificationMethod == rhs.cardholderVerificationMethod)||((this.cardholderVerificationMethod!= null)&&this.cardholderVerificationMethod.equals(rhs.cardholderVerificationMethod))))&&((this.storedDataCategory == rhs.storedDataCategory)||((this.storedDataCategory!= null)&&this.storedDataCategory.equals(rhs.storedDataCategory))))&&((this.decisionAlgorithmRoute == rhs.decisionAlgorithmRoute)||((this.decisionAlgorithmRoute!= null)&&this.decisionAlgorithmRoute.equals(rhs.decisionAlgorithmRoute))))&&((this.electronicCommerceAuthentication == rhs.electronicCommerceAuthentication)||((this.electronicCommerceAuthentication!= null)&&this.electronicCommerceAuthentication.equals(rhs.electronicCommerceAuthentication))))&&((this.encryptionAlgorithm == rhs.encryptionAlgorithm)||((this.encryptionAlgorithm!= null)&&this.encryptionAlgorithm.equals(rhs.encryptionAlgorithm))))&&((this.networkService == rhs.networkService)||((this.networkService!= null)&&this.networkService.equals(rhs.networkService))))&&((this.networkCodeNominalRoute == rhs.networkCodeNominalRoute)||((this.networkCodeNominalRoute!= null)&&this.networkCodeNominalRoute.equals(rhs.networkCodeNominalRoute))))&&((this.visaB2BProgramId == rhs.visaB2BProgramId)||((this.visaB2BProgramId!= null)&&this.visaB2BProgramId.equals(rhs.visaB2BProgramId))))&&((this.resendCounter == rhs.resendCounter)||((this.resendCounter!= null)&&this.resendCounter.equals(rhs.resendCounter))))&&((this.uuidContainerValue == rhs.uuidContainerValue)||((this.uuidContainerValue!= null)&&this.uuidContainerValue.equals(rhs.uuidContainerValue))))&&((this.forwardingId == rhs.forwardingId)||((this.forwardingId!= null)&&this.forwardingId.equals(rhs.forwardingId))))&&((this.fundTransferReason == rhs.fundTransferReason)||((this.fundTransferReason!= null)&&this.fundTransferReason.equals(rhs.fundTransferReason))))&&((this.regulatoryAndTechnicalEnvironment == rhs.regulatoryAndTechnicalEnvironment)||((this.regulatoryAndTechnicalEnvironment!= null)&&this.regulatoryAndTechnicalEnvironment.equals(rhs.regulatoryAndTechnicalEnvironment))))&&((this.nominalRoute == rhs.nominalRoute)||((this.nominalRoute!= null)&&this.nominalRoute.equals(rhs.nominalRoute))))&&((this.systemAuthenticatingTheCardholder == rhs.systemAuthenticatingTheCardholder)||((this.systemAuthenticatingTheCardholder!= null)&&this.systemAuthenticatingTheCardholder.equals(rhs.systemAuthenticatingTheCardholder))))&&((this.cardholderPresent == rhs.cardholderPresent)||((this.cardholderPresent!= null)&&this.cardholderPresent.equals(rhs.cardholderPresent))))&&((this.applicationSelectionIndicator == rhs.applicationSelectionIndicator)||((this.applicationSelectionIndicator!= null)&&this.applicationSelectionIndicator.equals(rhs.applicationSelectionIndicator))))&&((this.securizationNature == rhs.securizationNature)||((this.securizationNature!= null)&&this.securizationNature.equals(rhs.securizationNature))))&&((this.blockedRoute == rhs.blockedRoute)||((this.blockedRoute!= null)&&this.blockedRoute.equals(rhs.blockedRoute))))&&((this.serviceAttribute == rhs.serviceAttribute)||((this.serviceAttribute!= null)&&this.serviceAttribute.equals(rhs.serviceAttribute))))&&((this.accountNameVerificationNature == rhs.accountNameVerificationNature)||((this.accountNameVerificationNature!= null)&&this.accountNameVerificationNature.equals(rhs.accountNameVerificationNature))))&&((this.traceabilityService == rhs.traceabilityService)||((this.traceabilityService!= null)&&this.traceabilityService.equals(rhs.traceabilityService))))&&((this.transactionNature == rhs.transactionNature)||((this.transactionNature!= null)&&this.transactionNature.equals(rhs.transactionNature))))&&((this.authenticationAmount == rhs.authenticationAmount)||((this.authenticationAmount!= null)&&this.authenticationAmount.equals(rhs.authenticationAmount))))&&((this.keySerialNumber == rhs.keySerialNumber)||((this.keySerialNumber!= null)&&this.keySerialNumber.equals(rhs.keySerialNumber))))&&((this.reasonsForNotHonouringExemptions == rhs.reasonsForNotHonouringExemptions)||((this.reasonsForNotHonouringExemptions!= null)&&this.reasonsForNotHonouringExemptions.equals(rhs.reasonsForNotHonouringExemptions))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentUseCase == rhs.paymentUseCase)||((this.paymentUseCase!= null)&&this.paymentUseCase.equals(rhs.paymentUseCase))))&&((this.acceptanceSystemCardProductCode == rhs.acceptanceSystemCardProductCode)||((this.acceptanceSystemCardProductCode!= null)&&this.acceptanceSystemCardProductCode.equals(rhs.acceptanceSystemCardProductCode))))&&((this.extensionNominalRoute == rhs.extensionNominalRoute)||((this.extensionNominalRoute!= null)&&this.extensionNominalRoute.equals(rhs.extensionNominalRoute))))&&((this.networkCodeDualRoute == rhs.networkCodeDualRoute)||((this.networkCodeDualRoute!= null)&&this.networkCodeDualRoute.equals(rhs.networkCodeDualRoute))))&&((this.buyingMethod == rhs.buyingMethod)||((this.buyingMethod!= null)&&this.buyingMethod.equals(rhs.buyingMethod))))&&((this.extensionDualRoute == rhs.extensionDualRoute)||((this.extensionDualRoute!= null)&&this.extensionDualRoute.equals(rhs.extensionDualRoute))))&&((this.internationalAuthorisationNetwork == rhs.internationalAuthorisationNetwork)||((this.internationalAuthorisationNetwork!= null)&&this.internationalAuthorisationNetwork.equals(rhs.internationalAuthorisationNetwork))))&&((this.cardDataEntryMode == rhs.cardDataEntryMode)||((this.cardDataEntryMode!= null)&&this.cardDataEntryMode.equals(rhs.cardDataEntryMode))))&&((this.jurisdiction == rhs.jurisdiction)||((this.jurisdiction!= null)&&this.jurisdiction.equals(rhs.jurisdiction))))&&((this.dualRoute == rhs.dualRoute)||((this.dualRoute!= null)&&this.dualRoute.equals(rhs.dualRoute))))&&((this.serviceIndicator == rhs.serviceIndicator)||((this.serviceIndicator!= null)&&this.serviceIndicator.equals(rhs.serviceIndicator))))&&((this.authorisationUnbundling == rhs.authorisationUnbundling)||((this.authorisationUnbundling!= null)&&this.authorisationUnbundling.equals(rhs.authorisationUnbundling))))&&((this.schemeNature == rhs.schemeNature)||((this.schemeNature!= null)&&this.schemeNature.equals(rhs.schemeNature))))&&((this.issuerAuthenticationData == rhs.issuerAuthenticationData)||((this.issuerAuthenticationData!= null)&&this.issuerAuthenticationData.equals(rhs.issuerAuthenticationData))))&&((this.authenticationDate == rhs.authenticationDate)||((this.authenticationDate!= null)&&this.authenticationDate.equals(rhs.authenticationDate))))&&((this.cardOnFileAction == rhs.cardOnFileAction)||((this.cardOnFileAction!= null)&&this.cardOnFileAction.equals(rhs.cardOnFileAction))))&&((this.tracabilityEventID == rhs.tracabilityEventID)||((this.tracabilityEventID!= null)&&this.tracabilityEventID.equals(rhs.tracabilityEventID))))&&((this.manualIndicator == rhs.manualIndicator)||((this.manualIndicator!= null)&&this.manualIndicator.equals(rhs.manualIndicator))))&&((this.cardSecurityCodePresence == rhs.cardSecurityCodePresence)||((this.cardSecurityCodePresence!= null)&&this.cardSecurityCodePresence.equals(rhs.cardSecurityCodePresence))))&&((this.uuidContainerCategory == rhs.uuidContainerCategory)||((this.uuidContainerCategory!= null)&&this.uuidContainerCategory.equals(rhs.uuidContainerCategory))))&&((this.networkSubService == rhs.networkSubService)||((this.networkSubService!= null)&&this.networkSubService.equals(rhs.networkSubService))))&&((this.authenticationProgramIndicator == rhs.authenticationProgramIndicator)||((this.authenticationProgramIndicator!= null)&&this.authenticationProgramIndicator.equals(rhs.authenticationProgramIndicator))))&&((this.cardSecurityCodeVerificationInformation == rhs.cardSecurityCodeVerificationInformation)||((this.cardSecurityCodeVerificationInformation!= null)&&this.cardSecurityCodeVerificationInformation.equals(rhs.cardSecurityCodeVerificationInformation))))&&((this.domainIndicator == rhs.domainIndicator)||((this.domainIndicator!= null)&&this.domainIndicator.equals(rhs.domainIndicator))))&&((this.pointOfServiceConditionCode == rhs.pointOfServiceConditionCode)||((this.pointOfServiceConditionCode!= null)&&this.pointOfServiceConditionCode.equals(rhs.pointOfServiceConditionCode))))&&((this.fundsTransferApplicationNature == rhs.fundsTransferApplicationNature)||((this.fundsTransferApplicationNature!= null)&&this.fundsTransferApplicationNature.equals(rhs.fundsTransferApplicationNature))))&&((this.statusOfMessageDisplayPrintCapability == rhs.statusOfMessageDisplayPrintCapability)||((this.statusOfMessageDisplayPrintCapability!= null)&&this.statusOfMessageDisplayPrintCapability.equals(rhs.statusOfMessageDisplayPrintCapability))))&&((this.cardPresent == rhs.cardPresent)||((this.cardPresent!= null)&&this.cardPresent.equals(rhs.cardPresent))));
    }

}
