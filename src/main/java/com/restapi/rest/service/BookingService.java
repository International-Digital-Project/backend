/*
package com.restapi.rest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService {

    @Value("${external.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public BookingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NewBookingDetails getBookingDetails(String bookingId) {
        String url = apiUrl + bookingId;
        ResponseEntity<NewBookingDetails> responseEntity = restTemplate.getForEntity(url, NewBookingDetails.class);
        return responseEntity.getBody();
    }
}

*/
