
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum FeesNatureCodeset {

    ITPC(null),
    OISA(null),
    ITMA(null),
    ITMI(null);
    private final Object value;
    private final static Map<Object, FeesNatureCodeset> CONSTANTS = new HashMap<Object, FeesNatureCodeset>();

    static {
        for (FeesNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FeesNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static FeesNatureCodeset fromValue(Object value) {
        FeesNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
