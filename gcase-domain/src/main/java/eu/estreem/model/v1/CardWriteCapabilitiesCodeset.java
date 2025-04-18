
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardWriteCapabilitiesCodeset {

    CTUN(null),
    NCWC(null),
    MAGS(null),
    ICCR(null),
    RFPU(null);
    private final Object value;
    private final static Map<Object, CardWriteCapabilitiesCodeset> CONSTANTS = new HashMap<Object, CardWriteCapabilitiesCodeset>();

    static {
        for (CardWriteCapabilitiesCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardWriteCapabilitiesCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardWriteCapabilitiesCodeset fromValue(Object value) {
        CardWriteCapabilitiesCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
