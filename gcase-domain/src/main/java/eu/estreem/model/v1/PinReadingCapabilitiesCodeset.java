
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PinReadingCapabilitiesCodeset {

    NONE(null),
    UNKW(null),
    FOCH(null),
    FICH(null),
    SICH(null),
    SECH(null),
    EICH(null),
    NICH(null);
    private final Object value;
    private final static Map<Object, PinReadingCapabilitiesCodeset> CONSTANTS = new HashMap<Object, PinReadingCapabilitiesCodeset>();

    static {
        for (PinReadingCapabilitiesCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PinReadingCapabilitiesCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PinReadingCapabilitiesCodeset fromValue(Object value) {
        PinReadingCapabilitiesCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
