
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PinBlockFormatCodeset {

    ISO_0(null),
    ISO_1(null),
    ISO_2(null),
    ISO_3(null),
    ISO_4(null),
    ISO_5(null);
    private final Object value;
    private final static Map<Object, PinBlockFormatCodeset> CONSTANTS = new HashMap<Object, PinBlockFormatCodeset>();

    static {
        for (PinBlockFormatCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PinBlockFormatCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PinBlockFormatCodeset fromValue(Object value) {
        PinBlockFormatCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
