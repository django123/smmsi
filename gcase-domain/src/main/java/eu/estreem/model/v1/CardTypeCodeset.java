
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardTypeCodeset {

    CRDT(null),
    DEBT(null),
    CTPP(null),
    CTUN(null);
    private final Object value;
    private final static Map<Object, CardTypeCodeset> CONSTANTS = new HashMap<Object, CardTypeCodeset>();

    static {
        for (CardTypeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardTypeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardTypeCodeset fromValue(Object value) {
        CardTypeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
