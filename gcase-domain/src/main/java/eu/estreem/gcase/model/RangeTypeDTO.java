package eu.estreem.gcase.model;

import lombok.Builder;
import lombok.Value;

/**
 * RangDTO
 */

@Value
@Builder
public class RangeTypeDTO {

    private Integer low;
    private Integer high;
}
