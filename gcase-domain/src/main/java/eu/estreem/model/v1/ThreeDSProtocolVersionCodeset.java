
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ThreeDSProtocolVersionCodeset {

    UNKW(null),
    _3_DS_1(null),
    _3_DS_2(null);
    private final Object value;
    private final static Map<Object, ThreeDSProtocolVersionCodeset> CONSTANTS = new HashMap<Object, ThreeDSProtocolVersionCodeset>();

    static {
        for (ThreeDSProtocolVersionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ThreeDSProtocolVersionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ThreeDSProtocolVersionCodeset fromValue(Object value) {
        ThreeDSProtocolVersionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
