
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum IssuerZoneCodeset {

    NATI(null),
    ETRA(null);
    private final Object value;
    private final static Map<Object, IssuerZoneCodeset> CONSTANTS = new HashMap<Object, IssuerZoneCodeset>();

    static {
        for (IssuerZoneCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IssuerZoneCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static IssuerZoneCodeset fromValue(Object value) {
        IssuerZoneCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
