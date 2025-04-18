
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ReasonInformationEntitySourceCodeset {

    NTWK(null),
    VISA(null),
    MACD(null),
    SICB(null),
    ACQU(null),
    JCB_0(null),
    DISC(null),
    UPIC(null),
    OTHR(null);
    private final Object value;
    private final static Map<Object, ReasonInformationEntitySourceCodeset> CONSTANTS = new HashMap<Object, ReasonInformationEntitySourceCodeset>();

    static {
        for (ReasonInformationEntitySourceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ReasonInformationEntitySourceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ReasonInformationEntitySourceCodeset fromValue(Object value) {
        ReasonInformationEntitySourceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
