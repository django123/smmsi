
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ThreeDSIndicatorCodeset {

    _3_DSIAA(null),
    _3_DSIAB(null),
    _3_DSIAC(null),
    _3_DSIAD(null),
    _3_DSIAE(null),
    _3_DSIAF(null),
    _3_DSIAG(null),
    _3_DSIAH(null),
    _3_DSIAI(null),
    _3_DSIAJ(null),
    _3_DSIAK(null),
    _3_DSIAL(null),
    _3_DSIAM(null),
    _3_DSIAN(null),
    _3_DSIAO(null),
    _3_DSIAP(null),
    _3_DSIAQ(null),
    _3_DSIAR(null),
    _3_DSIAS(null),
    _3_DSIAT(null),
    _3_DSIAU(null),
    _3_DSIAV(null),
    _3_DSIAW(null),
    _3_DSIAX(null),
    _3_DSIAY(null),
    _3_DSIAZ(null),
    _3_DSIBA(null);
    private final Object value;
    private final static Map<Object, ThreeDSIndicatorCodeset> CONSTANTS = new HashMap<Object, ThreeDSIndicatorCodeset>();

    static {
        for (ThreeDSIndicatorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ThreeDSIndicatorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ThreeDSIndicatorCodeset fromValue(Object value) {
        ThreeDSIndicatorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
