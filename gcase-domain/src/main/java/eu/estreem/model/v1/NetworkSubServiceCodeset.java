
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum NetworkSubServiceCodeset {

    NNRISX(null),
    NNRISU(null);
    private final Object value;
    private final static Map<Object, NetworkSubServiceCodeset> CONSTANTS = new HashMap<Object, NetworkSubServiceCodeset>();

    static {
        for (NetworkSubServiceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NetworkSubServiceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static NetworkSubServiceCodeset fromValue(Object value) {
        NetworkSubServiceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
