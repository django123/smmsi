
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CardholderAddressCheckingInformationCodeset {

    PAFM(null),
    PAPM(null),
    PANM(null),
    NPAD(null),
    RTRY(null);
    private final Object value;
    private final static Map<Object, CardholderAddressCheckingInformationCodeset> CONSTANTS = new HashMap<Object, CardholderAddressCheckingInformationCodeset>();

    static {
        for (CardholderAddressCheckingInformationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CardholderAddressCheckingInformationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CardholderAddressCheckingInformationCodeset fromValue(Object value) {
        CardholderAddressCheckingInformationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
