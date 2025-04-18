
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
    "additionnalData",
    "auditTrailFolderEligibilityIndicator",
    "creationDateTime",
    "decisionDateTime",
    "disputeCondition",
    "disputeDataId",
    "disputeInternalIdentification",
    "disputeQualification",
    "reasonStatusCode",
    "reclamationIndicator",
    "refundDecisionCode",
    "statusChangeReason",
    "statusCode",
    "statusLabel",
    "statusUpdateDateTime",
    "totalAmount ",
    "transactionsCount",
    "updateDateTime"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONDisputeData implements Serializable
{

    @JsonProperty("additionnalData")
    private AdditionalDataType additionnalData;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("auditTrailFolderEligibilityIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean auditTrailFolderEligibilityIndicator;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("creationDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String creationDateTime;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("decisionDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String decisionDateTime;
    @JsonProperty("disputeCondition")
    private List<DisputeConditionCodeset> disputeCondition = new ArrayList<DisputeConditionCodeset>();
    /**
     *  16 alphanumeric characters
     * 
     */
    @JsonProperty("disputeDataId")
    @JsonPropertyDescription("16 alphanumeric characters")
    private String disputeDataId;
    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("disputeInternalIdentification")
    @JsonPropertyDescription("Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.")
    private String disputeInternalIdentification;
    @JsonProperty("disputeQualification")
    private List<DisputeQualificationCodeset> disputeQualification = new ArrayList<DisputeQualificationCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("reasonStatusCode")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String reasonStatusCode;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("reclamationIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean reclamationIndicator;
    @JsonProperty("refundDecisionCode")
    private List<RefundDecisionCodeset> refundDecisionCode = new ArrayList<RefundDecisionCodeset>();
    @JsonProperty("statusChangeReason")
    private List<StatusChangeReasonCodeset> statusChangeReason = new ArrayList<StatusChangeReasonCodeset>();
    @JsonProperty("statusCode")
    private List<StatusCodeCodeset> statusCode = new ArrayList<StatusCodeCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("statusLabel")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String statusLabel;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("statusUpdateDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String statusUpdateDateTime;
    @JsonProperty("totalAmount ")
    private AmountType totalAmount;
    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("transactionsCount")
    @JsonPropertyDescription("Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.")
    private String transactionsCount;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("updateDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String updateDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 979314694805053238L;

    @JsonProperty("additionnalData")
    public AdditionalDataType getAdditionnalData() {
        return additionnalData;
    }

    @JsonProperty("additionnalData")
    public void setAdditionnalData(AdditionalDataType additionnalData) {
        this.additionnalData = additionnalData;
    }

    public DICOOBJETJSONDisputeData withAdditionnalData(AdditionalDataType additionnalData) {
        this.additionnalData = additionnalData;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("auditTrailFolderEligibilityIndicator")
    public Boolean getAuditTrailFolderEligibilityIndicator() {
        return auditTrailFolderEligibilityIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("auditTrailFolderEligibilityIndicator")
    public void setAuditTrailFolderEligibilityIndicator(Boolean auditTrailFolderEligibilityIndicator) {
        this.auditTrailFolderEligibilityIndicator = auditTrailFolderEligibilityIndicator;
    }

    public DICOOBJETJSONDisputeData withAuditTrailFolderEligibilityIndicator(Boolean auditTrailFolderEligibilityIndicator) {
        this.auditTrailFolderEligibilityIndicator = auditTrailFolderEligibilityIndicator;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("creationDateTime")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public DICOOBJETJSONDisputeData withCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("decisionDateTime")
    public String getDecisionDateTime() {
        return decisionDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("decisionDateTime")
    public void setDecisionDateTime(String decisionDateTime) {
        this.decisionDateTime = decisionDateTime;
    }

    public DICOOBJETJSONDisputeData withDecisionDateTime(String decisionDateTime) {
        this.decisionDateTime = decisionDateTime;
        return this;
    }

    @JsonProperty("disputeCondition")
    public List<DisputeConditionCodeset> getDisputeCondition() {
        return disputeCondition;
    }

    @JsonProperty("disputeCondition")
    public void setDisputeCondition(List<DisputeConditionCodeset> disputeCondition) {
        this.disputeCondition = disputeCondition;
    }

    public DICOOBJETJSONDisputeData withDisputeCondition(List<DisputeConditionCodeset> disputeCondition) {
        this.disputeCondition = disputeCondition;
        return this;
    }

    /**
     *  16 alphanumeric characters
     * 
     */
    @JsonProperty("disputeDataId")
    public String getDisputeDataId() {
        return disputeDataId;
    }

    /**
     *  16 alphanumeric characters
     * 
     */
    @JsonProperty("disputeDataId")
    public void setDisputeDataId(String disputeDataId) {
        this.disputeDataId = disputeDataId;
    }

    public DICOOBJETJSONDisputeData withDisputeDataId(String disputeDataId) {
        this.disputeDataId = disputeDataId;
        return this;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("disputeInternalIdentification")
    public String getDisputeInternalIdentification() {
        return disputeInternalIdentification;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("disputeInternalIdentification")
    public void setDisputeInternalIdentification(String disputeInternalIdentification) {
        this.disputeInternalIdentification = disputeInternalIdentification;
    }

    public DICOOBJETJSONDisputeData withDisputeInternalIdentification(String disputeInternalIdentification) {
        this.disputeInternalIdentification = disputeInternalIdentification;
        return this;
    }

    @JsonProperty("disputeQualification")
    public List<DisputeQualificationCodeset> getDisputeQualification() {
        return disputeQualification;
    }

    @JsonProperty("disputeQualification")
    public void setDisputeQualification(List<DisputeQualificationCodeset> disputeQualification) {
        this.disputeQualification = disputeQualification;
    }

    public DICOOBJETJSONDisputeData withDisputeQualification(List<DisputeQualificationCodeset> disputeQualification) {
        this.disputeQualification = disputeQualification;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("reasonStatusCode")
    public String getReasonStatusCode() {
        return reasonStatusCode;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("reasonStatusCode")
    public void setReasonStatusCode(String reasonStatusCode) {
        this.reasonStatusCode = reasonStatusCode;
    }

    public DICOOBJETJSONDisputeData withReasonStatusCode(String reasonStatusCode) {
        this.reasonStatusCode = reasonStatusCode;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("reclamationIndicator")
    public Boolean getReclamationIndicator() {
        return reclamationIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("reclamationIndicator")
    public void setReclamationIndicator(Boolean reclamationIndicator) {
        this.reclamationIndicator = reclamationIndicator;
    }

    public DICOOBJETJSONDisputeData withReclamationIndicator(Boolean reclamationIndicator) {
        this.reclamationIndicator = reclamationIndicator;
        return this;
    }

    @JsonProperty("refundDecisionCode")
    public List<RefundDecisionCodeset> getRefundDecisionCode() {
        return refundDecisionCode;
    }

    @JsonProperty("refundDecisionCode")
    public void setRefundDecisionCode(List<RefundDecisionCodeset> refundDecisionCode) {
        this.refundDecisionCode = refundDecisionCode;
    }

    public DICOOBJETJSONDisputeData withRefundDecisionCode(List<RefundDecisionCodeset> refundDecisionCode) {
        this.refundDecisionCode = refundDecisionCode;
        return this;
    }

    @JsonProperty("statusChangeReason")
    public List<StatusChangeReasonCodeset> getStatusChangeReason() {
        return statusChangeReason;
    }

    @JsonProperty("statusChangeReason")
    public void setStatusChangeReason(List<StatusChangeReasonCodeset> statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }

    public DICOOBJETJSONDisputeData withStatusChangeReason(List<StatusChangeReasonCodeset> statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
        return this;
    }

    @JsonProperty("statusCode")
    public List<StatusCodeCodeset> getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(List<StatusCodeCodeset> statusCode) {
        this.statusCode = statusCode;
    }

    public DICOOBJETJSONDisputeData withStatusCode(List<StatusCodeCodeset> statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("statusLabel")
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("statusLabel")
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    public DICOOBJETJSONDisputeData withStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("statusUpdateDateTime")
    public String getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("statusUpdateDateTime")
    public void setStatusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public DICOOBJETJSONDisputeData withStatusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    @JsonProperty("totalAmount ")
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalAmount ")
    public void setTotalAmount(AmountType totalAmount) {
        this.totalAmount = totalAmount;
    }

    public DICOOBJETJSONDisputeData withTotalAmount(AmountType totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("transactionsCount")
    public String getTransactionsCount() {
        return transactionsCount;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("transactionsCount")
    public void setTransactionsCount(String transactionsCount) {
        this.transactionsCount = transactionsCount;
    }

    public DICOOBJETJSONDisputeData withTransactionsCount(String transactionsCount) {
        this.transactionsCount = transactionsCount;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("updateDateTime")
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("updateDateTime")
    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public DICOOBJETJSONDisputeData withUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
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

    public DICOOBJETJSONDisputeData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONDisputeData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionnalData");
        sb.append('=');
        sb.append(((this.additionnalData == null)?"<null>":this.additionnalData));
        sb.append(',');
        sb.append("auditTrailFolderEligibilityIndicator");
        sb.append('=');
        sb.append(((this.auditTrailFolderEligibilityIndicator == null)?"<null>":this.auditTrailFolderEligibilityIndicator));
        sb.append(',');
        sb.append("creationDateTime");
        sb.append('=');
        sb.append(((this.creationDateTime == null)?"<null>":this.creationDateTime));
        sb.append(',');
        sb.append("decisionDateTime");
        sb.append('=');
        sb.append(((this.decisionDateTime == null)?"<null>":this.decisionDateTime));
        sb.append(',');
        sb.append("disputeCondition");
        sb.append('=');
        sb.append(((this.disputeCondition == null)?"<null>":this.disputeCondition));
        sb.append(',');
        sb.append("disputeDataId");
        sb.append('=');
        sb.append(((this.disputeDataId == null)?"<null>":this.disputeDataId));
        sb.append(',');
        sb.append("disputeInternalIdentification");
        sb.append('=');
        sb.append(((this.disputeInternalIdentification == null)?"<null>":this.disputeInternalIdentification));
        sb.append(',');
        sb.append("disputeQualification");
        sb.append('=');
        sb.append(((this.disputeQualification == null)?"<null>":this.disputeQualification));
        sb.append(',');
        sb.append("reasonStatusCode");
        sb.append('=');
        sb.append(((this.reasonStatusCode == null)?"<null>":this.reasonStatusCode));
        sb.append(',');
        sb.append("reclamationIndicator");
        sb.append('=');
        sb.append(((this.reclamationIndicator == null)?"<null>":this.reclamationIndicator));
        sb.append(',');
        sb.append("refundDecisionCode");
        sb.append('=');
        sb.append(((this.refundDecisionCode == null)?"<null>":this.refundDecisionCode));
        sb.append(',');
        sb.append("statusChangeReason");
        sb.append('=');
        sb.append(((this.statusChangeReason == null)?"<null>":this.statusChangeReason));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("statusLabel");
        sb.append('=');
        sb.append(((this.statusLabel == null)?"<null>":this.statusLabel));
        sb.append(',');
        sb.append("statusUpdateDateTime");
        sb.append('=');
        sb.append(((this.statusUpdateDateTime == null)?"<null>":this.statusUpdateDateTime));
        sb.append(',');
        sb.append("totalAmount");
        sb.append('=');
        sb.append(((this.totalAmount == null)?"<null>":this.totalAmount));
        sb.append(',');
        sb.append("transactionsCount");
        sb.append('=');
        sb.append(((this.transactionsCount == null)?"<null>":this.transactionsCount));
        sb.append(',');
        sb.append("updateDateTime");
        sb.append('=');
        sb.append(((this.updateDateTime == null)?"<null>":this.updateDateTime));
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
        result = ((result* 31)+((this.statusChangeReason == null)? 0 :this.statusChangeReason.hashCode()));
        result = ((result* 31)+((this.additionnalData == null)? 0 :this.additionnalData.hashCode()));
        result = ((result* 31)+((this.disputeCondition == null)? 0 :this.disputeCondition.hashCode()));
        result = ((result* 31)+((this.disputeQualification == null)? 0 :this.disputeQualification.hashCode()));
        result = ((result* 31)+((this.auditTrailFolderEligibilityIndicator == null)? 0 :this.auditTrailFolderEligibilityIndicator.hashCode()));
        result = ((result* 31)+((this.decisionDateTime == null)? 0 :this.decisionDateTime.hashCode()));
        result = ((result* 31)+((this.reasonStatusCode == null)? 0 :this.reasonStatusCode.hashCode()));
        result = ((result* 31)+((this.reclamationIndicator == null)? 0 :this.reclamationIndicator.hashCode()));
        result = ((result* 31)+((this.disputeDataId == null)? 0 :this.disputeDataId.hashCode()));
        result = ((result* 31)+((this.refundDecisionCode == null)? 0 :this.refundDecisionCode.hashCode()));
        result = ((result* 31)+((this.disputeInternalIdentification == null)? 0 :this.disputeInternalIdentification.hashCode()));
        result = ((result* 31)+((this.statusLabel == null)? 0 :this.statusLabel.hashCode()));
        result = ((result* 31)+((this.totalAmount == null)? 0 :this.totalAmount.hashCode()));
        result = ((result* 31)+((this.statusUpdateDateTime == null)? 0 :this.statusUpdateDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.updateDateTime == null)? 0 :this.updateDateTime.hashCode()));
        result = ((result* 31)+((this.transactionsCount == null)? 0 :this.transactionsCount.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONDisputeData) == false) {
            return false;
        }
        DICOOBJETJSONDisputeData rhs = ((DICOOBJETJSONDisputeData) other);
        return ((((((((((((((((((((this.statusChangeReason == rhs.statusChangeReason)||((this.statusChangeReason!= null)&&this.statusChangeReason.equals(rhs.statusChangeReason)))&&((this.additionnalData == rhs.additionnalData)||((this.additionnalData!= null)&&this.additionnalData.equals(rhs.additionnalData))))&&((this.disputeCondition == rhs.disputeCondition)||((this.disputeCondition!= null)&&this.disputeCondition.equals(rhs.disputeCondition))))&&((this.disputeQualification == rhs.disputeQualification)||((this.disputeQualification!= null)&&this.disputeQualification.equals(rhs.disputeQualification))))&&((this.auditTrailFolderEligibilityIndicator == rhs.auditTrailFolderEligibilityIndicator)||((this.auditTrailFolderEligibilityIndicator!= null)&&this.auditTrailFolderEligibilityIndicator.equals(rhs.auditTrailFolderEligibilityIndicator))))&&((this.decisionDateTime == rhs.decisionDateTime)||((this.decisionDateTime!= null)&&this.decisionDateTime.equals(rhs.decisionDateTime))))&&((this.reasonStatusCode == rhs.reasonStatusCode)||((this.reasonStatusCode!= null)&&this.reasonStatusCode.equals(rhs.reasonStatusCode))))&&((this.reclamationIndicator == rhs.reclamationIndicator)||((this.reclamationIndicator!= null)&&this.reclamationIndicator.equals(rhs.reclamationIndicator))))&&((this.disputeDataId == rhs.disputeDataId)||((this.disputeDataId!= null)&&this.disputeDataId.equals(rhs.disputeDataId))))&&((this.refundDecisionCode == rhs.refundDecisionCode)||((this.refundDecisionCode!= null)&&this.refundDecisionCode.equals(rhs.refundDecisionCode))))&&((this.disputeInternalIdentification == rhs.disputeInternalIdentification)||((this.disputeInternalIdentification!= null)&&this.disputeInternalIdentification.equals(rhs.disputeInternalIdentification))))&&((this.statusLabel == rhs.statusLabel)||((this.statusLabel!= null)&&this.statusLabel.equals(rhs.statusLabel))))&&((this.totalAmount == rhs.totalAmount)||((this.totalAmount!= null)&&this.totalAmount.equals(rhs.totalAmount))))&&((this.statusUpdateDateTime == rhs.statusUpdateDateTime)||((this.statusUpdateDateTime!= null)&&this.statusUpdateDateTime.equals(rhs.statusUpdateDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updateDateTime == rhs.updateDateTime)||((this.updateDateTime!= null)&&this.updateDateTime.equals(rhs.updateDateTime))))&&((this.transactionsCount == rhs.transactionsCount)||((this.transactionsCount!= null)&&this.transactionsCount.equals(rhs.transactionsCount))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
