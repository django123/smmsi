
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SchemeFeesModeCodeset {

    STDD(null),
    REGN(null),
    TIER(null);
    private final Object value;
    private final static Map<Object, SchemeFeesModeCodeset> CONSTANTS = new HashMap<Object, SchemeFeesModeCodeset>();

    static {
        for (SchemeFeesModeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SchemeFeesModeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SchemeFeesModeCodeset fromValue(Object value) {
        SchemeFeesModeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
