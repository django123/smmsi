
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SystemAuthenticatingTheCardholderCodeset {

    NOAT(null),
    ICCR(null),
    TERM(null),
    AUTP(null),
    ACPT(null),
    OTHR(null),
    RFPU(null);
    private final Object value;
    private final static Map<Object, SystemAuthenticatingTheCardholderCodeset> CONSTANTS = new HashMap<Object, SystemAuthenticatingTheCardholderCodeset>();

    static {
        for (SystemAuthenticatingTheCardholderCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SystemAuthenticatingTheCardholderCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SystemAuthenticatingTheCardholderCodeset fromValue(Object value) {
        SystemAuthenticatingTheCardholderCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
