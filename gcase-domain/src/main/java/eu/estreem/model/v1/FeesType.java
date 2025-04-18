
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
    "feesNature",
    "feesDescription",
    "feesOtherNature",
    "feesProgram",
    "feesDescriptor",
    "amount",
    "debitCredit",
    "currency",
    "exchangeRate",
    "originalCurrency",
    "conversionDateTime"
})
@Generated("jsonschema2pojo")
public class FeesType implements Serializable
{

    @JsonProperty("feesNature")
    private List<FeesNatureCodeset> feesNature = new ArrayList<FeesNatureCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesDescription")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String feesDescription;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesOtherNature")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String feesOtherNature;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesProgram")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String feesProgram;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesDescriptor")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String feesDescriptor;
    /**
     * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.")
    private String amount;
    @JsonProperty("debitCredit")
    private List<DebitCreditCodeset> debitCredit = new ArrayList<DebitCreditCodeset>();
    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("Code to identify the Currency (ISO 4217)")
    private String currency;
    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("exchangeRate")
    @JsonPropertyDescription("Rate expressed as a decimal")
    private String exchangeRate;
    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("originalCurrency")
    @JsonPropertyDescription("Code to identify the Currency (ISO 4217)")
    private String originalCurrency;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("conversionDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String conversionDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3641106097267888653L;

    @JsonProperty("feesNature")
    public List<FeesNatureCodeset> getFeesNature() {
        return feesNature;
    }

    @JsonProperty("feesNature")
    public void setFeesNature(List<FeesNatureCodeset> feesNature) {
        this.feesNature = feesNature;
    }

    public FeesType withFeesNature(List<FeesNatureCodeset> feesNature) {
        this.feesNature = feesNature;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesDescription")
    public String getFeesDescription() {
        return feesDescription;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesDescription")
    public void setFeesDescription(String feesDescription) {
        this.feesDescription = feesDescription;
    }

    public FeesType withFeesDescription(String feesDescription) {
        this.feesDescription = feesDescription;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesOtherNature")
    public String getFeesOtherNature() {
        return feesOtherNature;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesOtherNature")
    public void setFeesOtherNature(String feesOtherNature) {
        this.feesOtherNature = feesOtherNature;
    }

    public FeesType withFeesOtherNature(String feesOtherNature) {
        this.feesOtherNature = feesOtherNature;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesProgram")
    public String getFeesProgram() {
        return feesProgram;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesProgram")
    public void setFeesProgram(String feesProgram) {
        this.feesProgram = feesProgram;
    }

    public FeesType withFeesProgram(String feesProgram) {
        this.feesProgram = feesProgram;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesDescriptor")
    public String getFeesDescriptor() {
        return feesDescriptor;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("feesDescriptor")
    public void setFeesDescriptor(String feesDescriptor) {
        this.feesDescriptor = feesDescriptor;
    }

    public FeesType withFeesDescriptor(String feesDescriptor) {
        this.feesDescriptor = feesDescriptor;
        return this;
    }

    /**
     * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.
     * 
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public FeesType withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("debitCredit")
    public List<DebitCreditCodeset> getDebitCredit() {
        return debitCredit;
    }

    @JsonProperty("debitCredit")
    public void setDebitCredit(List<DebitCreditCodeset> debitCredit) {
        this.debitCredit = debitCredit;
    }

    public FeesType withDebitCredit(List<DebitCreditCodeset> debitCredit) {
        this.debitCredit = debitCredit;
        return this;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public FeesType withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("exchangeRate")
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("exchangeRate")
    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public FeesType withExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("originalCurrency")
    public String getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("originalCurrency")
    public void setOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
    }

    public FeesType withOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("conversionDateTime")
    public String getConversionDateTime() {
        return conversionDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("conversionDateTime")
    public void setConversionDateTime(String conversionDateTime) {
        this.conversionDateTime = conversionDateTime;
    }

    public FeesType withConversionDateTime(String conversionDateTime) {
        this.conversionDateTime = conversionDateTime;
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

    public FeesType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeesType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("feesNature");
        sb.append('=');
        sb.append(((this.feesNature == null)?"<null>":this.feesNature));
        sb.append(',');
        sb.append("feesDescription");
        sb.append('=');
        sb.append(((this.feesDescription == null)?"<null>":this.feesDescription));
        sb.append(',');
        sb.append("feesOtherNature");
        sb.append('=');
        sb.append(((this.feesOtherNature == null)?"<null>":this.feesOtherNature));
        sb.append(',');
        sb.append("feesProgram");
        sb.append('=');
        sb.append(((this.feesProgram == null)?"<null>":this.feesProgram));
        sb.append(',');
        sb.append("feesDescriptor");
        sb.append('=');
        sb.append(((this.feesDescriptor == null)?"<null>":this.feesDescriptor));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("debitCredit");
        sb.append('=');
        sb.append(((this.debitCredit == null)?"<null>":this.debitCredit));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("exchangeRate");
        sb.append('=');
        sb.append(((this.exchangeRate == null)?"<null>":this.exchangeRate));
        sb.append(',');
        sb.append("originalCurrency");
        sb.append('=');
        sb.append(((this.originalCurrency == null)?"<null>":this.originalCurrency));
        sb.append(',');
        sb.append("conversionDateTime");
        sb.append('=');
        sb.append(((this.conversionDateTime == null)?"<null>":this.conversionDateTime));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.feesDescription == null)? 0 :this.feesDescription.hashCode()));
        result = ((result* 31)+((this.feesDescriptor == null)? 0 :this.feesDescriptor.hashCode()));
        result = ((result* 31)+((this.feesProgram == null)? 0 :this.feesProgram.hashCode()));
        result = ((result* 31)+((this.exchangeRate == null)? 0 :this.exchangeRate.hashCode()));
        result = ((result* 31)+((this.feesNature == null)? 0 :this.feesNature.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.conversionDateTime == null)? 0 :this.conversionDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.originalCurrency == null)? 0 :this.originalCurrency.hashCode()));
        result = ((result* 31)+((this.feesOtherNature == null)? 0 :this.feesOtherNature.hashCode()));
        result = ((result* 31)+((this.debitCredit == null)? 0 :this.debitCredit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeesType) == false) {
            return false;
        }
        FeesType rhs = ((FeesType) other);
        return (((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.feesDescription == rhs.feesDescription)||((this.feesDescription!= null)&&this.feesDescription.equals(rhs.feesDescription))))&&((this.feesDescriptor == rhs.feesDescriptor)||((this.feesDescriptor!= null)&&this.feesDescriptor.equals(rhs.feesDescriptor))))&&((this.feesProgram == rhs.feesProgram)||((this.feesProgram!= null)&&this.feesProgram.equals(rhs.feesProgram))))&&((this.exchangeRate == rhs.exchangeRate)||((this.exchangeRate!= null)&&this.exchangeRate.equals(rhs.exchangeRate))))&&((this.feesNature == rhs.feesNature)||((this.feesNature!= null)&&this.feesNature.equals(rhs.feesNature))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.conversionDateTime == rhs.conversionDateTime)||((this.conversionDateTime!= null)&&this.conversionDateTime.equals(rhs.conversionDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.originalCurrency == rhs.originalCurrency)||((this.originalCurrency!= null)&&this.originalCurrency.equals(rhs.originalCurrency))))&&((this.feesOtherNature == rhs.feesOtherNature)||((this.feesOtherNature!= null)&&this.feesOtherNature.equals(rhs.feesOtherNature))))&&((this.debitCredit == rhs.debitCredit)||((this.debitCredit!= null)&&this.debitCredit.equals(rhs.debitCredit))));
    }

}
