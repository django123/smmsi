
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DigitalCommerceDomainIdCodeset {

    MACD(null),
    ACQU(null),
    ISSU(null),
    REFU(null);
    private final Object value;
    private final static Map<Object, DigitalCommerceDomainIdCodeset> CONSTANTS = new HashMap<Object, DigitalCommerceDomainIdCodeset>();

    static {
        for (DigitalCommerceDomainIdCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DigitalCommerceDomainIdCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static DigitalCommerceDomainIdCodeset fromValue(Object value) {
        DigitalCommerceDomainIdCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
