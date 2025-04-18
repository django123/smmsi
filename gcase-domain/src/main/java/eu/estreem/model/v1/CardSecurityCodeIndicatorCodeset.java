
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardSecurityCodeIndicatorCodeset {

    CVDC(null);
    private final Object value;
    private final static Map<Object, CardSecurityCodeIndicatorCodeset> CONSTANTS = new HashMap<Object, CardSecurityCodeIndicatorCodeset>();

    static {
        for (CardSecurityCodeIndicatorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardSecurityCodeIndicatorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardSecurityCodeIndicatorCodeset fromValue(Object value) {
        CardSecurityCodeIndicatorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
