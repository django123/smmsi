
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum NetworkServiceCodeset {

    UNKN(null),
    INWR(null),
    ONUS(null),
    ACIN(null),
    GATE(null),
    ISAS(null),
    AGAT(null),
    IGAT(null),
    PTCS(null),
    DETO(null),
    ESAR(null),
    ESIR(null);
    private final Object value;
    private final static Map<Object, NetworkServiceCodeset> CONSTANTS = new HashMap<Object, NetworkServiceCodeset>();

    static {
        for (NetworkServiceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NetworkServiceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static NetworkServiceCodeset fromValue(Object value) {
        NetworkServiceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
