
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum POIInformationCodeset {

    MPOS(null),
    SPOC(null),
    CPOC(null),
    MPOC(null);
    private final Object value;
    private final static Map<Object, POIInformationCodeset> CONSTANTS = new HashMap<Object, POIInformationCodeset>();

    static {
        for (POIInformationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    POIInformationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static POIInformationCodeset fromValue(Object value) {
        POIInformationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
