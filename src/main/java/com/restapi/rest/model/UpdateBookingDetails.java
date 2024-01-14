package com.restapi.rest.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateBookingDetails {
    @Valid

    @NotNull(message = "size is mandatory")
    @NotBlank(message = "size is mandatory")
    private String size;
//    @Positive
    @Min(value = 0, message = "weight must be positive")
    private double weight;
    @NotNull(message = "senderAddress is mandatory")
    @NotBlank(message = "senderAddress is mandatory")
    private String senderAddress;
    @NotNull(message = "receiverAddress is mandatory")
    private ReceiverAddress receiverAddress;
    @NotNull(message = "customerName is mandatory")
    @NotBlank(message = "customerName is mandatory")
    private String customerName;

    public UpdateBookingDetails() {

    }

    @NotNull(message = "customerId is mandatory")
    @NotBlank(message = "customerId is mandatory")
    private String customerId;

    public UpdateBookingDetails(String size, double weight, String senderAddress, ReceiverAddress receiverAddress, String customerName, String customerId) {
        this.size = size;
        this.weight = weight;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.customerName = customerName;
        this.customerId = customerId;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public ReceiverAddress getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(ReceiverAddress receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}


