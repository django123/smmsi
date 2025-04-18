
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MaskGeneratorAlgorithmCodeset {

    MGF_1_SHA_256(null),
    MGF_1_SHA_384(null),
    MGF_1_SHA_512(null),
    MGF_1_SHA_1(null);
    private final Object value;
    private final static Map<Object, MaskGeneratorAlgorithmCodeset> CONSTANTS = new HashMap<Object, MaskGeneratorAlgorithmCodeset>();

    static {
        for (MaskGeneratorAlgorithmCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MaskGeneratorAlgorithmCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MaskGeneratorAlgorithmCodeset fromValue(Object value) {
        MaskGeneratorAlgorithmCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
