
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
    "issuerPlace",
    "issuerZone"
})
@Generated("jsonschema2pojo")
public class ProcessorIssuerDataType implements Serializable
{

    @JsonProperty("issuerPlace")
    private List<IssuerPlaceCodeset> issuerPlace = new ArrayList<IssuerPlaceCodeset>();
    @JsonProperty("issuerZone")
    private List<IssuerZoneCodeset> issuerZone = new ArrayList<IssuerZoneCodeset>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4752970915501166802L;

    @JsonProperty("issuerPlace")
    public List<IssuerPlaceCodeset> getIssuerPlace() {
        return issuerPlace;
    }

    @JsonProperty("issuerPlace")
    public void setIssuerPlace(List<IssuerPlaceCodeset> issuerPlace) {
        this.issuerPlace = issuerPlace;
    }

    public ProcessorIssuerDataType withIssuerPlace(List<IssuerPlaceCodeset> issuerPlace) {
        this.issuerPlace = issuerPlace;
        return this;
    }

    @JsonProperty("issuerZone")
    public List<IssuerZoneCodeset> getIssuerZone() {
        return issuerZone;
    }

    @JsonProperty("issuerZone")
    public void setIssuerZone(List<IssuerZoneCodeset> issuerZone) {
        this.issuerZone = issuerZone;
    }

    public ProcessorIssuerDataType withIssuerZone(List<IssuerZoneCodeset> issuerZone) {
        this.issuerZone = issuerZone;
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

    public ProcessorIssuerDataType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessorIssuerDataType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("issuerPlace");
        sb.append('=');
        sb.append(((this.issuerPlace == null)?"<null>":this.issuerPlace));
        sb.append(',');
        sb.append("issuerZone");
        sb.append('=');
        sb.append(((this.issuerZone == null)?"<null>":this.issuerZone));
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
        result = ((result* 31)+((this.issuerPlace == null)? 0 :this.issuerPlace.hashCode()));
        result = ((result* 31)+((this.issuerZone == null)? 0 :this.issuerZone.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessorIssuerDataType) == false) {
            return false;
        }
        ProcessorIssuerDataType rhs = ((ProcessorIssuerDataType) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.issuerPlace == rhs.issuerPlace)||((this.issuerPlace!= null)&&this.issuerPlace.equals(rhs.issuerPlace))))&&((this.issuerZone == rhs.issuerZone)||((this.issuerZone!= null)&&this.issuerZone.equals(rhs.issuerZone))));
    }

}
