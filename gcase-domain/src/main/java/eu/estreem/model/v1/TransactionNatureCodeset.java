
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum TransactionNatureCodeset {

    PUGS(null),
    ATMW(null),
    QUCA(null),
    CACP(null),
    MACA(null),
    CRED(null),
    QCAR(null),
    AVFI(null),
    CARE(null),
    FTDE(null),
    FTCR(null),
    FTWC(null),
    AICE(null),
    WCDI(null),
    VMAA(null),
    FIMA(null);
    private final Object value;
    private final static Map<Object, TransactionNatureCodeset> CONSTANTS = new HashMap<Object, TransactionNatureCodeset>();

    static {
        for (TransactionNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransactionNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static TransactionNatureCodeset fromValue(Object value) {
        TransactionNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
