
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
    "amountDescription",
    "amount",
    "currency",
    "exchangeRate",
    "originalCurrency",
    "conversionDateTime"
})
@Generated("jsonschema2pojo")
public class AmountType implements Serializable
{

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("amountDescription")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String amountDescription;
    /**
     * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.")
    private String amount;
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
    private final static long serialVersionUID = -2239222252930493491L;

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("amountDescription")
    public String getAmountDescription() {
        return amountDescription;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("amountDescription")
    public void setAmountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
    }

    public AmountType withAmountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
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

    public AmountType withAmount(String amount) {
        this.amount = amount;
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

    public AmountType withCurrency(String currency) {
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

    public AmountType withExchangeRate(String exchangeRate) {
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

    public AmountType withOriginalCurrency(String originalCurrency) {
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

    public AmountType withConversionDateTime(String conversionDateTime) {
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

    public AmountType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AmountType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amountDescription");
        sb.append('=');
        sb.append(((this.amountDescription == null)?"<null>":this.amountDescription));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.exchangeRate == null)? 0 :this.exchangeRate.hashCode()));
        result = ((result* 31)+((this.amountDescription == null)? 0 :this.amountDescription.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.conversionDateTime == null)? 0 :this.conversionDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.originalCurrency == null)? 0 :this.originalCurrency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmountType) == false) {
            return false;
        }
        AmountType rhs = ((AmountType) other);
        return ((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.exchangeRate == rhs.exchangeRate)||((this.exchangeRate!= null)&&this.exchangeRate.equals(rhs.exchangeRate))))&&((this.amountDescription == rhs.amountDescription)||((this.amountDescription!= null)&&this.amountDescription.equals(rhs.amountDescription))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.conversionDateTime == rhs.conversionDateTime)||((this.conversionDateTime!= null)&&this.conversionDateTime.equals(rhs.conversionDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.originalCurrency == rhs.originalCurrency)||((this.originalCurrency!= null)&&this.originalCurrency.equals(rhs.originalCurrency))));
    }

}
