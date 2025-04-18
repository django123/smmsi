
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum IssuerPlaceCodeset {

    ENPL(null),
    HRPL(null);
    private final Object value;
    private final static Map<Object, IssuerPlaceCodeset> CONSTANTS = new HashMap<Object, IssuerPlaceCodeset>();

    static {
        for (IssuerPlaceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IssuerPlaceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static IssuerPlaceCodeset fromValue(Object value) {
        IssuerPlaceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
