
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PinVerificationResultCodeset {

    __EMPTY__(null);
    private final Object value;
    private final static Map<Object, PinVerificationResultCodeset> CONSTANTS = new HashMap<Object, PinVerificationResultCodeset>();

    static {
        for (PinVerificationResultCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PinVerificationResultCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PinVerificationResultCodeset fromValue(Object value) {
        PinVerificationResultCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
