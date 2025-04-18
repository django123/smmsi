
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
    "issuerScriptTemplate1",
    "issuerScriptTemplate2",
    "scriptBuffer",
    "scriptIndex",
    "scriptNumber",
    "scriptValue"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONIssuerScript implements Serializable
{

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)
     * 
     */
    @JsonProperty("issuerScriptTemplate1")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)")
    private String issuerScriptTemplate1;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)
     * 
     */
    @JsonProperty("issuerScriptTemplate2")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)")
    private String issuerScriptTemplate2;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (max of 150 bytes)
     * 
     */
    @JsonProperty("scriptBuffer")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (max of 150 bytes)")
    private String scriptBuffer;
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("scriptIndex")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String scriptIndex;
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("scriptNumber")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String scriptNumber;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (150 bytes)
     * 
     */
    @JsonProperty("scriptValue")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (150 bytes)")
    private String scriptValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7902295165657171273L;

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)
     * 
     */
    @JsonProperty("issuerScriptTemplate1")
    public String getIssuerScriptTemplate1() {
        return issuerScriptTemplate1;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)
     * 
     */
    @JsonProperty("issuerScriptTemplate1")
    public void setIssuerScriptTemplate1(String issuerScriptTemplate1) {
        this.issuerScriptTemplate1 = issuerScriptTemplate1;
    }

    public DICOOBJETJSONIssuerScript withIssuerScriptTemplate1(String issuerScriptTemplate1) {
        this.issuerScriptTemplate1 = issuerScriptTemplate1;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)
     * 
     */
    @JsonProperty("issuerScriptTemplate2")
    public String getIssuerScriptTemplate2() {
        return issuerScriptTemplate2;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 171 digits. (max of 128 bytes)
     * 
     */
    @JsonProperty("issuerScriptTemplate2")
    public void setIssuerScriptTemplate2(String issuerScriptTemplate2) {
        this.issuerScriptTemplate2 = issuerScriptTemplate2;
    }

    public DICOOBJETJSONIssuerScript withIssuerScriptTemplate2(String issuerScriptTemplate2) {
        this.issuerScriptTemplate2 = issuerScriptTemplate2;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (max of 150 bytes)
     * 
     */
    @JsonProperty("scriptBuffer")
    public String getScriptBuffer() {
        return scriptBuffer;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (max of 150 bytes)
     * 
     */
    @JsonProperty("scriptBuffer")
    public void setScriptBuffer(String scriptBuffer) {
        this.scriptBuffer = scriptBuffer;
    }

    public DICOOBJETJSONIssuerScript withScriptBuffer(String scriptBuffer) {
        this.scriptBuffer = scriptBuffer;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("scriptIndex")
    public String getScriptIndex() {
        return scriptIndex;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("scriptIndex")
    public void setScriptIndex(String scriptIndex) {
        this.scriptIndex = scriptIndex;
    }

    public DICOOBJETJSONIssuerScript withScriptIndex(String scriptIndex) {
        this.scriptIndex = scriptIndex;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("scriptNumber")
    public String getScriptNumber() {
        return scriptNumber;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("scriptNumber")
    public void setScriptNumber(String scriptNumber) {
        this.scriptNumber = scriptNumber;
    }

    public DICOOBJETJSONIssuerScript withScriptNumber(String scriptNumber) {
        this.scriptNumber = scriptNumber;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (150 bytes)
     * 
     */
    @JsonProperty("scriptValue")
    public String getScriptValue() {
        return scriptValue;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 200 digits. (150 bytes)
     * 
     */
    @JsonProperty("scriptValue")
    public void setScriptValue(String scriptValue) {
        this.scriptValue = scriptValue;
    }

    public DICOOBJETJSONIssuerScript withScriptValue(String scriptValue) {
        this.scriptValue = scriptValue;
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

    public DICOOBJETJSONIssuerScript withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONIssuerScript.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("issuerScriptTemplate1");
        sb.append('=');
        sb.append(((this.issuerScriptTemplate1 == null)?"<null>":this.issuerScriptTemplate1));
        sb.append(',');
        sb.append("issuerScriptTemplate2");
        sb.append('=');
        sb.append(((this.issuerScriptTemplate2 == null)?"<null>":this.issuerScriptTemplate2));
        sb.append(',');
        sb.append("scriptBuffer");
        sb.append('=');
        sb.append(((this.scriptBuffer == null)?"<null>":this.scriptBuffer));
        sb.append(',');
        sb.append("scriptIndex");
        sb.append('=');
        sb.append(((this.scriptIndex == null)?"<null>":this.scriptIndex));
        sb.append(',');
        sb.append("scriptNumber");
        sb.append('=');
        sb.append(((this.scriptNumber == null)?"<null>":this.scriptNumber));
        sb.append(',');
        sb.append("scriptValue");
        sb.append('=');
        sb.append(((this.scriptValue == null)?"<null>":this.scriptValue));
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
        result = ((result* 31)+((this.issuerScriptTemplate2 == null)? 0 :this.issuerScriptTemplate2 .hashCode()));
        result = ((result* 31)+((this.scriptBuffer == null)? 0 :this.scriptBuffer.hashCode()));
        result = ((result* 31)+((this.issuerScriptTemplate1 == null)? 0 :this.issuerScriptTemplate1 .hashCode()));
        result = ((result* 31)+((this.scriptIndex == null)? 0 :this.scriptIndex.hashCode()));
        result = ((result* 31)+((this.scriptValue == null)? 0 :this.scriptValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scriptNumber == null)? 0 :this.scriptNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONIssuerScript) == false) {
            return false;
        }
        DICOOBJETJSONIssuerScript rhs = ((DICOOBJETJSONIssuerScript) other);
        return ((((((((this.issuerScriptTemplate2 == rhs.issuerScriptTemplate2)||((this.issuerScriptTemplate2 != null)&&this.issuerScriptTemplate2 .equals(rhs.issuerScriptTemplate2)))&&((this.scriptBuffer == rhs.scriptBuffer)||((this.scriptBuffer!= null)&&this.scriptBuffer.equals(rhs.scriptBuffer))))&&((this.issuerScriptTemplate1 == rhs.issuerScriptTemplate1)||((this.issuerScriptTemplate1 != null)&&this.issuerScriptTemplate1 .equals(rhs.issuerScriptTemplate1))))&&((this.scriptIndex == rhs.scriptIndex)||((this.scriptIndex!= null)&&this.scriptIndex.equals(rhs.scriptIndex))))&&((this.scriptValue == rhs.scriptValue)||((this.scriptValue!= null)&&this.scriptValue.equals(rhs.scriptValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scriptNumber == rhs.scriptNumber)||((this.scriptNumber!= null)&&this.scriptNumber.equals(rhs.scriptNumber))));
    }

}
