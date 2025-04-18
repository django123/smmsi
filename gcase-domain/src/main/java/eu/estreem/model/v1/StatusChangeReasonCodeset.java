
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum StatusChangeReasonCodeset {

    MAFC(null),
    APFC(null),
    AUFC(null),
    FOCO(null),
    MAAN(null),
    AUAN(null),
    ALRD(null),
    ALDR(null),
    AUCL(null),
    MACL(null),
    RECL(null),
    MARE(null),
    AUPU(null);
    private final Object value;
    private final static Map<Object, StatusChangeReasonCodeset> CONSTANTS = new HashMap<Object, StatusChangeReasonCodeset>();

    static {
        for (StatusChangeReasonCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StatusChangeReasonCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static StatusChangeReasonCodeset fromValue(Object value) {
        StatusChangeReasonCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
