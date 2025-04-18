
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardLevelCodeset {

    PRIV(null),
    TEST(null),
    PAIU(null),
    RETU(null),
    PARE(null);
    private final Object value;
    private final static Map<Object, CardLevelCodeset> CONSTANTS = new HashMap<Object, CardLevelCodeset>();

    static {
        for (CardLevelCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardLevelCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardLevelCodeset fromValue(Object value) {
        CardLevelCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
