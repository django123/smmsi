
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardDataEntryModeCodeset {

    NOTS(null),
    MANU(null),
    MAGS(null),
    OPTI(null),
    CHON(null),
    CUCD(null),
    FILE(null),
    CHFM(null),
    CHFG(null),
    SERV(null),
    MAGO(null),
    CUMD(null),
    NOTS_(null),
    MAGS_(null),
    CCEC(null),
    CCMD(null),
    ICCR(null),
    MAAR(null),
    PVBS(null);
    private final Object value;
    private final static Map<Object, CardDataEntryModeCodeset> CONSTANTS = new HashMap<Object, CardDataEntryModeCodeset>();

    static {
        for (CardDataEntryModeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardDataEntryModeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardDataEntryModeCodeset fromValue(Object value) {
        CardDataEntryModeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
