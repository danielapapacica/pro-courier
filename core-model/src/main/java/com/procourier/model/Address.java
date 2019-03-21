package com.procourier.model;

import java.util.Objects;

public final class Address {
    private String region;
    private String city;
    private Address street;
    private String streetNumber;

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public Address getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public Address(String region, String city, Address street) {
        this(region, city, street, "");
    }

    public Address(String region, String city, Address street, String streetNumber) {
        this.region = Objects.requireNonNull(region);
        this.city = Objects.requireNonNull(city);
        this.street = Objects.requireNonNull(street);
        this.streetNumber = Objects.requireNonNull(streetNumber);
    }
}
