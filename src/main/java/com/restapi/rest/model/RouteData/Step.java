package com.restapi.rest.model.RouteData;

import java.util.List;

public class Step {
    private double distance;
    private double duration;
    private int type;
    private String instruction;
    private String name;
    private List<Integer> way_points;

    // Getters and setters

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getWay_points() {
        return way_points;
    }

    public void setWay_points(List<Integer> way_points) {
        this.way_points = way_points;
    }
}
