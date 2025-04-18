
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
    "threeDsAuthenticationCategory",
    "threeDsComponentsAvailability",
    "threeDsIndicator",
    "threeDsMerchantRequestAuthentication",
    "threeDsProtocolVersion",
    "threeDsProtocolVersionSchemeSpecific",
    "threeDsResultsCardHolderAuthentication",
    "threeDsResultsNomenclature",
    "threeDsScore",
    "threeDsTransactionCancellationIndicator",
    "threeDsTransactionStatusReason"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONThreeDs implements Serializable
{

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("threeDsAuthenticationCategory")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String threeDsAuthenticationCategory;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("threeDsComponentsAvailability")
    @JsonPropertyDescription("1 alphanumeric character")
    private String threeDsComponentsAvailability;
    @JsonProperty("threeDsIndicator")
    private List<ThreeDSIndicatorCodeset> threeDsIndicator = new ArrayList<ThreeDSIndicatorCodeset>();
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsMerchantRequestAuthentication")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String threeDsMerchantRequestAuthentication;
    @JsonProperty("threeDsProtocolVersion")
    private List<ThreeDSProtocolVersionCodeset> threeDsProtocolVersion = new ArrayList<ThreeDSProtocolVersionCodeset>();
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 7 digits
     * 
     */
    @JsonProperty("threeDsProtocolVersionSchemeSpecific")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 7 digits")
    private String threeDsProtocolVersionSchemeSpecific;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("threeDsResultsCardHolderAuthentication")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String threeDsResultsCardHolderAuthentication;
    @JsonProperty("threeDsResultsNomenclature")
    private List<NetworkCodeset> threeDsResultsNomenclature = new ArrayList<NetworkCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 2 characters.
     * 
     */
    @JsonProperty("threeDsScore")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 2 characters.")
    private String threeDsScore;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsTransactionCancellationIndicator")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String threeDsTransactionCancellationIndicator;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsTransactionStatusReason")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String threeDsTransactionStatusReason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6837998940858030355L;

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("threeDsAuthenticationCategory")
    public String getThreeDsAuthenticationCategory() {
        return threeDsAuthenticationCategory;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("threeDsAuthenticationCategory")
    public void setThreeDsAuthenticationCategory(String threeDsAuthenticationCategory) {
        this.threeDsAuthenticationCategory = threeDsAuthenticationCategory;
    }

    public DICOOBJETJSONThreeDs withThreeDsAuthenticationCategory(String threeDsAuthenticationCategory) {
        this.threeDsAuthenticationCategory = threeDsAuthenticationCategory;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("threeDsComponentsAvailability")
    public String getThreeDsComponentsAvailability() {
        return threeDsComponentsAvailability;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("threeDsComponentsAvailability")
    public void setThreeDsComponentsAvailability(String threeDsComponentsAvailability) {
        this.threeDsComponentsAvailability = threeDsComponentsAvailability;
    }

    public DICOOBJETJSONThreeDs withThreeDsComponentsAvailability(String threeDsComponentsAvailability) {
        this.threeDsComponentsAvailability = threeDsComponentsAvailability;
        return this;
    }

    @JsonProperty("threeDsIndicator")
    public List<ThreeDSIndicatorCodeset> getThreeDsIndicator() {
        return threeDsIndicator;
    }

    @JsonProperty("threeDsIndicator")
    public void setThreeDsIndicator(List<ThreeDSIndicatorCodeset> threeDsIndicator) {
        this.threeDsIndicator = threeDsIndicator;
    }

    public DICOOBJETJSONThreeDs withThreeDsIndicator(List<ThreeDSIndicatorCodeset> threeDsIndicator) {
        this.threeDsIndicator = threeDsIndicator;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsMerchantRequestAuthentication")
    public String getThreeDsMerchantRequestAuthentication() {
        return threeDsMerchantRequestAuthentication;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsMerchantRequestAuthentication")
    public void setThreeDsMerchantRequestAuthentication(String threeDsMerchantRequestAuthentication) {
        this.threeDsMerchantRequestAuthentication = threeDsMerchantRequestAuthentication;
    }

    public DICOOBJETJSONThreeDs withThreeDsMerchantRequestAuthentication(String threeDsMerchantRequestAuthentication) {
        this.threeDsMerchantRequestAuthentication = threeDsMerchantRequestAuthentication;
        return this;
    }

    @JsonProperty("threeDsProtocolVersion")
    public List<ThreeDSProtocolVersionCodeset> getThreeDsProtocolVersion() {
        return threeDsProtocolVersion;
    }

    @JsonProperty("threeDsProtocolVersion")
    public void setThreeDsProtocolVersion(List<ThreeDSProtocolVersionCodeset> threeDsProtocolVersion) {
        this.threeDsProtocolVersion = threeDsProtocolVersion;
    }

    public DICOOBJETJSONThreeDs withThreeDsProtocolVersion(List<ThreeDSProtocolVersionCodeset> threeDsProtocolVersion) {
        this.threeDsProtocolVersion = threeDsProtocolVersion;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 7 digits
     * 
     */
    @JsonProperty("threeDsProtocolVersionSchemeSpecific")
    public String getThreeDsProtocolVersionSchemeSpecific() {
        return threeDsProtocolVersionSchemeSpecific;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 7 digits
     * 
     */
    @JsonProperty("threeDsProtocolVersionSchemeSpecific")
    public void setThreeDsProtocolVersionSchemeSpecific(String threeDsProtocolVersionSchemeSpecific) {
        this.threeDsProtocolVersionSchemeSpecific = threeDsProtocolVersionSchemeSpecific;
    }

    public DICOOBJETJSONThreeDs withThreeDsProtocolVersionSchemeSpecific(String threeDsProtocolVersionSchemeSpecific) {
        this.threeDsProtocolVersionSchemeSpecific = threeDsProtocolVersionSchemeSpecific;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("threeDsResultsCardHolderAuthentication")
    public String getThreeDsResultsCardHolderAuthentication() {
        return threeDsResultsCardHolderAuthentication;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("threeDsResultsCardHolderAuthentication")
    public void setThreeDsResultsCardHolderAuthentication(String threeDsResultsCardHolderAuthentication) {
        this.threeDsResultsCardHolderAuthentication = threeDsResultsCardHolderAuthentication;
    }

    public DICOOBJETJSONThreeDs withThreeDsResultsCardHolderAuthentication(String threeDsResultsCardHolderAuthentication) {
        this.threeDsResultsCardHolderAuthentication = threeDsResultsCardHolderAuthentication;
        return this;
    }

    @JsonProperty("threeDsResultsNomenclature")
    public List<NetworkCodeset> getThreeDsResultsNomenclature() {
        return threeDsResultsNomenclature;
    }

    @JsonProperty("threeDsResultsNomenclature")
    public void setThreeDsResultsNomenclature(List<NetworkCodeset> threeDsResultsNomenclature) {
        this.threeDsResultsNomenclature = threeDsResultsNomenclature;
    }

    public DICOOBJETJSONThreeDs withThreeDsResultsNomenclature(List<NetworkCodeset> threeDsResultsNomenclature) {
        this.threeDsResultsNomenclature = threeDsResultsNomenclature;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 2 characters.
     * 
     */
    @JsonProperty("threeDsScore")
    public String getThreeDsScore() {
        return threeDsScore;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 2 characters.
     * 
     */
    @JsonProperty("threeDsScore")
    public void setThreeDsScore(String threeDsScore) {
        this.threeDsScore = threeDsScore;
    }

    public DICOOBJETJSONThreeDs withThreeDsScore(String threeDsScore) {
        this.threeDsScore = threeDsScore;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsTransactionCancellationIndicator")
    public String getThreeDsTransactionCancellationIndicator() {
        return threeDsTransactionCancellationIndicator;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsTransactionCancellationIndicator")
    public void setThreeDsTransactionCancellationIndicator(String threeDsTransactionCancellationIndicator) {
        this.threeDsTransactionCancellationIndicator = threeDsTransactionCancellationIndicator;
    }

    public DICOOBJETJSONThreeDs withThreeDsTransactionCancellationIndicator(String threeDsTransactionCancellationIndicator) {
        this.threeDsTransactionCancellationIndicator = threeDsTransactionCancellationIndicator;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsTransactionStatusReason")
    public String getThreeDsTransactionStatusReason() {
        return threeDsTransactionStatusReason;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("threeDsTransactionStatusReason")
    public void setThreeDsTransactionStatusReason(String threeDsTransactionStatusReason) {
        this.threeDsTransactionStatusReason = threeDsTransactionStatusReason;
    }

    public DICOOBJETJSONThreeDs withThreeDsTransactionStatusReason(String threeDsTransactionStatusReason) {
        this.threeDsTransactionStatusReason = threeDsTransactionStatusReason;
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

    public DICOOBJETJSONThreeDs withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONThreeDs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threeDsAuthenticationCategory");
        sb.append('=');
        sb.append(((this.threeDsAuthenticationCategory == null)?"<null>":this.threeDsAuthenticationCategory));
        sb.append(',');
        sb.append("threeDsComponentsAvailability");
        sb.append('=');
        sb.append(((this.threeDsComponentsAvailability == null)?"<null>":this.threeDsComponentsAvailability));
        sb.append(',');
        sb.append("threeDsIndicator");
        sb.append('=');
        sb.append(((this.threeDsIndicator == null)?"<null>":this.threeDsIndicator));
        sb.append(',');
        sb.append("threeDsMerchantRequestAuthentication");
        sb.append('=');
        sb.append(((this.threeDsMerchantRequestAuthentication == null)?"<null>":this.threeDsMerchantRequestAuthentication));
        sb.append(',');
        sb.append("threeDsProtocolVersion");
        sb.append('=');
        sb.append(((this.threeDsProtocolVersion == null)?"<null>":this.threeDsProtocolVersion));
        sb.append(',');
        sb.append("threeDsProtocolVersionSchemeSpecific");
        sb.append('=');
        sb.append(((this.threeDsProtocolVersionSchemeSpecific == null)?"<null>":this.threeDsProtocolVersionSchemeSpecific));
        sb.append(',');
        sb.append("threeDsResultsCardHolderAuthentication");
        sb.append('=');
        sb.append(((this.threeDsResultsCardHolderAuthentication == null)?"<null>":this.threeDsResultsCardHolderAuthentication));
        sb.append(',');
        sb.append("threeDsResultsNomenclature");
        sb.append('=');
        sb.append(((this.threeDsResultsNomenclature == null)?"<null>":this.threeDsResultsNomenclature));
        sb.append(',');
        sb.append("threeDsScore");
        sb.append('=');
        sb.append(((this.threeDsScore == null)?"<null>":this.threeDsScore));
        sb.append(',');
        sb.append("threeDsTransactionCancellationIndicator");
        sb.append('=');
        sb.append(((this.threeDsTransactionCancellationIndicator == null)?"<null>":this.threeDsTransactionCancellationIndicator));
        sb.append(',');
        sb.append("threeDsTransactionStatusReason");
        sb.append('=');
        sb.append(((this.threeDsTransactionStatusReason == null)?"<null>":this.threeDsTransactionStatusReason));
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
        result = ((result* 31)+((this.threeDsIndicator == null)? 0 :this.threeDsIndicator.hashCode()));
        result = ((result* 31)+((this.threeDsResultsNomenclature == null)? 0 :this.threeDsResultsNomenclature.hashCode()));
        result = ((result* 31)+((this.threeDsProtocolVersionSchemeSpecific == null)? 0 :this.threeDsProtocolVersionSchemeSpecific.hashCode()));
        result = ((result* 31)+((this.threeDsScore == null)? 0 :this.threeDsScore.hashCode()));
        result = ((result* 31)+((this.threeDsTransactionCancellationIndicator == null)? 0 :this.threeDsTransactionCancellationIndicator.hashCode()));
        result = ((result* 31)+((this.threeDsProtocolVersion == null)? 0 :this.threeDsProtocolVersion.hashCode()));
        result = ((result* 31)+((this.threeDsAuthenticationCategory == null)? 0 :this.threeDsAuthenticationCategory.hashCode()));
        result = ((result* 31)+((this.threeDsComponentsAvailability == null)? 0 :this.threeDsComponentsAvailability.hashCode()));
        result = ((result* 31)+((this.threeDsMerchantRequestAuthentication == null)? 0 :this.threeDsMerchantRequestAuthentication.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.threeDsResultsCardHolderAuthentication == null)? 0 :this.threeDsResultsCardHolderAuthentication.hashCode()));
        result = ((result* 31)+((this.threeDsTransactionStatusReason == null)? 0 :this.threeDsTransactionStatusReason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONThreeDs) == false) {
            return false;
        }
        DICOOBJETJSONThreeDs rhs = ((DICOOBJETJSONThreeDs) other);
        return (((((((((((((this.threeDsIndicator == rhs.threeDsIndicator)||((this.threeDsIndicator!= null)&&this.threeDsIndicator.equals(rhs.threeDsIndicator)))&&((this.threeDsResultsNomenclature == rhs.threeDsResultsNomenclature)||((this.threeDsResultsNomenclature!= null)&&this.threeDsResultsNomenclature.equals(rhs.threeDsResultsNomenclature))))&&((this.threeDsProtocolVersionSchemeSpecific == rhs.threeDsProtocolVersionSchemeSpecific)||((this.threeDsProtocolVersionSchemeSpecific!= null)&&this.threeDsProtocolVersionSchemeSpecific.equals(rhs.threeDsProtocolVersionSchemeSpecific))))&&((this.threeDsScore == rhs.threeDsScore)||((this.threeDsScore!= null)&&this.threeDsScore.equals(rhs.threeDsScore))))&&((this.threeDsTransactionCancellationIndicator == rhs.threeDsTransactionCancellationIndicator)||((this.threeDsTransactionCancellationIndicator!= null)&&this.threeDsTransactionCancellationIndicator.equals(rhs.threeDsTransactionCancellationIndicator))))&&((this.threeDsProtocolVersion == rhs.threeDsProtocolVersion)||((this.threeDsProtocolVersion!= null)&&this.threeDsProtocolVersion.equals(rhs.threeDsProtocolVersion))))&&((this.threeDsAuthenticationCategory == rhs.threeDsAuthenticationCategory)||((this.threeDsAuthenticationCategory!= null)&&this.threeDsAuthenticationCategory.equals(rhs.threeDsAuthenticationCategory))))&&((this.threeDsComponentsAvailability == rhs.threeDsComponentsAvailability)||((this.threeDsComponentsAvailability!= null)&&this.threeDsComponentsAvailability.equals(rhs.threeDsComponentsAvailability))))&&((this.threeDsMerchantRequestAuthentication == rhs.threeDsMerchantRequestAuthentication)||((this.threeDsMerchantRequestAuthentication!= null)&&this.threeDsMerchantRequestAuthentication.equals(rhs.threeDsMerchantRequestAuthentication))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.threeDsResultsCardHolderAuthentication == rhs.threeDsResultsCardHolderAuthentication)||((this.threeDsResultsCardHolderAuthentication!= null)&&this.threeDsResultsCardHolderAuthentication.equals(rhs.threeDsResultsCardHolderAuthentication))))&&((this.threeDsTransactionStatusReason == rhs.threeDsTransactionStatusReason)||((this.threeDsTransactionStatusReason!= null)&&this.threeDsTransactionStatusReason.equals(rhs.threeDsTransactionStatusReason))));
    }

}
