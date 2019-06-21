package com.espresoh.entities.profiles;

import com.espresoh.entities.data.RawData;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String countryCode;
    private String zipCode;
    private String stateProvince;
    private String addressType;

    public Address(RawData rawData) {
        this.addressLine1 = rawData.getAddress1();
        this.addressLine2 = rawData.getAddress2();
        this.countryCode = rawData.getCountryCode();
        this.zipCode = rawData.getZipCode();
        this.stateProvince = rawData.getStateProvince();
        this.addressType = rawData.getAddressType();
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", addressType='" + addressType + '\'' +
                '}';
    }
}
