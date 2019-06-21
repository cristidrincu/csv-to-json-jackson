package com.espresoh.schemas;

import com.espresoh.interfaces.SchemaBuilder;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class RawDataSchemaBuilder implements SchemaBuilder {

    @Override
    public CsvSchema buildEntitySchema(Class<?> type) {
        return CsvSchema.builder()
                .addColumn("hotelCode")
                .addColumn("profileId", CsvSchema.ColumnType.NUMBER)
                .addColumn("reservationNameId", CsvSchema.ColumnType.NUMBER)
                .addColumn("confirmationNumber")
                .addColumn("reservationStatus")
                .addColumn("alternateId")
                .addColumn("title")
                .addColumn("firstName")
                .addColumn("lastName")
                .addColumn("addressType")
                .addColumn("address1")
                .addColumn("address2")
                .addColumn("address3")
                .addColumn("address4")
                .addColumn("countryCode")
                .addColumn("stateProvince")
                .addColumn("zipCode")
                .addColumn("gender")
                .addColumn("email")
                .addColumn("arrivalDate")
                .addColumn("departureDate")
                .addColumn("adultCount", CsvSchema.ColumnType.NUMBER)
                .addColumn("childCount", CsvSchema.ColumnType.NUMBER)
                .addColumn("arrivalTime")
                .addColumn("departureTime")
                .addColumn("blockCode")
                .addColumn("blockId")
                .addColumn("roomType")
                .addColumn("roomTypeToChange")
                .addColumn("travelAgentNameId")
                .addColumn("companyNameId")
                .addColumn("travelAgentName")
                .addColumn("companyName")
                .addColumn("resInsertDate")
                .addColumn("resCreationDate")
                .addColumn("resInsertUser")
                .addColumn("resUpdateDate")
                .addColumn("resUpdateUser")
                .addColumn("lastRoom")
                .addColumn("lastStay")
                .addColumn("marketCode")
                .addColumn("sourceCode")
                .addColumn("channelOriginCode")
                .addColumn("rateCode")
                .addColumn("rateAmountDailyDetails")
                .addColumn("roomNumber")
                .addColumn("roomFeatures")
                .addColumn("preferences")
                .addColumn("specials")
                .addColumn("reservationComments")
                .addColumn("projectedRevenue")
                .addColumn("totalRevenueCheckedOutGuest")
                .addColumn("roomRevenueCheckedOutGuest")
                .addColumn("fbRevenueCheckedOutGuest")
                .addColumn("otherRevenueCheckedOutGuest")
                .addColumn("specialRequest")
                .addColumn("membershipLevel")
                .addColumn("memberNumber")
                .build()
                .withSkipFirstDataRow(true);
    }
}