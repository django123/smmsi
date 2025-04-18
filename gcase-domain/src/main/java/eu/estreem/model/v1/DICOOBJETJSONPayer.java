
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
    "financialInstitutionId",
    "internationalBankAccountNumber"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONPayer implements Serializable
{

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.
     * 
     */
    @JsonProperty("accountNumber")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 35 digits.")
    private String accountNumber;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("financialInstitutionId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String financialInstitutionId;
    /**
     * The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard Banking and related financial services International Bank Account Number (IBAN) and replaced by the more recent edition of the standard.
     * 
     */
    @JsonProperty("internationalBankAccountNumber")
    @JsonPropertyDescription("The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard Banking and related financial services International Bank Account Number (IBAN) and replaced by the more recent edition of the standard.")
    private String internationalBankAccountNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6070587283070905440L;

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

    public DICOOBJETJSONPayer withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("financialInstitutionId")
    public String getFinancialInstitutionId() {
        return financialInstitutionId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("financialInstitutionId")
    public void setFinancialInstitutionId(String financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId;
    }

    public DICOOBJETJSONPayer withFinancialInstitutionId(String financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId;
        return this;
    }

    /**
     * The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard Banking and related financial services International Bank Account Number (IBAN) and replaced by the more recent edition of the standard.
     * 
     */
    @JsonProperty("internationalBankAccountNumber")
    public String getInternationalBankAccountNumber() {
        return internationalBankAccountNumber;
    }

    /**
     * The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard Banking and related financial services International Bank Account Number (IBAN) and replaced by the more recent edition of the standard.
     * 
     */
    @JsonProperty("internationalBankAccountNumber")
    public void setInternationalBankAccountNumber(String internationalBankAccountNumber) {
        this.internationalBankAccountNumber = internationalBankAccountNumber;
    }

    public DICOOBJETJSONPayer withInternationalBankAccountNumber(String internationalBankAccountNumber) {
        this.internationalBankAccountNumber = internationalBankAccountNumber;
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

    public DICOOBJETJSONPayer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONPayer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountNumber");
        sb.append('=');
        sb.append(((this.accountNumber == null)?"<null>":this.accountNumber));
        sb.append(',');
        sb.append("financialInstitutionId");
        sb.append('=');
        sb.append(((this.financialInstitutionId == null)?"<null>":this.financialInstitutionId));
        sb.append(',');
        sb.append("internationalBankAccountNumber");
        sb.append('=');
        sb.append(((this.internationalBankAccountNumber == null)?"<null>":this.internationalBankAccountNumber));
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
        result = ((result* 31)+((this.internationalBankAccountNumber == null)? 0 :this.internationalBankAccountNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountNumber == null)? 0 :this.accountNumber.hashCode()));
        result = ((result* 31)+((this.financialInstitutionId == null)? 0 :this.financialInstitutionId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONPayer) == false) {
            return false;
        }
        DICOOBJETJSONPayer rhs = ((DICOOBJETJSONPayer) other);
        return (((((this.internationalBankAccountNumber == rhs.internationalBankAccountNumber)||((this.internationalBankAccountNumber!= null)&&this.internationalBankAccountNumber.equals(rhs.internationalBankAccountNumber)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountNumber == rhs.accountNumber)||((this.accountNumber!= null)&&this.accountNumber.equals(rhs.accountNumber))))&&((this.financialInstitutionId == rhs.financialInstitutionId)||((this.financialInstitutionId!= null)&&this.financialInstitutionId.equals(rhs.financialInstitutionId))));
    }

}
