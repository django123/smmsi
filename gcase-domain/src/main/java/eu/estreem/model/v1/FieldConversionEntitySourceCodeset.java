
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum FieldConversionEntitySourceCodeset {

    NTWK(null),
    VISA(null),
    MACD(null),
    JCB_0(null),
    DISC(null),
    UPIC(null),
    OTHR(null);
    private final Object value;
    private final static Map<Object, FieldConversionEntitySourceCodeset> CONSTANTS = new HashMap<Object, FieldConversionEntitySourceCodeset>();

    static {
        for (FieldConversionEntitySourceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FieldConversionEntitySourceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static FieldConversionEntitySourceCodeset fromValue(Object value) {
        FieldConversionEntitySourceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
