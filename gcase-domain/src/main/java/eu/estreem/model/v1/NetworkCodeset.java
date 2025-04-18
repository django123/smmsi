
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum NetworkCodeset {

    CBFR(null),
    MACD(null),
    VISA(null),
    DISC(null),
    JCB_0(null),
    UPIC(null),
    REFU(null),
    INTR(null);
    private final Object value;
    private final static Map<Object, NetworkCodeset> CONSTANTS = new HashMap<Object, NetworkCodeset>();

    static {
        for (NetworkCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NetworkCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static NetworkCodeset fromValue(Object value) {
        NetworkCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
