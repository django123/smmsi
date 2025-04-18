
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardSecurityCodePresenceCodeset {

    NSTM(null),
    CSCP(null),
    CSPI(null),
    DCVP(null),
    DCVF(null),
    CSNI(null);
    private final Object value;
    private final static Map<Object, CardSecurityCodePresenceCodeset> CONSTANTS = new HashMap<Object, CardSecurityCodePresenceCodeset>();

    static {
        for (CardSecurityCodePresenceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardSecurityCodePresenceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardSecurityCodePresenceCodeset fromValue(Object value) {
        CardSecurityCodePresenceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
