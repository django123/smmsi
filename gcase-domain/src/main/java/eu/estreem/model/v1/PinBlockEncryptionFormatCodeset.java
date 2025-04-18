
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PinBlockEncryptionFormatCodeset {

    __EMPTY__(null);
    private final Object value;
    private final static Map<Object, PinBlockEncryptionFormatCodeset> CONSTANTS = new HashMap<Object, PinBlockEncryptionFormatCodeset>();

    static {
        for (PinBlockEncryptionFormatCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PinBlockEncryptionFormatCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static PinBlockEncryptionFormatCodeset fromValue(Object value) {
        PinBlockEncryptionFormatCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
