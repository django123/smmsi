
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
    "contactlessApplicationIndicator",
    "digitalCommerceCheckinEntity",
    "digitalCommerceCheckinMethod",
    "digitalCommerceDomainId",
    "digitalCommerceProgram",
    "extendedEcommerceIndicator",
    "inputCapabilities",
    "merchantSchemeTokenizationIndicator",
    "nameOfTheMessageDisplayedOrPrinted",
    "numberOfTheMessageDisplayedOrPrinted",
    "pinEntryCapability",
    "printCapabilities",
    "transactionReceiptFooter",
    "transactionReceiptHeader"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONPointOfServiceContext implements Serializable
{

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("contactlessApplicationIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean contactlessApplicationIndicator;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 15 characters.
     * 
     */
    @JsonProperty("digitalCommerceCheckinEntity")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 15 characters.")
    private String digitalCommerceCheckinEntity;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("digitalCommerceCheckinMethod")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String digitalCommerceCheckinMethod;
    @JsonProperty("digitalCommerceDomainId")
    private List<DigitalCommerceDomainIdCodeset> digitalCommerceDomainId = new ArrayList<DigitalCommerceDomainIdCodeset>();
    @JsonProperty("digitalCommerceProgram")
    private List<DigitalCommerceProgramCodeset> digitalCommerceProgram = new ArrayList<DigitalCommerceProgramCodeset>();
    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("extendedEcommerceIndicator")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 3 digits.")
    private String extendedEcommerceIndicator;
    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("inputCapabilities")
    @JsonPropertyDescription("4 alphanumeric  and special characters")
    private String inputCapabilities;
    @JsonProperty("merchantSchemeTokenizationIndicator")
    private List<MerchantSchemeTokenizationIndicatorCodeset> merchantSchemeTokenizationIndicator = new ArrayList<MerchantSchemeTokenizationIndicatorCodeset>();
    /**
     * Specifies a numeric character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("nameOfTheMessageDisplayedOrPrinted")
    @JsonPropertyDescription("Specifies a numeric character string with a minlength of 1 and maxlength of 40 characters")
    private String nameOfTheMessageDisplayedOrPrinted;
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("numberOfTheMessageDisplayedOrPrinted")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String numberOfTheMessageDisplayedOrPrinted;
    @JsonProperty("pinEntryCapability")
    private List<PinEntryCapabilityCodeset> pinEntryCapability = new ArrayList<PinEntryCapabilityCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 100 characters.
     * 
     */
    @JsonProperty("printCapabilities")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 100 characters.")
    private String printCapabilities;
    /**
     * Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("transactionReceiptFooter")
    @JsonPropertyDescription("Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters")
    private String transactionReceiptFooter;
    /**
     * Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("transactionReceiptHeader")
    @JsonPropertyDescription("Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters")
    private String transactionReceiptHeader;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7173388589877780537L;

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("contactlessApplicationIndicator")
    public Boolean getContactlessApplicationIndicator() {
        return contactlessApplicationIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("contactlessApplicationIndicator")
    public void setContactlessApplicationIndicator(Boolean contactlessApplicationIndicator) {
        this.contactlessApplicationIndicator = contactlessApplicationIndicator;
    }

    public DICOOBJETJSONPointOfServiceContext withContactlessApplicationIndicator(Boolean contactlessApplicationIndicator) {
        this.contactlessApplicationIndicator = contactlessApplicationIndicator;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 15 characters.
     * 
     */
    @JsonProperty("digitalCommerceCheckinEntity")
    public String getDigitalCommerceCheckinEntity() {
        return digitalCommerceCheckinEntity;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 15 characters.
     * 
     */
    @JsonProperty("digitalCommerceCheckinEntity")
    public void setDigitalCommerceCheckinEntity(String digitalCommerceCheckinEntity) {
        this.digitalCommerceCheckinEntity = digitalCommerceCheckinEntity;
    }

    public DICOOBJETJSONPointOfServiceContext withDigitalCommerceCheckinEntity(String digitalCommerceCheckinEntity) {
        this.digitalCommerceCheckinEntity = digitalCommerceCheckinEntity;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("digitalCommerceCheckinMethod")
    public String getDigitalCommerceCheckinMethod() {
        return digitalCommerceCheckinMethod;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("digitalCommerceCheckinMethod")
    public void setDigitalCommerceCheckinMethod(String digitalCommerceCheckinMethod) {
        this.digitalCommerceCheckinMethod = digitalCommerceCheckinMethod;
    }

    public DICOOBJETJSONPointOfServiceContext withDigitalCommerceCheckinMethod(String digitalCommerceCheckinMethod) {
        this.digitalCommerceCheckinMethod = digitalCommerceCheckinMethod;
        return this;
    }

    @JsonProperty("digitalCommerceDomainId")
    public List<DigitalCommerceDomainIdCodeset> getDigitalCommerceDomainId() {
        return digitalCommerceDomainId;
    }

    @JsonProperty("digitalCommerceDomainId")
    public void setDigitalCommerceDomainId(List<DigitalCommerceDomainIdCodeset> digitalCommerceDomainId) {
        this.digitalCommerceDomainId = digitalCommerceDomainId;
    }

    public DICOOBJETJSONPointOfServiceContext withDigitalCommerceDomainId(List<DigitalCommerceDomainIdCodeset> digitalCommerceDomainId) {
        this.digitalCommerceDomainId = digitalCommerceDomainId;
        return this;
    }

    @JsonProperty("digitalCommerceProgram")
    public List<DigitalCommerceProgramCodeset> getDigitalCommerceProgram() {
        return digitalCommerceProgram;
    }

    @JsonProperty("digitalCommerceProgram")
    public void setDigitalCommerceProgram(List<DigitalCommerceProgramCodeset> digitalCommerceProgram) {
        this.digitalCommerceProgram = digitalCommerceProgram;
    }

    public DICOOBJETJSONPointOfServiceContext withDigitalCommerceProgram(List<DigitalCommerceProgramCodeset> digitalCommerceProgram) {
        this.digitalCommerceProgram = digitalCommerceProgram;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("extendedEcommerceIndicator")
    public String getExtendedEcommerceIndicator() {
        return extendedEcommerceIndicator;
    }

    /**
     * Specifies a numeric string with an exact length of 3 digits.
     * 
     */
    @JsonProperty("extendedEcommerceIndicator")
    public void setExtendedEcommerceIndicator(String extendedEcommerceIndicator) {
        this.extendedEcommerceIndicator = extendedEcommerceIndicator;
    }

    public DICOOBJETJSONPointOfServiceContext withExtendedEcommerceIndicator(String extendedEcommerceIndicator) {
        this.extendedEcommerceIndicator = extendedEcommerceIndicator;
        return this;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("inputCapabilities")
    public String getInputCapabilities() {
        return inputCapabilities;
    }

    /**
     *  4 alphanumeric  and special characters
     * 
     */
    @JsonProperty("inputCapabilities")
    public void setInputCapabilities(String inputCapabilities) {
        this.inputCapabilities = inputCapabilities;
    }

    public DICOOBJETJSONPointOfServiceContext withInputCapabilities(String inputCapabilities) {
        this.inputCapabilities = inputCapabilities;
        return this;
    }

    @JsonProperty("merchantSchemeTokenizationIndicator")
    public List<MerchantSchemeTokenizationIndicatorCodeset> getMerchantSchemeTokenizationIndicator() {
        return merchantSchemeTokenizationIndicator;
    }

    @JsonProperty("merchantSchemeTokenizationIndicator")
    public void setMerchantSchemeTokenizationIndicator(List<MerchantSchemeTokenizationIndicatorCodeset> merchantSchemeTokenizationIndicator) {
        this.merchantSchemeTokenizationIndicator = merchantSchemeTokenizationIndicator;
    }

    public DICOOBJETJSONPointOfServiceContext withMerchantSchemeTokenizationIndicator(List<MerchantSchemeTokenizationIndicatorCodeset> merchantSchemeTokenizationIndicator) {
        this.merchantSchemeTokenizationIndicator = merchantSchemeTokenizationIndicator;
        return this;
    }

    /**
     * Specifies a numeric character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("nameOfTheMessageDisplayedOrPrinted")
    public String getNameOfTheMessageDisplayedOrPrinted() {
        return nameOfTheMessageDisplayedOrPrinted;
    }

    /**
     * Specifies a numeric character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("nameOfTheMessageDisplayedOrPrinted")
    public void setNameOfTheMessageDisplayedOrPrinted(String nameOfTheMessageDisplayedOrPrinted) {
        this.nameOfTheMessageDisplayedOrPrinted = nameOfTheMessageDisplayedOrPrinted;
    }

    public DICOOBJETJSONPointOfServiceContext withNameOfTheMessageDisplayedOrPrinted(String nameOfTheMessageDisplayedOrPrinted) {
        this.nameOfTheMessageDisplayedOrPrinted = nameOfTheMessageDisplayedOrPrinted;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("numberOfTheMessageDisplayedOrPrinted")
    public String getNumberOfTheMessageDisplayedOrPrinted() {
        return numberOfTheMessageDisplayedOrPrinted;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("numberOfTheMessageDisplayedOrPrinted")
    public void setNumberOfTheMessageDisplayedOrPrinted(String numberOfTheMessageDisplayedOrPrinted) {
        this.numberOfTheMessageDisplayedOrPrinted = numberOfTheMessageDisplayedOrPrinted;
    }

    public DICOOBJETJSONPointOfServiceContext withNumberOfTheMessageDisplayedOrPrinted(String numberOfTheMessageDisplayedOrPrinted) {
        this.numberOfTheMessageDisplayedOrPrinted = numberOfTheMessageDisplayedOrPrinted;
        return this;
    }

    @JsonProperty("pinEntryCapability")
    public List<PinEntryCapabilityCodeset> getPinEntryCapability() {
        return pinEntryCapability;
    }

    @JsonProperty("pinEntryCapability")
    public void setPinEntryCapability(List<PinEntryCapabilityCodeset> pinEntryCapability) {
        this.pinEntryCapability = pinEntryCapability;
    }

    public DICOOBJETJSONPointOfServiceContext withPinEntryCapability(List<PinEntryCapabilityCodeset> pinEntryCapability) {
        this.pinEntryCapability = pinEntryCapability;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 100 characters.
     * 
     */
    @JsonProperty("printCapabilities")
    public String getPrintCapabilities() {
        return printCapabilities;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 100 characters.
     * 
     */
    @JsonProperty("printCapabilities")
    public void setPrintCapabilities(String printCapabilities) {
        this.printCapabilities = printCapabilities;
    }

    public DICOOBJETJSONPointOfServiceContext withPrintCapabilities(String printCapabilities) {
        this.printCapabilities = printCapabilities;
        return this;
    }

    /**
     * Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("transactionReceiptFooter")
    public String getTransactionReceiptFooter() {
        return transactionReceiptFooter;
    }

    /**
     * Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("transactionReceiptFooter")
    public void setTransactionReceiptFooter(String transactionReceiptFooter) {
        this.transactionReceiptFooter = transactionReceiptFooter;
    }

    public DICOOBJETJSONPointOfServiceContext withTransactionReceiptFooter(String transactionReceiptFooter) {
        this.transactionReceiptFooter = transactionReceiptFooter;
        return this;
    }

    /**
     * Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("transactionReceiptHeader")
    public String getTransactionReceiptHeader() {
        return transactionReceiptHeader;
    }

    /**
     * Specifies a alphanumeric character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("transactionReceiptHeader")
    public void setTransactionReceiptHeader(String transactionReceiptHeader) {
        this.transactionReceiptHeader = transactionReceiptHeader;
    }

    public DICOOBJETJSONPointOfServiceContext withTransactionReceiptHeader(String transactionReceiptHeader) {
        this.transactionReceiptHeader = transactionReceiptHeader;
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

    public DICOOBJETJSONPointOfServiceContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONPointOfServiceContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactlessApplicationIndicator");
        sb.append('=');
        sb.append(((this.contactlessApplicationIndicator == null)?"<null>":this.contactlessApplicationIndicator));
        sb.append(',');
        sb.append("digitalCommerceCheckinEntity");
        sb.append('=');
        sb.append(((this.digitalCommerceCheckinEntity == null)?"<null>":this.digitalCommerceCheckinEntity));
        sb.append(',');
        sb.append("digitalCommerceCheckinMethod");
        sb.append('=');
        sb.append(((this.digitalCommerceCheckinMethod == null)?"<null>":this.digitalCommerceCheckinMethod));
        sb.append(',');
        sb.append("digitalCommerceDomainId");
        sb.append('=');
        sb.append(((this.digitalCommerceDomainId == null)?"<null>":this.digitalCommerceDomainId));
        sb.append(',');
        sb.append("digitalCommerceProgram");
        sb.append('=');
        sb.append(((this.digitalCommerceProgram == null)?"<null>":this.digitalCommerceProgram));
        sb.append(',');
        sb.append("extendedEcommerceIndicator");
        sb.append('=');
        sb.append(((this.extendedEcommerceIndicator == null)?"<null>":this.extendedEcommerceIndicator));
        sb.append(',');
        sb.append("inputCapabilities");
        sb.append('=');
        sb.append(((this.inputCapabilities == null)?"<null>":this.inputCapabilities));
        sb.append(',');
        sb.append("merchantSchemeTokenizationIndicator");
        sb.append('=');
        sb.append(((this.merchantSchemeTokenizationIndicator == null)?"<null>":this.merchantSchemeTokenizationIndicator));
        sb.append(',');
        sb.append("nameOfTheMessageDisplayedOrPrinted");
        sb.append('=');
        sb.append(((this.nameOfTheMessageDisplayedOrPrinted == null)?"<null>":this.nameOfTheMessageDisplayedOrPrinted));
        sb.append(',');
        sb.append("numberOfTheMessageDisplayedOrPrinted");
        sb.append('=');
        sb.append(((this.numberOfTheMessageDisplayedOrPrinted == null)?"<null>":this.numberOfTheMessageDisplayedOrPrinted));
        sb.append(',');
        sb.append("pinEntryCapability");
        sb.append('=');
        sb.append(((this.pinEntryCapability == null)?"<null>":this.pinEntryCapability));
        sb.append(',');
        sb.append("printCapabilities");
        sb.append('=');
        sb.append(((this.printCapabilities == null)?"<null>":this.printCapabilities));
        sb.append(',');
        sb.append("transactionReceiptFooter");
        sb.append('=');
        sb.append(((this.transactionReceiptFooter == null)?"<null>":this.transactionReceiptFooter));
        sb.append(',');
        sb.append("transactionReceiptHeader");
        sb.append('=');
        sb.append(((this.transactionReceiptHeader == null)?"<null>":this.transactionReceiptHeader));
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
        result = ((result* 31)+((this.digitalCommerceDomainId == null)? 0 :this.digitalCommerceDomainId.hashCode()));
        result = ((result* 31)+((this.digitalCommerceCheckinEntity == null)? 0 :this.digitalCommerceCheckinEntity.hashCode()));
        result = ((result* 31)+((this.numberOfTheMessageDisplayedOrPrinted == null)? 0 :this.numberOfTheMessageDisplayedOrPrinted.hashCode()));
        result = ((result* 31)+((this.transactionReceiptFooter == null)? 0 :this.transactionReceiptFooter.hashCode()));
        result = ((result* 31)+((this.digitalCommerceProgram == null)? 0 :this.digitalCommerceProgram.hashCode()));
        result = ((result* 31)+((this.printCapabilities == null)? 0 :this.printCapabilities.hashCode()));
        result = ((result* 31)+((this.transactionReceiptHeader == null)? 0 :this.transactionReceiptHeader.hashCode()));
        result = ((result* 31)+((this.extendedEcommerceIndicator == null)? 0 :this.extendedEcommerceIndicator.hashCode()));
        result = ((result* 31)+((this.inputCapabilities == null)? 0 :this.inputCapabilities.hashCode()));
        result = ((result* 31)+((this.nameOfTheMessageDisplayedOrPrinted == null)? 0 :this.nameOfTheMessageDisplayedOrPrinted.hashCode()));
        result = ((result* 31)+((this.contactlessApplicationIndicator == null)? 0 :this.contactlessApplicationIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.digitalCommerceCheckinMethod == null)? 0 :this.digitalCommerceCheckinMethod.hashCode()));
        result = ((result* 31)+((this.merchantSchemeTokenizationIndicator == null)? 0 :this.merchantSchemeTokenizationIndicator.hashCode()));
        result = ((result* 31)+((this.pinEntryCapability == null)? 0 :this.pinEntryCapability.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONPointOfServiceContext) == false) {
            return false;
        }
        DICOOBJETJSONPointOfServiceContext rhs = ((DICOOBJETJSONPointOfServiceContext) other);
        return ((((((((((((((((this.digitalCommerceDomainId == rhs.digitalCommerceDomainId)||((this.digitalCommerceDomainId!= null)&&this.digitalCommerceDomainId.equals(rhs.digitalCommerceDomainId)))&&((this.digitalCommerceCheckinEntity == rhs.digitalCommerceCheckinEntity)||((this.digitalCommerceCheckinEntity!= null)&&this.digitalCommerceCheckinEntity.equals(rhs.digitalCommerceCheckinEntity))))&&((this.numberOfTheMessageDisplayedOrPrinted == rhs.numberOfTheMessageDisplayedOrPrinted)||((this.numberOfTheMessageDisplayedOrPrinted!= null)&&this.numberOfTheMessageDisplayedOrPrinted.equals(rhs.numberOfTheMessageDisplayedOrPrinted))))&&((this.transactionReceiptFooter == rhs.transactionReceiptFooter)||((this.transactionReceiptFooter!= null)&&this.transactionReceiptFooter.equals(rhs.transactionReceiptFooter))))&&((this.digitalCommerceProgram == rhs.digitalCommerceProgram)||((this.digitalCommerceProgram!= null)&&this.digitalCommerceProgram.equals(rhs.digitalCommerceProgram))))&&((this.printCapabilities == rhs.printCapabilities)||((this.printCapabilities!= null)&&this.printCapabilities.equals(rhs.printCapabilities))))&&((this.transactionReceiptHeader == rhs.transactionReceiptHeader)||((this.transactionReceiptHeader!= null)&&this.transactionReceiptHeader.equals(rhs.transactionReceiptHeader))))&&((this.extendedEcommerceIndicator == rhs.extendedEcommerceIndicator)||((this.extendedEcommerceIndicator!= null)&&this.extendedEcommerceIndicator.equals(rhs.extendedEcommerceIndicator))))&&((this.inputCapabilities == rhs.inputCapabilities)||((this.inputCapabilities!= null)&&this.inputCapabilities.equals(rhs.inputCapabilities))))&&((this.nameOfTheMessageDisplayedOrPrinted == rhs.nameOfTheMessageDisplayedOrPrinted)||((this.nameOfTheMessageDisplayedOrPrinted!= null)&&this.nameOfTheMessageDisplayedOrPrinted.equals(rhs.nameOfTheMessageDisplayedOrPrinted))))&&((this.contactlessApplicationIndicator == rhs.contactlessApplicationIndicator)||((this.contactlessApplicationIndicator!= null)&&this.contactlessApplicationIndicator.equals(rhs.contactlessApplicationIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.digitalCommerceCheckinMethod == rhs.digitalCommerceCheckinMethod)||((this.digitalCommerceCheckinMethod!= null)&&this.digitalCommerceCheckinMethod.equals(rhs.digitalCommerceCheckinMethod))))&&((this.merchantSchemeTokenizationIndicator == rhs.merchantSchemeTokenizationIndicator)||((this.merchantSchemeTokenizationIndicator!= null)&&this.merchantSchemeTokenizationIndicator.equals(rhs.merchantSchemeTokenizationIndicator))))&&((this.pinEntryCapability == rhs.pinEntryCapability)||((this.pinEntryCapability!= null)&&this.pinEntryCapability.equals(rhs.pinEntryCapability))));
    }

}
