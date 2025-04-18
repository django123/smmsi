
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DisputeQualificationCodeset {

    CONT(null),
    COFA(null),
    LITC(null),
    OPME(null),
    PEVO(null),
    REGU(null);
    private final Object value;
    private final static Map<Object, DisputeQualificationCodeset> CONSTANTS = new HashMap<Object, DisputeQualificationCodeset>();

    static {
        for (DisputeQualificationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DisputeQualificationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static DisputeQualificationCodeset fromValue(Object value) {
        DisputeQualificationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
