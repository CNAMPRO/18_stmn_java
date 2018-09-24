package Exo4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Test;

public class HotelManageurTest {

	
	
	@Test
	public final void testUpdate() {
		HotelManageurADMIN mgr = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2017, 10, 6);
		
		mgr.CreeNewReservation(new HotelManageur("JPC", "V1.021", "Java course", c.getTime()));
		mgr.CreeNewReservation(new HotelManageur("LSD", "V1.021", "Exam1", c.getTime()));
		
		ArrayList<HotelManageur> b = mgr.CheckByDate(c.getTime());
		assertEquals("Exam1", b.get(0).title);
		assertEquals("LSD", b.get(0).Touriste);
	}
	@Test
	public final void testViewByRoom() {
		HotelManageurADMIN mgr = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2017, 10, 6);
		
		mgr.CreeNewReservation(new HotelManageur("JPC", "V1.021", "Java course", c.getTime()));
		c.set(2017, 10, 13);
		mgr.CreeNewReservation(new HotelManageur("JPC", "V1.021", "Java course", c.getTime()));
		
		
		ArrayList<HotelManageur> b = mgr.CheckByChambre("V1.021");
		assertEquals(2, b.size());
	}
	@Test
	public final void testAdd() {
		HotelManageurADMIN mgr = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2017, 10, 6);
		
		mgr.CreeNewReservation(new HotelManageur("JPC", "V1.021", "Java course", c.getTime()));
		
		assertEquals(new HotelManageur("JPC", "V1.021", "Java course", c.getTime()), mgr.CheckByDate(c.getTime()).get(0));
	}
	@Test
	public final void testDelete() {
		HotelManageurADMIN mgr = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2017, 10, 6);
		
		mgr.CreeNewReservation(new HotelManageur("JPC", "V1.021", "Java course", c.getTime()));
		
		mgr.SupprimerReservation(new HotelManageur("", "V1.021", "", c.getTime()));
		
		ArrayList<HotelManageur> b = mgr.CheckByDate(c.getTime());
		assertTrue(b.isEmpty());
	}
	
	

}