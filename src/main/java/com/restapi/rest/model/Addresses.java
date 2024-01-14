package com.restapi.rest.model;

public class Addresses {
    private String senderStreet;
    private String senderZip;
    private String senderCity;
    private String senderCountry;
    private String receiverStreet;
    private String receiverZip;
    private String receiverCity;
    private String receiverCountry;


    // Getter Methods

    public String getSenderStreet() {
        return senderStreet;
    }

    public String getSenderZip() {
        return senderZip;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public String getReceiverStreet() {
        return receiverStreet;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    // Setter Methods

    public void setSenderStreet( String senderStreet ) {
        this.senderStreet = senderStreet;
    }

    public void setSenderZip( String senderZip ) {
        this.senderZip = senderZip;
    }

    public void setSenderCity( String senderCity ) {
        this.senderCity = senderCity;
    }

    public void setSenderCountry( String senderCountry ) {
        this.senderCountry = senderCountry;
    }

    public void setReceiverStreet( String receiverStreet ) {
        this.receiverStreet = receiverStreet;
    }

    public void setReceiverZip( String receiverZip ) {
        this.receiverZip = receiverZip;
    }

    public void setReceiverCity( String receiverCity ) {
        this.receiverCity = receiverCity;
    }

    public void setReceiverCountry( String receiverCountry ) {
        this.receiverCountry = receiverCountry;
    }
}