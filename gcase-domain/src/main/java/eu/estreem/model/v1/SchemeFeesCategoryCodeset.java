
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum SchemeFeesCategoryCodeset {

    QTTY(null),
    AMNT(null);
    private final Object value;
    private final static Map<Object, SchemeFeesCategoryCodeset> CONSTANTS = new HashMap<Object, SchemeFeesCategoryCodeset>();

    static {
        for (SchemeFeesCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SchemeFeesCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static SchemeFeesCategoryCodeset fromValue(Object value) {
        SchemeFeesCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
