package com.restapi.rest.model.RouteData;

import java.util.List;

public class Route {
    private List<Segment> segments;
    private List<Integer> way_points;
    private Summary summary;

    // Getters and setters

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Integer> getWay_points() {
        return way_points;
    }

    public void setWay_points(List<Integer> way_points) {
        this.way_points = way_points;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
