
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
    "tokenAssuranceMethod",
    "tokenProgramIndicator",
    "tokenRequestorIdentification",
    "trustedMerchantExemptionIndicator"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONToken implements Serializable
{

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("tokenAssuranceMethod")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String tokenAssuranceMethod;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("tokenProgramIndicator")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String tokenProgramIndicator;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("tokenRequestorIdentification")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String tokenRequestorIdentification;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("trustedMerchantExemptionIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String trustedMerchantExemptionIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5965731668403765344L;

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("tokenAssuranceMethod")
    public String getTokenAssuranceMethod() {
        return tokenAssuranceMethod;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("tokenAssuranceMethod")
    public void setTokenAssuranceMethod(String tokenAssuranceMethod) {
        this.tokenAssuranceMethod = tokenAssuranceMethod;
    }

    public DICOOBJETJSONToken withTokenAssuranceMethod(String tokenAssuranceMethod) {
        this.tokenAssuranceMethod = tokenAssuranceMethod;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("tokenProgramIndicator")
    public String getTokenProgramIndicator() {
        return tokenProgramIndicator;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("tokenProgramIndicator")
    public void setTokenProgramIndicator(String tokenProgramIndicator) {
        this.tokenProgramIndicator = tokenProgramIndicator;
    }

    public DICOOBJETJSONToken withTokenProgramIndicator(String tokenProgramIndicator) {
        this.tokenProgramIndicator = tokenProgramIndicator;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("tokenRequestorIdentification")
    public String getTokenRequestorIdentification() {
        return tokenRequestorIdentification;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("tokenRequestorIdentification")
    public void setTokenRequestorIdentification(String tokenRequestorIdentification) {
        this.tokenRequestorIdentification = tokenRequestorIdentification;
    }

    public DICOOBJETJSONToken withTokenRequestorIdentification(String tokenRequestorIdentification) {
        this.tokenRequestorIdentification = tokenRequestorIdentification;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("trustedMerchantExemptionIndicator")
    public String getTrustedMerchantExemptionIndicator() {
        return trustedMerchantExemptionIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("trustedMerchantExemptionIndicator")
    public void setTrustedMerchantExemptionIndicator(String trustedMerchantExemptionIndicator) {
        this.trustedMerchantExemptionIndicator = trustedMerchantExemptionIndicator;
    }

    public DICOOBJETJSONToken withTrustedMerchantExemptionIndicator(String trustedMerchantExemptionIndicator) {
        this.trustedMerchantExemptionIndicator = trustedMerchantExemptionIndicator;
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

    public DICOOBJETJSONToken withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONToken.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tokenAssuranceMethod");
        sb.append('=');
        sb.append(((this.tokenAssuranceMethod == null)?"<null>":this.tokenAssuranceMethod));
        sb.append(',');
        sb.append("tokenProgramIndicator");
        sb.append('=');
        sb.append(((this.tokenProgramIndicator == null)?"<null>":this.tokenProgramIndicator));
        sb.append(',');
        sb.append("tokenRequestorIdentification");
        sb.append('=');
        sb.append(((this.tokenRequestorIdentification == null)?"<null>":this.tokenRequestorIdentification));
        sb.append(',');
        sb.append("trustedMerchantExemptionIndicator");
        sb.append('=');
        sb.append(((this.trustedMerchantExemptionIndicator == null)?"<null>":this.trustedMerchantExemptionIndicator));
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
        result = ((result* 31)+((this.tokenProgramIndicator == null)? 0 :this.tokenProgramIndicator.hashCode()));
        result = ((result* 31)+((this.tokenAssuranceMethod == null)? 0 :this.tokenAssuranceMethod.hashCode()));
        result = ((result* 31)+((this.trustedMerchantExemptionIndicator == null)? 0 :this.trustedMerchantExemptionIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tokenRequestorIdentification == null)? 0 :this.tokenRequestorIdentification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONToken) == false) {
            return false;
        }
        DICOOBJETJSONToken rhs = ((DICOOBJETJSONToken) other);
        return ((((((this.tokenProgramIndicator == rhs.tokenProgramIndicator)||((this.tokenProgramIndicator!= null)&&this.tokenProgramIndicator.equals(rhs.tokenProgramIndicator)))&&((this.tokenAssuranceMethod == rhs.tokenAssuranceMethod)||((this.tokenAssuranceMethod!= null)&&this.tokenAssuranceMethod.equals(rhs.tokenAssuranceMethod))))&&((this.trustedMerchantExemptionIndicator == rhs.trustedMerchantExemptionIndicator)||((this.trustedMerchantExemptionIndicator!= null)&&this.trustedMerchantExemptionIndicator.equals(rhs.trustedMerchantExemptionIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tokenRequestorIdentification == rhs.tokenRequestorIdentification)||((this.tokenRequestorIdentification!= null)&&this.tokenRequestorIdentification.equals(rhs.tokenRequestorIdentification))));
    }

}
