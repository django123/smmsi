
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MessageFunctionCodeset {

    PAYMENT_AUTORISATION_REQUEST(null),
    PAYMENT_AUTORISATION_RESPONSE(null),
    CARD_INFORMATION_REQUEST(null),
    CARD_INFORMATION_RESPONSE(null),
    FRAUD_FIRST_CONTROL_REQUEST(null),
    FRAUD_FIRST_CONTROL_RESPONSE(null),
    FRAUD_SECOND_CONTROL_REQUEST(null),
    FRAUD_SECOND_CONTROL_RESPONSE(null),
    FRAUD_ADVICE(null),
    INFOPAN_REQUEST(null),
    INFOPAN_RESPONSE(null),
    AUTORISATION_EVENT(null),
    REVERSAL_EVENT(null);
    private final Object value;
    private final static Map<Object, MessageFunctionCodeset> CONSTANTS = new HashMap<Object, MessageFunctionCodeset>();

    static {
        for (MessageFunctionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MessageFunctionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MessageFunctionCodeset fromValue(Object value) {
        MessageFunctionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
