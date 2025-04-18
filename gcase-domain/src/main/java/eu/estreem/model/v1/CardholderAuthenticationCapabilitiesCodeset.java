
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardholderAuthenticationCapabilitiesCodeset {

    NOEA(null),
    AUTP(null),
    EAOS(null),
    OTHR(null),
    RFPU(null);
    private final Object value;
    private final static Map<Object, CardholderAuthenticationCapabilitiesCodeset> CONSTANTS = new HashMap<Object, CardholderAuthenticationCapabilitiesCodeset>();

    static {
        for (CardholderAuthenticationCapabilitiesCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardholderAuthenticationCapabilitiesCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardholderAuthenticationCapabilitiesCodeset fromValue(Object value) {
        CardholderAuthenticationCapabilitiesCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
