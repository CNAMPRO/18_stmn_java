package exercice4;

import java.util.Date;

public class Booking {
	public final String id;
	public Date date;
	public int roomNumber;
	
	public Booking(String id, Date date, int roomNumber) {
		this.id = id;
		this.date = date;
		this.roomNumber = roomNumber;
	}
}
