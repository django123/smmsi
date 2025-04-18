
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum BuyingMethodCodeset {

    INAP(null),
    BRWS(null);
    private final Object value;
    private final static Map<Object, BuyingMethodCodeset> CONSTANTS = new HashMap<Object, BuyingMethodCodeset>();

    static {
        for (BuyingMethodCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BuyingMethodCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static BuyingMethodCodeset fromValue(Object value) {
        BuyingMethodCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
