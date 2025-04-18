
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AcknowledgementRequestIndicatorCodeset {

    NOAR(null),
    ACRE(null),
    ARET(null),
    POAC(null),
    PAAT(null),
    NARR(null),
    NAWR(null),
    NAET(null);
    private final Object value;
    private final static Map<Object, AcknowledgementRequestIndicatorCodeset> CONSTANTS = new HashMap<Object, AcknowledgementRequestIndicatorCodeset>();

    static {
        for (AcknowledgementRequestIndicatorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AcknowledgementRequestIndicatorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AcknowledgementRequestIndicatorCodeset fromValue(Object value) {
        AcknowledgementRequestIndicatorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
