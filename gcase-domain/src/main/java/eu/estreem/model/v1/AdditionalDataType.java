
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
    "typeData",
    "value"
})
@Generated("jsonschema2pojo")
public class AdditionalDataType implements Serializable
{

    @JsonProperty("typeData")
    private List<TypeDataCodeset> typeData = new ArrayList<TypeDataCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 3000 characters
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 3000 characters")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6888101740577634564L;

    @JsonProperty("typeData")
    public List<TypeDataCodeset> getTypeData() {
        return typeData;
    }

    @JsonProperty("typeData")
    public void setTypeData(List<TypeDataCodeset> typeData) {
        this.typeData = typeData;
    }

    public AdditionalDataType withTypeData(List<TypeDataCodeset> typeData) {
        this.typeData = typeData;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 3000 characters
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 3000 characters
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public AdditionalDataType withValue(String value) {
        this.value = value;
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

    public AdditionalDataType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalDataType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("typeData");
        sb.append('=');
        sb.append(((this.typeData == null)?"<null>":this.typeData));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.typeData == null)? 0 :this.typeData.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalDataType) == false) {
            return false;
        }
        AdditionalDataType rhs = ((AdditionalDataType) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.typeData == rhs.typeData)||((this.typeData!= null)&&this.typeData.equals(rhs.typeData))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
