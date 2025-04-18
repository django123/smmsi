
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
    "addressCategory",
    "department",
    "subDepartment",
    "streetName",
    "buildingNumber",
    "postCode",
    "townName",
    "countrySubdivisionMinorCode",
    "countrySubdivisionMajorCode",
    "countrySubdivisionMinorName",
    "countrySubdivisionMajorName",
    "countryCode",
    "countryName",
    "postalAddressAdditionalData"
})
@Generated("jsonschema2pojo")
public class PostalAddressType implements Serializable
{

    @JsonProperty("addressCategory")
    private List<AddressCategoryCodeset> addressCategory = new ArrayList<AddressCategoryCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String department;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("subDepartment")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String subDepartment;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("streetName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String streetName;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("buildingNumber")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 16 characters.")
    private String buildingNumber;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("postCode")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 16 characters.")
    private String postCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("townName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String townName;
    /**
     * Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority
     * 
     */
    @JsonProperty("countrySubdivisionMinorCode")
    @JsonPropertyDescription("Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority")
    private String countrySubdivisionMinorCode;
    /**
     * Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority
     * 
     */
    @JsonProperty("countrySubdivisionMajorCode")
    @JsonPropertyDescription("Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority")
    private String countrySubdivisionMajorCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("countrySubdivisionMinorName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 50 characters")
    private String countrySubdivisionMinorName;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("countrySubdivisionMajorName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 50 characters")
    private String countrySubdivisionMajorName;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String countryCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("countryName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String countryName;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("postalAddressAdditionalData")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String postalAddressAdditionalData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3297489498687147321L;

    @JsonProperty("addressCategory")
    public List<AddressCategoryCodeset> getAddressCategory() {
        return addressCategory;
    }

    @JsonProperty("addressCategory")
    public void setAddressCategory(List<AddressCategoryCodeset> addressCategory) {
        this.addressCategory = addressCategory;
    }

    public PostalAddressType withAddressCategory(List<AddressCategoryCodeset> addressCategory) {
        this.addressCategory = addressCategory;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public PostalAddressType withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("subDepartment")
    public String getSubDepartment() {
        return subDepartment;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("subDepartment")
    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
    }

    public PostalAddressType withSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public PostalAddressType withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("buildingNumber")
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("buildingNumber")
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public PostalAddressType withBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 16 characters.
     * 
     */
    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public PostalAddressType withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("townName")
    public String getTownName() {
        return townName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("townName")
    public void setTownName(String townName) {
        this.townName = townName;
    }

    public PostalAddressType withTownName(String townName) {
        this.townName = townName;
        return this;
    }

    /**
     * Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority
     * 
     */
    @JsonProperty("countrySubdivisionMinorCode")
    public String getCountrySubdivisionMinorCode() {
        return countrySubdivisionMinorCode;
    }

    /**
     * Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority
     * 
     */
    @JsonProperty("countrySubdivisionMinorCode")
    public void setCountrySubdivisionMinorCode(String countrySubdivisionMinorCode) {
        this.countrySubdivisionMinorCode = countrySubdivisionMinorCode;
    }

    public PostalAddressType withCountrySubdivisionMinorCode(String countrySubdivisionMinorCode) {
        this.countrySubdivisionMinorCode = countrySubdivisionMinorCode;
        return this;
    }

    /**
     * Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority
     * 
     */
    @JsonProperty("countrySubdivisionMajorCode")
    public String getCountrySubdivisionMajorCode() {
        return countrySubdivisionMajorCode;
    }

    /**
     * Code to identify an area of geopolitical interest, based on names obtained from the United Nations ISO 3166-2 or the local authority
     * 
     */
    @JsonProperty("countrySubdivisionMajorCode")
    public void setCountrySubdivisionMajorCode(String countrySubdivisionMajorCode) {
        this.countrySubdivisionMajorCode = countrySubdivisionMajorCode;
    }

    public PostalAddressType withCountrySubdivisionMajorCode(String countrySubdivisionMajorCode) {
        this.countrySubdivisionMajorCode = countrySubdivisionMajorCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("countrySubdivisionMinorName")
    public String getCountrySubdivisionMinorName() {
        return countrySubdivisionMinorName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("countrySubdivisionMinorName")
    public void setCountrySubdivisionMinorName(String countrySubdivisionMinorName) {
        this.countrySubdivisionMinorName = countrySubdivisionMinorName;
    }

    public PostalAddressType withCountrySubdivisionMinorName(String countrySubdivisionMinorName) {
        this.countrySubdivisionMinorName = countrySubdivisionMinorName;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("countrySubdivisionMajorName")
    public String getCountrySubdivisionMajorName() {
        return countrySubdivisionMajorName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("countrySubdivisionMajorName")
    public void setCountrySubdivisionMajorName(String countrySubdivisionMajorName) {
        this.countrySubdivisionMajorName = countrySubdivisionMajorName;
    }

    public PostalAddressType withCountrySubdivisionMajorName(String countrySubdivisionMajorName) {
        this.countrySubdivisionMajorName = countrySubdivisionMajorName;
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

    public PostalAddressType withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public PostalAddressType withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("postalAddressAdditionalData")
    public String getPostalAddressAdditionalData() {
        return postalAddressAdditionalData;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("postalAddressAdditionalData")
    public void setPostalAddressAdditionalData(String postalAddressAdditionalData) {
        this.postalAddressAdditionalData = postalAddressAdditionalData;
    }

    public PostalAddressType withPostalAddressAdditionalData(String postalAddressAdditionalData) {
        this.postalAddressAdditionalData = postalAddressAdditionalData;
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

    public PostalAddressType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostalAddressType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressCategory");
        sb.append('=');
        sb.append(((this.addressCategory == null)?"<null>":this.addressCategory));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("subDepartment");
        sb.append('=');
        sb.append(((this.subDepartment == null)?"<null>":this.subDepartment));
        sb.append(',');
        sb.append("streetName");
        sb.append('=');
        sb.append(((this.streetName == null)?"<null>":this.streetName));
        sb.append(',');
        sb.append("buildingNumber");
        sb.append('=');
        sb.append(((this.buildingNumber == null)?"<null>":this.buildingNumber));
        sb.append(',');
        sb.append("postCode");
        sb.append('=');
        sb.append(((this.postCode == null)?"<null>":this.postCode));
        sb.append(',');
        sb.append("townName");
        sb.append('=');
        sb.append(((this.townName == null)?"<null>":this.townName));
        sb.append(',');
        sb.append("countrySubdivisionMinorCode");
        sb.append('=');
        sb.append(((this.countrySubdivisionMinorCode == null)?"<null>":this.countrySubdivisionMinorCode));
        sb.append(',');
        sb.append("countrySubdivisionMajorCode");
        sb.append('=');
        sb.append(((this.countrySubdivisionMajorCode == null)?"<null>":this.countrySubdivisionMajorCode));
        sb.append(',');
        sb.append("countrySubdivisionMinorName");
        sb.append('=');
        sb.append(((this.countrySubdivisionMinorName == null)?"<null>":this.countrySubdivisionMinorName));
        sb.append(',');
        sb.append("countrySubdivisionMajorName");
        sb.append('=');
        sb.append(((this.countrySubdivisionMajorName == null)?"<null>":this.countrySubdivisionMajorName));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("countryName");
        sb.append('=');
        sb.append(((this.countryName == null)?"<null>":this.countryName));
        sb.append(',');
        sb.append("postalAddressAdditionalData");
        sb.append('=');
        sb.append(((this.postalAddressAdditionalData == null)?"<null>":this.postalAddressAdditionalData));
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
        result = ((result* 31)+((this.townName == null)? 0 :this.townName.hashCode()));
        result = ((result* 31)+((this.countrySubdivisionMinorName == null)? 0 :this.countrySubdivisionMinorName.hashCode()));
        result = ((result* 31)+((this.postalAddressAdditionalData == null)? 0 :this.postalAddressAdditionalData.hashCode()));
        result = ((result* 31)+((this.subDepartment == null)? 0 :this.subDepartment.hashCode()));
        result = ((result* 31)+((this.countrySubdivisionMajorName == null)? 0 :this.countrySubdivisionMajorName.hashCode()));
        result = ((result* 31)+((this.addressCategory == null)? 0 :this.addressCategory.hashCode()));
        result = ((result* 31)+((this.streetName == null)? 0 :this.streetName.hashCode()));
        result = ((result* 31)+((this.countrySubdivisionMajorCode == null)? 0 :this.countrySubdivisionMajorCode.hashCode()));
        result = ((result* 31)+((this.countrySubdivisionMinorCode == null)? 0 :this.countrySubdivisionMinorCode.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.buildingNumber == null)? 0 :this.buildingNumber.hashCode()));
        result = ((result* 31)+((this.postCode == null)? 0 :this.postCode.hashCode()));
        result = ((result* 31)+((this.countryName == null)? 0 :this.countryName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PostalAddressType) == false) {
            return false;
        }
        PostalAddressType rhs = ((PostalAddressType) other);
        return ((((((((((((((((this.townName == rhs.townName)||((this.townName!= null)&&this.townName.equals(rhs.townName)))&&((this.countrySubdivisionMinorName == rhs.countrySubdivisionMinorName)||((this.countrySubdivisionMinorName!= null)&&this.countrySubdivisionMinorName.equals(rhs.countrySubdivisionMinorName))))&&((this.postalAddressAdditionalData == rhs.postalAddressAdditionalData)||((this.postalAddressAdditionalData!= null)&&this.postalAddressAdditionalData.equals(rhs.postalAddressAdditionalData))))&&((this.subDepartment == rhs.subDepartment)||((this.subDepartment!= null)&&this.subDepartment.equals(rhs.subDepartment))))&&((this.countrySubdivisionMajorName == rhs.countrySubdivisionMajorName)||((this.countrySubdivisionMajorName!= null)&&this.countrySubdivisionMajorName.equals(rhs.countrySubdivisionMajorName))))&&((this.addressCategory == rhs.addressCategory)||((this.addressCategory!= null)&&this.addressCategory.equals(rhs.addressCategory))))&&((this.streetName == rhs.streetName)||((this.streetName!= null)&&this.streetName.equals(rhs.streetName))))&&((this.countrySubdivisionMajorCode == rhs.countrySubdivisionMajorCode)||((this.countrySubdivisionMajorCode!= null)&&this.countrySubdivisionMajorCode.equals(rhs.countrySubdivisionMajorCode))))&&((this.countrySubdivisionMinorCode == rhs.countrySubdivisionMinorCode)||((this.countrySubdivisionMinorCode!= null)&&this.countrySubdivisionMinorCode.equals(rhs.countrySubdivisionMinorCode))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.buildingNumber == rhs.buildingNumber)||((this.buildingNumber!= null)&&this.buildingNumber.equals(rhs.buildingNumber))))&&((this.postCode == rhs.postCode)||((this.postCode!= null)&&this.postCode.equals(rhs.postCode))))&&((this.countryName == rhs.countryName)||((this.countryName!= null)&&this.countryName.equals(rhs.countryName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))));
    }

}
