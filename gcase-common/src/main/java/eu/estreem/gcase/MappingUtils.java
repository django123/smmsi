package eu.estreem.gcase;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class MappingUtils {

    private static final DateTimeFormatter ISO_DATE_TIME_FORMATTER = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    public static BigDecimal toBigDecimal(String amountStr){
        try{
            return Optional.ofNullable(amountStr)
                    .map(BigDecimal::new)
                    .orElse(null);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("Invalid amount format: " + amountStr, e);
        }
    }

    public static String fromBigDecimal(BigDecimal amount){
        return Optional.ofNullable(amount).map(BigDecimal::toPlainString).orElse(null);
    }

    public static OffsetDateTime toOffsetDateTime(String isoDateTime){
        return Optional.ofNullable(isoDateTime)
                .map(ISO_DATE_TIME_FORMATTER::parse)
                .map(OffsetDateTime::from)
                .orElse(null);
    }
    public static String fromOffsetDateTime(OffsetDateTime dateTime){
        return Optional.ofNullable(dateTime)
                .map(ISO_DATE_TIME_FORMATTER::format)
                .orElse(null);
    }
}
