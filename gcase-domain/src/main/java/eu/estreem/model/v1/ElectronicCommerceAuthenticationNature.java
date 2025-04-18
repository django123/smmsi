
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ElectronicCommerceAuthenticationNature {

    ACNS(null),
    ACNO(null),
    ACXX(null),
    ACMO(null);
    private final Object value;
    private final static Map<Object, ElectronicCommerceAuthenticationNature> CONSTANTS = new HashMap<Object, ElectronicCommerceAuthenticationNature>();

    static {
        for (ElectronicCommerceAuthenticationNature c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ElectronicCommerceAuthenticationNature(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ElectronicCommerceAuthenticationNature fromValue(Object value) {
        ElectronicCommerceAuthenticationNature constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
