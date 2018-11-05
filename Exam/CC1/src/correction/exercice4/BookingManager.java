package exercice4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

public class BookingManager {
	private final Hashtable<String, Booking> bookings = new Hashtable<>();
	
	public Booking getBooking(String id) {
		return bookings.get(id);
	}
	
	public ArrayList<Booking> getBookingByDate(Date date) {
		ArrayList<Booking> result = new ArrayList<>();
		for (Booking b:bookings.values()) {
			if (b.date.equals(date)) {
				result.add(b);
			}
		}
		return result;
	}
	
	public ArrayList<Booking> getBookingByRoom(int roomNumber) {
		ArrayList<Booking> result = new ArrayList<>();
		for (Booking b:bookings.values()) {
			if (b.roomNumber == roomNumber) {
				result.add(b);
			}
		}
		return result;
	}
	
	public void addBooking(Booking booking) {
		bookings.put(booking.id, booking);
	}
	
	public void deleteBooking(String id) {
		bookings.remove(id);
	}
}
