
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum RecoveryModeCodeset {

    NORE(null),
    ISSU(null),
    INSU(null),
    ACQU(null),
    AUTA(null),
    CLDE(null);
    private final Object value;
    private final static Map<Object, RecoveryModeCodeset> CONSTANTS = new HashMap<Object, RecoveryModeCodeset>();

    static {
        for (RecoveryModeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RecoveryModeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static RecoveryModeCodeset fromValue(Object value) {
        RecoveryModeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
