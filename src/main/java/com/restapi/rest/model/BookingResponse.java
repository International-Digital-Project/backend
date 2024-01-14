package com.restapi.rest.model;

public class BookingResponse {


    public BookingResponse() {

    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

//    private String message;
    private String bookingId;
    private String trackingId;
//    public BookingResponse(String message, String bookingId, String trackingId) {
//        this.message = message;
//        this.bookingId = bookingId;
//        this.trackingId = trackingId;
//    }

//    public BookingResponse(String bookingId, String trackingId) {
//        this.bookingId = bookingId;
//        this.trackingId = trackingId;
//    }



    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

}
