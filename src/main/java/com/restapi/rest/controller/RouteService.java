package com.restapi.rest.controller;

import com.restapi.rest.model.BookingDetails;
import com.restapi.rest.model.ReceiverAddress;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class RouteService {
    static ReceiverAddress receiverAddress = new ReceiverAddress("456 Pine Street", "Unit 3C", "San Francisco", "94101", "USA");
    static BookingDetails bookingDetails = new BookingDetails("booking123", "tr1112", "Medium", 3.7, "789 Oak Lane, Apt 2B, Los Angeles, 90001, USA", receiverAddress, "Jane Smith", "Cust789");
    static String senderLocation;
    static String receiverLocation;




//    public static void generateGpsCordinates (String senderAddress, String receiverAddress)
//    public static void generateGpsCordinates ()
//    {
//        String senderCoordinates, receiverCoordinates;
//        String senderAddress = bookingDetails.getSenderAddress();
////        String recAddress=   receiverAddress.toString();
//
//        try {
//            URL url = new URL("https://www.mapquestapi.com/geocoding/v1/batch?key=KEY&location="+senderAddress+"&location="+receiverAddress.toString());
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//
//            int responseCode = conn.getResponseCode();
//            if (responseCode != 200)
//            {
//                throw new RuntimeException("HttpResponseCode:" + responseCode);
//            } else {
//                StringBuilder informationString = new StringBuilder();
//                Scanner scanner = new Scanner(url.openStream);
//
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }



    public static void generateGpsCoordinates() {
        String senderCoordinates, receiverCoordinates;
        String senderAddress = bookingDetails.getSenderAddress();
        // String recAddress = receiverAddress.toString();
        String apiKey = "lP4PGwfBZ1Db3DrxVpCKQViuXFAixzqw"; // Replace with your actual API key
        String rAddress = "Vidnäsinkatu 16, Kokkola, Finland";
        String sAddress = "Talonpojankatu 2, Kokkola, Finland";

        String encodedRAddress;
        String encodedSAddress;

// Encode the addresses
        try {
             encodedSAddress = URLEncoder.encode("Talonpojankatu 2, Kokkola, Finland", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        try {
             encodedRAddress = URLEncoder.encode("Vidnäsinkatu 16, Kokkola, Finland", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }


        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet("https://www.mapquestapi.com/geocoding/v1/batch?key=" + apiKey + "&location=" + encodedSAddress+ "&location="+ encodedRAddress);

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                int statusCode = response.getStatusLine().getStatusCode();

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    try (InputStream content = entity.getContent()) {
                        ObjectMapper objectMapper = new ObjectMapper();
                        JsonNode jsonNode = objectMapper.readTree(content);
                        // Now you can work with the JSON data in the jsonNode

                        // Extract senderlat and senderlong from the first location in the first result
                        double senderlat = jsonNode.get("results").get(0).get("locations").get(0).get("latLng").get("lat").asDouble();
                        double senderlong = jsonNode.get("results").get(0).get("locations").get(0).get("latLng").get("lng").asDouble();

                        double receiverlat = jsonNode.get("results").get(1).get("locations").get(0).get("latLng").get("lat").asDouble();
                        double receiverlong = jsonNode.get("results").get(1).get("locations").get(0).get("latLng").get("lng").asDouble();
                        System.out.println("senderlat: " + senderlat);
                        System.out.println("senderlong: " + senderlong);
                        senderLocation = senderlong+","+senderlat;
                        System.out.println("receiverlat: " + receiverlat);
                        System.out.println("receiverlong: " + receiverlong);

                        receiverLocation = receiverlong +","+ receiverlat;
                        generateRoute(senderLocation, receiverLocation);

                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void generateRoute(String startLocation, String endLocation) {
        String apiKey = "5b3ce3597851110001cf624818d0cbde05fe4df7af23bccfff329846";
//        String startLocation = "8.681495,49.41461";
//        String endLocation = "8.687872,49.420318";
        String profile = "driving-car";
        String apiUrl = "https://api.openrouteservice.org/v2/directions/" + profile +
                "?api_key=" + apiKey +
                "&start=" + startLocation +
                "&end=" + endLocation;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(apiUrl);

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                int statusCode = response.getStatusLine().getStatusCode();

                if (statusCode >= 200 && statusCode < 300) {
                    // Successful response
                    ObjectMapper objectMapper = new ObjectMapper();
                    JsonNode jsonNode = objectMapper.readTree(response.getEntity().getContent());
                    JsonNode metadata = jsonNode.get("metadata");
                    JsonNode segmentsNode = jsonNode.get("segments");

                    // Convert the "segments" data back to a JSON string
                    String segmentsJson = objectMapper.writeValueAsString(segmentsNode);


                    if (metadata != null) {
                        JsonNode timestampNode = metadata.get("timestamp");

                        if (timestampNode != null && timestampNode.isNumber()) {
                            long timestamp = timestampNode.asLong();
                            System.out.println("Timestamp: " + timestamp);
                        } else {
                            System.out.println("Timestamp not found.");
                        }
                    } else {
                        System.out.println("Metadata not found in the response.");
                    }
                } else {
                    // Handle unsuccessful response (e.g., print error message)
                    System.out.println("API request failed with status code: " + statusCode);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
