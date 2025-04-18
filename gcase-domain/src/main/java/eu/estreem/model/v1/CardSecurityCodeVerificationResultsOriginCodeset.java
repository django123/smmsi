
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardSecurityCodeVerificationResultsOriginCodeset {

    CISS(null),
    STIN(null);
    private final Object value;
    private final static Map<Object, CardSecurityCodeVerificationResultsOriginCodeset> CONSTANTS = new HashMap<Object, CardSecurityCodeVerificationResultsOriginCodeset>();

    static {
        for (CardSecurityCodeVerificationResultsOriginCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardSecurityCodeVerificationResultsOriginCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardSecurityCodeVerificationResultsOriginCodeset fromValue(Object value) {
        CardSecurityCodeVerificationResultsOriginCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
