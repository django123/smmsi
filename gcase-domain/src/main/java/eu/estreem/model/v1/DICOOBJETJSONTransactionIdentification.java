
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
    "cryptogramDateTime",
    "ecommerceTransactionId",
    "localDateTime",
    "transactionReference",
    "transmissionGmtDateTime"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONTransactionIdentification implements Serializable
{

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("cryptogramDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String cryptogramDateTime;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("ecommerceTransactionId")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)")
    private String ecommerceTransactionId;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("localDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String localDateTime;
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
    private final static long serialVersionUID = -6858497092949682420L;

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("cryptogramDateTime")
    public String getCryptogramDateTime() {
        return cryptogramDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("cryptogramDateTime")
    public void setCryptogramDateTime(String cryptogramDateTime) {
        this.cryptogramDateTime = cryptogramDateTime;
    }

    public DICOOBJETJSONTransactionIdentification withCryptogramDateTime(String cryptogramDateTime) {
        this.cryptogramDateTime = cryptogramDateTime;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("ecommerceTransactionId")
    public String getEcommerceTransactionId() {
        return ecommerceTransactionId;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 54 digits. (4 to 40 bytes)
     * 
     */
    @JsonProperty("ecommerceTransactionId")
    public void setEcommerceTransactionId(String ecommerceTransactionId) {
        this.ecommerceTransactionId = ecommerceTransactionId;
    }

    public DICOOBJETJSONTransactionIdentification withEcommerceTransactionId(String ecommerceTransactionId) {
        this.ecommerceTransactionId = ecommerceTransactionId;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("localDateTime")
    public String getLocalDateTime() {
        return localDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("localDateTime")
    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public DICOOBJETJSONTransactionIdentification withLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
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

    public DICOOBJETJSONTransactionIdentification withTransactionReference(String transactionReference) {
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

    public DICOOBJETJSONTransactionIdentification withTransmissionGmtDateTime(String transmissionGmtDateTime) {
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

    public DICOOBJETJSONTransactionIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONTransactionIdentification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cryptogramDateTime");
        sb.append('=');
        sb.append(((this.cryptogramDateTime == null)?"<null>":this.cryptogramDateTime));
        sb.append(',');
        sb.append("ecommerceTransactionId");
        sb.append('=');
        sb.append(((this.ecommerceTransactionId == null)?"<null>":this.ecommerceTransactionId));
        sb.append(',');
        sb.append("localDateTime");
        sb.append('=');
        sb.append(((this.localDateTime == null)?"<null>":this.localDateTime));
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
        result = ((result* 31)+((this.ecommerceTransactionId == null)? 0 :this.ecommerceTransactionId.hashCode()));
        result = ((result* 31)+((this.localDateTime == null)? 0 :this.localDateTime.hashCode()));
        result = ((result* 31)+((this.transmissionGmtDateTime == null)? 0 :this.transmissionGmtDateTime.hashCode()));
        result = ((result* 31)+((this.transactionReference == null)? 0 :this.transactionReference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cryptogramDateTime == null)? 0 :this.cryptogramDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONTransactionIdentification) == false) {
            return false;
        }
        DICOOBJETJSONTransactionIdentification rhs = ((DICOOBJETJSONTransactionIdentification) other);
        return (((((((this.ecommerceTransactionId == rhs.ecommerceTransactionId)||((this.ecommerceTransactionId!= null)&&this.ecommerceTransactionId.equals(rhs.ecommerceTransactionId)))&&((this.localDateTime == rhs.localDateTime)||((this.localDateTime!= null)&&this.localDateTime.equals(rhs.localDateTime))))&&((this.transmissionGmtDateTime == rhs.transmissionGmtDateTime)||((this.transmissionGmtDateTime!= null)&&this.transmissionGmtDateTime.equals(rhs.transmissionGmtDateTime))))&&((this.transactionReference == rhs.transactionReference)||((this.transactionReference!= null)&&this.transactionReference.equals(rhs.transactionReference))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cryptogramDateTime == rhs.cryptogramDateTime)||((this.cryptogramDateTime!= null)&&this.cryptogramDateTime.equals(rhs.cryptogramDateTime))));
    }

}
