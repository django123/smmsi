
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
    "authorisationCode",
    "responseCode",
    "responseDateTime"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONResponse implements Serializable
{

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("authorisationCode")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.")
    private String authorisationCode;
    @JsonProperty("responseCode")
    private List<ResponseCodeCodeset> responseCode = new ArrayList<ResponseCodeCodeset>();
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("responseDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String responseDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7480120516613426652L;

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("authorisationCode")
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 6 digits.
     * 
     */
    @JsonProperty("authorisationCode")
    public void setAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
    }

    public DICOOBJETJSONResponse withAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
        return this;
    }

    @JsonProperty("responseCode")
    public List<ResponseCodeCodeset> getResponseCode() {
        return responseCode;
    }

    @JsonProperty("responseCode")
    public void setResponseCode(List<ResponseCodeCodeset> responseCode) {
        this.responseCode = responseCode;
    }

    public DICOOBJETJSONResponse withResponseCode(List<ResponseCodeCodeset> responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("responseDateTime")
    public String getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("responseDateTime")
    public void setResponseDateTime(String responseDateTime) {
        this.responseDateTime = responseDateTime;
    }

    public DICOOBJETJSONResponse withResponseDateTime(String responseDateTime) {
        this.responseDateTime = responseDateTime;
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

    public DICOOBJETJSONResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("authorisationCode");
        sb.append('=');
        sb.append(((this.authorisationCode == null)?"<null>":this.authorisationCode));
        sb.append(',');
        sb.append("responseCode");
        sb.append('=');
        sb.append(((this.responseCode == null)?"<null>":this.responseCode));
        sb.append(',');
        sb.append("responseDateTime");
        sb.append('=');
        sb.append(((this.responseDateTime == null)?"<null>":this.responseDateTime));
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
        result = ((result* 31)+((this.authorisationCode == null)? 0 :this.authorisationCode.hashCode()));
        result = ((result* 31)+((this.responseDateTime == null)? 0 :this.responseDateTime.hashCode()));
        result = ((result* 31)+((this.responseCode == null)? 0 :this.responseCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONResponse) == false) {
            return false;
        }
        DICOOBJETJSONResponse rhs = ((DICOOBJETJSONResponse) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.authorisationCode == rhs.authorisationCode)||((this.authorisationCode!= null)&&this.authorisationCode.equals(rhs.authorisationCode))))&&((this.responseDateTime == rhs.responseDateTime)||((this.responseDateTime!= null)&&this.responseDateTime.equals(rhs.responseDateTime))))&&((this.responseCode == rhs.responseCode)||((this.responseCode!= null)&&this.responseCode.equals(rhs.responseCode))));
    }

}
