
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DisputeConditionCodeset {

    FCTC(null),
    FAID(null),
    DETC(null),
    CACO(null),
    COMU(null),
    FRDF(null),
    DEMA(null),
    DOUB(null),
    RNDI(null),
    RPDI(null),
    MOER(null),
    CNPA(null),
    CEAM(null),
    CVSV(null),
    CAEC(null),
    COPP(null),
    RPAR(null);
    private final Object value;
    private final static Map<Object, DisputeConditionCodeset> CONSTANTS = new HashMap<Object, DisputeConditionCodeset>();

    static {
        for (DisputeConditionCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DisputeConditionCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static DisputeConditionCodeset fromValue(Object value) {
        DisputeConditionCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
