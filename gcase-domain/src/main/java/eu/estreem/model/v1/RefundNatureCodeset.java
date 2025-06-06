
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum RefundNatureCodeset {

    CLNT(null),
    ESTB(null),
    INSU(null),
    NPS_0(null);
    private final Object value;
    private final static Map<Object, RefundNatureCodeset> CONSTANTS = new HashMap<Object, RefundNatureCodeset>();

    static {
        for (RefundNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RefundNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static RefundNatureCodeset fromValue(Object value) {
        RefundNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
