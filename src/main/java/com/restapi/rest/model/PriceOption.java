package com.restapi.rest.model;

public class PriceOption {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    // Constructors, getters, and setters
    // ...
    public PriceOption(String name, double price)
    {
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", price=" + price ;
    }
}
