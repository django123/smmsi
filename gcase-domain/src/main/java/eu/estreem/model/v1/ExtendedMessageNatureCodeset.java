
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ExtendedMessageNatureCodeset {

    PRNT(null),
    DISP(null),
    PRDI(null),
    PRCO(null),
    DICO(null),
    PDCO(null),
    PRAO(null),
    DIAO(null),
    PDAO(null),
    PRAC(null),
    DIAC(null),
    PDAC(null);
    private final Object value;
    private final static Map<Object, ExtendedMessageNatureCodeset> CONSTANTS = new HashMap<Object, ExtendedMessageNatureCodeset>();

    static {
        for (ExtendedMessageNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ExtendedMessageNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ExtendedMessageNatureCodeset fromValue(Object value) {
        ExtendedMessageNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
