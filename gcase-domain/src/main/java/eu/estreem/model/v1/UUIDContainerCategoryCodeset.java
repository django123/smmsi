
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum UUIDContainerCategoryCodeset {

    DSID(null),
    ACSI(null);
    private final Object value;
    private final static Map<Object, UUIDContainerCategoryCodeset> CONSTANTS = new HashMap<Object, UUIDContainerCategoryCodeset>();

    static {
        for (UUIDContainerCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    UUIDContainerCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static UUIDContainerCategoryCodeset fromValue(Object value) {
        UUIDContainerCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
