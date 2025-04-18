
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardProductCodeCodeset {

    CNAR(null),
    CNPR(null),
    CNAP(null),
    PRAS(null),
    CPAS(null),
    CASM(null);
    private final Object value;
    private final static Map<Object, CardProductCodeCodeset> CONSTANTS = new HashMap<Object, CardProductCodeCodeset>();

    static {
        for (CardProductCodeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardProductCodeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardProductCodeCodeset fromValue(Object value) {
        CardProductCodeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
