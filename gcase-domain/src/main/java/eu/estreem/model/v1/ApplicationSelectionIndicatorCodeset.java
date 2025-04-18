
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ApplicationSelectionIndicatorCodeset {

    DEFT(null),
    CRHD(null);
    private final Object value;
    private final static Map<Object, ApplicationSelectionIndicatorCodeset> CONSTANTS = new HashMap<Object, ApplicationSelectionIndicatorCodeset>();

    static {
        for (ApplicationSelectionIndicatorCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ApplicationSelectionIndicatorCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ApplicationSelectionIndicatorCodeset fromValue(Object value) {
        ApplicationSelectionIndicatorCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
