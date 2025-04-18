
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
    "cardHolderId",
    "countryCode",
    "email",
    "firstName",
    "lastName",
    "localLanguageCode",
    "middleName",
    "phoneNumber",
    "postalAddress",
    "taxCountryCode",
    "taxRegistrationIdentication",
    "taxRegistrationReasonCode"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONCardholder implements Serializable
{

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("cardHolderId")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.")
    private String cardHolderId;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String countryCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 256 characters
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 256 characters")
    private String email;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String firstName;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String lastName;
    /**
     *  Identification of the language name in accordance with ISO 639-1 and ISO 639-2.
     * 
     */
    @JsonProperty("localLanguageCode")
    @JsonPropertyDescription(" Identification of the language name in accordance with ISO 639-1 and ISO 639-2.")
    private String localLanguageCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String middleName;
    /**
     * International phone number E164 standard
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("International phone number E164 standard")
    private String phoneNumber;
    @JsonProperty("postalAddress")
    private PostalAddressType postalAddress;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("taxCountryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String taxCountryCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("taxRegistrationIdentication")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String taxRegistrationIdentication;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("taxRegistrationReasonCode")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String taxRegistrationReasonCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3329483279024084232L;

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("cardHolderId")
    public String getCardHolderId() {
        return cardHolderId;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("cardHolderId")
    public void setCardHolderId(String cardHolderId) {
        this.cardHolderId = cardHolderId;
    }

    public DICOOBJETJSONCardholder withCardHolderId(String cardHolderId) {
        this.cardHolderId = cardHolderId;
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

    public DICOOBJETJSONCardholder withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 256 characters
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 256 characters
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public DICOOBJETJSONCardholder withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public DICOOBJETJSONCardholder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DICOOBJETJSONCardholder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  Identification of the language name in accordance with ISO 639-1 and ISO 639-2.
     * 
     */
    @JsonProperty("localLanguageCode")
    public String getLocalLanguageCode() {
        return localLanguageCode;
    }

    /**
     *  Identification of the language name in accordance with ISO 639-1 and ISO 639-2.
     * 
     */
    @JsonProperty("localLanguageCode")
    public void setLocalLanguageCode(String localLanguageCode) {
        this.localLanguageCode = localLanguageCode;
    }

    public DICOOBJETJSONCardholder withLocalLanguageCode(String localLanguageCode) {
        this.localLanguageCode = localLanguageCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public DICOOBJETJSONCardholder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * International phone number E164 standard
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * International phone number E164 standard
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DICOOBJETJSONCardholder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("postalAddress")
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    @JsonProperty("postalAddress")
    public void setPostalAddress(PostalAddressType postalAddress) {
        this.postalAddress = postalAddress;
    }

    public DICOOBJETJSONCardholder withPostalAddress(PostalAddressType postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("taxCountryCode")
    public String getTaxCountryCode() {
        return taxCountryCode;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("taxCountryCode")
    public void setTaxCountryCode(String taxCountryCode) {
        this.taxCountryCode = taxCountryCode;
    }

    public DICOOBJETJSONCardholder withTaxCountryCode(String taxCountryCode) {
        this.taxCountryCode = taxCountryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("taxRegistrationIdentication")
    public String getTaxRegistrationIdentication() {
        return taxRegistrationIdentication;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("taxRegistrationIdentication")
    public void setTaxRegistrationIdentication(String taxRegistrationIdentication) {
        this.taxRegistrationIdentication = taxRegistrationIdentication;
    }

    public DICOOBJETJSONCardholder withTaxRegistrationIdentication(String taxRegistrationIdentication) {
        this.taxRegistrationIdentication = taxRegistrationIdentication;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("taxRegistrationReasonCode")
    public String getTaxRegistrationReasonCode() {
        return taxRegistrationReasonCode;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("taxRegistrationReasonCode")
    public void setTaxRegistrationReasonCode(String taxRegistrationReasonCode) {
        this.taxRegistrationReasonCode = taxRegistrationReasonCode;
    }

    public DICOOBJETJSONCardholder withTaxRegistrationReasonCode(String taxRegistrationReasonCode) {
        this.taxRegistrationReasonCode = taxRegistrationReasonCode;
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

    public DICOOBJETJSONCardholder withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONCardholder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardHolderId");
        sb.append('=');
        sb.append(((this.cardHolderId == null)?"<null>":this.cardHolderId));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("localLanguageCode");
        sb.append('=');
        sb.append(((this.localLanguageCode == null)?"<null>":this.localLanguageCode));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("postalAddress");
        sb.append('=');
        sb.append(((this.postalAddress == null)?"<null>":this.postalAddress));
        sb.append(',');
        sb.append("taxCountryCode");
        sb.append('=');
        sb.append(((this.taxCountryCode == null)?"<null>":this.taxCountryCode));
        sb.append(',');
        sb.append("taxRegistrationIdentication");
        sb.append('=');
        sb.append(((this.taxRegistrationIdentication == null)?"<null>":this.taxRegistrationIdentication));
        sb.append(',');
        sb.append("taxRegistrationReasonCode");
        sb.append('=');
        sb.append(((this.taxRegistrationReasonCode == null)?"<null>":this.taxRegistrationReasonCode));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.taxCountryCode == null)? 0 :this.taxCountryCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.postalAddress == null)? 0 :this.postalAddress.hashCode()));
        result = ((result* 31)+((this.taxRegistrationReasonCode == null)? 0 :this.taxRegistrationReasonCode.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.localLanguageCode == null)? 0 :this.localLanguageCode.hashCode()));
        result = ((result* 31)+((this.cardHolderId == null)? 0 :this.cardHolderId.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.taxRegistrationIdentication == null)? 0 :this.taxRegistrationIdentication.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONCardholder) == false) {
            return false;
        }
        DICOOBJETJSONCardholder rhs = ((DICOOBJETJSONCardholder) other);
        return ((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.taxCountryCode == rhs.taxCountryCode)||((this.taxCountryCode!= null)&&this.taxCountryCode.equals(rhs.taxCountryCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.postalAddress == rhs.postalAddress)||((this.postalAddress!= null)&&this.postalAddress.equals(rhs.postalAddress))))&&((this.taxRegistrationReasonCode == rhs.taxRegistrationReasonCode)||((this.taxRegistrationReasonCode!= null)&&this.taxRegistrationReasonCode.equals(rhs.taxRegistrationReasonCode))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.localLanguageCode == rhs.localLanguageCode)||((this.localLanguageCode!= null)&&this.localLanguageCode.equals(rhs.localLanguageCode))))&&((this.cardHolderId == rhs.cardHolderId)||((this.cardHolderId!= null)&&this.cardHolderId.equals(rhs.cardHolderId))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.taxRegistrationIdentication == rhs.taxRegistrationIdentication)||((this.taxRegistrationIdentication!= null)&&this.taxRegistrationIdentication.equals(rhs.taxRegistrationIdentication))));
    }

}
