
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
    "eventNature",
    "incompatibilityEventIndicator",
    "incompatibilityEventReason",
    "localDateTime",
    "manualIndicator",
    "statusCode",
    "unboundEventIndicator",
    "unboundEventReason"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONEventData implements Serializable
{

    @JsonProperty("amount")
    private AmountType amount;
    @JsonProperty("eventNature")
    private List<EventNatureCodeset> eventNature = new ArrayList<EventNatureCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("incompatibilityEventIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean incompatibilityEventIndicator;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("incompatibilityEventReason")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String incompatibilityEventReason;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("localDateTime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String localDateTime;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("manualIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean manualIndicator;
    @JsonProperty("statusCode")
    private List<StatusCodeCodeset> statusCode = new ArrayList<StatusCodeCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("unboundEventIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean unboundEventIndicator;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("unboundEventReason")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String unboundEventReason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 79054390683539733L;

    @JsonProperty("amount")
    public AmountType getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(AmountType amount) {
        this.amount = amount;
    }

    public DICOOBJETJSONEventData withAmount(AmountType amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("eventNature")
    public List<EventNatureCodeset> getEventNature() {
        return eventNature;
    }

    @JsonProperty("eventNature")
    public void setEventNature(List<EventNatureCodeset> eventNature) {
        this.eventNature = eventNature;
    }

    public DICOOBJETJSONEventData withEventNature(List<EventNatureCodeset> eventNature) {
        this.eventNature = eventNature;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("incompatibilityEventIndicator")
    public Boolean getIncompatibilityEventIndicator() {
        return incompatibilityEventIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("incompatibilityEventIndicator")
    public void setIncompatibilityEventIndicator(Boolean incompatibilityEventIndicator) {
        this.incompatibilityEventIndicator = incompatibilityEventIndicator;
    }

    public DICOOBJETJSONEventData withIncompatibilityEventIndicator(Boolean incompatibilityEventIndicator) {
        this.incompatibilityEventIndicator = incompatibilityEventIndicator;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("incompatibilityEventReason")
    public String getIncompatibilityEventReason() {
        return incompatibilityEventReason;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("incompatibilityEventReason")
    public void setIncompatibilityEventReason(String incompatibilityEventReason) {
        this.incompatibilityEventReason = incompatibilityEventReason;
    }

    public DICOOBJETJSONEventData withIncompatibilityEventReason(String incompatibilityEventReason) {
        this.incompatibilityEventReason = incompatibilityEventReason;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("localDateTime")
    public String getLocalDateTime() {
        return localDateTime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("localDateTime")
    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public DICOOBJETJSONEventData withLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("manualIndicator")
    public Boolean getManualIndicator() {
        return manualIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("manualIndicator")
    public void setManualIndicator(Boolean manualIndicator) {
        this.manualIndicator = manualIndicator;
    }

    public DICOOBJETJSONEventData withManualIndicator(Boolean manualIndicator) {
        this.manualIndicator = manualIndicator;
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

    public DICOOBJETJSONEventData withStatusCode(List<StatusCodeCodeset> statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("unboundEventIndicator")
    public Boolean getUnboundEventIndicator() {
        return unboundEventIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("unboundEventIndicator")
    public void setUnboundEventIndicator(Boolean unboundEventIndicator) {
        this.unboundEventIndicator = unboundEventIndicator;
    }

    public DICOOBJETJSONEventData withUnboundEventIndicator(Boolean unboundEventIndicator) {
        this.unboundEventIndicator = unboundEventIndicator;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("unboundEventReason")
    public String getUnboundEventReason() {
        return unboundEventReason;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("unboundEventReason")
    public void setUnboundEventReason(String unboundEventReason) {
        this.unboundEventReason = unboundEventReason;
    }

    public DICOOBJETJSONEventData withUnboundEventReason(String unboundEventReason) {
        this.unboundEventReason = unboundEventReason;
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

    public DICOOBJETJSONEventData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONEventData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("eventNature");
        sb.append('=');
        sb.append(((this.eventNature == null)?"<null>":this.eventNature));
        sb.append(',');
        sb.append("incompatibilityEventIndicator");
        sb.append('=');
        sb.append(((this.incompatibilityEventIndicator == null)?"<null>":this.incompatibilityEventIndicator));
        sb.append(',');
        sb.append("incompatibilityEventReason");
        sb.append('=');
        sb.append(((this.incompatibilityEventReason == null)?"<null>":this.incompatibilityEventReason));
        sb.append(',');
        sb.append("localDateTime");
        sb.append('=');
        sb.append(((this.localDateTime == null)?"<null>":this.localDateTime));
        sb.append(',');
        sb.append("manualIndicator");
        sb.append('=');
        sb.append(((this.manualIndicator == null)?"<null>":this.manualIndicator));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("unboundEventIndicator");
        sb.append('=');
        sb.append(((this.unboundEventIndicator == null)?"<null>":this.unboundEventIndicator));
        sb.append(',');
        sb.append("unboundEventReason");
        sb.append('=');
        sb.append(((this.unboundEventReason == null)?"<null>":this.unboundEventReason));
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
        result = ((result* 31)+((this.localDateTime == null)? 0 :this.localDateTime.hashCode()));
        result = ((result* 31)+((this.manualIndicator == null)? 0 :this.manualIndicator.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.incompatibilityEventIndicator == null)? 0 :this.incompatibilityEventIndicator.hashCode()));
        result = ((result* 31)+((this.unboundEventReason == null)? 0 :this.unboundEventReason.hashCode()));
        result = ((result* 31)+((this.unboundEventIndicator == null)? 0 :this.unboundEventIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.incompatibilityEventReason == null)? 0 :this.incompatibilityEventReason.hashCode()));
        result = ((result* 31)+((this.eventNature == null)? 0 :this.eventNature.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONEventData) == false) {
            return false;
        }
        DICOOBJETJSONEventData rhs = ((DICOOBJETJSONEventData) other);
        return (((((((((((this.localDateTime == rhs.localDateTime)||((this.localDateTime!= null)&&this.localDateTime.equals(rhs.localDateTime)))&&((this.manualIndicator == rhs.manualIndicator)||((this.manualIndicator!= null)&&this.manualIndicator.equals(rhs.manualIndicator))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.incompatibilityEventIndicator == rhs.incompatibilityEventIndicator)||((this.incompatibilityEventIndicator!= null)&&this.incompatibilityEventIndicator.equals(rhs.incompatibilityEventIndicator))))&&((this.unboundEventReason == rhs.unboundEventReason)||((this.unboundEventReason!= null)&&this.unboundEventReason.equals(rhs.unboundEventReason))))&&((this.unboundEventIndicator == rhs.unboundEventIndicator)||((this.unboundEventIndicator!= null)&&this.unboundEventIndicator.equals(rhs.unboundEventIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.incompatibilityEventReason == rhs.incompatibilityEventReason)||((this.incompatibilityEventReason!= null)&&this.incompatibilityEventReason.equals(rhs.incompatibilityEventReason))))&&((this.eventNature == rhs.eventNature)||((this.eventNature!= null)&&this.eventNature.equals(rhs.eventNature))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
