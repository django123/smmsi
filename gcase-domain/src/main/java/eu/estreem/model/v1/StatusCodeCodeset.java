
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum StatusCodeCodeset {

    INCO(null),
    COMP(null),
    ANLY(null),
    DERM(null),
    RECA(null),
    CLOS(null),
    REOP(null),
    PURG(null),
    TBPR(null),
    WAIT(null),
    TERM(null);
    private final Object value;
    private final static Map<Object, StatusCodeCodeset> CONSTANTS = new HashMap<Object, StatusCodeCodeset>();

    static {
        for (StatusCodeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StatusCodeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static StatusCodeCodeset fromValue(Object value) {
        StatusCodeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
