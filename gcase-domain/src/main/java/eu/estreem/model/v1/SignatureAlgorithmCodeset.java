
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SignatureAlgorithmCodeset {

    RS_256(null),
    RS_384(null),
    RS_512(null),
    ES_256(null),
    ES_384(null),
    ES_512(null),
    PS_256(null),
    PS_384(null),
    PS_512(null);
    private final Object value;
    private final static Map<Object, SignatureAlgorithmCodeset> CONSTANTS = new HashMap<Object, SignatureAlgorithmCodeset>();

    static {
        for (SignatureAlgorithmCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SignatureAlgorithmCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SignatureAlgorithmCodeset fromValue(Object value) {
        SignatureAlgorithmCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
