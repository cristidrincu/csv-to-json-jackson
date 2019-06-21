package com.espresoh;

import com.espresoh.entities.bookings.Booking;
import com.espresoh.entities.data.RawData;
import com.espresoh.entities.profiles.Profile;
import com.espresoh.schemas.RawDataSchemaBuilder;
import com.espresoh.interfaces.SchemaBuilder;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main( String[] args ) throws IOException, ParseException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE);

        SchemaBuilder bookingSchemaBuilder = new RawDataSchemaBuilder();
        CsvSchema rawDataSchema = bookingSchemaBuilder.buildEntitySchema(RawData.class);

        List<Booking> bookings = new ArrayList<>();
        List<Profile> profiles = new ArrayList<>();

        try (Reader reader = new FileReader("sample-data/Berlin and Venice 4 - 6 May.csv")) {
            MappingIterator<RawData> mappingIterator = csvMapper.readerFor(RawData.class).with(rawDataSchema).readValues(reader);
            while(mappingIterator.hasNext()) {
                RawData current = mappingIterator.next();
                Booking booking = new Booking(current);
                Profile profile = new Profile(current);
                bookings.add(booking);
                profiles.add(profile);
            }
        }

        String bookingsJson = objectMapper.writeValueAsString(bookings);
        String profilesJson =  objectMapper.writeValueAsString(profiles);

        logger.log(Level.INFO, bookingsJson);
        logger.log(Level.INFO,profilesJson);
    }
}
