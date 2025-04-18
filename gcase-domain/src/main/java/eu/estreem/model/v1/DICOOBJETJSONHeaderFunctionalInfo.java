
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
    "datetime",
    "messageDescription",
    "messageFunction",
    "protocolVersion",
    "recipientPartyResponseCode",
    "vacationNumber"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONHeaderFunctionalInfo implements Serializable
{

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("datetime")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String datetime;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("messageDescription")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 255 characters")
    private String messageDescription;
    @JsonProperty("messageFunction")
    private List<MessageFunctionCodeset> messageFunction = new ArrayList<MessageFunctionCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("protocolVersion")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 50 characters")
    private String protocolVersion;
    /**
     * Specifies a numeric string with an exact length of 5 digits.
     * 
     */
    @JsonProperty("recipientPartyResponseCode")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 5 digits.")
    private String recipientPartyResponseCode;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 5 digits
     * 
     */
    @JsonProperty("vacationNumber")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 5 digits")
    private String vacationNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6407554554826284051L;

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public DICOOBJETJSONHeaderFunctionalInfo withDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("messageDescription")
    public String getMessageDescription() {
        return messageDescription;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 255 characters
     * 
     */
    @JsonProperty("messageDescription")
    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }

    public DICOOBJETJSONHeaderFunctionalInfo withMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
        return this;
    }

    @JsonProperty("messageFunction")
    public List<MessageFunctionCodeset> getMessageFunction() {
        return messageFunction;
    }

    @JsonProperty("messageFunction")
    public void setMessageFunction(List<MessageFunctionCodeset> messageFunction) {
        this.messageFunction = messageFunction;
    }

    public DICOOBJETJSONHeaderFunctionalInfo withMessageFunction(List<MessageFunctionCodeset> messageFunction) {
        this.messageFunction = messageFunction;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("protocolVersion")
    public String getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 50 characters
     * 
     */
    @JsonProperty("protocolVersion")
    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public DICOOBJETJSONHeaderFunctionalInfo withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 5 digits.
     * 
     */
    @JsonProperty("recipientPartyResponseCode")
    public String getRecipientPartyResponseCode() {
        return recipientPartyResponseCode;
    }

    /**
     * Specifies a numeric string with an exact length of 5 digits.
     * 
     */
    @JsonProperty("recipientPartyResponseCode")
    public void setRecipientPartyResponseCode(String recipientPartyResponseCode) {
        this.recipientPartyResponseCode = recipientPartyResponseCode;
    }

    public DICOOBJETJSONHeaderFunctionalInfo withRecipientPartyResponseCode(String recipientPartyResponseCode) {
        this.recipientPartyResponseCode = recipientPartyResponseCode;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 5 digits
     * 
     */
    @JsonProperty("vacationNumber")
    public String getVacationNumber() {
        return vacationNumber;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 5 digits
     * 
     */
    @JsonProperty("vacationNumber")
    public void setVacationNumber(String vacationNumber) {
        this.vacationNumber = vacationNumber;
    }

    public DICOOBJETJSONHeaderFunctionalInfo withVacationNumber(String vacationNumber) {
        this.vacationNumber = vacationNumber;
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

    public DICOOBJETJSONHeaderFunctionalInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONHeaderFunctionalInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("messageDescription");
        sb.append('=');
        sb.append(((this.messageDescription == null)?"<null>":this.messageDescription));
        sb.append(',');
        sb.append("messageFunction");
        sb.append('=');
        sb.append(((this.messageFunction == null)?"<null>":this.messageFunction));
        sb.append(',');
        sb.append("protocolVersion");
        sb.append('=');
        sb.append(((this.protocolVersion == null)?"<null>":this.protocolVersion));
        sb.append(',');
        sb.append("recipientPartyResponseCode");
        sb.append('=');
        sb.append(((this.recipientPartyResponseCode == null)?"<null>":this.recipientPartyResponseCode));
        sb.append(',');
        sb.append("vacationNumber");
        sb.append('=');
        sb.append(((this.vacationNumber == null)?"<null>":this.vacationNumber));
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
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.recipientPartyResponseCode == null)? 0 :this.recipientPartyResponseCode.hashCode()));
        result = ((result* 31)+((this.vacationNumber == null)? 0 :this.vacationNumber.hashCode()));
        result = ((result* 31)+((this.messageDescription == null)? 0 :this.messageDescription.hashCode()));
        result = ((result* 31)+((this.protocolVersion == null)? 0 :this.protocolVersion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.messageFunction == null)? 0 :this.messageFunction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONHeaderFunctionalInfo) == false) {
            return false;
        }
        DICOOBJETJSONHeaderFunctionalInfo rhs = ((DICOOBJETJSONHeaderFunctionalInfo) other);
        return ((((((((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime)))&&((this.recipientPartyResponseCode == rhs.recipientPartyResponseCode)||((this.recipientPartyResponseCode!= null)&&this.recipientPartyResponseCode.equals(rhs.recipientPartyResponseCode))))&&((this.vacationNumber == rhs.vacationNumber)||((this.vacationNumber!= null)&&this.vacationNumber.equals(rhs.vacationNumber))))&&((this.messageDescription == rhs.messageDescription)||((this.messageDescription!= null)&&this.messageDescription.equals(rhs.messageDescription))))&&((this.protocolVersion == rhs.protocolVersion)||((this.protocolVersion!= null)&&this.protocolVersion.equals(rhs.protocolVersion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.messageFunction == rhs.messageFunction)||((this.messageFunction!= null)&&this.messageFunction.equals(rhs.messageFunction))));
    }

}
