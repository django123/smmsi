
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PaymentProtocolCategoryCodeset {

    CB_2_A(null);
    private final Object value;
    private final static Map<Object, PaymentProtocolCategoryCodeset> CONSTANTS = new HashMap<Object, PaymentProtocolCategoryCodeset>();

    static {
        for (PaymentProtocolCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PaymentProtocolCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PaymentProtocolCategoryCodeset fromValue(Object value) {
        PaymentProtocolCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
