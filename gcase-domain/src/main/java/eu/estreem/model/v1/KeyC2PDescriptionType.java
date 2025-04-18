
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
    "keyType",
    "keyOwner",
    "additionalKeyIdentifier",
    "keyVersionNumber"
})
@Generated("jsonschema2pojo")
public class KeyC2PDescriptionType implements Serializable
{

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyType")
    @JsonPropertyDescription("2 alphanumeric  and special characters")
    private String keyType;
    /**
     *  10 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyOwner")
    @JsonPropertyDescription("10 alphanumeric  and special characters")
    private String keyOwner;
    /**
     *  24 alphanumeric  and special characters
     * 
     */
    @JsonProperty("additionalKeyIdentifier")
    @JsonPropertyDescription("24 alphanumeric  and special characters")
    private String additionalKeyIdentifier;
    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyVersionNumber")
    @JsonPropertyDescription("2 alphanumeric  and special characters")
    private String keyVersionNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8241705170579826204L;

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyType")
    public String getKeyType() {
        return keyType;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyType")
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public KeyC2PDescriptionType withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     *  10 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyOwner")
    public String getKeyOwner() {
        return keyOwner;
    }

    /**
     *  10 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyOwner")
    public void setKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner;
    }

    public KeyC2PDescriptionType withKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner;
        return this;
    }

    /**
     *  24 alphanumeric  and special characters
     * 
     */
    @JsonProperty("additionalKeyIdentifier")
    public String getAdditionalKeyIdentifier() {
        return additionalKeyIdentifier;
    }

    /**
     *  24 alphanumeric  and special characters
     * 
     */
    @JsonProperty("additionalKeyIdentifier")
    public void setAdditionalKeyIdentifier(String additionalKeyIdentifier) {
        this.additionalKeyIdentifier = additionalKeyIdentifier;
    }

    public KeyC2PDescriptionType withAdditionalKeyIdentifier(String additionalKeyIdentifier) {
        this.additionalKeyIdentifier = additionalKeyIdentifier;
        return this;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyVersionNumber")
    public String getKeyVersionNumber() {
        return keyVersionNumber;
    }

    /**
     *  2 alphanumeric  and special characters
     * 
     */
    @JsonProperty("keyVersionNumber")
    public void setKeyVersionNumber(String keyVersionNumber) {
        this.keyVersionNumber = keyVersionNumber;
    }

    public KeyC2PDescriptionType withKeyVersionNumber(String keyVersionNumber) {
        this.keyVersionNumber = keyVersionNumber;
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

    public KeyC2PDescriptionType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyC2PDescriptionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyType");
        sb.append('=');
        sb.append(((this.keyType == null)?"<null>":this.keyType));
        sb.append(',');
        sb.append("keyOwner");
        sb.append('=');
        sb.append(((this.keyOwner == null)?"<null>":this.keyOwner));
        sb.append(',');
        sb.append("additionalKeyIdentifier");
        sb.append('=');
        sb.append(((this.additionalKeyIdentifier == null)?"<null>":this.additionalKeyIdentifier));
        sb.append(',');
        sb.append("keyVersionNumber");
        sb.append('=');
        sb.append(((this.keyVersionNumber == null)?"<null>":this.keyVersionNumber));
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
        result = ((result* 31)+((this.keyOwner == null)? 0 :this.keyOwner.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyType == null)? 0 :this.keyType.hashCode()));
        result = ((result* 31)+((this.additionalKeyIdentifier == null)? 0 :this.additionalKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.keyVersionNumber == null)? 0 :this.keyVersionNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyC2PDescriptionType) == false) {
            return false;
        }
        KeyC2PDescriptionType rhs = ((KeyC2PDescriptionType) other);
        return ((((((this.keyOwner == rhs.keyOwner)||((this.keyOwner!= null)&&this.keyOwner.equals(rhs.keyOwner)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyType == rhs.keyType)||((this.keyType!= null)&&this.keyType.equals(rhs.keyType))))&&((this.additionalKeyIdentifier == rhs.additionalKeyIdentifier)||((this.additionalKeyIdentifier!= null)&&this.additionalKeyIdentifier.equals(rhs.additionalKeyIdentifier))))&&((this.keyVersionNumber == rhs.keyVersionNumber)||((this.keyVersionNumber!= null)&&this.keyVersionNumber.equals(rhs.keyVersionNumber))));
    }

}
