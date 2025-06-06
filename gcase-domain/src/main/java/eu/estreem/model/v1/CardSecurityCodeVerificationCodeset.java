
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardSecurityCodeVerificationCodeset {

    VRCR(null),
    VRVR(null);
    private final Object value;
    private final static Map<Object, CardSecurityCodeVerificationCodeset> CONSTANTS = new HashMap<Object, CardSecurityCodeVerificationCodeset>();

    static {
        for (CardSecurityCodeVerificationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardSecurityCodeVerificationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardSecurityCodeVerificationCodeset fromValue(Object value) {
        CardSecurityCodeVerificationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
