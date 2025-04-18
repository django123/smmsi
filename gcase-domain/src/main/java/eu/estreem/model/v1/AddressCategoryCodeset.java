
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AddressCategoryCodeset {

    ADDR(null),
    PBOX(null),
    HOME(null),
    BIZZ(null),
    MLTO(null),
    DLVY(null);
    private final Object value;
    private final static Map<Object, AddressCategoryCodeset> CONSTANTS = new HashMap<Object, AddressCategoryCodeset>();

    static {
        for (AddressCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AddressCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AddressCategoryCodeset fromValue(Object value) {
        AddressCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
