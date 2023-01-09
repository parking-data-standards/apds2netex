package org.apds.interop.apds2netex.reader;

import generated.org.apds.model.RateTableDTO;
import generated.org.apds.model.RightSpecificationDTO;

import java.util.List;

public class ApdsDataParser {

    public static RightSpecificationDTO getRightById( String rightId, List<RightSpecificationDTO> rightsList) {
        for ( RightSpecificationDTO right : rightsList) {
            if ( right.getId() != null && right.getId().equals( rightId)) {
                return right;
            }
        }
        return null;
    }

    public static RateTableDTO getRateById( String rateId, List<RateTableDTO> ratesList) {
        for ( RateTableDTO rate : ratesList) {
            if ( rate.getId() != null && rate.getId().equals( rateId)) {
                return rate;
            }
        }
        return null;
    }

}
