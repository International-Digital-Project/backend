package com.restapi.rest.model;

public class VehicleResponse {
    private String vehicleId;
    private String vehicleType;
    private double distance;
    private double fuelEfficiency;
    private String parcelId;
    private String status;

    public VehicleResponse() {
    }

    public VehicleResponse(String vehicleId, String vehicleType, double distance, double fuelEfficiency, String parcelId, String status) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.distance = distance;
        this.fuelEfficiency = fuelEfficiency;
        this.parcelId = parcelId;
        this.status = status;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getParcelId() {
        return parcelId;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
