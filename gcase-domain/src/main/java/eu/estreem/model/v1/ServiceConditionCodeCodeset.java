
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ServiceConditionCodeCodeset {

    STDR(null),
    CUNP(null),
    UTAR(null),
    MESU(null),
    CPCA(null),
    TLDR(null),
    MTOR(null),
    CUIV(null),
    SUFR(null),
    SERE(null),
    CUTE(null),
    UTUR(null),
    FLCO(null),
    MAOR(null),
    TLOR(null);
    private final Object value;
    private final static Map<Object, ServiceConditionCodeCodeset> CONSTANTS = new HashMap<Object, ServiceConditionCodeCodeset>();

    static {
        for (ServiceConditionCodeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ServiceConditionCodeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ServiceConditionCodeCodeset fromValue(Object value) {
        ServiceConditionCodeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
