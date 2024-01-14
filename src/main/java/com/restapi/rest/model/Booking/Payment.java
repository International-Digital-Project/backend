package com.restapi.rest.model.Booking;

public class Payment {
    private String cardHolder;
    private float cardNumber;
    private String expiryDate;
    private float cvc;


    // Getter Methods

    public String getCardHolder() {
        return cardHolder;
    }

    public float getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public float getCvc() {
        return cvc;
    }

    // Setter Methods

    public void setCardHolder( String cardHolder ) {
        this.cardHolder = cardHolder;
    }

    public void setCardNumber( float cardNumber ) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate( String expiryDate ) {
        this.expiryDate = expiryDate;
    }

    public void setCvc( float cvc ) {
        this.cvc = cvc;
    }
}
