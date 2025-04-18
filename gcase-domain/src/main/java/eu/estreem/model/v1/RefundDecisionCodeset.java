
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum RefundDecisionCodeset {

    REFU(null),
    NORE(null),
    PARE(null),
    DERM(null);
    private final Object value;
    private final static Map<Object, RefundDecisionCodeset> CONSTANTS = new HashMap<Object, RefundDecisionCodeset>();

    static {
        for (RefundDecisionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RefundDecisionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static RefundDecisionCodeset fromValue(Object value) {
        RefundDecisionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
