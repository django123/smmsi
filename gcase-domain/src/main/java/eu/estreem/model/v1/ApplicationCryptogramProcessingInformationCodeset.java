
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ApplicationCryptogramProcessingInformationCodeset {

    UCAC(null),
    ICAC(null),
    VCAC(null),
    NSBI(null),
    VAAC(null);
    private final Object value;
    private final static Map<Object, ApplicationCryptogramProcessingInformationCodeset> CONSTANTS = new HashMap<Object, ApplicationCryptogramProcessingInformationCodeset>();

    static {
        for (ApplicationCryptogramProcessingInformationCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ApplicationCryptogramProcessingInformationCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static ApplicationCryptogramProcessingInformationCodeset fromValue(Object value) {
        ApplicationCryptogramProcessingInformationCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
