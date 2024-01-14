//package com.restapi.rest.entity;
//
//package com.restapi.rest.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "parcels", schema = "funcreis")
//public class Parcel2 {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(name = "booking_id")
//    private String bookingId;
//
//    @Column(name = "tracking_id")
//    private String trackingId;
//
//    @Column(name = "size")
//    private String size;
//
//    @Column(name = "weight")
//    private double weight;
//
//    @Column(name = "sender_address")
//    private String senderAddress;
//
//    @Column(name = "receiver_street_name")
//    private String receiverStreetName;
//
//    @Column(name = "receiver_street_number")
//    private String receiverStreetNumber;
//
//    @Column(name = "receiver_city")
//    private String receiverCity;
//
//    @Column(name = "receiver_zip_code")
//    private String receiverZipCode;
//
//    @Column(name = "receiver_country")
//    private String receiverCountry;
//
//    @Column(name = "customer_name")
//    private String customerName;
//
//    @Column(name = "customer_id")
//    private String customerId;
//
//    @Column(name = "status")
//    private String status;
//
//    public Long getId() {
//        return id;
//    }
//
//    // ... other getters and setters
//
//    public String getReceiverStreetName() {
//        return receiverStreetName;
//    }
//
//    public void setReceiverStreetName(String receiverStreetName) {
//        this.receiverStreetName = receiverStreetName;
//    }
//
//    public String getReceiverStreetNumber() {
//        return receiverStreetNumber;
//    }
//
//    public void setReceiverStreetNumber(String receiverStreetNumber) {
//        this.receiverStreetNumber = receiverStreetNumber;
//    }
//
//    public String getReceiverCity() {
//        return receiverCity;
//    }
//
//    public void setReceiverCity(String receiverCity) {
//        this.receiverCity = receiverCity;
//    }
//
//    public String getReceiverZipCode() {
//        return receiverZipCode;
//    }
//
//    public void setReceiverZipCode(String receiverZipCode) {
//        this.receiverZipCode = receiverZipCode;
//    }
//
//    public String getReceiverCountry() {
//        return receiverCountry;
//    }
//
//    public void setReceiverCountry(String receiverCountry) {
//        this.receiverCountry = receiverCountry;
//    }
//}
//
