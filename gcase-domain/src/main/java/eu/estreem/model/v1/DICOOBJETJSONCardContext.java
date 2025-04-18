
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
    "actionOnCard",
    "activationCodeForNoShowInvoice",
    "activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction",
    "additionalInvoiceActivationCode",
    "forcingAuthorised",
    "maximumLengthOfPAN",
    "minimumLengthOfPAN",
    "pinEntryTimer",
    "processingModeForNSCardApplicationCurrency",
    "typeOfAuthorisationRequestTrigger"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONCardContext implements Serializable
{

    @JsonProperty("actionOnCard")
    private List<ActivationCardCodeset> actionOnCard = new ArrayList<ActivationCardCodeset>();
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("activationCodeForNoShowInvoice")
    @JsonPropertyDescription("1 alphanumeric character")
    private String activationCodeForNoShowInvoice;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction")
    @JsonPropertyDescription("1 alphanumeric character")
    private String activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("additionalInvoiceActivationCode")
    @JsonPropertyDescription("1 alphanumeric character")
    private String additionalInvoiceActivationCode;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("forcingAuthorised")
    @JsonPropertyDescription("1 alphanumeric character")
    private String forcingAuthorised;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("maximumLengthOfPAN")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits")
    private String maximumLengthOfPAN;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("minimumLengthOfPAN")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits")
    private String minimumLengthOfPAN;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("pinEntryTimer")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String pinEntryTimer;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("processingModeForNSCardApplicationCurrency")
    @JsonPropertyDescription("1 alphanumeric character")
    private String processingModeForNSCardApplicationCurrency;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("typeOfAuthorisationRequestTrigger")
    @JsonPropertyDescription("1 alphanumeric character")
    private String typeOfAuthorisationRequestTrigger;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5362478050231975919L;

    @JsonProperty("actionOnCard")
    public List<ActivationCardCodeset> getActionOnCard() {
        return actionOnCard;
    }

    @JsonProperty("actionOnCard")
    public void setActionOnCard(List<ActivationCardCodeset> actionOnCard) {
        this.actionOnCard = actionOnCard;
    }

    public DICOOBJETJSONCardContext withActionOnCard(List<ActivationCardCodeset> actionOnCard) {
        this.actionOnCard = actionOnCard;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("activationCodeForNoShowInvoice")
    public String getActivationCodeForNoShowInvoice() {
        return activationCodeForNoShowInvoice;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("activationCodeForNoShowInvoice")
    public void setActivationCodeForNoShowInvoice(String activationCodeForNoShowInvoice) {
        this.activationCodeForNoShowInvoice = activationCodeForNoShowInvoice;
    }

    public DICOOBJETJSONCardContext withActivationCodeForNoShowInvoice(String activationCodeForNoShowInvoice) {
        this.activationCodeForNoShowInvoice = activationCodeForNoShowInvoice;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction")
    public String getActivCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction() {
        return activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction")
    public void setActivCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction(String activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction) {
        this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction = activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction;
    }

    public DICOOBJETJSONCardContext withActivCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction(String activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction) {
        this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction = activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("additionalInvoiceActivationCode")
    public String getAdditionalInvoiceActivationCode() {
        return additionalInvoiceActivationCode;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("additionalInvoiceActivationCode")
    public void setAdditionalInvoiceActivationCode(String additionalInvoiceActivationCode) {
        this.additionalInvoiceActivationCode = additionalInvoiceActivationCode;
    }

    public DICOOBJETJSONCardContext withAdditionalInvoiceActivationCode(String additionalInvoiceActivationCode) {
        this.additionalInvoiceActivationCode = additionalInvoiceActivationCode;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("forcingAuthorised")
    public String getForcingAuthorised() {
        return forcingAuthorised;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("forcingAuthorised")
    public void setForcingAuthorised(String forcingAuthorised) {
        this.forcingAuthorised = forcingAuthorised;
    }

    public DICOOBJETJSONCardContext withForcingAuthorised(String forcingAuthorised) {
        this.forcingAuthorised = forcingAuthorised;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("maximumLengthOfPAN")
    public String getMaximumLengthOfPAN() {
        return maximumLengthOfPAN;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("maximumLengthOfPAN")
    public void setMaximumLengthOfPAN(String maximumLengthOfPAN) {
        this.maximumLengthOfPAN = maximumLengthOfPAN;
    }

    public DICOOBJETJSONCardContext withMaximumLengthOfPAN(String maximumLengthOfPAN) {
        this.maximumLengthOfPAN = maximumLengthOfPAN;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("minimumLengthOfPAN")
    public String getMinimumLengthOfPAN() {
        return minimumLengthOfPAN;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("minimumLengthOfPAN")
    public void setMinimumLengthOfPAN(String minimumLengthOfPAN) {
        this.minimumLengthOfPAN = minimumLengthOfPAN;
    }

    public DICOOBJETJSONCardContext withMinimumLengthOfPAN(String minimumLengthOfPAN) {
        this.minimumLengthOfPAN = minimumLengthOfPAN;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("pinEntryTimer")
    public String getPinEntryTimer() {
        return pinEntryTimer;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("pinEntryTimer")
    public void setPinEntryTimer(String pinEntryTimer) {
        this.pinEntryTimer = pinEntryTimer;
    }

    public DICOOBJETJSONCardContext withPinEntryTimer(String pinEntryTimer) {
        this.pinEntryTimer = pinEntryTimer;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("processingModeForNSCardApplicationCurrency")
    public String getProcessingModeForNSCardApplicationCurrency() {
        return processingModeForNSCardApplicationCurrency;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("processingModeForNSCardApplicationCurrency")
    public void setProcessingModeForNSCardApplicationCurrency(String processingModeForNSCardApplicationCurrency) {
        this.processingModeForNSCardApplicationCurrency = processingModeForNSCardApplicationCurrency;
    }

    public DICOOBJETJSONCardContext withProcessingModeForNSCardApplicationCurrency(String processingModeForNSCardApplicationCurrency) {
        this.processingModeForNSCardApplicationCurrency = processingModeForNSCardApplicationCurrency;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("typeOfAuthorisationRequestTrigger")
    public String getTypeOfAuthorisationRequestTrigger() {
        return typeOfAuthorisationRequestTrigger;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("typeOfAuthorisationRequestTrigger")
    public void setTypeOfAuthorisationRequestTrigger(String typeOfAuthorisationRequestTrigger) {
        this.typeOfAuthorisationRequestTrigger = typeOfAuthorisationRequestTrigger;
    }

    public DICOOBJETJSONCardContext withTypeOfAuthorisationRequestTrigger(String typeOfAuthorisationRequestTrigger) {
        this.typeOfAuthorisationRequestTrigger = typeOfAuthorisationRequestTrigger;
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

    public DICOOBJETJSONCardContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONCardContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actionOnCard");
        sb.append('=');
        sb.append(((this.actionOnCard == null)?"<null>":this.actionOnCard));
        sb.append(',');
        sb.append("activationCodeForNoShowInvoice");
        sb.append('=');
        sb.append(((this.activationCodeForNoShowInvoice == null)?"<null>":this.activationCodeForNoShowInvoice));
        sb.append(',');
        sb.append("activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction");
        sb.append('=');
        sb.append(((this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction == null)?"<null>":this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction));
        sb.append(',');
        sb.append("additionalInvoiceActivationCode");
        sb.append('=');
        sb.append(((this.additionalInvoiceActivationCode == null)?"<null>":this.additionalInvoiceActivationCode));
        sb.append(',');
        sb.append("forcingAuthorised");
        sb.append('=');
        sb.append(((this.forcingAuthorised == null)?"<null>":this.forcingAuthorised));
        sb.append(',');
        sb.append("maximumLengthOfPAN");
        sb.append('=');
        sb.append(((this.maximumLengthOfPAN == null)?"<null>":this.maximumLengthOfPAN));
        sb.append(',');
        sb.append("minimumLengthOfPAN");
        sb.append('=');
        sb.append(((this.minimumLengthOfPAN == null)?"<null>":this.minimumLengthOfPAN));
        sb.append(',');
        sb.append("pinEntryTimer");
        sb.append('=');
        sb.append(((this.pinEntryTimer == null)?"<null>":this.pinEntryTimer));
        sb.append(',');
        sb.append("processingModeForNSCardApplicationCurrency");
        sb.append('=');
        sb.append(((this.processingModeForNSCardApplicationCurrency == null)?"<null>":this.processingModeForNSCardApplicationCurrency));
        sb.append(',');
        sb.append("typeOfAuthorisationRequestTrigger");
        sb.append('=');
        sb.append(((this.typeOfAuthorisationRequestTrigger == null)?"<null>":this.typeOfAuthorisationRequestTrigger));
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
        result = ((result* 31)+((this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction == null)? 0 :this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction.hashCode()));
        result = ((result* 31)+((this.maximumLengthOfPAN == null)? 0 :this.maximumLengthOfPAN.hashCode()));
        result = ((result* 31)+((this.forcingAuthorised == null)? 0 :this.forcingAuthorised.hashCode()));
        result = ((result* 31)+((this.actionOnCard == null)? 0 :this.actionOnCard.hashCode()));
        result = ((result* 31)+((this.processingModeForNSCardApplicationCurrency == null)? 0 :this.processingModeForNSCardApplicationCurrency.hashCode()));
        result = ((result* 31)+((this.activationCodeForNoShowInvoice == null)? 0 :this.activationCodeForNoShowInvoice.hashCode()));
        result = ((result* 31)+((this.additionalInvoiceActivationCode == null)? 0 :this.additionalInvoiceActivationCode.hashCode()));
        result = ((result* 31)+((this.pinEntryTimer == null)? 0 :this.pinEntryTimer.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minimumLengthOfPAN == null)? 0 :this.minimumLengthOfPAN.hashCode()));
        result = ((result* 31)+((this.typeOfAuthorisationRequestTrigger == null)? 0 :this.typeOfAuthorisationRequestTrigger.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONCardContext) == false) {
            return false;
        }
        DICOOBJETJSONCardContext rhs = ((DICOOBJETJSONCardContext) other);
        return ((((((((((((this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction == rhs.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction)||((this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction!= null)&&this.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction.equals(rhs.activCodePLBSInvoiceRemoteModeOrPreAuthProlongTransaction)))&&((this.maximumLengthOfPAN == rhs.maximumLengthOfPAN)||((this.maximumLengthOfPAN!= null)&&this.maximumLengthOfPAN.equals(rhs.maximumLengthOfPAN))))&&((this.forcingAuthorised == rhs.forcingAuthorised)||((this.forcingAuthorised!= null)&&this.forcingAuthorised.equals(rhs.forcingAuthorised))))&&((this.actionOnCard == rhs.actionOnCard)||((this.actionOnCard!= null)&&this.actionOnCard.equals(rhs.actionOnCard))))&&((this.processingModeForNSCardApplicationCurrency == rhs.processingModeForNSCardApplicationCurrency)||((this.processingModeForNSCardApplicationCurrency!= null)&&this.processingModeForNSCardApplicationCurrency.equals(rhs.processingModeForNSCardApplicationCurrency))))&&((this.activationCodeForNoShowInvoice == rhs.activationCodeForNoShowInvoice)||((this.activationCodeForNoShowInvoice!= null)&&this.activationCodeForNoShowInvoice.equals(rhs.activationCodeForNoShowInvoice))))&&((this.additionalInvoiceActivationCode == rhs.additionalInvoiceActivationCode)||((this.additionalInvoiceActivationCode!= null)&&this.additionalInvoiceActivationCode.equals(rhs.additionalInvoiceActivationCode))))&&((this.pinEntryTimer == rhs.pinEntryTimer)||((this.pinEntryTimer!= null)&&this.pinEntryTimer.equals(rhs.pinEntryTimer))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minimumLengthOfPAN == rhs.minimumLengthOfPAN)||((this.minimumLengthOfPAN!= null)&&this.minimumLengthOfPAN.equals(rhs.minimumLengthOfPAN))))&&((this.typeOfAuthorisationRequestTrigger == rhs.typeOfAuthorisationRequestTrigger)||((this.typeOfAuthorisationRequestTrigger!= null)&&this.typeOfAuthorisationRequestTrigger.equals(rhs.typeOfAuthorisationRequestTrigger))));
    }

}
