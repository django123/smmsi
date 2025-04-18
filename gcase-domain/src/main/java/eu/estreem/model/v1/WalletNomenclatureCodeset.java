
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum WalletNomenclatureCodeset {

    CBOT(null),
    MCIN(null),
    REFU(null);
    private final Object value;
    private final static Map<Object, WalletNomenclatureCodeset> CONSTANTS = new HashMap<Object, WalletNomenclatureCodeset>();

    static {
        for (WalletNomenclatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    WalletNomenclatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static WalletNomenclatureCodeset fromValue(Object value) {
        WalletNomenclatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
