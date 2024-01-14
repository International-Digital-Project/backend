package com.restapi.rest.model.Booking;


public class User {
    private String firstname;
    private String lastname;
    private String company;
    private float phoneNumber;
    private String email;


    // Getter Methods

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Setter Methods

    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname;
    }

    public void setCompany( String company ) {
        this.company = company;
    }

    public void setPhoneNumber( float phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
}
