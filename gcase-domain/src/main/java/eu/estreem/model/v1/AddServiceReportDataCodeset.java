
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AddServiceReportDataCodeset {

    NSPR(null),
    NPCE(null),
    NPMN(null),
    NPMO(null),
    NPFO(null),
    NPUS(null);
    private final Object value;
    private final static Map<Object, AddServiceReportDataCodeset> CONSTANTS = new HashMap<Object, AddServiceReportDataCodeset>();

    static {
        for (AddServiceReportDataCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AddServiceReportDataCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static AddServiceReportDataCodeset fromValue(Object value) {
        AddServiceReportDataCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
