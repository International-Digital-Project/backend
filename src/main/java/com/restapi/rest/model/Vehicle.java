package com.restapi.rest.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @NotNull(message = "vehicleId is mandatory")
    @NotBlank(message = "vehicleId is mandatory")
    private String vehicleId;

    private String vehicleType;

    @Min(value = 0, message = "distance must be positive")
    private double distance;

    @Min(value = 0, message = "fuelEfficiency must be positive")
    private double fuelEfficiency;

    @NotNull(message = "parcelId is mandatory")
    @NotBlank(message = "parcelId is mandatory")
    private String parcelId;

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vehicle() {
    }

    public Vehicle(String vehicleId, String vehicleType, double distance, double fuelEfficiency, String parcelId) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.distance = distance;
        this.fuelEfficiency = fuelEfficiency;
        this.parcelId = parcelId;
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
}
