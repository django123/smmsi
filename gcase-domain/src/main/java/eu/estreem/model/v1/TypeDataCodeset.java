
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum TypeDataCodeset {

    COMM(null);
    private final Object value;
    private final static Map<Object, TypeDataCodeset> CONSTANTS = new HashMap<Object, TypeDataCodeset>();

    static {
        for (TypeDataCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TypeDataCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static TypeDataCodeset fromValue(Object value) {
        TypeDataCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
