package com.restapi.rest.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ReceiverAddress {
    @Valid
    @NotNull(message = "receiver streetName is mandatory")
    @NotBlank(message = "receiver streetName is mandatory")
    private String streetName;
    @NotNull(message = "receiver streetNumber is mandatory")
    @NotBlank(message = "receiver streetNumber is mandatory")
    private String streetNumber;
    @NotNull(message = "receiver city is mandatory")
    @NotBlank(message = "receiver city is mandatory")
    private String city;
    @NotNull(message = "receiver zipCode is mandatory")
    @NotBlank(message = "receiver zipCode is mandatory")
    private String zipCode;
    @NotNull(message = "receiver country is mandatory")
    @NotBlank(message = "receiver country is mandatory")
    private String country;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public ReceiverAddress(String streetName, String streetNumber, String city, String zipCode, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
    @Override
    public String toString() {
        return "ReceiverAddress{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
