
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MastercardRegionCodeset {

    ASPA(null),
    CNDA(null),
    DMST(null),
    EUNS(null),
    EUSE(null),
    LACA(null),
    EMEA(null),
    USAM(null);
    private final Object value;
    private final static Map<Object, MastercardRegionCodeset> CONSTANTS = new HashMap<Object, MastercardRegionCodeset>();

    static {
        for (MastercardRegionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MastercardRegionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MastercardRegionCodeset fromValue(Object value) {
        MastercardRegionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
