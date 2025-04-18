
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DebitCreditCodeset {

    CRDT(null),
    DEBT(null);
    private final Object value;
    private final static Map<Object, DebitCreditCodeset> CONSTANTS = new HashMap<Object, DebitCreditCodeset>();

    static {
        for (DebitCreditCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DebitCreditCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static DebitCreditCodeset fromValue(Object value) {
        DebitCreditCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
