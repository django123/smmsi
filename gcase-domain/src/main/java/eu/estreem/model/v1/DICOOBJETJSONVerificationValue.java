
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
    "cardholderAuthenticationValueCalculationMethod",
    "paymentSolutionProof"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONVerificationValue implements Serializable
{

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueCalculationMethod")
    @JsonPropertyDescription("1 alphanumeric character")
    private String cardholderAuthenticationValueCalculationMethod;
    @JsonProperty("paymentSolutionProof")
    private List<PaymentSolutionProofCodeset> paymentSolutionProof = new ArrayList<PaymentSolutionProofCodeset>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1074348389182741446L;

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueCalculationMethod")
    public String getCardholderAuthenticationValueCalculationMethod() {
        return cardholderAuthenticationValueCalculationMethod;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("cardholderAuthenticationValueCalculationMethod")
    public void setCardholderAuthenticationValueCalculationMethod(String cardholderAuthenticationValueCalculationMethod) {
        this.cardholderAuthenticationValueCalculationMethod = cardholderAuthenticationValueCalculationMethod;
    }

    public DICOOBJETJSONVerificationValue withCardholderAuthenticationValueCalculationMethod(String cardholderAuthenticationValueCalculationMethod) {
        this.cardholderAuthenticationValueCalculationMethod = cardholderAuthenticationValueCalculationMethod;
        return this;
    }

    @JsonProperty("paymentSolutionProof")
    public List<PaymentSolutionProofCodeset> getPaymentSolutionProof() {
        return paymentSolutionProof;
    }

    @JsonProperty("paymentSolutionProof")
    public void setPaymentSolutionProof(List<PaymentSolutionProofCodeset> paymentSolutionProof) {
        this.paymentSolutionProof = paymentSolutionProof;
    }

    public DICOOBJETJSONVerificationValue withPaymentSolutionProof(List<PaymentSolutionProofCodeset> paymentSolutionProof) {
        this.paymentSolutionProof = paymentSolutionProof;
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

    public DICOOBJETJSONVerificationValue withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONVerificationValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardholderAuthenticationValueCalculationMethod");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationValueCalculationMethod == null)?"<null>":this.cardholderAuthenticationValueCalculationMethod));
        sb.append(',');
        sb.append("paymentSolutionProof");
        sb.append('=');
        sb.append(((this.paymentSolutionProof == null)?"<null>":this.paymentSolutionProof));
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
        result = ((result* 31)+((this.cardholderAuthenticationValueCalculationMethod == null)? 0 :this.cardholderAuthenticationValueCalculationMethod.hashCode()));
        result = ((result* 31)+((this.paymentSolutionProof == null)? 0 :this.paymentSolutionProof.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONVerificationValue) == false) {
            return false;
        }
        DICOOBJETJSONVerificationValue rhs = ((DICOOBJETJSONVerificationValue) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.cardholderAuthenticationValueCalculationMethod == rhs.cardholderAuthenticationValueCalculationMethod)||((this.cardholderAuthenticationValueCalculationMethod!= null)&&this.cardholderAuthenticationValueCalculationMethod.equals(rhs.cardholderAuthenticationValueCalculationMethod))))&&((this.paymentSolutionProof == rhs.paymentSolutionProof)||((this.paymentSolutionProof!= null)&&this.paymentSolutionProof.equals(rhs.paymentSolutionProof))));
    }

}
