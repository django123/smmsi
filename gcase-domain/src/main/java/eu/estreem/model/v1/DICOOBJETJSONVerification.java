
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
    "accountNameRequestValue",
    "acknowledgementRequestIndicator",
    "cardholderAuthenticationMethod",
    "cardholderAuthenticationValueProcessingInfo",
    "keySetIdentifier",
    "secureCorporatePaymentExemptionIndicator"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONVerification implements Serializable
{

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("accountNameRequestValue")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String accountNameRequestValue;
    @JsonProperty("acknowledgementRequestIndicator")
    private List<AcknowledgementRequestIndicatorCodeset> acknowledgementRequestIndicator = new ArrayList<AcknowledgementRequestIndicatorCodeset>();
    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("cardholderAuthenticationMethod")
    @JsonPropertyDescription("2 alphanumeric  and special characters")
    private String cardholderAuthenticationMethod;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueProcessingInfo")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String cardholderAuthenticationValueProcessingInfo;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 26 digits (19 bytes)
     * 
     */
    @JsonProperty("keySetIdentifier")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 26 digits (19 bytes)")
    private String keySetIdentifier;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("secureCorporatePaymentExemptionIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String secureCorporatePaymentExemptionIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6408641291032050284L;

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("accountNameRequestValue")
    public String getAccountNameRequestValue() {
        return accountNameRequestValue;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("accountNameRequestValue")
    public void setAccountNameRequestValue(String accountNameRequestValue) {
        this.accountNameRequestValue = accountNameRequestValue;
    }

    public DICOOBJETJSONVerification withAccountNameRequestValue(String accountNameRequestValue) {
        this.accountNameRequestValue = accountNameRequestValue;
        return this;
    }

    @JsonProperty("acknowledgementRequestIndicator")
    public List<AcknowledgementRequestIndicatorCodeset> getAcknowledgementRequestIndicator() {
        return acknowledgementRequestIndicator;
    }

    @JsonProperty("acknowledgementRequestIndicator")
    public void setAcknowledgementRequestIndicator(List<AcknowledgementRequestIndicatorCodeset> acknowledgementRequestIndicator) {
        this.acknowledgementRequestIndicator = acknowledgementRequestIndicator;
    }

    public DICOOBJETJSONVerification withAcknowledgementRequestIndicator(List<AcknowledgementRequestIndicatorCodeset> acknowledgementRequestIndicator) {
        this.acknowledgementRequestIndicator = acknowledgementRequestIndicator;
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

    public DICOOBJETJSONVerification withCardholderAuthenticationMethod(String cardholderAuthenticationMethod) {
        this.cardholderAuthenticationMethod = cardholderAuthenticationMethod;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueProcessingInfo")
    public String getCardholderAuthenticationValueProcessingInfo() {
        return cardholderAuthenticationValueProcessingInfo;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueProcessingInfo")
    public void setCardholderAuthenticationValueProcessingInfo(String cardholderAuthenticationValueProcessingInfo) {
        this.cardholderAuthenticationValueProcessingInfo = cardholderAuthenticationValueProcessingInfo;
    }

    public DICOOBJETJSONVerification withCardholderAuthenticationValueProcessingInfo(String cardholderAuthenticationValueProcessingInfo) {
        this.cardholderAuthenticationValueProcessingInfo = cardholderAuthenticationValueProcessingInfo;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 26 digits (19 bytes)
     * 
     */
    @JsonProperty("keySetIdentifier")
    public String getKeySetIdentifier() {
        return keySetIdentifier;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 26 digits (19 bytes)
     * 
     */
    @JsonProperty("keySetIdentifier")
    public void setKeySetIdentifier(String keySetIdentifier) {
        this.keySetIdentifier = keySetIdentifier;
    }

    public DICOOBJETJSONVerification withKeySetIdentifier(String keySetIdentifier) {
        this.keySetIdentifier = keySetIdentifier;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("secureCorporatePaymentExemptionIndicator")
    public String getSecureCorporatePaymentExemptionIndicator() {
        return secureCorporatePaymentExemptionIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("secureCorporatePaymentExemptionIndicator")
    public void setSecureCorporatePaymentExemptionIndicator(String secureCorporatePaymentExemptionIndicator) {
        this.secureCorporatePaymentExemptionIndicator = secureCorporatePaymentExemptionIndicator;
    }

    public DICOOBJETJSONVerification withSecureCorporatePaymentExemptionIndicator(String secureCorporatePaymentExemptionIndicator) {
        this.secureCorporatePaymentExemptionIndicator = secureCorporatePaymentExemptionIndicator;
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

    public DICOOBJETJSONVerification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONVerification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountNameRequestValue");
        sb.append('=');
        sb.append(((this.accountNameRequestValue == null)?"<null>":this.accountNameRequestValue));
        sb.append(',');
        sb.append("acknowledgementRequestIndicator");
        sb.append('=');
        sb.append(((this.acknowledgementRequestIndicator == null)?"<null>":this.acknowledgementRequestIndicator));
        sb.append(',');
        sb.append("cardholderAuthenticationMethod");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationMethod == null)?"<null>":this.cardholderAuthenticationMethod));
        sb.append(',');
        sb.append("cardholderAuthenticationValueProcessingInfo");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationValueProcessingInfo == null)?"<null>":this.cardholderAuthenticationValueProcessingInfo));
        sb.append(',');
        sb.append("keySetIdentifier");
        sb.append('=');
        sb.append(((this.keySetIdentifier == null)?"<null>":this.keySetIdentifier));
        sb.append(',');
        sb.append("secureCorporatePaymentExemptionIndicator");
        sb.append('=');
        sb.append(((this.secureCorporatePaymentExemptionIndicator == null)?"<null>":this.secureCorporatePaymentExemptionIndicator));
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
        result = ((result* 31)+((this.cardholderAuthenticationMethod == null)? 0 :this.cardholderAuthenticationMethod.hashCode()));
        result = ((result* 31)+((this.keySetIdentifier == null)? 0 :this.keySetIdentifier.hashCode()));
        result = ((result* 31)+((this.accountNameRequestValue == null)? 0 :this.accountNameRequestValue.hashCode()));
        result = ((result* 31)+((this.secureCorporatePaymentExemptionIndicator == null)? 0 :this.secureCorporatePaymentExemptionIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.acknowledgementRequestIndicator == null)? 0 :this.acknowledgementRequestIndicator.hashCode()));
        result = ((result* 31)+((this.cardholderAuthenticationValueProcessingInfo == null)? 0 :this.cardholderAuthenticationValueProcessingInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONVerification) == false) {
            return false;
        }
        DICOOBJETJSONVerification rhs = ((DICOOBJETJSONVerification) other);
        return ((((((((this.cardholderAuthenticationMethod == rhs.cardholderAuthenticationMethod)||((this.cardholderAuthenticationMethod!= null)&&this.cardholderAuthenticationMethod.equals(rhs.cardholderAuthenticationMethod)))&&((this.keySetIdentifier == rhs.keySetIdentifier)||((this.keySetIdentifier!= null)&&this.keySetIdentifier.equals(rhs.keySetIdentifier))))&&((this.accountNameRequestValue == rhs.accountNameRequestValue)||((this.accountNameRequestValue!= null)&&this.accountNameRequestValue.equals(rhs.accountNameRequestValue))))&&((this.secureCorporatePaymentExemptionIndicator == rhs.secureCorporatePaymentExemptionIndicator)||((this.secureCorporatePaymentExemptionIndicator!= null)&&this.secureCorporatePaymentExemptionIndicator.equals(rhs.secureCorporatePaymentExemptionIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.acknowledgementRequestIndicator == rhs.acknowledgementRequestIndicator)||((this.acknowledgementRequestIndicator!= null)&&this.acknowledgementRequestIndicator.equals(rhs.acknowledgementRequestIndicator))))&&((this.cardholderAuthenticationValueProcessingInfo == rhs.cardholderAuthenticationValueProcessingInfo)||((this.cardholderAuthenticationValueProcessingInfo!= null)&&this.cardholderAuthenticationValueProcessingInfo.equals(rhs.cardholderAuthenticationValueProcessingInfo))));
    }

}
