
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardAcceptorArchitectureCategoryCodeset {

    AUTO(null),
    DICO(null),
    DICL(null);
    private final Object value;
    private final static Map<Object, CardAcceptorArchitectureCategoryCodeset> CONSTANTS = new HashMap<Object, CardAcceptorArchitectureCategoryCodeset>();

    static {
        for (CardAcceptorArchitectureCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardAcceptorArchitectureCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardAcceptorArchitectureCategoryCodeset fromValue(Object value) {
        CardAcceptorArchitectureCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
