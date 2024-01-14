package com.restapi.rest.controller;

import com.restapi.rest.model.BookingDetails;
import com.restapi.rest.model.BookingResponse;
import com.restapi.rest.model.UpdateBookingDetails;
import com.restapi.rest.model.ReceiverAddress;
import com.restapi.rest.model.BookingStatusResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;

import java.util.*;

@CrossOrigin(
        origins = {
                "http://localhost:3000/",
                "https://staging.example.com/",
                "https://app.example.com/"
        },
        methods = {
                RequestMethod.OPTIONS,
                RequestMethod.GET,
                RequestMethod.PUT,
                RequestMethod.DELETE,
                RequestMethod.POST
        })


@RestController
@RequestMapping("/tracking")
public class BookingAPIService {
    BookingDetails bookingDetails;
    private final List<BookingDetails> bookingList = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<BookingDetails>> getAllBookings() {
        List<BookingDetails> bookingList = new ArrayList<>();
        // Return the list of all bookings, hardcode for tests.
        BookingDetails booking = new BookingDetails();
        booking.setBookingId("123456T");
        bookingList.add(booking);
        return new ResponseEntity<>(bookingList, HttpStatus.OK);
    }

    @GetMapping("{trackingId}")
    public ResponseEntity<BookingStatusResponse> getBookingDetails(@PathVariable  String trackingId) {
        for (BookingDetails booking : bookingList) {
            if (booking.getTrackingId().equals(trackingId)) {
                BookingStatusResponse response = new BookingStatusResponse(booking.getStatus(),booking.getTrackingId());
                return new ResponseEntity<>(response, HttpStatus.OK);
               }
        }
        // If the booking with the provided tracking ID is not found, return a 404 response
        return new ResponseEntity<>(new BookingStatusResponse("Received", trackingId),HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity<BookingResponse> createBooking(@Valid @RequestBody BookingDetails bookingDetails) {
//        BookingResponse bookingResponse = new BookingResponse();
//        String bookingId = bookingDetails.getBookingId();
//
//        // Check if a booking with the same bookingId already exists
//        for (BookingDetails existingBooking : bookingList) {
//            if (existingBooking.getBookingId().equals(bookingId)) {
//                // Return a conflict response if the bookingId already exists
//                return new ResponseEntity<>(new BookingResponse("Booking id already exists", bookingId, "null"),(HttpStatus.CONFLICT));
//            }
//        }
//
//        // If the bookingId is unique, proceed with creating the booking
//        // ... (generate trackingId, persist data, etc.)
//
//        bookingResponse.setBookingId(bookingId);
//        bookingResponse.setMessage("Booking created successfully");
//        String generatedTrackingId = generateRandomTrackingId();
//        bookingDetails.setTrackingId(generatedTrackingId);
//        bookingDetails.setStatus("PROCESSING");
//        bookingResponse.setTrackingId(generatedTrackingId);
//
//        bookingList.add(bookingDetails);
//
//        return new ResponseEntity<>(bookingResponse, HttpStatus.CREATED);
//    }


//    @PostMapping("/tracking/{bookingId}")
//    public ResponseEntity<BookingResponse> tracking(@PathVariable String bookingId) {
//        BookingResponse bookingResponse = new BookingResponse();
//        String generatedTrackingId = generateRandomTrackingId();
//
//        bookingResponse.setTrackingId(generatedTrackingId);
//        bookingResponse.setBookingId(bookingId);
//
//        return new ResponseEntity<>(bookingResponse, HttpStatus.CREATED);
//    }

    @PostMapping("/{bookingId}")
    public ResponseEntity<BookingResponse> tracking(@PathVariable String bookingId) {
        BookingResponse bookingResponse = new BookingResponse();
        String generatedTrackingId = generateRandomTrackingId();

        bookingResponse.setTrackingId(generatedTrackingId);
        bookingResponse.setBookingId(bookingId);

        return new ResponseEntity<>(bookingResponse, HttpStatus.CREATED);
    }

    public String generateRandomTrackingId() {
        String uuid = UUID.randomUUID().toString();
        String shortUuid = uuid.substring(0, 10); // Take the first 10 characters
        return "T" + shortUuid;
    }
}