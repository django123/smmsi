
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PaymentProtocolVersionCodeset {

    V_11_X(null),
    V_150(null),
    V_160(null),
    V_165(null);
    private final Object value;
    private final static Map<Object, PaymentProtocolVersionCodeset> CONSTANTS = new HashMap<Object, PaymentProtocolVersionCodeset>();

    static {
        for (PaymentProtocolVersionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PaymentProtocolVersionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PaymentProtocolVersionCodeset fromValue(Object value) {
        PaymentProtocolVersionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
