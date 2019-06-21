package com.espresoh;

import com.espresoh.entities.bookings.Booking;
import com.espresoh.entities.data.RawData;
import com.espresoh.schemas.RawDataSchemaBuilder;
import com.espresoh.interfaces.SchemaBuilder;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main( String[] args ) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE);

        SchemaBuilder bookingSchemaBuilder = new RawDataSchemaBuilder();
        CsvSchema schemaTest = bookingSchemaBuilder.buildEntitySchema(RawData.class);

        List<Booking> bookings = new ArrayList<>();

        try (Reader reader = new FileReader("Berlin and Venice 4 - 6 May.csv")) {
            MappingIterator<RawData> mappingIterator = csvMapper.readerFor(RawData.class).with(schemaTest).readValues(reader);
            while(mappingIterator.hasNext()) {
                RawData current = mappingIterator.next();
                Booking booking = new Booking(current);
                bookings.add(booking);
            }
        }

        System.out.println(objectMapper.writeValueAsString(bookings));
    }
}
