
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
    "walletId",
    "walletNomenclature"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONWallet implements Serializable
{

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("walletId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 3 digits")
    private String walletId;
    @JsonProperty("walletNomenclature")
    private List<WalletNomenclatureCodeset> walletNomenclature = new ArrayList<WalletNomenclatureCodeset>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1193017908049715580L;

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("walletId")
    public String getWalletId() {
        return walletId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("walletId")
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public DICOOBJETJSONWallet withWalletId(String walletId) {
        this.walletId = walletId;
        return this;
    }

    @JsonProperty("walletNomenclature")
    public List<WalletNomenclatureCodeset> getWalletNomenclature() {
        return walletNomenclature;
    }

    @JsonProperty("walletNomenclature")
    public void setWalletNomenclature(List<WalletNomenclatureCodeset> walletNomenclature) {
        this.walletNomenclature = walletNomenclature;
    }

    public DICOOBJETJSONWallet withWalletNomenclature(List<WalletNomenclatureCodeset> walletNomenclature) {
        this.walletNomenclature = walletNomenclature;
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

    public DICOOBJETJSONWallet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONWallet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("walletId");
        sb.append('=');
        sb.append(((this.walletId == null)?"<null>":this.walletId));
        sb.append(',');
        sb.append("walletNomenclature");
        sb.append('=');
        sb.append(((this.walletNomenclature == null)?"<null>":this.walletNomenclature));
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
        result = ((result* 31)+((this.walletNomenclature == null)? 0 :this.walletNomenclature.hashCode()));
        result = ((result* 31)+((this.walletId == null)? 0 :this.walletId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONWallet) == false) {
            return false;
        }
        DICOOBJETJSONWallet rhs = ((DICOOBJETJSONWallet) other);
        return ((((this.walletNomenclature == rhs.walletNomenclature)||((this.walletNomenclature!= null)&&this.walletNomenclature.equals(rhs.walletNomenclature)))&&((this.walletId == rhs.walletId)||((this.walletId!= null)&&this.walletId.equals(rhs.walletId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
