
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
    "finalMerchantId",
    "independantSalesOrganisationId",
    "marketPlaceId",
    "paymentFacilitatorId"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONSponsoredMerchant implements Serializable
{

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("finalMerchantId")
    @JsonPropertyDescription("15 alphanumeric  and special characters")
    private String finalMerchantId;
    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("independantSalesOrganisationId")
    @JsonPropertyDescription("15 alphanumeric  and special characters")
    private String independantSalesOrganisationId;
    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("marketPlaceId")
    @JsonPropertyDescription("15 alphanumeric  and special characters")
    private String marketPlaceId;
    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("paymentFacilitatorId")
    @JsonPropertyDescription("15 alphanumeric  and special characters")
    private String paymentFacilitatorId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8549350970835241702L;

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("finalMerchantId")
    public String getFinalMerchantId() {
        return finalMerchantId;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("finalMerchantId")
    public void setFinalMerchantId(String finalMerchantId) {
        this.finalMerchantId = finalMerchantId;
    }

    public DICOOBJETJSONSponsoredMerchant withFinalMerchantId(String finalMerchantId) {
        this.finalMerchantId = finalMerchantId;
        return this;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("independantSalesOrganisationId")
    public String getIndependantSalesOrganisationId() {
        return independantSalesOrganisationId;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("independantSalesOrganisationId")
    public void setIndependantSalesOrganisationId(String independantSalesOrganisationId) {
        this.independantSalesOrganisationId = independantSalesOrganisationId;
    }

    public DICOOBJETJSONSponsoredMerchant withIndependantSalesOrganisationId(String independantSalesOrganisationId) {
        this.independantSalesOrganisationId = independantSalesOrganisationId;
        return this;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("marketPlaceId")
    public String getMarketPlaceId() {
        return marketPlaceId;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("marketPlaceId")
    public void setMarketPlaceId(String marketPlaceId) {
        this.marketPlaceId = marketPlaceId;
    }

    public DICOOBJETJSONSponsoredMerchant withMarketPlaceId(String marketPlaceId) {
        this.marketPlaceId = marketPlaceId;
        return this;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("paymentFacilitatorId")
    public String getPaymentFacilitatorId() {
        return paymentFacilitatorId;
    }

    /**
     *  15 alphanumeric  and special characters
     * 
     */
    @JsonProperty("paymentFacilitatorId")
    public void setPaymentFacilitatorId(String paymentFacilitatorId) {
        this.paymentFacilitatorId = paymentFacilitatorId;
    }

    public DICOOBJETJSONSponsoredMerchant withPaymentFacilitatorId(String paymentFacilitatorId) {
        this.paymentFacilitatorId = paymentFacilitatorId;
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

    public DICOOBJETJSONSponsoredMerchant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONSponsoredMerchant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finalMerchantId");
        sb.append('=');
        sb.append(((this.finalMerchantId == null)?"<null>":this.finalMerchantId));
        sb.append(',');
        sb.append("independantSalesOrganisationId");
        sb.append('=');
        sb.append(((this.independantSalesOrganisationId == null)?"<null>":this.independantSalesOrganisationId));
        sb.append(',');
        sb.append("marketPlaceId");
        sb.append('=');
        sb.append(((this.marketPlaceId == null)?"<null>":this.marketPlaceId));
        sb.append(',');
        sb.append("paymentFacilitatorId");
        sb.append('=');
        sb.append(((this.paymentFacilitatorId == null)?"<null>":this.paymentFacilitatorId));
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
        result = ((result* 31)+((this.marketPlaceId == null)? 0 :this.marketPlaceId.hashCode()));
        result = ((result* 31)+((this.independantSalesOrganisationId == null)? 0 :this.independantSalesOrganisationId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentFacilitatorId == null)? 0 :this.paymentFacilitatorId.hashCode()));
        result = ((result* 31)+((this.finalMerchantId == null)? 0 :this.finalMerchantId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONSponsoredMerchant) == false) {
            return false;
        }
        DICOOBJETJSONSponsoredMerchant rhs = ((DICOOBJETJSONSponsoredMerchant) other);
        return ((((((this.marketPlaceId == rhs.marketPlaceId)||((this.marketPlaceId!= null)&&this.marketPlaceId.equals(rhs.marketPlaceId)))&&((this.independantSalesOrganisationId == rhs.independantSalesOrganisationId)||((this.independantSalesOrganisationId!= null)&&this.independantSalesOrganisationId.equals(rhs.independantSalesOrganisationId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentFacilitatorId == rhs.paymentFacilitatorId)||((this.paymentFacilitatorId!= null)&&this.paymentFacilitatorId.equals(rhs.paymentFacilitatorId))))&&((this.finalMerchantId == rhs.finalMerchantId)||((this.finalMerchantId!= null)&&this.finalMerchantId.equals(rhs.finalMerchantId))));
    }

}
