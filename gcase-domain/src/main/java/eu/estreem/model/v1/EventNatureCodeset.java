
package eu.estreem.model.v1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum EventNatureCodeset {

    EDDJ(null),
    ACJU(null),
    ACRE(null),
    EIMP(null),
    RERE(null),
    REAR(null),
    INRE(null),
    CRDC(null),
    CLSC(null),
    EDRE(null),
    JURE(null),
    DDNR(null),
    DPCV(null),
    REVI(null),
    REVC(null),
    ALEM(null),
    COEM(null),
    ANDI(null),
    PARE(null),
    PAAC(null),
    PAAP(null),
    PARE_(null),
    REPA(null),
    ARBR(null),
    ARBA(null),
    ARBF(null),
    DEAR(null),
    ARDF(null),
    ARDD(null),
    SPDE(null),
    REDI(null),
    EXVR(null),
    ANIE(null),
    RE_1_I(null),
    RE_1_R(null),
    AC_1_I(null),
    RA_1_I(null),
    EMRE(null),
    RE_2_I(null),
    AC_2_I(null),
    RA_2_I(null),
    EMAR(null),
    RDJU(null),
    REIM(null),
    REIR(null),
    ACIM(null),
    REAI(null),
    EMRC(null),
    EMAC(null),
    REDJ(null),
    PAGA(null),
    PAPC(null),
    ADFA(null),
    ADDC(null),
    CREC(null),
    CREM(null),
    CREV(null),
    TITL(null),
    EDRA(null),
    ERNA(null),
    RDRA(null),
    RDRC(null),
    RDRE(null),
    AAIM(null),
    CACD(null),
    CACC(null),
    CSCO(null),
    EMDR(null),
    REDR(null),
    DRAC(null),
    DRRE(null),
    RRSI(null),
    RDRP(null),
    RDRP_(null),
    RDRP__(null);
    private final Object value;
    private final static Map<Object, EventNatureCodeset> CONSTANTS = new HashMap<Object, EventNatureCodeset>();

    static {
        for (EventNatureCodeset c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EventNatureCodeset(Object value) {
        this.value = value;
    }

    @JsonValue
    public Object value() {
        return this.value;
    }

    @JsonCreator
    public static EventNatureCodeset fromValue(Object value) {
        EventNatureCodeset constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
