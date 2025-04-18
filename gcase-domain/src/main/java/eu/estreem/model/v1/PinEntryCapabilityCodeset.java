
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PinEntryCapabilityCodeset {

    NOTS(null),
    TACP(null),
    TNOP(null),
    MPPI(null);
    private final Object value;
    private final static Map<Object, PinEntryCapabilityCodeset> CONSTANTS = new HashMap<Object, PinEntryCapabilityCodeset>();

    static {
        for (PinEntryCapabilityCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PinEntryCapabilityCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PinEntryCapabilityCodeset fromValue(Object value) {
        PinEntryCapabilityCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
