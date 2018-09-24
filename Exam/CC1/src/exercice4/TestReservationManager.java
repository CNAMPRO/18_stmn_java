package exercice4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

class TestReservationManager {

	@Test
	public final void testAdd() {
		ReservationManageur reservAdmin = new ReservationManageur();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		reservAdmin.creerReservation(new Reservation("KBI", "206", "ADONF", c.getTime()));
		
		assertEquals(new Reservation("KBI", "206", "ADONF", c.getTime()), reservAdmin.consulterParDate(c.getTime()).get(0));
	}
	
	@Test
	public final void testUpdate() {
		ReservationManageur reservAdmin = new ReservationManageur();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		reservAdmin.creerReservation(new Reservation("KBI", "195", "ADONF", c.getTime()));
		reservAdmin.creerReservation(new Reservation("VSA", "195", "IDK", c.getTime()));
		
		ArrayList<Reservation> b = reservAdmin.consulterParDate(c.getTime());
		assertEquals("IDK", b.get(0).nom);
		assertEquals("VSA", b.get(0).proprietaire);
	}
	
	@Test
	public final void testDelete() {
		ReservationManageur reservAdmin = new ReservationManageur();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		reservAdmin.creerReservation(new Reservation("KBI", "25", "ADONF", c.getTime()));
		
		reservAdmin.supprimerReservation(new Reservation("", "25", "", c.getTime()));
		
		ArrayList<Reservation> b = reservAdmin.consulterParDate(c.getTime());
		assertTrue(b.isEmpty());
	}
	
	@Test
	public final void testViewByRoom() {
		ReservationManageur reservAdmin = new ReservationManageur();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		reservAdmin.creerReservation(new Reservation("JSP", "156", "JPPDIPP", c.getTime()));
		c.set(2018, 9, 29);
		reservAdmin.creerReservation(new Reservation("JSP", "156", "JPPDIPP", c.getTime()));
		
		
		ArrayList<Reservation> b = reservAdmin.consulterParNumero("156");
		assertEquals(2, b.size());
	}


}
