
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DomainIndicatorCodeset {

    ACQU(null),
    ISSU(null);
    private final Object value;
    private final static Map<Object, DomainIndicatorCodeset> CONSTANTS = new HashMap<Object, DomainIndicatorCodeset>();

    static {
        for (DomainIndicatorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DomainIndicatorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static DomainIndicatorCodeset fromValue(Object value) {
        DomainIndicatorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
