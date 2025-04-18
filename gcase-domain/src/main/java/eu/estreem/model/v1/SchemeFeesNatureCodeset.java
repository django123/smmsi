
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SchemeFeesNatureCodeset {

    OPER(null),
    LNCE(null),
    PROC(null),
    SUBS(null),
    PNLT(null);
    private final Object value;
    private final static Map<Object, SchemeFeesNatureCodeset> CONSTANTS = new HashMap<Object, SchemeFeesNatureCodeset>();

    static {
        for (SchemeFeesNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SchemeFeesNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SchemeFeesNatureCodeset fromValue(Object value) {
        SchemeFeesNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
