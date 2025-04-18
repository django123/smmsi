
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CompanyRegistrationNumberCategoryCodeset {

    SIRE(null),
    SIRF(null),
    OTHR(null);
    private final Object value;
    private final static Map<Object, CompanyRegistrationNumberCategoryCodeset> CONSTANTS = new HashMap<Object, CompanyRegistrationNumberCategoryCodeset>();

    static {
        for (CompanyRegistrationNumberCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CompanyRegistrationNumberCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CompanyRegistrationNumberCategoryCodeset fromValue(Object value) {
        CompanyRegistrationNumberCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
