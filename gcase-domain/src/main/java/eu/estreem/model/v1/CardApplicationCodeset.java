
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardApplicationCodeset {

    EMVC(null),
    CIMG(null);
    private final Object value;
    private final static Map<Object, CardApplicationCodeset> CONSTANTS = new HashMap<Object, CardApplicationCodeset>();

    static {
        for (CardApplicationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardApplicationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardApplicationCodeset fromValue(Object value) {
        CardApplicationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
