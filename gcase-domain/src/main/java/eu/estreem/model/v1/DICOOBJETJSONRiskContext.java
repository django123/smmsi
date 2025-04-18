
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
    "delegatedAuthenticationExemptionIndicator",
    "multiFactorAuthenticationExemptionIndicator",
    "riskAnalysisIndicatorsId",
    "riskAnalysisIndicatorsValue",
    "riskPipResponse",
    "riskRecommendation",
    "riskRulesId",
    "riskScoringServiceData",
    "riskScoringServiceId",
    "riskTreatmentStatus",
    "traExemptionIndicator",
    "traScore"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONRiskContext implements Serializable
{

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("delegatedAuthenticationExemptionIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String delegatedAuthenticationExemptionIndicator;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 3 and a maxlength of 4 digits. (2 to 3 bytes)
     * 
     */
    @JsonProperty("multiFactorAuthenticationExemptionIndicator")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 3 and a maxlength of 4 digits. (2 to 3 bytes)")
    private String multiFactorAuthenticationExemptionIndicator;
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("riskAnalysisIndicatorsId")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String riskAnalysisIndicatorsId;
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("riskAnalysisIndicatorsValue")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String riskAnalysisIndicatorsValue;
    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("riskPipResponse")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 1 digits.")
    private String riskPipResponse;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("riskRecommendation")
    @JsonPropertyDescription("1 alphanumeric character")
    private String riskRecommendation;
    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("riskRulesId")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 4 digits.")
    private String riskRulesId;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 31 digits. (max of 23 bytes)
     * 
     */
    @JsonProperty("riskScoringServiceData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 31 digits. (max of 23 bytes)")
    private String riskScoringServiceData;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("riskScoringServiceId")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)")
    private String riskScoringServiceId;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("riskTreatmentStatus")
    @JsonPropertyDescription("1 alphanumeric character")
    private String riskTreatmentStatus;
    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("traExemptionIndicator")
    @JsonPropertyDescription("1 alphanumeric character")
    private String traExemptionIndicator;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("traScore")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String traScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -508476262337152621L;

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("delegatedAuthenticationExemptionIndicator")
    public String getDelegatedAuthenticationExemptionIndicator() {
        return delegatedAuthenticationExemptionIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("delegatedAuthenticationExemptionIndicator")
    public void setDelegatedAuthenticationExemptionIndicator(String delegatedAuthenticationExemptionIndicator) {
        this.delegatedAuthenticationExemptionIndicator = delegatedAuthenticationExemptionIndicator;
    }

    public DICOOBJETJSONRiskContext withDelegatedAuthenticationExemptionIndicator(String delegatedAuthenticationExemptionIndicator) {
        this.delegatedAuthenticationExemptionIndicator = delegatedAuthenticationExemptionIndicator;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 3 and a maxlength of 4 digits. (2 to 3 bytes)
     * 
     */
    @JsonProperty("multiFactorAuthenticationExemptionIndicator")
    public String getMultiFactorAuthenticationExemptionIndicator() {
        return multiFactorAuthenticationExemptionIndicator;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 3 and a maxlength of 4 digits. (2 to 3 bytes)
     * 
     */
    @JsonProperty("multiFactorAuthenticationExemptionIndicator")
    public void setMultiFactorAuthenticationExemptionIndicator(String multiFactorAuthenticationExemptionIndicator) {
        this.multiFactorAuthenticationExemptionIndicator = multiFactorAuthenticationExemptionIndicator;
    }

    public DICOOBJETJSONRiskContext withMultiFactorAuthenticationExemptionIndicator(String multiFactorAuthenticationExemptionIndicator) {
        this.multiFactorAuthenticationExemptionIndicator = multiFactorAuthenticationExemptionIndicator;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("riskAnalysisIndicatorsId")
    public String getRiskAnalysisIndicatorsId() {
        return riskAnalysisIndicatorsId;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("riskAnalysisIndicatorsId")
    public void setRiskAnalysisIndicatorsId(String riskAnalysisIndicatorsId) {
        this.riskAnalysisIndicatorsId = riskAnalysisIndicatorsId;
    }

    public DICOOBJETJSONRiskContext withRiskAnalysisIndicatorsId(String riskAnalysisIndicatorsId) {
        this.riskAnalysisIndicatorsId = riskAnalysisIndicatorsId;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("riskAnalysisIndicatorsValue")
    public String getRiskAnalysisIndicatorsValue() {
        return riskAnalysisIndicatorsValue;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("riskAnalysisIndicatorsValue")
    public void setRiskAnalysisIndicatorsValue(String riskAnalysisIndicatorsValue) {
        this.riskAnalysisIndicatorsValue = riskAnalysisIndicatorsValue;
    }

    public DICOOBJETJSONRiskContext withRiskAnalysisIndicatorsValue(String riskAnalysisIndicatorsValue) {
        this.riskAnalysisIndicatorsValue = riskAnalysisIndicatorsValue;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("riskPipResponse")
    public String getRiskPipResponse() {
        return riskPipResponse;
    }

    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("riskPipResponse")
    public void setRiskPipResponse(String riskPipResponse) {
        this.riskPipResponse = riskPipResponse;
    }

    public DICOOBJETJSONRiskContext withRiskPipResponse(String riskPipResponse) {
        this.riskPipResponse = riskPipResponse;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("riskRecommendation")
    public String getRiskRecommendation() {
        return riskRecommendation;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("riskRecommendation")
    public void setRiskRecommendation(String riskRecommendation) {
        this.riskRecommendation = riskRecommendation;
    }

    public DICOOBJETJSONRiskContext withRiskRecommendation(String riskRecommendation) {
        this.riskRecommendation = riskRecommendation;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("riskRulesId")
    public String getRiskRulesId() {
        return riskRulesId;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("riskRulesId")
    public void setRiskRulesId(String riskRulesId) {
        this.riskRulesId = riskRulesId;
    }

    public DICOOBJETJSONRiskContext withRiskRulesId(String riskRulesId) {
        this.riskRulesId = riskRulesId;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 31 digits. (max of 23 bytes)
     * 
     */
    @JsonProperty("riskScoringServiceData")
    public String getRiskScoringServiceData() {
        return riskScoringServiceData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 31 digits. (max of 23 bytes)
     * 
     */
    @JsonProperty("riskScoringServiceData")
    public void setRiskScoringServiceData(String riskScoringServiceData) {
        this.riskScoringServiceData = riskScoringServiceData;
    }

    public DICOOBJETJSONRiskContext withRiskScoringServiceData(String riskScoringServiceData) {
        this.riskScoringServiceData = riskScoringServiceData;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("riskScoringServiceId")
    public String getRiskScoringServiceId() {
        return riskScoringServiceId;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 2 digits. (1 byte)
     * 
     */
    @JsonProperty("riskScoringServiceId")
    public void setRiskScoringServiceId(String riskScoringServiceId) {
        this.riskScoringServiceId = riskScoringServiceId;
    }

    public DICOOBJETJSONRiskContext withRiskScoringServiceId(String riskScoringServiceId) {
        this.riskScoringServiceId = riskScoringServiceId;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("riskTreatmentStatus")
    public String getRiskTreatmentStatus() {
        return riskTreatmentStatus;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("riskTreatmentStatus")
    public void setRiskTreatmentStatus(String riskTreatmentStatus) {
        this.riskTreatmentStatus = riskTreatmentStatus;
    }

    public DICOOBJETJSONRiskContext withRiskTreatmentStatus(String riskTreatmentStatus) {
        this.riskTreatmentStatus = riskTreatmentStatus;
        return this;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("traExemptionIndicator")
    public String getTraExemptionIndicator() {
        return traExemptionIndicator;
    }

    /**
     *  1 alphanumeric character
     * 
     */
    @JsonProperty("traExemptionIndicator")
    public void setTraExemptionIndicator(String traExemptionIndicator) {
        this.traExemptionIndicator = traExemptionIndicator;
    }

    public DICOOBJETJSONRiskContext withTraExemptionIndicator(String traExemptionIndicator) {
        this.traExemptionIndicator = traExemptionIndicator;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("traScore")
    public String getTraScore() {
        return traScore;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("traScore")
    public void setTraScore(String traScore) {
        this.traScore = traScore;
    }

    public DICOOBJETJSONRiskContext withTraScore(String traScore) {
        this.traScore = traScore;
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

    public DICOOBJETJSONRiskContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONRiskContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("delegatedAuthenticationExemptionIndicator");
        sb.append('=');
        sb.append(((this.delegatedAuthenticationExemptionIndicator == null)?"<null>":this.delegatedAuthenticationExemptionIndicator));
        sb.append(',');
        sb.append("multiFactorAuthenticationExemptionIndicator");
        sb.append('=');
        sb.append(((this.multiFactorAuthenticationExemptionIndicator == null)?"<null>":this.multiFactorAuthenticationExemptionIndicator));
        sb.append(',');
        sb.append("riskAnalysisIndicatorsId");
        sb.append('=');
        sb.append(((this.riskAnalysisIndicatorsId == null)?"<null>":this.riskAnalysisIndicatorsId));
        sb.append(',');
        sb.append("riskAnalysisIndicatorsValue");
        sb.append('=');
        sb.append(((this.riskAnalysisIndicatorsValue == null)?"<null>":this.riskAnalysisIndicatorsValue));
        sb.append(',');
        sb.append("riskPipResponse");
        sb.append('=');
        sb.append(((this.riskPipResponse == null)?"<null>":this.riskPipResponse));
        sb.append(',');
        sb.append("riskRecommendation");
        sb.append('=');
        sb.append(((this.riskRecommendation == null)?"<null>":this.riskRecommendation));
        sb.append(',');
        sb.append("riskRulesId");
        sb.append('=');
        sb.append(((this.riskRulesId == null)?"<null>":this.riskRulesId));
        sb.append(',');
        sb.append("riskScoringServiceData");
        sb.append('=');
        sb.append(((this.riskScoringServiceData == null)?"<null>":this.riskScoringServiceData));
        sb.append(',');
        sb.append("riskScoringServiceId");
        sb.append('=');
        sb.append(((this.riskScoringServiceId == null)?"<null>":this.riskScoringServiceId));
        sb.append(',');
        sb.append("riskTreatmentStatus");
        sb.append('=');
        sb.append(((this.riskTreatmentStatus == null)?"<null>":this.riskTreatmentStatus));
        sb.append(',');
        sb.append("traExemptionIndicator");
        sb.append('=');
        sb.append(((this.traExemptionIndicator == null)?"<null>":this.traExemptionIndicator));
        sb.append(',');
        sb.append("traScore");
        sb.append('=');
        sb.append(((this.traScore == null)?"<null>":this.traScore));
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
        result = ((result* 31)+((this.multiFactorAuthenticationExemptionIndicator == null)? 0 :this.multiFactorAuthenticationExemptionIndicator.hashCode()));
        result = ((result* 31)+((this.riskAnalysisIndicatorsValue == null)? 0 :this.riskAnalysisIndicatorsValue.hashCode()));
        result = ((result* 31)+((this.riskScoringServiceId == null)? 0 :this.riskScoringServiceId.hashCode()));
        result = ((result* 31)+((this.riskAnalysisIndicatorsId == null)? 0 :this.riskAnalysisIndicatorsId.hashCode()));
        result = ((result* 31)+((this.riskScoringServiceData == null)? 0 :this.riskScoringServiceData.hashCode()));
        result = ((result* 31)+((this.riskPipResponse == null)? 0 :this.riskPipResponse.hashCode()));
        result = ((result* 31)+((this.delegatedAuthenticationExemptionIndicator == null)? 0 :this.delegatedAuthenticationExemptionIndicator.hashCode()));
        result = ((result* 31)+((this.traExemptionIndicator == null)? 0 :this.traExemptionIndicator.hashCode()));
        result = ((result* 31)+((this.riskTreatmentStatus == null)? 0 :this.riskTreatmentStatus.hashCode()));
        result = ((result* 31)+((this.riskRulesId == null)? 0 :this.riskRulesId.hashCode()));
        result = ((result* 31)+((this.traScore == null)? 0 :this.traScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.riskRecommendation == null)? 0 :this.riskRecommendation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONRiskContext) == false) {
            return false;
        }
        DICOOBJETJSONRiskContext rhs = ((DICOOBJETJSONRiskContext) other);
        return ((((((((((((((this.multiFactorAuthenticationExemptionIndicator == rhs.multiFactorAuthenticationExemptionIndicator)||((this.multiFactorAuthenticationExemptionIndicator!= null)&&this.multiFactorAuthenticationExemptionIndicator.equals(rhs.multiFactorAuthenticationExemptionIndicator)))&&((this.riskAnalysisIndicatorsValue == rhs.riskAnalysisIndicatorsValue)||((this.riskAnalysisIndicatorsValue!= null)&&this.riskAnalysisIndicatorsValue.equals(rhs.riskAnalysisIndicatorsValue))))&&((this.riskScoringServiceId == rhs.riskScoringServiceId)||((this.riskScoringServiceId!= null)&&this.riskScoringServiceId.equals(rhs.riskScoringServiceId))))&&((this.riskAnalysisIndicatorsId == rhs.riskAnalysisIndicatorsId)||((this.riskAnalysisIndicatorsId!= null)&&this.riskAnalysisIndicatorsId.equals(rhs.riskAnalysisIndicatorsId))))&&((this.riskScoringServiceData == rhs.riskScoringServiceData)||((this.riskScoringServiceData!= null)&&this.riskScoringServiceData.equals(rhs.riskScoringServiceData))))&&((this.riskPipResponse == rhs.riskPipResponse)||((this.riskPipResponse!= null)&&this.riskPipResponse.equals(rhs.riskPipResponse))))&&((this.delegatedAuthenticationExemptionIndicator == rhs.delegatedAuthenticationExemptionIndicator)||((this.delegatedAuthenticationExemptionIndicator!= null)&&this.delegatedAuthenticationExemptionIndicator.equals(rhs.delegatedAuthenticationExemptionIndicator))))&&((this.traExemptionIndicator == rhs.traExemptionIndicator)||((this.traExemptionIndicator!= null)&&this.traExemptionIndicator.equals(rhs.traExemptionIndicator))))&&((this.riskTreatmentStatus == rhs.riskTreatmentStatus)||((this.riskTreatmentStatus!= null)&&this.riskTreatmentStatus.equals(rhs.riskTreatmentStatus))))&&((this.riskRulesId == rhs.riskRulesId)||((this.riskRulesId!= null)&&this.riskRulesId.equals(rhs.riskRulesId))))&&((this.traScore == rhs.traScore)||((this.traScore!= null)&&this.traScore.equals(rhs.traScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.riskRecommendation == rhs.riskRecommendation)||((this.riskRecommendation!= null)&&this.riskRecommendation.equals(rhs.riskRecommendation))));
    }

}
