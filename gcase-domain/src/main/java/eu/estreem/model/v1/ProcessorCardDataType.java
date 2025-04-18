
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardLevel",
    "cardUsage"
})
@Generated("jsonschema2pojo")
public class ProcessorCardDataType implements Serializable
{

    @JsonProperty("cardLevel")
    private List<CardLevelCodeset> cardLevel = new ArrayList<CardLevelCodeset>();
    @JsonProperty("cardUsage")
    private List<CardUsageCodeset> cardUsage = new ArrayList<CardUsageCodeset>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -809379329268786952L;

    @JsonProperty("cardLevel")
    public List<CardLevelCodeset> getCardLevel() {
        return cardLevel;
    }

    @JsonProperty("cardLevel")
    public void setCardLevel(List<CardLevelCodeset> cardLevel) {
        this.cardLevel = cardLevel;
    }

    public ProcessorCardDataType withCardLevel(List<CardLevelCodeset> cardLevel) {
        this.cardLevel = cardLevel;
        return this;
    }

    @JsonProperty("cardUsage")
    public List<CardUsageCodeset> getCardUsage() {
        return cardUsage;
    }

    @JsonProperty("cardUsage")
    public void setCardUsage(List<CardUsageCodeset> cardUsage) {
        this.cardUsage = cardUsage;
    }

    public ProcessorCardDataType withCardUsage(List<CardUsageCodeset> cardUsage) {
        this.cardUsage = cardUsage;
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

    public ProcessorCardDataType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessorCardDataType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardLevel");
        sb.append('=');
        sb.append(((this.cardLevel == null)?"<null>":this.cardLevel));
        sb.append(',');
        sb.append("cardUsage");
        sb.append('=');
        sb.append(((this.cardUsage == null)?"<null>":this.cardUsage));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cardLevel == null)? 0 :this.cardLevel.hashCode()));
        result = ((result* 31)+((this.cardUsage == null)? 0 :this.cardUsage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessorCardDataType) == false) {
            return false;
        }
        ProcessorCardDataType rhs = ((ProcessorCardDataType) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.cardLevel == rhs.cardLevel)||((this.cardLevel!= null)&&this.cardLevel.equals(rhs.cardLevel))))&&((this.cardUsage == rhs.cardUsage)||((this.cardUsage!= null)&&this.cardUsage.equals(rhs.cardUsage))));
    }

}
