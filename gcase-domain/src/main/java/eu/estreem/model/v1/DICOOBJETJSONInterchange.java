
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
    "additionalCode",
    "amount",
    "ICScode",
    "rate"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONInterchange implements Serializable
{

    @JsonProperty("additionalCode")
    private KeyValueType additionalCode;
    @JsonProperty("amount")
    private AmountType amount;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("ICScode")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String iCScode;
    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("Rate expressed as a decimal")
    private String rate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5726930226023882923L;

    @JsonProperty("additionalCode")
    public KeyValueType getAdditionalCode() {
        return additionalCode;
    }

    @JsonProperty("additionalCode")
    public void setAdditionalCode(KeyValueType additionalCode) {
        this.additionalCode = additionalCode;
    }

    public DICOOBJETJSONInterchange withAdditionalCode(KeyValueType additionalCode) {
        this.additionalCode = additionalCode;
        return this;
    }

    @JsonProperty("amount")
    public AmountType getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(AmountType amount) {
        this.amount = amount;
    }

    public DICOOBJETJSONInterchange withAmount(AmountType amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("ICScode")
    public String getICScode() {
        return iCScode;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("ICScode")
    public void setICScode(String iCScode) {
        this.iCScode = iCScode;
    }

    public DICOOBJETJSONInterchange withICScode(String iCScode) {
        this.iCScode = iCScode;
        return this;
    }

    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    public DICOOBJETJSONInterchange withRate(String rate) {
        this.rate = rate;
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

    public DICOOBJETJSONInterchange withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONInterchange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalCode");
        sb.append('=');
        sb.append(((this.additionalCode == null)?"<null>":this.additionalCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("iCScode");
        sb.append('=');
        sb.append(((this.iCScode == null)?"<null>":this.iCScode));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.iCScode == null)? 0 :this.iCScode.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.additionalCode == null)? 0 :this.additionalCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONInterchange) == false) {
            return false;
        }
        DICOOBJETJSONInterchange rhs = ((DICOOBJETJSONInterchange) other);
        return ((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iCScode == rhs.iCScode)||((this.iCScode!= null)&&this.iCScode.equals(rhs.iCScode))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.additionalCode == rhs.additionalCode)||((this.additionalCode!= null)&&this.additionalCode.equals(rhs.additionalCode))));
    }

}
