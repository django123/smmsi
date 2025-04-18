
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum StoredDataCategoryCodeSet {

    INTERN_AUTORISATION_REQUEST(null),
    SCHEME_AUTORISATION_REQUEST(null),
    MERCHANT_AUTORISATION_REQUEST(null),
    INTERN_AUTORISATION_RESPONSE(null),
    SCHEME_AUTORISATION_RESPONSE(null),
    MERCHANT_AUTORISATION_RESPONSE(null);
    private final Object value;
    private final static Map<Object, StoredDataCategoryCodeSet> CONSTANTS = new HashMap<Object, StoredDataCategoryCodeSet>();

    static {
        for (StoredDataCategoryCodeSet c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StoredDataCategoryCodeSet(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static StoredDataCategoryCodeSet fromValue(Object value) {
        StoredDataCategoryCodeSet constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
