
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AccountUsageCodeset {

    PWNF(null),
    SAAC(null),
    DEAC(null),
    CRAC(null),
    DECL(null),
    DEDA(null),
    CHAC(null),
    PRAC(null);
    private final Object value;
    private final static Map<Object, AccountUsageCodeset> CONSTANTS = new HashMap<Object, AccountUsageCodeset>();

    static {
        for (AccountUsageCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AccountUsageCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AccountUsageCodeset fromValue(Object value) {
        AccountUsageCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
