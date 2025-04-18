
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
    "key",
    "value"
})
@Generated("jsonschema2pojo")
public class KeyValueType implements Serializable
{

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String key;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4560802170764716614L;

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public KeyValueType withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public KeyValueType withValue(String value) {
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

    public KeyValueType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyValueType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyValueType) == false) {
            return false;
        }
        KeyValueType rhs = ((KeyValueType) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

}
