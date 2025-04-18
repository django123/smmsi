
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
    "httpCode"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONHttpStatus implements Serializable
{

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("httpCode")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 3 digits.")
    private String httpCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -948274007101769472L;

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("httpCode")
    public String getHttpCode() {
        return httpCode;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("httpCode")
    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    public DICOOBJETJSONHttpStatus withHttpCode(String httpCode) {
        this.httpCode = httpCode;
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

    public DICOOBJETJSONHttpStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONHttpStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("httpCode");
        sb.append('=');
        sb.append(((this.httpCode == null)?"<null>":this.httpCode));
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
        result = ((result* 31)+((this.httpCode == null)? 0 :this.httpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONHttpStatus) == false) {
            return false;
        }
        DICOOBJETJSONHttpStatus rhs = ((DICOOBJETJSONHttpStatus) other);
        return (((this.httpCode == rhs.httpCode)||((this.httpCode!= null)&&this.httpCode.equals(rhs.httpCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
