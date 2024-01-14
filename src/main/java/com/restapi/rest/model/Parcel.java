package com.restapi.rest.model;

public class Parcel {
    private float weight;
    private float length;
    private float width;
    private float height;
    private String state;


    // Getter Methods

    public float getWeight() {
        return weight;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String getState() {
        return state;
    }

    // Setter Methods

    public void setWeight( float weight ) {
        this.weight = weight;
    }

    public void setLength( float length ) {
        this.length = length;
    }

    public void setWidth( float width ) {
        this.width = width;
    }

    public void setHeight( float height ) {
        this.height = height;
    }

    public void setState( String state ) {
        this.state = state;
    }
}