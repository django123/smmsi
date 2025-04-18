
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SecurityErrorCodeset {

    ECKN(null),
    ECIE(null),
    ECUL(null),
    ECKE(null),
    ECSD(null),
    ECRE(null);
    private final Object value;
    private final static Map<Object, SecurityErrorCodeset> CONSTANTS = new HashMap<Object, SecurityErrorCodeset>();

    static {
        for (SecurityErrorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SecurityErrorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SecurityErrorCodeset fromValue(Object value) {
        SecurityErrorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
