
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
    "amount",
    "rechargeable",
    "schemeFeesCaterory",
    "billingId",
    "schemeFeesLabel",
    "schemeFeesGroup",
    "schemeFeesNature",
    "schemeFeesMode",
    "tieredVolume",
    "tieredRangeAppliedLow",
    "tieredRangeAppliedHigh",
    "regionApplied",
    "schemeFeesRate",
    "schemeFeesAmountNature",
    "schemeFeesAmount"
})
@Generated("jsonschema2pojo")
public class SchemeFeesType implements Serializable
{

    @JsonProperty("amount")
    private AmountType amount;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("rechargeable")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean rechargeable;
    @JsonProperty("schemeFeesCaterory")
    private List<SchemeFeesCategoryCodeset> schemeFeesCaterory = new ArrayList<SchemeFeesCategoryCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("billingId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 20 characters.")
    private String billingId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("schemeFeesLabel")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 70 digits.")
    private String schemeFeesLabel;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 30 characters
     * 
     */
    @JsonProperty("schemeFeesGroup")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 30 characters")
    private String schemeFeesGroup;
    @JsonProperty("schemeFeesNature")
    private List<SchemeFeesNatureCodeset> schemeFeesNature = new ArrayList<SchemeFeesNatureCodeset>();
    @JsonProperty("schemeFeesMode")
    private List<SchemeFeesModeCodeset> schemeFeesMode = new ArrayList<SchemeFeesModeCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredVolume")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 19 characters.")
    private String tieredVolume;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredRangeAppliedLow")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 19 characters.")
    private String tieredRangeAppliedLow;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredRangeAppliedHigh")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 19 characters.")
    private String tieredRangeAppliedHigh;
    @JsonProperty("regionApplied")
    private List<MastercardRegionCodeset> regionApplied = new ArrayList<MastercardRegionCodeset>();
    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("schemeFeesRate")
    @JsonPropertyDescription("Rate expressed as a decimal")
    private String schemeFeesRate;
    @JsonProperty("schemeFeesAmountNature")
    private List<SchemeFeesAmountNatureCodeset> schemeFeesAmountNature = new ArrayList<SchemeFeesAmountNatureCodeset>();
    @JsonProperty("schemeFeesAmount")
    private AmountType schemeFeesAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8715184066987847288L;

    @JsonProperty("amount")
    public AmountType getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(AmountType amount) {
        this.amount = amount;
    }

    public SchemeFeesType withAmount(AmountType amount) {
        this.amount = amount;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("rechargeable")
    public Boolean getRechargeable() {
        return rechargeable;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("rechargeable")
    public void setRechargeable(Boolean rechargeable) {
        this.rechargeable = rechargeable;
    }

    public SchemeFeesType withRechargeable(Boolean rechargeable) {
        this.rechargeable = rechargeable;
        return this;
    }

    @JsonProperty("schemeFeesCaterory")
    public List<SchemeFeesCategoryCodeset> getSchemeFeesCaterory() {
        return schemeFeesCaterory;
    }

    @JsonProperty("schemeFeesCaterory")
    public void setSchemeFeesCaterory(List<SchemeFeesCategoryCodeset> schemeFeesCaterory) {
        this.schemeFeesCaterory = schemeFeesCaterory;
    }

    public SchemeFeesType withSchemeFeesCaterory(List<SchemeFeesCategoryCodeset> schemeFeesCaterory) {
        this.schemeFeesCaterory = schemeFeesCaterory;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("billingId")
    public String getBillingId() {
        return billingId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("billingId")
    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    public SchemeFeesType withBillingId(String billingId) {
        this.billingId = billingId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("schemeFeesLabel")
    public String getSchemeFeesLabel() {
        return schemeFeesLabel;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 70 digits.
     * 
     */
    @JsonProperty("schemeFeesLabel")
    public void setSchemeFeesLabel(String schemeFeesLabel) {
        this.schemeFeesLabel = schemeFeesLabel;
    }

    public SchemeFeesType withSchemeFeesLabel(String schemeFeesLabel) {
        this.schemeFeesLabel = schemeFeesLabel;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 30 characters
     * 
     */
    @JsonProperty("schemeFeesGroup")
    public String getSchemeFeesGroup() {
        return schemeFeesGroup;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 30 characters
     * 
     */
    @JsonProperty("schemeFeesGroup")
    public void setSchemeFeesGroup(String schemeFeesGroup) {
        this.schemeFeesGroup = schemeFeesGroup;
    }

    public SchemeFeesType withSchemeFeesGroup(String schemeFeesGroup) {
        this.schemeFeesGroup = schemeFeesGroup;
        return this;
    }

    @JsonProperty("schemeFeesNature")
    public List<SchemeFeesNatureCodeset> getSchemeFeesNature() {
        return schemeFeesNature;
    }

    @JsonProperty("schemeFeesNature")
    public void setSchemeFeesNature(List<SchemeFeesNatureCodeset> schemeFeesNature) {
        this.schemeFeesNature = schemeFeesNature;
    }

    public SchemeFeesType withSchemeFeesNature(List<SchemeFeesNatureCodeset> schemeFeesNature) {
        this.schemeFeesNature = schemeFeesNature;
        return this;
    }

    @JsonProperty("schemeFeesMode")
    public List<SchemeFeesModeCodeset> getSchemeFeesMode() {
        return schemeFeesMode;
    }

    @JsonProperty("schemeFeesMode")
    public void setSchemeFeesMode(List<SchemeFeesModeCodeset> schemeFeesMode) {
        this.schemeFeesMode = schemeFeesMode;
    }

    public SchemeFeesType withSchemeFeesMode(List<SchemeFeesModeCodeset> schemeFeesMode) {
        this.schemeFeesMode = schemeFeesMode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredVolume")
    public String getTieredVolume() {
        return tieredVolume;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredVolume")
    public void setTieredVolume(String tieredVolume) {
        this.tieredVolume = tieredVolume;
    }

    public SchemeFeesType withTieredVolume(String tieredVolume) {
        this.tieredVolume = tieredVolume;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredRangeAppliedLow")
    public String getTieredRangeAppliedLow() {
        return tieredRangeAppliedLow;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredRangeAppliedLow")
    public void setTieredRangeAppliedLow(String tieredRangeAppliedLow) {
        this.tieredRangeAppliedLow = tieredRangeAppliedLow;
    }

    public SchemeFeesType withTieredRangeAppliedLow(String tieredRangeAppliedLow) {
        this.tieredRangeAppliedLow = tieredRangeAppliedLow;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredRangeAppliedHigh")
    public String getTieredRangeAppliedHigh() {
        return tieredRangeAppliedHigh;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 19 characters.
     * 
     */
    @JsonProperty("tieredRangeAppliedHigh")
    public void setTieredRangeAppliedHigh(String tieredRangeAppliedHigh) {
        this.tieredRangeAppliedHigh = tieredRangeAppliedHigh;
    }

    public SchemeFeesType withTieredRangeAppliedHigh(String tieredRangeAppliedHigh) {
        this.tieredRangeAppliedHigh = tieredRangeAppliedHigh;
        return this;
    }

    @JsonProperty("regionApplied")
    public List<MastercardRegionCodeset> getRegionApplied() {
        return regionApplied;
    }

    @JsonProperty("regionApplied")
    public void setRegionApplied(List<MastercardRegionCodeset> regionApplied) {
        this.regionApplied = regionApplied;
    }

    public SchemeFeesType withRegionApplied(List<MastercardRegionCodeset> regionApplied) {
        this.regionApplied = regionApplied;
        return this;
    }

    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("schemeFeesRate")
    public String getSchemeFeesRate() {
        return schemeFeesRate;
    }

    /**
     * Rate expressed as a decimal
     * 
     */
    @JsonProperty("schemeFeesRate")
    public void setSchemeFeesRate(String schemeFeesRate) {
        this.schemeFeesRate = schemeFeesRate;
    }

    public SchemeFeesType withSchemeFeesRate(String schemeFeesRate) {
        this.schemeFeesRate = schemeFeesRate;
        return this;
    }

    @JsonProperty("schemeFeesAmountNature")
    public List<SchemeFeesAmountNatureCodeset> getSchemeFeesAmountNature() {
        return schemeFeesAmountNature;
    }

    @JsonProperty("schemeFeesAmountNature")
    public void setSchemeFeesAmountNature(List<SchemeFeesAmountNatureCodeset> schemeFeesAmountNature) {
        this.schemeFeesAmountNature = schemeFeesAmountNature;
    }

    public SchemeFeesType withSchemeFeesAmountNature(List<SchemeFeesAmountNatureCodeset> schemeFeesAmountNature) {
        this.schemeFeesAmountNature = schemeFeesAmountNature;
        return this;
    }

    @JsonProperty("schemeFeesAmount")
    public AmountType getSchemeFeesAmount() {
        return schemeFeesAmount;
    }

    @JsonProperty("schemeFeesAmount")
    public void setSchemeFeesAmount(AmountType schemeFeesAmount) {
        this.schemeFeesAmount = schemeFeesAmount;
    }

    public SchemeFeesType withSchemeFeesAmount(AmountType schemeFeesAmount) {
        this.schemeFeesAmount = schemeFeesAmount;
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

    public SchemeFeesType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchemeFeesType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("rechargeable");
        sb.append('=');
        sb.append(((this.rechargeable == null)?"<null>":this.rechargeable));
        sb.append(',');
        sb.append("schemeFeesCaterory");
        sb.append('=');
        sb.append(((this.schemeFeesCaterory == null)?"<null>":this.schemeFeesCaterory));
        sb.append(',');
        sb.append("billingId");
        sb.append('=');
        sb.append(((this.billingId == null)?"<null>":this.billingId));
        sb.append(',');
        sb.append("schemeFeesLabel");
        sb.append('=');
        sb.append(((this.schemeFeesLabel == null)?"<null>":this.schemeFeesLabel));
        sb.append(',');
        sb.append("schemeFeesGroup");
        sb.append('=');
        sb.append(((this.schemeFeesGroup == null)?"<null>":this.schemeFeesGroup));
        sb.append(',');
        sb.append("schemeFeesNature");
        sb.append('=');
        sb.append(((this.schemeFeesNature == null)?"<null>":this.schemeFeesNature));
        sb.append(',');
        sb.append("schemeFeesMode");
        sb.append('=');
        sb.append(((this.schemeFeesMode == null)?"<null>":this.schemeFeesMode));
        sb.append(',');
        sb.append("tieredVolume");
        sb.append('=');
        sb.append(((this.tieredVolume == null)?"<null>":this.tieredVolume));
        sb.append(',');
        sb.append("tieredRangeAppliedLow");
        sb.append('=');
        sb.append(((this.tieredRangeAppliedLow == null)?"<null>":this.tieredRangeAppliedLow));
        sb.append(',');
        sb.append("tieredRangeAppliedHigh");
        sb.append('=');
        sb.append(((this.tieredRangeAppliedHigh == null)?"<null>":this.tieredRangeAppliedHigh));
        sb.append(',');
        sb.append("regionApplied");
        sb.append('=');
        sb.append(((this.regionApplied == null)?"<null>":this.regionApplied));
        sb.append(',');
        sb.append("schemeFeesRate");
        sb.append('=');
        sb.append(((this.schemeFeesRate == null)?"<null>":this.schemeFeesRate));
        sb.append(',');
        sb.append("schemeFeesAmountNature");
        sb.append('=');
        sb.append(((this.schemeFeesAmountNature == null)?"<null>":this.schemeFeesAmountNature));
        sb.append(',');
        sb.append("schemeFeesAmount");
        sb.append('=');
        sb.append(((this.schemeFeesAmount == null)?"<null>":this.schemeFeesAmount));
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
        result = ((result* 31)+((this.rechargeable == null)? 0 :this.rechargeable.hashCode()));
        result = ((result* 31)+((this.billingId == null)? 0 :this.billingId.hashCode()));
        result = ((result* 31)+((this.tieredRangeAppliedLow == null)? 0 :this.tieredRangeAppliedLow.hashCode()));
        result = ((result* 31)+((this.schemeFeesRate == null)? 0 :this.schemeFeesRate.hashCode()));
        result = ((result* 31)+((this.schemeFeesMode == null)? 0 :this.schemeFeesMode.hashCode()));
        result = ((result* 31)+((this.schemeFeesAmountNature == null)? 0 :this.schemeFeesAmountNature.hashCode()));
        result = ((result* 31)+((this.schemeFeesAmount == null)? 0 :this.schemeFeesAmount.hashCode()));
        result = ((result* 31)+((this.tieredVolume == null)? 0 :this.tieredVolume.hashCode()));
        result = ((result* 31)+((this.schemeFeesNature == null)? 0 :this.schemeFeesNature.hashCode()));
        result = ((result* 31)+((this.schemeFeesCaterory == null)? 0 :this.schemeFeesCaterory.hashCode()));
        result = ((result* 31)+((this.schemeFeesGroup == null)? 0 :this.schemeFeesGroup.hashCode()));
        result = ((result* 31)+((this.tieredRangeAppliedHigh == null)? 0 :this.tieredRangeAppliedHigh.hashCode()));
        result = ((result* 31)+((this.regionApplied == null)? 0 :this.regionApplied.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.schemeFeesLabel == null)? 0 :this.schemeFeesLabel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemeFeesType) == false) {
            return false;
        }
        SchemeFeesType rhs = ((SchemeFeesType) other);
        return (((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.rechargeable == rhs.rechargeable)||((this.rechargeable!= null)&&this.rechargeable.equals(rhs.rechargeable))))&&((this.billingId == rhs.billingId)||((this.billingId!= null)&&this.billingId.equals(rhs.billingId))))&&((this.tieredRangeAppliedLow == rhs.tieredRangeAppliedLow)||((this.tieredRangeAppliedLow!= null)&&this.tieredRangeAppliedLow.equals(rhs.tieredRangeAppliedLow))))&&((this.schemeFeesRate == rhs.schemeFeesRate)||((this.schemeFeesRate!= null)&&this.schemeFeesRate.equals(rhs.schemeFeesRate))))&&((this.schemeFeesMode == rhs.schemeFeesMode)||((this.schemeFeesMode!= null)&&this.schemeFeesMode.equals(rhs.schemeFeesMode))))&&((this.schemeFeesAmountNature == rhs.schemeFeesAmountNature)||((this.schemeFeesAmountNature!= null)&&this.schemeFeesAmountNature.equals(rhs.schemeFeesAmountNature))))&&((this.schemeFeesAmount == rhs.schemeFeesAmount)||((this.schemeFeesAmount!= null)&&this.schemeFeesAmount.equals(rhs.schemeFeesAmount))))&&((this.tieredVolume == rhs.tieredVolume)||((this.tieredVolume!= null)&&this.tieredVolume.equals(rhs.tieredVolume))))&&((this.schemeFeesNature == rhs.schemeFeesNature)||((this.schemeFeesNature!= null)&&this.schemeFeesNature.equals(rhs.schemeFeesNature))))&&((this.schemeFeesCaterory == rhs.schemeFeesCaterory)||((this.schemeFeesCaterory!= null)&&this.schemeFeesCaterory.equals(rhs.schemeFeesCaterory))))&&((this.schemeFeesGroup == rhs.schemeFeesGroup)||((this.schemeFeesGroup!= null)&&this.schemeFeesGroup.equals(rhs.schemeFeesGroup))))&&((this.tieredRangeAppliedHigh == rhs.tieredRangeAppliedHigh)||((this.tieredRangeAppliedHigh!= null)&&this.tieredRangeAppliedHigh.equals(rhs.tieredRangeAppliedHigh))))&&((this.regionApplied == rhs.regionApplied)||((this.regionApplied!= null)&&this.regionApplied.equals(rhs.regionApplied))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.schemeFeesLabel == rhs.schemeFeesLabel)||((this.schemeFeesLabel!= null)&&this.schemeFeesLabel.equals(rhs.schemeFeesLabel))));
    }

}
