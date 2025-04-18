
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SchemeFeesAmountNatureCodeset {

    FIXD(null),
    MINI(null),
    MAXI(null);
    private final Object value;
    private final static Map<Object, SchemeFeesAmountNatureCodeset> CONSTANTS = new HashMap<Object, SchemeFeesAmountNatureCodeset>();

    static {
        for (SchemeFeesAmountNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SchemeFeesAmountNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SchemeFeesAmountNatureCodeset fromValue(Object value) {
        SchemeFeesAmountNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
