
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AdditionnalInformationForImmediateActionCodeset {

    NOAI(null),
    FORE(null),
    COIP(null),
    ODRS(null),
    ETNS(null),
    ACFI(null),
    INPT(null),
    RPTT(null),
    TRRD(null),
    RERR(null),
    CWNR(null);
    private final Object value;
    private final static Map<Object, AdditionnalInformationForImmediateActionCodeset> CONSTANTS = new HashMap<Object, AdditionnalInformationForImmediateActionCodeset>();

    static {
        for (AdditionnalInformationForImmediateActionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionnalInformationForImmediateActionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AdditionnalInformationForImmediateActionCodeset fromValue(Object value) {
        AdditionnalInformationForImmediateActionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
