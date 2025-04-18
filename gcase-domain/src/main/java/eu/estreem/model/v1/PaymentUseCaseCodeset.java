
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PaymentUseCaseCodeset {

    SNGL(null),
    RCFX(null),
    INST(null),
    SHIP(null),
    RCOT(null),
    RERE(null),
    PREA(null),
    PTRL(null);
    private final Object value;
    private final static Map<Object, PaymentUseCaseCodeset> CONSTANTS = new HashMap<Object, PaymentUseCaseCodeset>();

    static {
        for (PaymentUseCaseCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PaymentUseCaseCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PaymentUseCaseCodeset fromValue(Object value) {
        PaymentUseCaseCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
