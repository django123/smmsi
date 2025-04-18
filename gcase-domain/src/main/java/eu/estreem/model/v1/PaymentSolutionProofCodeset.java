
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PaymentSolutionProofCodeset {

    EMV_0(null),
    SECM(null);
    private final Object value;
    private final static Map<Object, PaymentSolutionProofCodeset> CONSTANTS = new HashMap<Object, PaymentSolutionProofCodeset>();

    static {
        for (PaymentSolutionProofCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PaymentSolutionProofCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PaymentSolutionProofCodeset fromValue(Object value) {
        PaymentSolutionProofCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
