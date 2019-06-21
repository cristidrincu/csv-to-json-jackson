package com.espresoh.entities.bookings;

import com.espresoh.entities.data.RawData;

public class Booking {

    private String hotelCode;
    private String profileId;
    private Integer reservationNameId;
    private String confirmationNumber;
    private String reservationStatus;
    private String alternateId;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String countryCode;
    private String stateProvince;
    private String zipCode;
    private String email;
    private String arrivalDate;
    private String departureDate;
    private Integer adultCount;
    private Integer childCount;
    private String arrivalTime;
    private String departureTime;
    private String roomType;
    private String marketCode;
    private String sourceCode;
    private String rateCode;
    private String preferences;
    private String reservationComments;
    private String projectedRevenue;
    private String roomRevenueCheckedOutGuest;
    private String fbRevenueCheckedOutGuest;
    private String otherRevenueCheckedOutGuest;

    public Booking() {}

    public Booking(RawData rawData) {
        this.profileId = rawData.getProfileId();
        this.confirmationNumber = rawData.getConfirmationNumber();
        this.email = rawData.getEmail();
        this.reservationStatus = rawData.getReservationStatus();
        this.hotelCode = rawData.getHotelCode();
        this.adultCount = rawData.getAdultCount();
        this.childCount = rawData.getChildCount();
        this.arrivalDate = rawData.getArrivalDate();
        this.departureDate = rawData.getDepartureDate();
        this.arrivalTime = rawData.getArrivalTime();
        this.departureTime = rawData.getDepartureTime();
        this.roomType = rawData.getRoomType();
        this.marketCode = rawData.getMarketCode();
        this.sourceCode = rawData.getSourceCode();
        this.rateCode = rawData.getRateCode();
        this.preferences = rawData.getPreferences();
        this.reservationComments = rawData.getReservationComments();
        this.roomRevenueCheckedOutGuest = rawData.getRoomRevenueCheckedOutGuest();
        this.fbRevenueCheckedOutGuest = rawData.getFbRevenueCheckedOutGuest();
        this.otherRevenueCheckedOutGuest = rawData.getOtherRevenueCheckedOutGuest();
        this.projectedRevenue = rawData.getProjectedRevenue();
        //currency? where do they get that, it's not in the csv file
        this.address1 = rawData.getAddress1();
        this.address2 = rawData.getAddress2();
        //city? where do they get that, it's not in the csv file
        this.countryCode = rawData.getCountryCode();
        this.zipCode = rawData.getZipCode();
        this.stateProvince = rawData.getStateProvince();
        //region? where do they get that, it's not in the csv file
        this.roomType = rawData.getRoomType();
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Integer getReservationNameId() {
        return reservationNameId;
    }

    public void setReservationNameId(Integer reservationNameId) {
        this.reservationNameId = reservationNameId;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getAlternateId() {
        return alternateId;
    }

    public void setAlternateId(String alternateId) {
        this.alternateId = alternateId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getReservationComments() {
        return reservationComments;
    }

    public void setReservationComments(String reservationComments) {
        this.reservationComments = reservationComments;
    }

    public String getProjectedRevenue() {
        return projectedRevenue;
    }

    public void setProjectedRevenue(String projectedRevenue) {
        this.projectedRevenue = projectedRevenue;
    }

    public String getRoomRevenueCheckedOutGuest() {
        return roomRevenueCheckedOutGuest;
    }

    public void setRoomRevenueCheckedOutGuest(String roomRevenueCheckedOutGuest) {
        this.roomRevenueCheckedOutGuest = roomRevenueCheckedOutGuest;
    }

    public String getFbRevenueCheckedOutGuest() {
        return fbRevenueCheckedOutGuest;
    }

    public void setFbRevenueCheckedOutGuest(String fbRevenueCheckedOutGuest) {
        this.fbRevenueCheckedOutGuest = fbRevenueCheckedOutGuest;
    }

    public String getOtherRevenueCheckedOutGuest() {
        return otherRevenueCheckedOutGuest;
    }

    public void setOtherRevenueCheckedOutGuest(String otherRevenueCheckedOutGuest) {
        this.otherRevenueCheckedOutGuest = otherRevenueCheckedOutGuest;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "hotelCode='" + hotelCode + '\'' +
                ", profileId=" + profileId +
                ", reservationNameId=" + reservationNameId +
                ", confirmationNumber='" + confirmationNumber + '\'' +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", alternateId='" + alternateId + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", address4='" + address4 + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", email='" + email + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", adultCount=" + adultCount +
                ", childCount=" + childCount +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", roomType='" + roomType + '\'' +
                ", marketCode='" + marketCode + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                ", rateCode='" + rateCode + '\'' +
                ", preferences='" + preferences + '\'' +
                ", reservationComments='" + reservationComments + '\'' +
                ", projectedRevenue='" + projectedRevenue + '\'' +
                ", roomRevenueCheckedOutGuest='" + roomRevenueCheckedOutGuest + '\'' +
                ", fbRevenueCheckedOutGuest='" + fbRevenueCheckedOutGuest + '\'' +
                ", otherRevenueCheckedOutGuest='" + otherRevenueCheckedOutGuest + '\'' +
                '}';
    }
}