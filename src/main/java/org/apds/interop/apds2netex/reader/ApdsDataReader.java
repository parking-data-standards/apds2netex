package org.apds.interop.apds2netex.reader;

import generated.org.apds.model.PlaceDTO;
import generated.org.apds.model.RateTableDTO;
import generated.org.apds.model.RightSpecificationDTO;
import org.apds.interop.apds2netex.orm.JsonObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class ApdsDataReader {

    public static List<PlaceDTO> getPlacesFromInputStream(InputStream source) {
        String stringRepresentation = getAsStringFromInputStream( source);
        if ( stringRepresentation == null) {
            return null;
        }
        PlaceDTO[] places = JsonObjectMapper.mapFromJson( stringRepresentation, PlaceDTO[].class);
        return places != null ? Arrays.asList( places) : null;
    }

    public static List<RateTableDTO> getRatesFromInputStream(InputStream source) {
        String stringRepresentation = getAsStringFromInputStream( source);
        if ( stringRepresentation == null) {
            return null;
        }
        RateTableDTO[] rates = JsonObjectMapper.mapFromJson( stringRepresentation, RateTableDTO[].class);
        return rates != null ? Arrays.asList( rates) : null;
    }

    public static List<RightSpecificationDTO> getRightsFromInputStream(InputStream source) {
        String stringRepresentation = getAsStringFromInputStream( source);
        if ( stringRepresentation == null) {
            return null;
        }
        RightSpecificationDTO[] rights = JsonObjectMapper.mapFromJson( stringRepresentation, RightSpecificationDTO[].class);
        return rights != null ? Arrays.asList( rights) : null;
    }


    public static String getAsStringFromInputStream( InputStream source)  {

        BufferedInputStream bufferedSource = new BufferedInputStream( source);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            for (int charsRead = bufferedSource.read(); charsRead != -1; charsRead = bufferedSource.read()) {
                output.write((byte) charsRead);
            }
            return output.toString(StandardCharsets.UTF_8.name());
        } catch (IOException encodingEx) {
            return null;
        }
    }
}
