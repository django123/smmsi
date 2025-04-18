
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schemeFeesDetails",
    "totalAmount"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONSchemeFees implements Serializable
{

    @JsonProperty("schemeFeesDetails")
    private SchemeFeesType schemeFeesDetails;
    @JsonProperty("totalAmount")
    private AmountType totalAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6817337975914801669L;

    @JsonProperty("schemeFeesDetails")
    public SchemeFeesType getSchemeFeesDetails() {
        return schemeFeesDetails;
    }

    @JsonProperty("schemeFeesDetails")
    public void setSchemeFeesDetails(SchemeFeesType schemeFeesDetails) {
        this.schemeFeesDetails = schemeFeesDetails;
    }

    public DICOOBJETJSONSchemeFees withSchemeFeesDetails(SchemeFeesType schemeFeesDetails) {
        this.schemeFeesDetails = schemeFeesDetails;
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

    public DICOOBJETJSONSchemeFees withTotalAmount(AmountType totalAmount) {
        this.totalAmount = totalAmount;
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

    public DICOOBJETJSONSchemeFees withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONSchemeFees.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schemeFeesDetails");
        sb.append('=');
        sb.append(((this.schemeFeesDetails == null)?"<null>":this.schemeFeesDetails));
        sb.append(',');
        sb.append("totalAmount");
        sb.append('=');
        sb.append(((this.totalAmount == null)?"<null>":this.totalAmount));
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
        result = ((result* 31)+((this.totalAmount == null)? 0 :this.totalAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.schemeFeesDetails == null)? 0 :this.schemeFeesDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONSchemeFees) == false) {
            return false;
        }
        DICOOBJETJSONSchemeFees rhs = ((DICOOBJETJSONSchemeFees) other);
        return ((((this.totalAmount == rhs.totalAmount)||((this.totalAmount!= null)&&this.totalAmount.equals(rhs.totalAmount)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.schemeFeesDetails == rhs.schemeFeesDetails)||((this.schemeFeesDetails!= null)&&this.schemeFeesDetails.equals(rhs.schemeFeesDetails))));
    }

}
