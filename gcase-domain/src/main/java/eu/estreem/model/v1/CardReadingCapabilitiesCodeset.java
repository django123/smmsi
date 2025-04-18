
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardReadingCapabilitiesCodeset {

    UNKW(null),
    MANU(null),
    MAGS(null),
    CCEC(null),
    CCMC(null),
    ICCR(null),
    KEYI(null),
    CCCR(null),
    REPV(null),
    NCEC(null),
    PBAS(null);
    private final Object value;
    private final static Map<Object, CardReadingCapabilitiesCodeset> CONSTANTS = new HashMap<Object, CardReadingCapabilitiesCodeset>();

    static {
        for (CardReadingCapabilitiesCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardReadingCapabilitiesCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardReadingCapabilitiesCodeset fromValue(Object value) {
        CardReadingCapabilitiesCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
