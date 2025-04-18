
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AccountFundingSourceCodeset {

    CRDT(null),
    DEBT(null),
    CHAR(null),
    PREP(null),
    DEFR(null);
    private final Object value;
    private final static Map<Object, AccountFundingSourceCodeset> CONSTANTS = new HashMap<Object, AccountFundingSourceCodeset>();

    static {
        for (AccountFundingSourceCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AccountFundingSourceCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AccountFundingSourceCodeset fromValue(Object value) {
        AccountFundingSourceCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
