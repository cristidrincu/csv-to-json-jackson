package com.espresoh;

import com.fasterxml.jackson.databind.MappingIterator;
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
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE);

        CsvSchema schema = CsvSchema.emptySchema().withSkipFirstDataRow(true);

        List<Booking> bookings = new ArrayList<>();

        try (Reader reader = new FileReader("BerlinVeniceValid.csv")) {
            MappingIterator<Booking> mappingIterator = csvMapper.readerWithTypedSchemaFor(Booking.class).readValues(reader);
            while(mappingIterator.hasNext()) {
                Booking current = mappingIterator.next();
                bookings.add(current);
            }
        }

        System.out.println(bookings.toString());
    }
}
