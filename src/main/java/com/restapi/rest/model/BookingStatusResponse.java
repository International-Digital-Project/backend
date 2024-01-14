package com.restapi.rest.model;

public class BookingStatusResponse {
    private String status;
    private String trackingId;

    public BookingStatusResponse(String status, String trackingId) {
        this.status = status;
        this.trackingId=trackingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String customerName) {
        this.status = customerName;
    }
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
}
