
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
    "duplicatedTransactionControlIndicator",
    "fraudReportingIndicator",
    "governmentControlCountryCode",
    "governmentControlIndicator",
    "maximumAutorizedCredit",
    "maximumAutorizedDebit",
    "noShowIndicator",
    "paymentFacilitatorIndicator",
    "paymentProtocolCategory",
    "paymentProtocolVersion",
    "transactionNumericStatementIndicator",
    "transactionPaperStatementIndicator"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONMerchantParameters implements Serializable
{

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("duplicatedTransactionControlIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean duplicatedTransactionControlIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("fraudReportingIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean fraudReportingIndicator;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("governmentControlCountryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String governmentControlCountryCode;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("governmentControlIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean governmentControlIndicator;
    @JsonProperty("maximumAutorizedCredit")
    private AmountType maximumAutorizedCredit;
    @JsonProperty("maximumAutorizedDebit")
    private AmountType maximumAutorizedDebit;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("noShowIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean noShowIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("paymentFacilitatorIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean paymentFacilitatorIndicator;
    @JsonProperty("paymentProtocolCategory")
    private List<PaymentProtocolCategoryCodeset> paymentProtocolCategory = new ArrayList<PaymentProtocolCategoryCodeset>();
    @JsonProperty("paymentProtocolVersion")
    private List<PaymentProtocolVersionCodeset> paymentProtocolVersion = new ArrayList<PaymentProtocolVersionCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("transactionNumericStatementIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean transactionNumericStatementIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("transactionPaperStatementIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean transactionPaperStatementIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5262326331660225372L;

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("duplicatedTransactionControlIndicator")
    public Boolean getDuplicatedTransactionControlIndicator() {
        return duplicatedTransactionControlIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("duplicatedTransactionControlIndicator")
    public void setDuplicatedTransactionControlIndicator(Boolean duplicatedTransactionControlIndicator) {
        this.duplicatedTransactionControlIndicator = duplicatedTransactionControlIndicator;
    }

    public DICOOBJETJSONMerchantParameters withDuplicatedTransactionControlIndicator(Boolean duplicatedTransactionControlIndicator) {
        this.duplicatedTransactionControlIndicator = duplicatedTransactionControlIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("fraudReportingIndicator")
    public Boolean getFraudReportingIndicator() {
        return fraudReportingIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("fraudReportingIndicator")
    public void setFraudReportingIndicator(Boolean fraudReportingIndicator) {
        this.fraudReportingIndicator = fraudReportingIndicator;
    }

    public DICOOBJETJSONMerchantParameters withFraudReportingIndicator(Boolean fraudReportingIndicator) {
        this.fraudReportingIndicator = fraudReportingIndicator;
        return this;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("governmentControlCountryCode")
    public String getGovernmentControlCountryCode() {
        return governmentControlCountryCode;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("governmentControlCountryCode")
    public void setGovernmentControlCountryCode(String governmentControlCountryCode) {
        this.governmentControlCountryCode = governmentControlCountryCode;
    }

    public DICOOBJETJSONMerchantParameters withGovernmentControlCountryCode(String governmentControlCountryCode) {
        this.governmentControlCountryCode = governmentControlCountryCode;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("governmentControlIndicator")
    public Boolean getGovernmentControlIndicator() {
        return governmentControlIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("governmentControlIndicator")
    public void setGovernmentControlIndicator(Boolean governmentControlIndicator) {
        this.governmentControlIndicator = governmentControlIndicator;
    }

    public DICOOBJETJSONMerchantParameters withGovernmentControlIndicator(Boolean governmentControlIndicator) {
        this.governmentControlIndicator = governmentControlIndicator;
        return this;
    }

    @JsonProperty("maximumAutorizedCredit")
    public AmountType getMaximumAutorizedCredit() {
        return maximumAutorizedCredit;
    }

    @JsonProperty("maximumAutorizedCredit")
    public void setMaximumAutorizedCredit(AmountType maximumAutorizedCredit) {
        this.maximumAutorizedCredit = maximumAutorizedCredit;
    }

    public DICOOBJETJSONMerchantParameters withMaximumAutorizedCredit(AmountType maximumAutorizedCredit) {
        this.maximumAutorizedCredit = maximumAutorizedCredit;
        return this;
    }

    @JsonProperty("maximumAutorizedDebit")
    public AmountType getMaximumAutorizedDebit() {
        return maximumAutorizedDebit;
    }

    @JsonProperty("maximumAutorizedDebit")
    public void setMaximumAutorizedDebit(AmountType maximumAutorizedDebit) {
        this.maximumAutorizedDebit = maximumAutorizedDebit;
    }

    public DICOOBJETJSONMerchantParameters withMaximumAutorizedDebit(AmountType maximumAutorizedDebit) {
        this.maximumAutorizedDebit = maximumAutorizedDebit;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("noShowIndicator")
    public Boolean getNoShowIndicator() {
        return noShowIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("noShowIndicator")
    public void setNoShowIndicator(Boolean noShowIndicator) {
        this.noShowIndicator = noShowIndicator;
    }

    public DICOOBJETJSONMerchantParameters withNoShowIndicator(Boolean noShowIndicator) {
        this.noShowIndicator = noShowIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("paymentFacilitatorIndicator")
    public Boolean getPaymentFacilitatorIndicator() {
        return paymentFacilitatorIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("paymentFacilitatorIndicator")
    public void setPaymentFacilitatorIndicator(Boolean paymentFacilitatorIndicator) {
        this.paymentFacilitatorIndicator = paymentFacilitatorIndicator;
    }

    public DICOOBJETJSONMerchantParameters withPaymentFacilitatorIndicator(Boolean paymentFacilitatorIndicator) {
        this.paymentFacilitatorIndicator = paymentFacilitatorIndicator;
        return this;
    }

    @JsonProperty("paymentProtocolCategory")
    public List<PaymentProtocolCategoryCodeset> getPaymentProtocolCategory() {
        return paymentProtocolCategory;
    }

    @JsonProperty("paymentProtocolCategory")
    public void setPaymentProtocolCategory(List<PaymentProtocolCategoryCodeset> paymentProtocolCategory) {
        this.paymentProtocolCategory = paymentProtocolCategory;
    }

    public DICOOBJETJSONMerchantParameters withPaymentProtocolCategory(List<PaymentProtocolCategoryCodeset> paymentProtocolCategory) {
        this.paymentProtocolCategory = paymentProtocolCategory;
        return this;
    }

    @JsonProperty("paymentProtocolVersion")
    public List<PaymentProtocolVersionCodeset> getPaymentProtocolVersion() {
        return paymentProtocolVersion;
    }

    @JsonProperty("paymentProtocolVersion")
    public void setPaymentProtocolVersion(List<PaymentProtocolVersionCodeset> paymentProtocolVersion) {
        this.paymentProtocolVersion = paymentProtocolVersion;
    }

    public DICOOBJETJSONMerchantParameters withPaymentProtocolVersion(List<PaymentProtocolVersionCodeset> paymentProtocolVersion) {
        this.paymentProtocolVersion = paymentProtocolVersion;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("transactionNumericStatementIndicator")
    public Boolean getTransactionNumericStatementIndicator() {
        return transactionNumericStatementIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("transactionNumericStatementIndicator")
    public void setTransactionNumericStatementIndicator(Boolean transactionNumericStatementIndicator) {
        this.transactionNumericStatementIndicator = transactionNumericStatementIndicator;
    }

    public DICOOBJETJSONMerchantParameters withTransactionNumericStatementIndicator(Boolean transactionNumericStatementIndicator) {
        this.transactionNumericStatementIndicator = transactionNumericStatementIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("transactionPaperStatementIndicator")
    public Boolean getTransactionPaperStatementIndicator() {
        return transactionPaperStatementIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("transactionPaperStatementIndicator")
    public void setTransactionPaperStatementIndicator(Boolean transactionPaperStatementIndicator) {
        this.transactionPaperStatementIndicator = transactionPaperStatementIndicator;
    }

    public DICOOBJETJSONMerchantParameters withTransactionPaperStatementIndicator(Boolean transactionPaperStatementIndicator) {
        this.transactionPaperStatementIndicator = transactionPaperStatementIndicator;
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

    public DICOOBJETJSONMerchantParameters withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONMerchantParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("duplicatedTransactionControlIndicator");
        sb.append('=');
        sb.append(((this.duplicatedTransactionControlIndicator == null)?"<null>":this.duplicatedTransactionControlIndicator));
        sb.append(',');
        sb.append("fraudReportingIndicator");
        sb.append('=');
        sb.append(((this.fraudReportingIndicator == null)?"<null>":this.fraudReportingIndicator));
        sb.append(',');
        sb.append("governmentControlCountryCode");
        sb.append('=');
        sb.append(((this.governmentControlCountryCode == null)?"<null>":this.governmentControlCountryCode));
        sb.append(',');
        sb.append("governmentControlIndicator");
        sb.append('=');
        sb.append(((this.governmentControlIndicator == null)?"<null>":this.governmentControlIndicator));
        sb.append(',');
        sb.append("maximumAutorizedCredit");
        sb.append('=');
        sb.append(((this.maximumAutorizedCredit == null)?"<null>":this.maximumAutorizedCredit));
        sb.append(',');
        sb.append("maximumAutorizedDebit");
        sb.append('=');
        sb.append(((this.maximumAutorizedDebit == null)?"<null>":this.maximumAutorizedDebit));
        sb.append(',');
        sb.append("noShowIndicator");
        sb.append('=');
        sb.append(((this.noShowIndicator == null)?"<null>":this.noShowIndicator));
        sb.append(',');
        sb.append("paymentFacilitatorIndicator");
        sb.append('=');
        sb.append(((this.paymentFacilitatorIndicator == null)?"<null>":this.paymentFacilitatorIndicator));
        sb.append(',');
        sb.append("paymentProtocolCategory");
        sb.append('=');
        sb.append(((this.paymentProtocolCategory == null)?"<null>":this.paymentProtocolCategory));
        sb.append(',');
        sb.append("paymentProtocolVersion");
        sb.append('=');
        sb.append(((this.paymentProtocolVersion == null)?"<null>":this.paymentProtocolVersion));
        sb.append(',');
        sb.append("transactionNumericStatementIndicator");
        sb.append('=');
        sb.append(((this.transactionNumericStatementIndicator == null)?"<null>":this.transactionNumericStatementIndicator));
        sb.append(',');
        sb.append("transactionPaperStatementIndicator");
        sb.append('=');
        sb.append(((this.transactionPaperStatementIndicator == null)?"<null>":this.transactionPaperStatementIndicator));
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
        result = ((result* 31)+((this.governmentControlCountryCode == null)? 0 :this.governmentControlCountryCode.hashCode()));
        result = ((result* 31)+((this.paymentProtocolVersion == null)? 0 :this.paymentProtocolVersion.hashCode()));
        result = ((result* 31)+((this.duplicatedTransactionControlIndicator == null)? 0 :this.duplicatedTransactionControlIndicator.hashCode()));
        result = ((result* 31)+((this.paymentProtocolCategory == null)? 0 :this.paymentProtocolCategory.hashCode()));
        result = ((result* 31)+((this.transactionPaperStatementIndicator == null)? 0 :this.transactionPaperStatementIndicator.hashCode()));
        result = ((result* 31)+((this.maximumAutorizedCredit == null)? 0 :this.maximumAutorizedCredit.hashCode()));
        result = ((result* 31)+((this.maximumAutorizedDebit == null)? 0 :this.maximumAutorizedDebit.hashCode()));
        result = ((result* 31)+((this.fraudReportingIndicator == null)? 0 :this.fraudReportingIndicator.hashCode()));
        result = ((result* 31)+((this.transactionNumericStatementIndicator == null)? 0 :this.transactionNumericStatementIndicator.hashCode()));
        result = ((result* 31)+((this.noShowIndicator == null)? 0 :this.noShowIndicator.hashCode()));
        result = ((result* 31)+((this.governmentControlIndicator == null)? 0 :this.governmentControlIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentFacilitatorIndicator == null)? 0 :this.paymentFacilitatorIndicator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONMerchantParameters) == false) {
            return false;
        }
        DICOOBJETJSONMerchantParameters rhs = ((DICOOBJETJSONMerchantParameters) other);
        return ((((((((((((((this.governmentControlCountryCode == rhs.governmentControlCountryCode)||((this.governmentControlCountryCode!= null)&&this.governmentControlCountryCode.equals(rhs.governmentControlCountryCode)))&&((this.paymentProtocolVersion == rhs.paymentProtocolVersion)||((this.paymentProtocolVersion!= null)&&this.paymentProtocolVersion.equals(rhs.paymentProtocolVersion))))&&((this.duplicatedTransactionControlIndicator == rhs.duplicatedTransactionControlIndicator)||((this.duplicatedTransactionControlIndicator!= null)&&this.duplicatedTransactionControlIndicator.equals(rhs.duplicatedTransactionControlIndicator))))&&((this.paymentProtocolCategory == rhs.paymentProtocolCategory)||((this.paymentProtocolCategory!= null)&&this.paymentProtocolCategory.equals(rhs.paymentProtocolCategory))))&&((this.transactionPaperStatementIndicator == rhs.transactionPaperStatementIndicator)||((this.transactionPaperStatementIndicator!= null)&&this.transactionPaperStatementIndicator.equals(rhs.transactionPaperStatementIndicator))))&&((this.maximumAutorizedCredit == rhs.maximumAutorizedCredit)||((this.maximumAutorizedCredit!= null)&&this.maximumAutorizedCredit.equals(rhs.maximumAutorizedCredit))))&&((this.maximumAutorizedDebit == rhs.maximumAutorizedDebit)||((this.maximumAutorizedDebit!= null)&&this.maximumAutorizedDebit.equals(rhs.maximumAutorizedDebit))))&&((this.fraudReportingIndicator == rhs.fraudReportingIndicator)||((this.fraudReportingIndicator!= null)&&this.fraudReportingIndicator.equals(rhs.fraudReportingIndicator))))&&((this.transactionNumericStatementIndicator == rhs.transactionNumericStatementIndicator)||((this.transactionNumericStatementIndicator!= null)&&this.transactionNumericStatementIndicator.equals(rhs.transactionNumericStatementIndicator))))&&((this.noShowIndicator == rhs.noShowIndicator)||((this.noShowIndicator!= null)&&this.noShowIndicator.equals(rhs.noShowIndicator))))&&((this.governmentControlIndicator == rhs.governmentControlIndicator)||((this.governmentControlIndicator!= null)&&this.governmentControlIndicator.equals(rhs.governmentControlIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentFacilitatorIndicator == rhs.paymentFacilitatorIndicator)||((this.paymentFacilitatorIndicator!= null)&&this.paymentFacilitatorIndicator.equals(rhs.paymentFacilitatorIndicator))));
    }

}
