
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum TraceabilityServiceCodeset {

    QUAL(null),
    ICCL(null),
    SFCL(null);
    private final Object value;
    private final static Map<Object, TraceabilityServiceCodeset> CONSTANTS = new HashMap<Object, TraceabilityServiceCodeset>();

    static {
        for (TraceabilityServiceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TraceabilityServiceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static TraceabilityServiceCodeset fromValue(Object value) {
        TraceabilityServiceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
