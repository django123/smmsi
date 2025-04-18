
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum EncryptionAlgorithmCodeset {

    _3_DES(null),
    A_128(null),
    A_192(null),
    A_256(null);
    private final Object value;
    private final static Map<Object, EncryptionAlgorithmCodeset> CONSTANTS = new HashMap<Object, EncryptionAlgorithmCodeset>();

    static {
        for (EncryptionAlgorithmCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EncryptionAlgorithmCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static EncryptionAlgorithmCodeset fromValue(Object value) {
        EncryptionAlgorithmCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
