
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
    "acsTransactionId",
    "authenticationAmount",
    "authenticationDateTime",
    "authorisationCode",
    "cardholderAuthenticationMethod",
    "cardholderAuthenticationValue",
    "cardholderAuthenticationValueCalculationMethod",
    "dsTransactionId",
    "electronicCommerceAuthentication",
    "merchantName",
    "originalUniqueIdentifier",
    "securedRemotePaymentArchitectureResult",
    "securedRemotePaymentArchitectureResultExtension",
    "technicalInfoTransactionUuid",
    "technicalInfoTransmissionDateTime",
    "technicalInfoTransmittingServerId",
    "threeDsProtocolVersion",
    "transactionReference",
    "transmissionGmtDateTime"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONOriginalTransactionData implements Serializable
{

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("acsTransactionId")
    @JsonPropertyDescription("36 alphanumeric  and special characters")
    private String acsTransactionId;
    @JsonProperty("authenticationAmount")
    private AmountType authenticationAmount;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("authenticationDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String authenticationDateTime;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("authorisationCode")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.")
    private String authorisationCode;
    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("cardholderAuthenticationMethod")
    @JsonPropertyDescription("2 alphanumeric  and special characters")
    private String cardholderAuthenticationMethod;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("cardholderAuthenticationValue")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)")
    private String cardholderAuthenticationValue;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueCalculationMethod")
    @JsonPropertyDescription("1 alphanumeric character")
    private String cardholderAuthenticationValueCalculationMethod;
    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("dsTransactionId")
    @JsonPropertyDescription("36 alphanumeric  and special characters")
    private String dsTransactionId;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("electronicCommerceAuthentication")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String electronicCommerceAuthentication;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String merchantName;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("originalUniqueIdentifier")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 50 characters")
    private String originalUniqueIdentifier;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("securedRemotePaymentArchitectureResult")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 4 characters")
    private String securedRemotePaymentArchitectureResult;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 10 characters.
     * 
     */
    @JsonProperty("securedRemotePaymentArchitectureResultExtension")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 10 characters.")
    private String securedRemotePaymentArchitectureResultExtension;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 19 digits
     * 
     */
    @JsonProperty("technicalInfoTransactionUuid")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 19 digits")
    private String technicalInfoTransactionUuid;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("technicalInfoTransmissionDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String technicalInfoTransmissionDateTime;
    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("technicalInfoTransmittingServerId")
    @JsonPropertyDescription("4 alphanumeric  and special characters")
    private String technicalInfoTransmittingServerId;
    @JsonProperty("threeDsProtocolVersion")
    private List<ThreeDSProtocolVersionCodeset> threeDsProtocolVersion = new ArrayList<ThreeDSProtocolVersionCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("transactionReference")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String transactionReference;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("transmissionGmtDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String transmissionGmtDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8584127644272322977L;

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("acsTransactionId")
    public String getAcsTransactionId() {
        return acsTransactionId;
    }

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("acsTransactionId")
    public void setAcsTransactionId(String acsTransactionId) {
        this.acsTransactionId = acsTransactionId;
    }

    public DICOOBJETJSONOriginalTransactionData withAcsTransactionId(String acsTransactionId) {
        this.acsTransactionId = acsTransactionId;
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

    public DICOOBJETJSONOriginalTransactionData withAuthenticationAmount(AmountType authenticationAmount) {
        this.authenticationAmount = authenticationAmount;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("authenticationDateTime")
    public String getAuthenticationDateTime() {
        return authenticationDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("authenticationDateTime")
    public void setAuthenticationDateTime(String authenticationDateTime) {
        this.authenticationDateTime = authenticationDateTime;
    }

    public DICOOBJETJSONOriginalTransactionData withAuthenticationDateTime(String authenticationDateTime) {
        this.authenticationDateTime = authenticationDateTime;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("authorisationCode")
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("authorisationCode")
    public void setAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
    }

    public DICOOBJETJSONOriginalTransactionData withAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
        return this;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("cardholderAuthenticationMethod")
    public String getCardholderAuthenticationMethod() {
        return cardholderAuthenticationMethod;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("cardholderAuthenticationMethod")
    public void setCardholderAuthenticationMethod(String cardholderAuthenticationMethod) {
        this.cardholderAuthenticationMethod = cardholderAuthenticationMethod;
    }

    public DICOOBJETJSONOriginalTransactionData withCardholderAuthenticationMethod(String cardholderAuthenticationMethod) {
        this.cardholderAuthenticationMethod = cardholderAuthenticationMethod;
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

    public DICOOBJETJSONOriginalTransactionData withCardholderAuthenticationValue(String cardholderAuthenticationValue) {
        this.cardholderAuthenticationValue = cardholderAuthenticationValue;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueCalculationMethod")
    public String getCardholderAuthenticationValueCalculationMethod() {
        return cardholderAuthenticationValueCalculationMethod;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueCalculationMethod")
    public void setCardholderAuthenticationValueCalculationMethod(String cardholderAuthenticationValueCalculationMethod) {
        this.cardholderAuthenticationValueCalculationMethod = cardholderAuthenticationValueCalculationMethod;
    }

    public DICOOBJETJSONOriginalTransactionData withCardholderAuthenticationValueCalculationMethod(String cardholderAuthenticationValueCalculationMethod) {
        this.cardholderAuthenticationValueCalculationMethod = cardholderAuthenticationValueCalculationMethod;
        return this;
    }

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("dsTransactionId")
    public String getDsTransactionId() {
        return dsTransactionId;
    }

    /**
     *  36 alphanumeric  and special characters
     * 
     */
    @JsonProperty("dsTransactionId")
    public void setDsTransactionId(String dsTransactionId) {
        this.dsTransactionId = dsTransactionId;
    }

    public DICOOBJETJSONOriginalTransactionData withDsTransactionId(String dsTransactionId) {
        this.dsTransactionId = dsTransactionId;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("electronicCommerceAuthentication")
    public String getElectronicCommerceAuthentication() {
        return electronicCommerceAuthentication;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("electronicCommerceAuthentication")
    public void setElectronicCommerceAuthentication(String electronicCommerceAuthentication) {
        this.electronicCommerceAuthentication = electronicCommerceAuthentication;
    }

    public DICOOBJETJSONOriginalTransactionData withElectronicCommerceAuthentication(String electronicCommerceAuthentication) {
        this.electronicCommerceAuthentication = electronicCommerceAuthentication;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantName")
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public DICOOBJETJSONOriginalTransactionData withMerchantName(String merchantName) {
        this.merchantName = merchantName;
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

    public DICOOBJETJSONOriginalTransactionData withOriginalUniqueIdentifier(String originalUniqueIdentifier) {
        this.originalUniqueIdentifier = originalUniqueIdentifier;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("securedRemotePaymentArchitectureResult")
    public String getSecuredRemotePaymentArchitectureResult() {
        return securedRemotePaymentArchitectureResult;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 4 characters
     * 
     */
    @JsonProperty("securedRemotePaymentArchitectureResult")
    public void setSecuredRemotePaymentArchitectureResult(String securedRemotePaymentArchitectureResult) {
        this.securedRemotePaymentArchitectureResult = securedRemotePaymentArchitectureResult;
    }

    public DICOOBJETJSONOriginalTransactionData withSecuredRemotePaymentArchitectureResult(String securedRemotePaymentArchitectureResult) {
        this.securedRemotePaymentArchitectureResult = securedRemotePaymentArchitectureResult;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 10 characters.
     * 
     */
    @JsonProperty("securedRemotePaymentArchitectureResultExtension")
    public String getSecuredRemotePaymentArchitectureResultExtension() {
        return securedRemotePaymentArchitectureResultExtension;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 10 characters.
     * 
     */
    @JsonProperty("securedRemotePaymentArchitectureResultExtension")
    public void setSecuredRemotePaymentArchitectureResultExtension(String securedRemotePaymentArchitectureResultExtension) {
        this.securedRemotePaymentArchitectureResultExtension = securedRemotePaymentArchitectureResultExtension;
    }

    public DICOOBJETJSONOriginalTransactionData withSecuredRemotePaymentArchitectureResultExtension(String securedRemotePaymentArchitectureResultExtension) {
        this.securedRemotePaymentArchitectureResultExtension = securedRemotePaymentArchitectureResultExtension;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 19 digits
     * 
     */
    @JsonProperty("technicalInfoTransactionUuid")
    public String getTechnicalInfoTransactionUuid() {
        return technicalInfoTransactionUuid;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 19 digits
     * 
     */
    @JsonProperty("technicalInfoTransactionUuid")
    public void setTechnicalInfoTransactionUuid(String technicalInfoTransactionUuid) {
        this.technicalInfoTransactionUuid = technicalInfoTransactionUuid;
    }

    public DICOOBJETJSONOriginalTransactionData withTechnicalInfoTransactionUuid(String technicalInfoTransactionUuid) {
        this.technicalInfoTransactionUuid = technicalInfoTransactionUuid;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("technicalInfoTransmissionDateTime")
    public String getTechnicalInfoTransmissionDateTime() {
        return technicalInfoTransmissionDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("technicalInfoTransmissionDateTime")
    public void setTechnicalInfoTransmissionDateTime(String technicalInfoTransmissionDateTime) {
        this.technicalInfoTransmissionDateTime = technicalInfoTransmissionDateTime;
    }

    public DICOOBJETJSONOriginalTransactionData withTechnicalInfoTransmissionDateTime(String technicalInfoTransmissionDateTime) {
        this.technicalInfoTransmissionDateTime = technicalInfoTransmissionDateTime;
        return this;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("technicalInfoTransmittingServerId")
    public String getTechnicalInfoTransmittingServerId() {
        return technicalInfoTransmittingServerId;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("technicalInfoTransmittingServerId")
    public void setTechnicalInfoTransmittingServerId(String technicalInfoTransmittingServerId) {
        this.technicalInfoTransmittingServerId = technicalInfoTransmittingServerId;
    }

    public DICOOBJETJSONOriginalTransactionData withTechnicalInfoTransmittingServerId(String technicalInfoTransmittingServerId) {
        this.technicalInfoTransmittingServerId = technicalInfoTransmittingServerId;
        return this;
    }

    @JsonProperty("threeDsProtocolVersion")
    public List<ThreeDSProtocolVersionCodeset> getThreeDsProtocolVersion() {
        return threeDsProtocolVersion;
    }

    @JsonProperty("threeDsProtocolVersion")
    public void setThreeDsProtocolVersion(List<ThreeDSProtocolVersionCodeset> threeDsProtocolVersion) {
        this.threeDsProtocolVersion = threeDsProtocolVersion;
    }

    public DICOOBJETJSONOriginalTransactionData withThreeDsProtocolVersion(List<ThreeDSProtocolVersionCodeset> threeDsProtocolVersion) {
        this.threeDsProtocolVersion = threeDsProtocolVersion;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("transactionReference")
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("transactionReference")
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public DICOOBJETJSONOriginalTransactionData withTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("transmissionGmtDateTime")
    public String getTransmissionGmtDateTime() {
        return transmissionGmtDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("transmissionGmtDateTime")
    public void setTransmissionGmtDateTime(String transmissionGmtDateTime) {
        this.transmissionGmtDateTime = transmissionGmtDateTime;
    }

    public DICOOBJETJSONOriginalTransactionData withTransmissionGmtDateTime(String transmissionGmtDateTime) {
        this.transmissionGmtDateTime = transmissionGmtDateTime;
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

    public DICOOBJETJSONOriginalTransactionData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONOriginalTransactionData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acsTransactionId");
        sb.append('=');
        sb.append(((this.acsTransactionId == null)?"<null>":this.acsTransactionId));
        sb.append(',');
        sb.append("authenticationAmount");
        sb.append('=');
        sb.append(((this.authenticationAmount == null)?"<null>":this.authenticationAmount));
        sb.append(',');
        sb.append("authenticationDateTime");
        sb.append('=');
        sb.append(((this.authenticationDateTime == null)?"<null>":this.authenticationDateTime));
        sb.append(',');
        sb.append("authorisationCode");
        sb.append('=');
        sb.append(((this.authorisationCode == null)?"<null>":this.authorisationCode));
        sb.append(',');
        sb.append("cardholderAuthenticationMethod");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationMethod == null)?"<null>":this.cardholderAuthenticationMethod));
        sb.append(',');
        sb.append("cardholderAuthenticationValue");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationValue == null)?"<null>":this.cardholderAuthenticationValue));
        sb.append(',');
        sb.append("cardholderAuthenticationValueCalculationMethod");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationValueCalculationMethod == null)?"<null>":this.cardholderAuthenticationValueCalculationMethod));
        sb.append(',');
        sb.append("dsTransactionId");
        sb.append('=');
        sb.append(((this.dsTransactionId == null)?"<null>":this.dsTransactionId));
        sb.append(',');
        sb.append("electronicCommerceAuthentication");
        sb.append('=');
        sb.append(((this.electronicCommerceAuthentication == null)?"<null>":this.electronicCommerceAuthentication));
        sb.append(',');
        sb.append("merchantName");
        sb.append('=');
        sb.append(((this.merchantName == null)?"<null>":this.merchantName));
        sb.append(',');
        sb.append("originalUniqueIdentifier");
        sb.append('=');
        sb.append(((this.originalUniqueIdentifier == null)?"<null>":this.originalUniqueIdentifier));
        sb.append(',');
        sb.append("securedRemotePaymentArchitectureResult");
        sb.append('=');
        sb.append(((this.securedRemotePaymentArchitectureResult == null)?"<null>":this.securedRemotePaymentArchitectureResult));
        sb.append(',');
        sb.append("securedRemotePaymentArchitectureResultExtension");
        sb.append('=');
        sb.append(((this.securedRemotePaymentArchitectureResultExtension == null)?"<null>":this.securedRemotePaymentArchitectureResultExtension));
        sb.append(',');
        sb.append("technicalInfoTransactionUuid");
        sb.append('=');
        sb.append(((this.technicalInfoTransactionUuid == null)?"<null>":this.technicalInfoTransactionUuid));
        sb.append(',');
        sb.append("technicalInfoTransmissionDateTime");
        sb.append('=');
        sb.append(((this.technicalInfoTransmissionDateTime == null)?"<null>":this.technicalInfoTransmissionDateTime));
        sb.append(',');
        sb.append("technicalInfoTransmittingServerId");
        sb.append('=');
        sb.append(((this.technicalInfoTransmittingServerId == null)?"<null>":this.technicalInfoTransmittingServerId));
        sb.append(',');
        sb.append("threeDsProtocolVersion");
        sb.append('=');
        sb.append(((this.threeDsProtocolVersion == null)?"<null>":this.threeDsProtocolVersion));
        sb.append(',');
        sb.append("transactionReference");
        sb.append('=');
        sb.append(((this.transactionReference == null)?"<null>":this.transactionReference));
        sb.append(',');
        sb.append("transmissionGmtDateTime");
        sb.append('=');
        sb.append(((this.transmissionGmtDateTime == null)?"<null>":this.transmissionGmtDateTime));
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
        result = ((result* 31)+((this.securedRemotePaymentArchitectureResultExtension == null)? 0 :this.securedRemotePaymentArchitectureResultExtension.hashCode()));
        result = ((result* 31)+((this.technicalInfoTransmissionDateTime == null)? 0 :this.technicalInfoTransmissionDateTime.hashCode()));
        result = ((result* 31)+((this.transactionReference == null)? 0 :this.transactionReference.hashCode()));
        result = ((result* 31)+((this.dsTransactionId == null)? 0 :this.dsTransactionId.hashCode()));
        result = ((result* 31)+((this.technicalInfoTransmittingServerId == null)? 0 :this.technicalInfoTransmittingServerId.hashCode()));
        result = ((result* 31)+((this.authorisationCode == null)? 0 :this.authorisationCode.hashCode()));
        result = ((result* 31)+((this.cardholderAuthenticationValueCalculationMethod == null)? 0 :this.cardholderAuthenticationValueCalculationMethod.hashCode()));
        result = ((result* 31)+((this.electronicCommerceAuthentication == null)? 0 :this.electronicCommerceAuthentication.hashCode()));
        result = ((result* 31)+((this.merchantName == null)? 0 :this.merchantName.hashCode()));
        result = ((result* 31)+((this.technicalInfoTransactionUuid == null)? 0 :this.technicalInfoTransactionUuid.hashCode()));
        result = ((result* 31)+((this.authenticationAmount == null)? 0 :this.authenticationAmount.hashCode()));
        result = ((result* 31)+((this.cardholderAuthenticationValue == null)? 0 :this.cardholderAuthenticationValue.hashCode()));
        result = ((result* 31)+((this.transmissionGmtDateTime == null)? 0 :this.transmissionGmtDateTime.hashCode()));
        result = ((result* 31)+((this.originalUniqueIdentifier == null)? 0 :this.originalUniqueIdentifier.hashCode()));
        result = ((result* 31)+((this.cardholderAuthenticationMethod == null)? 0 :this.cardholderAuthenticationMethod.hashCode()));
        result = ((result* 31)+((this.threeDsProtocolVersion == null)? 0 :this.threeDsProtocolVersion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.authenticationDateTime == null)? 0 :this.authenticationDateTime.hashCode()));
        result = ((result* 31)+((this.securedRemotePaymentArchitectureResult == null)? 0 :this.securedRemotePaymentArchitectureResult.hashCode()));
        result = ((result* 31)+((this.acsTransactionId == null)? 0 :this.acsTransactionId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONOriginalTransactionData) == false) {
            return false;
        }
        DICOOBJETJSONOriginalTransactionData rhs = ((DICOOBJETJSONOriginalTransactionData) other);
        return (((((((((((((((((((((this.securedRemotePaymentArchitectureResultExtension == rhs.securedRemotePaymentArchitectureResultExtension)||((this.securedRemotePaymentArchitectureResultExtension!= null)&&this.securedRemotePaymentArchitectureResultExtension.equals(rhs.securedRemotePaymentArchitectureResultExtension)))&&((this.technicalInfoTransmissionDateTime == rhs.technicalInfoTransmissionDateTime)||((this.technicalInfoTransmissionDateTime!= null)&&this.technicalInfoTransmissionDateTime.equals(rhs.technicalInfoTransmissionDateTime))))&&((this.transactionReference == rhs.transactionReference)||((this.transactionReference!= null)&&this.transactionReference.equals(rhs.transactionReference))))&&((this.dsTransactionId == rhs.dsTransactionId)||((this.dsTransactionId!= null)&&this.dsTransactionId.equals(rhs.dsTransactionId))))&&((this.technicalInfoTransmittingServerId == rhs.technicalInfoTransmittingServerId)||((this.technicalInfoTransmittingServerId!= null)&&this.technicalInfoTransmittingServerId.equals(rhs.technicalInfoTransmittingServerId))))&&((this.authorisationCode == rhs.authorisationCode)||((this.authorisationCode!= null)&&this.authorisationCode.equals(rhs.authorisationCode))))&&((this.cardholderAuthenticationValueCalculationMethod == rhs.cardholderAuthenticationValueCalculationMethod)||((this.cardholderAuthenticationValueCalculationMethod!= null)&&this.cardholderAuthenticationValueCalculationMethod.equals(rhs.cardholderAuthenticationValueCalculationMethod))))&&((this.electronicCommerceAuthentication == rhs.electronicCommerceAuthentication)||((this.electronicCommerceAuthentication!= null)&&this.electronicCommerceAuthentication.equals(rhs.electronicCommerceAuthentication))))&&((this.merchantName == rhs.merchantName)||((this.merchantName!= null)&&this.merchantName.equals(rhs.merchantName))))&&((this.technicalInfoTransactionUuid == rhs.technicalInfoTransactionUuid)||((this.technicalInfoTransactionUuid!= null)&&this.technicalInfoTransactionUuid.equals(rhs.technicalInfoTransactionUuid))))&&((this.authenticationAmount == rhs.authenticationAmount)||((this.authenticationAmount!= null)&&this.authenticationAmount.equals(rhs.authenticationAmount))))&&((this.cardholderAuthenticationValue == rhs.cardholderAuthenticationValue)||((this.cardholderAuthenticationValue!= null)&&this.cardholderAuthenticationValue.equals(rhs.cardholderAuthenticationValue))))&&((this.transmissionGmtDateTime == rhs.transmissionGmtDateTime)||((this.transmissionGmtDateTime!= null)&&this.transmissionGmtDateTime.equals(rhs.transmissionGmtDateTime))))&&((this.originalUniqueIdentifier == rhs.originalUniqueIdentifier)||((this.originalUniqueIdentifier!= null)&&this.originalUniqueIdentifier.equals(rhs.originalUniqueIdentifier))))&&((this.cardholderAuthenticationMethod == rhs.cardholderAuthenticationMethod)||((this.cardholderAuthenticationMethod!= null)&&this.cardholderAuthenticationMethod.equals(rhs.cardholderAuthenticationMethod))))&&((this.threeDsProtocolVersion == rhs.threeDsProtocolVersion)||((this.threeDsProtocolVersion!= null)&&this.threeDsProtocolVersion.equals(rhs.threeDsProtocolVersion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.authenticationDateTime == rhs.authenticationDateTime)||((this.authenticationDateTime!= null)&&this.authenticationDateTime.equals(rhs.authenticationDateTime))))&&((this.securedRemotePaymentArchitectureResult == rhs.securedRemotePaymentArchitectureResult)||((this.securedRemotePaymentArchitectureResult!= null)&&this.securedRemotePaymentArchitectureResult.equals(rhs.securedRemotePaymentArchitectureResult))))&&((this.acsTransactionId == rhs.acsTransactionId)||((this.acsTransactionId!= null)&&this.acsTransactionId.equals(rhs.acsTransactionId))));
    }

}
