
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
    "chargebackId",
    "reasonCode",
    "reasonLabel",
    "representmentReasonCode"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONChargebackData implements Serializable
{

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("chargebackId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 19 characters.")
    private String chargebackId;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("reasonCode")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.")
    private String reasonCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("reasonLabel")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String reasonLabel;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("representmentReasonCode")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.")
    private String representmentReasonCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8180121922067347550L;

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("chargebackId")
    public String getChargebackId() {
        return chargebackId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("chargebackId")
    public void setChargebackId(String chargebackId) {
        this.chargebackId = chargebackId;
    }

    public DICOOBJETJSONChargebackData withChargebackId(String chargebackId) {
        this.chargebackId = chargebackId;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public DICOOBJETJSONChargebackData withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("reasonLabel")
    public String getReasonLabel() {
        return reasonLabel;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("reasonLabel")
    public void setReasonLabel(String reasonLabel) {
        this.reasonLabel = reasonLabel;
    }

    public DICOOBJETJSONChargebackData withReasonLabel(String reasonLabel) {
        this.reasonLabel = reasonLabel;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("representmentReasonCode")
    public String getRepresentmentReasonCode() {
        return representmentReasonCode;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("representmentReasonCode")
    public void setRepresentmentReasonCode(String representmentReasonCode) {
        this.representmentReasonCode = representmentReasonCode;
    }

    public DICOOBJETJSONChargebackData withRepresentmentReasonCode(String representmentReasonCode) {
        this.representmentReasonCode = representmentReasonCode;
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

    public DICOOBJETJSONChargebackData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONChargebackData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chargebackId");
        sb.append('=');
        sb.append(((this.chargebackId == null)?"<null>":this.chargebackId));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("reasonLabel");
        sb.append('=');
        sb.append(((this.reasonLabel == null)?"<null>":this.reasonLabel));
        sb.append(',');
        sb.append("representmentReasonCode");
        sb.append('=');
        sb.append(((this.representmentReasonCode == null)?"<null>":this.representmentReasonCode));
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
        result = ((result* 31)+((this.chargebackId == null)? 0 :this.chargebackId.hashCode()));
        result = ((result* 31)+((this.reasonCode == null)? 0 :this.reasonCode.hashCode()));
        result = ((result* 31)+((this.reasonLabel == null)? 0 :this.reasonLabel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.representmentReasonCode == null)? 0 :this.representmentReasonCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONChargebackData) == false) {
            return false;
        }
        DICOOBJETJSONChargebackData rhs = ((DICOOBJETJSONChargebackData) other);
        return ((((((this.chargebackId == rhs.chargebackId)||((this.chargebackId!= null)&&this.chargebackId.equals(rhs.chargebackId)))&&((this.reasonCode == rhs.reasonCode)||((this.reasonCode!= null)&&this.reasonCode.equals(rhs.reasonCode))))&&((this.reasonLabel == rhs.reasonLabel)||((this.reasonLabel!= null)&&this.reasonLabel.equals(rhs.reasonLabel))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.representmentReasonCode == rhs.representmentReasonCode)||((this.representmentReasonCode!= null)&&this.representmentReasonCode.equals(rhs.representmentReasonCode))));
    }

}
