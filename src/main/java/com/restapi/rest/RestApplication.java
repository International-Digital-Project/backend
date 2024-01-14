package com.restapi.rest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restapi.rest.controller.RouteService;
import com.restapi.rest.model.Addresses;
import com.restapi.rest.model.NewPriceRequest;
import com.restapi.rest.model.Parcel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RestApplication {
	public static void main(String[] args) throws JsonProcessingException {
//		RouteService.generateGpsCoordinates ();

//		RouteService.checkApiResponse();
	SpringApplication.run(RestApplication.class, args);
		NewPriceRequest res  = new NewPriceRequest();
		Addresses ad = new Addresses();
		ad.setReceiverCity("aa");
		ad.setReceiverCountry("aa");
		Parcel p = new Parcel();
		p.setHeight(8);

		res.setAddresses(ad);
		res.setParcel(p);

// Initialize Jackson ObjectMapper
		ObjectMapper objectMapper = new ObjectMapper();

		// Convert object to JSON string
		String jsonString = objectMapper.writeValueAsString(res);

		// Print the JSON string
		System.out.println(jsonString);


	}
}
