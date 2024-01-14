//import com.restapi.rest.controller.BookingAPIService;
//import com.restapi.rest.model.BookingDetails;
//import com.restapi.rest.model.BookingResponse;
//import com.restapi.rest.model.UpdateBookingDetails;
//import com.restapi.rest.model.BookingStatusResponse;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class BookingAPIServiceTest {
//
//    private BookingAPIService bookingAPIService;
//
//    @BeforeEach
//    public void setUp() {
//        bookingAPIService = new BookingAPIService();
//
//        // Create a booking with tracking ID "T123" and other properties
//        BookingDetails initialBooking = new BookingDetails();
//        initialBooking.setBookingId("123");
//        initialBooking.setTrackingId("T123");
//        // Set other properties as needed
//        bookingAPIService.createBooking(initialBooking);
//    }
//
//
//    @Test
//    public void testCreateBooking() {
//        BookingDetails bookingDetails = new BookingDetails();
//        bookingDetails.setBookingId("1234");
//        bookingDetails.setTrackingId("T1234");
//        // Set other properties as needed
//
//        ResponseEntity<BookingResponse> response = bookingAPIService.createBooking(bookingDetails);
//
//        assertEquals(HttpStatus.CREATED, response.getStatusCode());
//        assertNotNull(response.getBody());
//        assertEquals("Booking created successfully", response.getBody().getMessage());
//    }
//
//    @Test
//    public void testGetBookingDetails() {
//        // Create a sample booking and add it to the service
//        BookingDetails bookingDetails = new BookingDetails();
//        bookingDetails.setBookingId("123");
//        bookingDetails.setTrackingId("T123");
//        // Set other properties as needed
//        bookingAPIService.createBooking(bookingDetails);
//
//        ResponseEntity<BookingStatusResponse> response = bookingAPIService.getBookingDetails("T123");
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertNotNull(response.getBody());
//
//        // Assert that the status is "Success," or adjust the condition based on your application's logic
//        // You should update this assertion to match the actual behavior of your API
//        assertEquals("Success", response.getBody().getStatus());
//    }
//
//
//    @Test
//    public void testGetBookingDetailsNotFound() {
//        ResponseEntity<BookingStatusResponse> response = bookingAPIService.getBookingDetails("NonExistentTrackingId");
//
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//        assertNotNull(response.getBody());
//        assertEquals("FAILED", response.getBody().getStatus());
//    }
//
//    @Test
//    public void testUpdateBooking() {
//        BookingDetails bookingDetails = new BookingDetails();
//        bookingDetails.setBookingId("123");
//        ResponseEntity<BookingResponse> createResponse = bookingAPIService.createBooking(bookingDetails);
//
//        UpdateBookingDetails updateBookingDetails = new UpdateBookingDetails();
//        updateBookingDetails.setSize("Large");
//        updateBookingDetails.setWeight(5.0);
//
//        ResponseEntity<BookingResponse> updateResponse = bookingAPIService.updateBooking("T123", updateBookingDetails);
//
//        assertEquals(HttpStatus.OK, updateResponse.getStatusCode());
//        assertNotNull(updateResponse.getBody());
//        // Update this assertion based on your actual application behavior
//        assertEquals("Updated", updateResponse.getBody().getMessage());
//    }
//
//    @Test
//    public void testUpdateBookingNotFound() {
//        UpdateBookingDetails updateBookingDetails = new UpdateBookingDetails();
//        ResponseEntity<BookingResponse> response = bookingAPIService.updateBooking("NonExistentTrackingId", updateBookingDetails);
//
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//    }
//
//
//
//    @Test
//    public void testGetAllBookings() {
//        ResponseEntity<List<BookingDetails>> response = bookingAPIService.getAllBookings();
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertNotNull(response.getBody());
//        // Add more assertions to check the content of the list, if needed.
//    }
//}
