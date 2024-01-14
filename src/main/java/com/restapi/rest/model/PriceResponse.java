package com.restapi.rest.model;

public class PriceResponse {

    private String message;
    private double greenPrice;
    private double cheapestPrice;
    private double expressPrice;

    public PriceResponse() {
    }

    public PriceResponse(String message, double greenPrice, double cheapestPrice, double expressPrice) {
        this.message = message;
        this.greenPrice = greenPrice;
        this.cheapestPrice = cheapestPrice;
        this.expressPrice = expressPrice;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getGreenPrice() {
        return greenPrice;
    }

    public void setGreenPrice(double greenPrice) {
        this.greenPrice = greenPrice;
    }

    public double getCheapestPrice() {
        return cheapestPrice;
    }

    public void setCheapestPrice(double cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
    }

    public double getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(double expressPrice) {
        this.expressPrice = expressPrice;
    }
}

