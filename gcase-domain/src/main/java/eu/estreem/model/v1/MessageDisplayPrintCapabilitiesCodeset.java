
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MessageDisplayPrintCapabilitiesCodeset {

    UNKW(null),
    NONE(null),
    PRNT(null),
    DISP(null),
    PRDI(null);
    private final Object value;
    private final static Map<Object, MessageDisplayPrintCapabilitiesCodeset> CONSTANTS = new HashMap<Object, MessageDisplayPrintCapabilitiesCodeset>();

    static {
        for (MessageDisplayPrintCapabilitiesCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MessageDisplayPrintCapabilitiesCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MessageDisplayPrintCapabilitiesCodeset fromValue(Object value) {
        MessageDisplayPrintCapabilitiesCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
