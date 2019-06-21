package com.espresoh.interfaces;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public interface SchemaBuilder {

    CsvSchema buildEntitySchema(Class<?> type);
}
