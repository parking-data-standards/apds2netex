package org.apds.interop.apds2netex.builder;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class ApdsDurationParser {

    private ApdsDurationParser() {
        throw new IllegalStateException( "utility class");
    }

    public static Duration calculateDuration(String start, String end) {

        if ( start == null || start.isEmpty() || end == null || end.isEmpty()) {
            return null;
        }

        if ( start.startsWith( "P") && end.startsWith( "P")) {

            try {

                java.time.Duration durationStart = java.time.Duration.parse( start);
                java.time.Duration durationEnd = java.time.Duration.parse( end);
                long seconds = durationEnd.getSeconds() - durationStart.getSeconds();
                int hours = (int) seconds / 3600;
                int minutes = ((int) seconds - ( hours * 3600)) / 60;
                try {
                    String durationString = "PT";
                    if ( hours > 0 || minutes > 0) {
                        if ( hours > 0) {
                            durationString += String.format( "%dH", hours);
                        }
                        if ( minutes > 0) {
                            durationString += String.format( "%dM", minutes);
                        }
                    } else {
                        durationString += "0M";
                    }
                    return DatatypeFactory.newInstance().newDuration( durationString);
                } catch ( Exception ex) {
                    return null;
                }

            } catch ( Exception ex) {
                return null;
            }

        } else {

            int startHours = Integer.parseInt( start.substring( 0, 2));
            int startMinutes = Integer.parseInt( start.substring( 3, 5));
            int startTotalMinutes = 60 * startHours + startMinutes;

            int endHours = Integer.parseInt( end.substring( 0, 2));
            int endMinutes = Integer.parseInt( end.substring( 3, 5));
            int endTotalMinutes = 60 * endHours + endMinutes;

            int durationTotalMinutes = endTotalMinutes - startTotalMinutes;
            int durationHours = durationTotalMinutes / 60;
            int durationMinutes = durationTotalMinutes - ( durationHours * 60);

            String duration = "PT";
            if ( durationHours > 0) {
                duration += String.format( "%dH", durationHours);
            }
            if ( durationMinutes > 0) {
                duration += String.format( "%dM", durationMinutes);
            }
            try {
                return DatatypeFactory.newInstance().newDuration(duration);
            } catch ( Exception ignore) {
                // should not happen
            }
        }
        return null;
    }
}
