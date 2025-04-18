
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum MerchantCategoryCodeset {

    PYFS(null),
    PYFA(null),
    MKPL(null),
    IPRV(null),
    STND(null),
    SBMT(null);
    private final Object value;
    private final static Map<Object, MerchantCategoryCodeset> CONSTANTS = new HashMap<Object, MerchantCategoryCodeset>();

    static {
        for (MerchantCategoryCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MerchantCategoryCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static MerchantCategoryCodeset fromValue(Object value) {
        MerchantCategoryCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
