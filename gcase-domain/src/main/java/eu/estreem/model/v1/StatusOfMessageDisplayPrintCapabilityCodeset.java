
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum StatusOfMessageDisplayPrintCapabilityCodeset {

    UNKW(null),
    NONE(null),
    PRTU(null),
    DISU(null),
    PADU(null);
    private final Object value;
    private final static Map<Object, StatusOfMessageDisplayPrintCapabilityCodeset> CONSTANTS = new HashMap<Object, StatusOfMessageDisplayPrintCapabilityCodeset>();

    static {
        for (StatusOfMessageDisplayPrintCapabilityCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StatusOfMessageDisplayPrintCapabilityCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static StatusOfMessageDisplayPrintCapabilityCodeset fromValue(Object value) {
        StatusOfMessageDisplayPrintCapabilityCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
