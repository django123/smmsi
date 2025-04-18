
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MerchantSchemeTokenizationIndicatorCodeset {

    COFT(null);
    private final Object value;
    private final static Map<Object, MerchantSchemeTokenizationIndicatorCodeset> CONSTANTS = new HashMap<Object, MerchantSchemeTokenizationIndicatorCodeset>();

    static {
        for (MerchantSchemeTokenizationIndicatorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MerchantSchemeTokenizationIndicatorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MerchantSchemeTokenizationIndicatorCodeset fromValue(Object value) {
        MerchantSchemeTokenizationIndicatorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
