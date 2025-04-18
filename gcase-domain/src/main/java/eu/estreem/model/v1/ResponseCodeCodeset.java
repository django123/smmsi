
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ResponseCodeCodeset {

    APPV(null),
    RFCI(null),
    INMC(null),
    PKUP(null),
    DNHR(null),
    EROR(null),
    PUPC(null),
    HRID(null),
    APPA(null),
    INVD(null),
    IAMT(null),
    ICDN(null),
    NOSI(null),
    CSCL(null),
    RETS(null),
    IRSP(null),
    NOAT(null),
    FUNR(null),
    ULRF(null),
    DFUR(null),
    FUFE(null),
    FUFL(null),
    FUNS(null),
    FRME(null);
    private final Object value;
    private final static Map<Object, ResponseCodeCodeset> CONSTANTS = new HashMap<Object, ResponseCodeCodeset>();

    static {
        for (ResponseCodeCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ResponseCodeCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ResponseCodeCodeset fromValue(Object value) {
        ResponseCodeCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
