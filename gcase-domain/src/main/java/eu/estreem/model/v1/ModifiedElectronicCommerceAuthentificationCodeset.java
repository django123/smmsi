
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ModifiedElectronicCommerceAuthentificationCodeset {

    NOAC(null),
    AUTC(null),
    ACIM(null);
    private final Object value;
    private final static Map<Object, ModifiedElectronicCommerceAuthentificationCodeset> CONSTANTS = new HashMap<Object, ModifiedElectronicCommerceAuthentificationCodeset>();

    static {
        for (ModifiedElectronicCommerceAuthentificationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ModifiedElectronicCommerceAuthentificationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ModifiedElectronicCommerceAuthentificationCodeset fromValue(Object value) {
        ModifiedElectronicCommerceAuthentificationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
