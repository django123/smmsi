
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
    "accountNumber",
    "primaryAccountNumber"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONPayee implements Serializable
{

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("accountNumber")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.")
    private String accountNumber;
    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("primaryAccountNumber")
    @JsonPropertyDescription("Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.")
    private String primaryAccountNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6163659421584593987L;

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public DICOOBJETJSONPayee withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("primaryAccountNumber")
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("primaryAccountNumber")
    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }

    public DICOOBJETJSONPayee withPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
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

    public DICOOBJETJSONPayee withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONPayee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountNumber");
        sb.append('=');
        sb.append(((this.accountNumber == null)?"<null>":this.accountNumber));
        sb.append(',');
        sb.append("primaryAccountNumber");
        sb.append('=');
        sb.append(((this.primaryAccountNumber == null)?"<null>":this.primaryAccountNumber));
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
        result = ((result* 31)+((this.primaryAccountNumber == null)? 0 :this.primaryAccountNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountNumber == null)? 0 :this.accountNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONPayee) == false) {
            return false;
        }
        DICOOBJETJSONPayee rhs = ((DICOOBJETJSONPayee) other);
        return ((((this.primaryAccountNumber == rhs.primaryAccountNumber)||((this.primaryAccountNumber!= null)&&this.primaryAccountNumber.equals(rhs.primaryAccountNumber)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountNumber == rhs.accountNumber)||((this.accountNumber!= null)&&this.accountNumber.equals(rhs.accountNumber))));
    }

}
