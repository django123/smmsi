
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CryptogramProcessingInformationCodeset {

    CVNC(null),
    CVCI(null),
    CVCC(null),
    CVUN(null);
    private final Object value;
    private final static Map<Object, CryptogramProcessingInformationCodeset> CONSTANTS = new HashMap<Object, CryptogramProcessingInformationCodeset>();

    static {
        for (CryptogramProcessingInformationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CryptogramProcessingInformationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static CryptogramProcessingInformationCodeset fromValue(Object value) {
        CryptogramProcessingInformationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
