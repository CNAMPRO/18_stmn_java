package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestBooking {

	@Test
	void testCreate() throws Exception {
		BookingManager manager = new BookingManager();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		manager.addBooking(new Booking("0123456", formatter.parse("24/09/2018"), 208));
		manager.addBooking(new Booking("9875632", formatter.parse("24/09/2018"), 309));
		manager.addBooking(new Booking("5476321", formatter.parse("31/12/2018"), 208));
		
		Booking b1 = manager.getBooking("0123456");
		assertEquals(formatter.parse("24/09/2018"), b1.date);
		assertEquals(208, b1.roomNumber);
		
		ArrayList<Booking> bookings1 = manager.getBookingByDate(formatter.parse("24/09/2018"));
		assertEquals(2, bookings1.size());
		
		ArrayList<Booking> bookings2 = manager.getBookingByRoom(208);
		assertEquals(2, bookings2.size());
		
		//Add some more tests
	}

}
