
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ImmediateActionCodset {

    APRV(null),
    DECL(null),
    RFST(null),
    RFPT(null);
    private final Object value;
    private final static Map<Object, ImmediateActionCodset> CONSTANTS = new HashMap<Object, ImmediateActionCodset>();

    static {
        for (ImmediateActionCodset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ImmediateActionCodset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ImmediateActionCodset fromValue(Object value) {
        ImmediateActionCodset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
