
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum NextActionCodeset {

    NONE(null),
    RFPU(null);
    private final Object value;
    private final static Map<Object, NextActionCodeset> CONSTANTS = new HashMap<Object, NextActionCodeset>();

    static {
        for (NextActionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NextActionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static NextActionCodeset fromValue(Object value) {
        NextActionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
