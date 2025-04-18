
package eu.estreem.model.v1;

import java.io.Serializable;
import java.util.LinkedHashMap;
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
    "appExpiryDate",
    "applicationCryptogram",
    "applicationSelectionRegisteredProprietaryData",
    "contactlessTrack1",
    "contactlessTrack2",
    "cryptogramInformationData",
    "issuerApplicationData",
    "randomNumber",
    "terminalTransactionDate",
    "terminalVerificationResult"
})
@Generated("jsonschema2pojo")
public class DicoObjetJsonEmv implements Serializable
{

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("appExpiryDate")
    @JsonPropertyDescription("Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).")
    private String appExpiryDate;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 11 digits (8 bytes)
     * 
     */
    @JsonProperty("applicationCryptogram")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 11 digits (8 bytes)")
    private String applicationCryptogram;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 43 digits. (4 t0 32 bytes)
     * 
     */
    @JsonProperty("applicationSelectionRegisteredProprietaryData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 43 digits. (4 t0 32 bytes)")
    private String applicationSelectionRegisteredProprietaryData;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 76 characters.
     * 
     */
    @JsonProperty("contactlessTrack1")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 76 characters.")
    private String contactlessTrack1;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 26 digits. (max of 19 bytes)
     * 
     */
    @JsonProperty("contactlessTrack2")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 26 digits. (max of 19 bytes)")
    private String contactlessTrack2;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("cryptogramInformationData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)")
    private String cryptogramInformationData;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)
     * 
     */
    @JsonProperty("issuerApplicationData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)")
    private String issuerApplicationData;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)
     * 
     */
    @JsonProperty("randomNumber")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)")
    private String randomNumber;
    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("terminalTransactionDate")
    @JsonPropertyDescription("Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).")
    private String terminalTransactionDate;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)
     * 
     */
    @JsonProperty("terminalVerificationResult")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)")
    private String terminalVerificationResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5840900428328754579L;

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("appExpiryDate")
    public String getAppExpiryDate() {
        return appExpiryDate;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("appExpiryDate")
    public void setAppExpiryDate(String appExpiryDate) {
        this.appExpiryDate = appExpiryDate;
    }

    public DicoObjetJsonEmv withAppExpiryDate(String appExpiryDate) {
        this.appExpiryDate = appExpiryDate;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 11 digits (8 bytes)
     * 
     */
    @JsonProperty("applicationCryptogram")
    public String getApplicationCryptogram() {
        return applicationCryptogram;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 11 digits (8 bytes)
     * 
     */
    @JsonProperty("applicationCryptogram")
    public void setApplicationCryptogram(String applicationCryptogram) {
        this.applicationCryptogram = applicationCryptogram;
    }

    public DicoObjetJsonEmv withApplicationCryptogram(String applicationCryptogram) {
        this.applicationCryptogram = applicationCryptogram;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 43 digits. (4 t0 32 bytes)
     * 
     */
    @JsonProperty("applicationSelectionRegisteredProprietaryData")
    public String getApplicationSelectionRegisteredProprietaryData() {
        return applicationSelectionRegisteredProprietaryData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 43 digits. (4 t0 32 bytes)
     * 
     */
    @JsonProperty("applicationSelectionRegisteredProprietaryData")
    public void setApplicationSelectionRegisteredProprietaryData(String applicationSelectionRegisteredProprietaryData) {
        this.applicationSelectionRegisteredProprietaryData = applicationSelectionRegisteredProprietaryData;
    }

    public DicoObjetJsonEmv withApplicationSelectionRegisteredProprietaryData(String applicationSelectionRegisteredProprietaryData) {
        this.applicationSelectionRegisteredProprietaryData = applicationSelectionRegisteredProprietaryData;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 76 characters.
     * 
     */
    @JsonProperty("contactlessTrack1")
    public String getContactlessTrack1() {
        return contactlessTrack1;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 76 characters.
     * 
     */
    @JsonProperty("contactlessTrack1")
    public void setContactlessTrack1(String contactlessTrack1) {
        this.contactlessTrack1 = contactlessTrack1;
    }

    public DicoObjetJsonEmv withContactlessTrack1(String contactlessTrack1) {
        this.contactlessTrack1 = contactlessTrack1;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 26 digits. (max of 19 bytes)
     * 
     */
    @JsonProperty("contactlessTrack2")
    public String getContactlessTrack2() {
        return contactlessTrack2;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 26 digits. (max of 19 bytes)
     * 
     */
    @JsonProperty("contactlessTrack2")
    public void setContactlessTrack2(String contactlessTrack2) {
        this.contactlessTrack2 = contactlessTrack2;
    }

    public DicoObjetJsonEmv withContactlessTrack2(String contactlessTrack2) {
        this.contactlessTrack2 = contactlessTrack2;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("cryptogramInformationData")
    public String getCryptogramInformationData() {
        return cryptogramInformationData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("cryptogramInformationData")
    public void setCryptogramInformationData(String cryptogramInformationData) {
        this.cryptogramInformationData = cryptogramInformationData;
    }

    public DicoObjetJsonEmv withCryptogramInformationData(String cryptogramInformationData) {
        this.cryptogramInformationData = cryptogramInformationData;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)
     * 
     */
    @JsonProperty("issuerApplicationData")
    public String getIssuerApplicationData() {
        return issuerApplicationData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 43 digits. (max of 32 bytes)
     * 
     */
    @JsonProperty("issuerApplicationData")
    public void setIssuerApplicationData(String issuerApplicationData) {
        this.issuerApplicationData = issuerApplicationData;
    }

    public DicoObjetJsonEmv withIssuerApplicationData(String issuerApplicationData) {
        this.issuerApplicationData = issuerApplicationData;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)
     * 
     */
    @JsonProperty("randomNumber")
    public String getRandomNumber() {
        return randomNumber;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 6 digits. (4 bytes)
     * 
     */
    @JsonProperty("randomNumber")
    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public DicoObjetJsonEmv withRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
        return this;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("terminalTransactionDate")
    public String getTerminalTransactionDate() {
        return terminalTransactionDate;
    }

    /**
     * Date within a particular calendar year represented by YYYY-MM-DD (ISO 8601).
     * 
     */
    @JsonProperty("terminalTransactionDate")
    public void setTerminalTransactionDate(String terminalTransactionDate) {
        this.terminalTransactionDate = terminalTransactionDate;
    }

    public DicoObjetJsonEmv withTerminalTransactionDate(String terminalTransactionDate) {
        this.terminalTransactionDate = terminalTransactionDate;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)
     * 
     */
    @JsonProperty("terminalVerificationResult")
    public String getTerminalVerificationResult() {
        return terminalVerificationResult;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 7 digits. (5 bytes)
     * 
     */
    @JsonProperty("terminalVerificationResult")
    public void setTerminalVerificationResult(String terminalVerificationResult) {
        this.terminalVerificationResult = terminalVerificationResult;
    }

    public DicoObjetJsonEmv withTerminalVerificationResult(String terminalVerificationResult) {
        this.terminalVerificationResult = terminalVerificationResult;
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

    public DicoObjetJsonEmv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DicoObjetJsonEmv.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appExpiryDate");
        sb.append('=');
        sb.append(((this.appExpiryDate == null)?"<null>":this.appExpiryDate));
        sb.append(',');
        sb.append("applicationCryptogram");
        sb.append('=');
        sb.append(((this.applicationCryptogram == null)?"<null>":this.applicationCryptogram));
        sb.append(',');
        sb.append("applicationSelectionRegisteredProprietaryData");
        sb.append('=');
        sb.append(((this.applicationSelectionRegisteredProprietaryData == null)?"<null>":this.applicationSelectionRegisteredProprietaryData));
        sb.append(',');
        sb.append("contactlessTrack1");
        sb.append('=');
        sb.append(((this.contactlessTrack1 == null)?"<null>":this.contactlessTrack1));
        sb.append(',');
        sb.append("contactlessTrack2");
        sb.append('=');
        sb.append(((this.contactlessTrack2 == null)?"<null>":this.contactlessTrack2));
        sb.append(',');
        sb.append("cryptogramInformationData");
        sb.append('=');
        sb.append(((this.cryptogramInformationData == null)?"<null>":this.cryptogramInformationData));
        sb.append(',');
        sb.append("issuerApplicationData");
        sb.append('=');
        sb.append(((this.issuerApplicationData == null)?"<null>":this.issuerApplicationData));
        sb.append(',');
        sb.append("randomNumber");
        sb.append('=');
        sb.append(((this.randomNumber == null)?"<null>":this.randomNumber));
        sb.append(',');
        sb.append("terminalTransactionDate");
        sb.append('=');
        sb.append(((this.terminalTransactionDate == null)?"<null>":this.terminalTransactionDate));
        sb.append(',');
        sb.append("terminalVerificationResult");
        sb.append('=');
        sb.append(((this.terminalVerificationResult == null)?"<null>":this.terminalVerificationResult));
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
        result = ((result* 31)+((this.issuerApplicationData == null)? 0 :this.issuerApplicationData.hashCode()));
        result = ((result* 31)+((this.cryptogramInformationData == null)? 0 :this.cryptogramInformationData.hashCode()));
        result = ((result* 31)+((this.contactlessTrack1 == null)? 0 :this.contactlessTrack1 .hashCode()));
        result = ((result* 31)+((this.randomNumber == null)? 0 :this.randomNumber.hashCode()));
        result = ((result* 31)+((this.applicationCryptogram == null)? 0 :this.applicationCryptogram.hashCode()));
        result = ((result* 31)+((this.applicationSelectionRegisteredProprietaryData == null)? 0 :this.applicationSelectionRegisteredProprietaryData.hashCode()));
        result = ((result* 31)+((this.contactlessTrack2 == null)? 0 :this.contactlessTrack2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.terminalTransactionDate == null)? 0 :this.terminalTransactionDate.hashCode()));
        result = ((result* 31)+((this.appExpiryDate == null)? 0 :this.appExpiryDate.hashCode()));
        result = ((result* 31)+((this.terminalVerificationResult == null)? 0 :this.terminalVerificationResult.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DicoObjetJsonEmv) == false) {
            return false;
        }
        DicoObjetJsonEmv rhs = ((DicoObjetJsonEmv) other);
        return ((((((((((((this.issuerApplicationData == rhs.issuerApplicationData)||((this.issuerApplicationData!= null)&&this.issuerApplicationData.equals(rhs.issuerApplicationData)))&&((this.cryptogramInformationData == rhs.cryptogramInformationData)||((this.cryptogramInformationData!= null)&&this.cryptogramInformationData.equals(rhs.cryptogramInformationData))))&&((this.contactlessTrack1 == rhs.contactlessTrack1)||((this.contactlessTrack1 != null)&&this.contactlessTrack1 .equals(rhs.contactlessTrack1))))&&((this.randomNumber == rhs.randomNumber)||((this.randomNumber!= null)&&this.randomNumber.equals(rhs.randomNumber))))&&((this.applicationCryptogram == rhs.applicationCryptogram)||((this.applicationCryptogram!= null)&&this.applicationCryptogram.equals(rhs.applicationCryptogram))))&&((this.applicationSelectionRegisteredProprietaryData == rhs.applicationSelectionRegisteredProprietaryData)||((this.applicationSelectionRegisteredProprietaryData!= null)&&this.applicationSelectionRegisteredProprietaryData.equals(rhs.applicationSelectionRegisteredProprietaryData))))&&((this.contactlessTrack2 == rhs.contactlessTrack2)||((this.contactlessTrack2 != null)&&this.contactlessTrack2 .equals(rhs.contactlessTrack2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.terminalTransactionDate == rhs.terminalTransactionDate)||((this.terminalTransactionDate!= null)&&this.terminalTransactionDate.equals(rhs.terminalTransactionDate))))&&((this.appExpiryDate == rhs.appExpiryDate)||((this.appExpiryDate!= null)&&this.appExpiryDate.equals(rhs.appExpiryDate))))&&((this.terminalVerificationResult == rhs.terminalVerificationResult)||((this.terminalVerificationResult!= null)&&this.terminalVerificationResult.equals(rhs.terminalVerificationResult))));
    }

}
