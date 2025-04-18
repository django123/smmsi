
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardholderPickUpCapabilitiesCodeset {

    NONE(null),
    PIUP(null);
    private final Object value;
    private final static Map<Object, CardholderPickUpCapabilitiesCodeset> CONSTANTS = new HashMap<Object, CardholderPickUpCapabilitiesCodeset>();

    static {
        for (CardholderPickUpCapabilitiesCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardholderPickUpCapabilitiesCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardholderPickUpCapabilitiesCodeset fromValue(Object value) {
        CardholderPickUpCapabilitiesCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
