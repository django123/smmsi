
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AcceptanceChannelCodeset {

    FFPM(null),
    RMPM(null),
    AIPM(null),
    TLPM(null),
    UTPM(null),
    QCPM(null),
    PAPM(null),
    FTPM(null);
    private final Object value;
    private final static Map<Object, AcceptanceChannelCodeset> CONSTANTS = new HashMap<Object, AcceptanceChannelCodeset>();

    static {
        for (AcceptanceChannelCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AcceptanceChannelCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AcceptanceChannelCodeset fromValue(Object value) {
        AcceptanceChannelCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
