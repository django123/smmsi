
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MessageToTransactionInitiatorCtrlCharacterCodeset {

    RSVD(null),
    PRNT(null),
    DSPL(null),
    PRDS(null),
    PRCO(null),
    DSCO(null),
    PDCO(null),
    PFAO(null),
    DFAO(null),
    PDAO(null),
    PRAC(null),
    DIAC(null),
    PDAC(null),
    REPV(null);
    private final Object value;
    private final static Map<Object, MessageToTransactionInitiatorCtrlCharacterCodeset> CONSTANTS = new HashMap<Object, MessageToTransactionInitiatorCtrlCharacterCodeset>();

    static {
        for (MessageToTransactionInitiatorCtrlCharacterCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MessageToTransactionInitiatorCtrlCharacterCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MessageToTransactionInitiatorCtrlCharacterCodeset fromValue(Object value) {
        MessageToTransactionInitiatorCtrlCharacterCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
