package org.apds.interop.apds2netex.orm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonObjectMapper {

    public static String mapToJson(Object obj)  {
        com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        //objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        try {
            return objectMapper.writeValueAsString(obj);
        } catch ( JsonProcessingException ignore) {
        }
        return "";
    }
    public static  <T> T mapFromJson(String json, Class<T> clazz) {

        if ( json == null || json.isEmpty()) {
            return null;
        }
        com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        //objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        try {
            return objectMapper.readValue(json, clazz);
        } catch ( Exception ignore) {
            System.out.println( ignore);
        }
        return null;
    }

}
