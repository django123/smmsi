
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum COFActionCodeset {

    ADDC(null),
    KEEP(null);
    private final Object value;
    private final static Map<Object, COFActionCodeset> CONSTANTS = new HashMap<Object, COFActionCodeset>();

    static {
        for (COFActionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    COFActionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static COFActionCodeset fromValue(Object value) {
        COFActionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
