
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
    "acquirerDomain",
    "acquirerId",
    "acquirerLeaderInstitutionId",
    "acquirerName",
    "countryCode"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONAcquirer implements Serializable
{

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("acquirerDomain")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 16 characters.")
    private String acquirerDomain;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("acquirerId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String acquirerId;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("acquirerLeaderInstitutionId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String acquirerLeaderInstitutionId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("acquirerName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String acquirerName;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String countryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1127949919622122011L;

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("acquirerDomain")
    public String getAcquirerDomain() {
        return acquirerDomain;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("acquirerDomain")
    public void setAcquirerDomain(String acquirerDomain) {
        this.acquirerDomain = acquirerDomain;
    }

    public DICOOBJETJSONAcquirer withAcquirerDomain(String acquirerDomain) {
        this.acquirerDomain = acquirerDomain;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("acquirerId")
    public String getAcquirerId() {
        return acquirerId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("acquirerId")
    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public DICOOBJETJSONAcquirer withAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("acquirerLeaderInstitutionId")
    public String getAcquirerLeaderInstitutionId() {
        return acquirerLeaderInstitutionId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("acquirerLeaderInstitutionId")
    public void setAcquirerLeaderInstitutionId(String acquirerLeaderInstitutionId) {
        this.acquirerLeaderInstitutionId = acquirerLeaderInstitutionId;
    }

    public DICOOBJETJSONAcquirer withAcquirerLeaderInstitutionId(String acquirerLeaderInstitutionId) {
        this.acquirerLeaderInstitutionId = acquirerLeaderInstitutionId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("acquirerName")
    public String getAcquirerName() {
        return acquirerName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("acquirerName")
    public void setAcquirerName(String acquirerName) {
        this.acquirerName = acquirerName;
    }

    public DICOOBJETJSONAcquirer withAcquirerName(String acquirerName) {
        this.acquirerName = acquirerName;
        return this;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public DICOOBJETJSONAcquirer withCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public DICOOBJETJSONAcquirer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONAcquirer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acquirerDomain");
        sb.append('=');
        sb.append(((this.acquirerDomain == null)?"<null>":this.acquirerDomain));
        sb.append(',');
        sb.append("acquirerId");
        sb.append('=');
        sb.append(((this.acquirerId == null)?"<null>":this.acquirerId));
        sb.append(',');
        sb.append("acquirerLeaderInstitutionId");
        sb.append('=');
        sb.append(((this.acquirerLeaderInstitutionId == null)?"<null>":this.acquirerLeaderInstitutionId));
        sb.append(',');
        sb.append("acquirerName");
        sb.append('=');
        sb.append(((this.acquirerName == null)?"<null>":this.acquirerName));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
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
        result = ((result* 31)+((this.acquirerDomain == null)? 0 :this.acquirerDomain.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.acquirerId == null)? 0 :this.acquirerId.hashCode()));
        result = ((result* 31)+((this.acquirerLeaderInstitutionId == null)? 0 :this.acquirerLeaderInstitutionId.hashCode()));
        result = ((result* 31)+((this.acquirerName == null)? 0 :this.acquirerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONAcquirer) == false) {
            return false;
        }
        DICOOBJETJSONAcquirer rhs = ((DICOOBJETJSONAcquirer) other);
        return (((((((this.acquirerDomain == rhs.acquirerDomain)||((this.acquirerDomain!= null)&&this.acquirerDomain.equals(rhs.acquirerDomain)))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.acquirerId == rhs.acquirerId)||((this.acquirerId!= null)&&this.acquirerId.equals(rhs.acquirerId))))&&((this.acquirerLeaderInstitutionId == rhs.acquirerLeaderInstitutionId)||((this.acquirerLeaderInstitutionId!= null)&&this.acquirerLeaderInstitutionId.equals(rhs.acquirerLeaderInstitutionId))))&&((this.acquirerName == rhs.acquirerName)||((this.acquirerName!= null)&&this.acquirerName.equals(rhs.acquirerName))));
    }

}
