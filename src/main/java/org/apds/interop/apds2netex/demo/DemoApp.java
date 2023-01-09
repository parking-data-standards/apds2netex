package org.apds.interop.apds2netex.demo;

import org.apds.interop.apds2netex.builder.Apds2NetexBuilder;
import org.apds.interop.apds2netex.netex.NetexSerializer;
import org.apds.interop.apds2netex.netex.PublicationDelivery;

public class DemoApp
{
    static final String PLACES_FILE = "--places=";
    static final String RATES_FILE = "--rates=";
    static final String RIGHTS_FILE = "--rights=";
    static final String OUTPUT_FILE = "--out=";

    public static void main( String[] args )
    {

        System.out.println( "Apds2Netex Example CLI" );

        Apds2NetexBuilder builder = Apds2NetexBuilder
                .newInstance()
                .usingPlaces( getParameterValue( PLACES_FILE, args))
                .usingRates( getParameterValue( RATES_FILE, args))
                .usingRights( getParameterValue( RIGHTS_FILE, args));

        PublicationDelivery publication = builder.build();
        if ( builder.isSuccess()) {
            String payload = NetexSerializer.serialize( publication, PublicationDelivery.class);
            String outputFile = getParameterValue( OUTPUT_FILE, args);
            if ( outputFile == null) {
                System.out.println( payload);
            } else {
                if ( NetexSerializer.outputToFile( outputFile, payload)) {
                    System.out.println( "result saved to " + outputFile);
                } else {
                    System.out.println( "failed to save result to " + outputFile);
                }
            }
        } else {
            System.out.println( "error: " + builder.getLastError());
        }
    }

    private static String getParameterValue( String parameterName, String[] args) {
        for ( String arg : args) {
            if ( arg.startsWith( parameterName)) {
                return arg.substring( parameterName.length());
            }
        }
        return null;
    }
}
