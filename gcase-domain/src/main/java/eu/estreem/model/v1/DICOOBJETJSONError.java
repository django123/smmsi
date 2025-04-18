
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
    "code",
    "developerText",
    "moreInfo",
    "text"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONError implements Serializable
{

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 20 characters.")
    private String code;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("developerText")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String developerText;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 256 characters
     * 
     */
    @JsonProperty("moreInfo")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 256 characters")
    private String moreInfo;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 1653974621694267886L;

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DICOOBJETJSONError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("developerText")
    public String getDeveloperText() {
        return developerText;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("developerText")
    public void setDeveloperText(String developerText) {
        this.developerText = developerText;
    }

    public DICOOBJETJSONError withDeveloperText(String developerText) {
        this.developerText = developerText;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 256 characters
     * 
     */
    @JsonProperty("moreInfo")
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 256 characters
     * 
     */
    @JsonProperty("moreInfo")
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public DICOOBJETJSONError withMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public DICOOBJETJSONError withText(String text) {
        this.text = text;
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

    public DICOOBJETJSONError withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONError.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("developerText");
        sb.append('=');
        sb.append(((this.developerText == null)?"<null>":this.developerText));
        sb.append(',');
        sb.append("moreInfo");
        sb.append('=');
        sb.append(((this.moreInfo == null)?"<null>":this.moreInfo));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.developerText == null)? 0 :this.developerText.hashCode()));
        result = ((result* 31)+((this.moreInfo == null)? 0 :this.moreInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONError) == false) {
            return false;
        }
        DICOOBJETJSONError rhs = ((DICOOBJETJSONError) other);
        return ((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.developerText == rhs.developerText)||((this.developerText!= null)&&this.developerText.equals(rhs.developerText))))&&((this.moreInfo == rhs.moreInfo)||((this.moreInfo!= null)&&this.moreInfo.equals(rhs.moreInfo))));
    }

}
