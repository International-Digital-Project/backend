package com.restapi.rest.controller;

import com.restapi.rest.model.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/price")
public class PricingAPIService {
//    @PostMapping
//    public ResponseEntity<PriceResponse> calculatePrice(@RequestBody PriceRequest priceRequest) {
//        // Extract request parameters
//        String size = priceRequest.getSize();
//        double weight = priceRequest.getWeight();
//        String senderAddress = priceRequest.getSenderAddress();
//        String streetName = priceRequest.getReceiverAddress().getStreetName();
//        String streetNumber = priceRequest.getReceiverAddress().getStreetNumber();
//        String city = priceRequest.getReceiverAddress().getCity();
//        String zipCode = priceRequest.getReceiverAddress().getZipCode();
//        String country = priceRequest.getReceiverAddress().getCountry();
//
//        PriceResponse priceResponse = new PriceResponse();
//
//
//        // Check for mandatory fields
//        if (size == null || weight <= 0 || senderAddress == null || streetName == null || streetNumber == null || city == null || zipCode == null || country == null) {
//            priceResponse.setMessage("One or more mandatory fields are empty");
//            return new ResponseEntity<>(priceResponse, HttpStatus.BAD_REQUEST);
//        }
//
//        // Pricing logic
//        double greenPrice = 100.0;
//        double cheapestPrice = 70.0;
//        double expressPrice = 110.0;
//
//        priceResponse = new PriceResponse("Success",greenPrice, cheapestPrice, expressPrice);
//
//        return new ResponseEntity<>(priceResponse, HttpStatus.OK);
//    }


@PostMapping
public ResponseEntity<List<PriceOption>> calculatePrice(@RequestBody NewPriceRequest priceRequest) {
    double ecoPrice = 100.0;
    double fastPrice = 70.0;
    double regularPrice = 110.0;

    NewPriceResponse priceResponse = new NewPriceResponse();

    List<PriceOption> options = new ArrayList<>();
    options.add(new PriceOption("eco", ecoPrice));
    options.add(new PriceOption("fast", fastPrice));
    options.add(new PriceOption("regular", regularPrice));

    // Return the response with HttpStatus.OK
    return new ResponseEntity<>(options, HttpStatus.OK);
}
}
