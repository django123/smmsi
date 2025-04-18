
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardUsageCodeset {

    PRIV(null),
    TEST(null),
    BANK(null);
    private final Object value;
    private final static Map<Object, CardUsageCodeset> CONSTANTS = new HashMap<Object, CardUsageCodeset>();

    static {
        for (CardUsageCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardUsageCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardUsageCodeset fromValue(Object value) {
        CardUsageCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
