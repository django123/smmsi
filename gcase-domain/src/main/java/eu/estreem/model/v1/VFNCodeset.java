
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum VFNCodeset {

    VERI(null),
    FAIL(null),
    NOTP(null);
    private final Object value;
    private final static Map<Object, VFNCodeset> CONSTANTS = new HashMap<Object, VFNCodeset>();

    static {
        for (VFNCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    VFNCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static VFNCodeset fromValue(Object value) {
        VFNCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
