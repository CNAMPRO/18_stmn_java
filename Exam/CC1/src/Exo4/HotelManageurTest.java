package Exo4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Test;

public class HotelManageurTest {

	
	
	@Test
	public final void testUpdate() {
		
		
		HotelManageurADMIN AdministrateurForReservation = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		AdministrateurForReservation.CreeNewReservation(new HotelManageur("tpp", "V69", "AfondLaFOrmeDECATHLON", c.getTime()));
		AdministrateurForReservation.CreeNewReservation(new HotelManageur("JPPDELIPP", "V69", "Exam1", c.getTime()));
		
		ArrayList<HotelManageur> b = AdministrateurForReservation.CheckByDate(c.getTime());
		assertEquals("Exam1", b.get(0).title);
		assertEquals("JPPDELIPP", b.get(0).Touriste);
	}
	@Test
	public final void testViewByRoom() {
		HotelManageurADMIN AdministrateurForReservation = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		AdministrateurForReservation.CreeNewReservation(new HotelManageur("strongo", "V69", "AfondLaFOrmeDECATHLON", c.getTime()));
		c.set(2018, 9, 13);
		AdministrateurForReservation.CreeNewReservation(new HotelManageur("strongo", "V69", "AfondLaFOrmeDECATHLON", c.getTime()));
		
		
		ArrayList<HotelManageur> b = AdministrateurForReservation.CheckByChambre("V69");
		assertEquals(2, b.size());
	}
	@Test
	public final void testAdd() {
		HotelManageurADMIN AdministrateurForReservation = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		AdministrateurForReservation.CreeNewReservation(new HotelManageur("Polo", "V250km", "PasPLUSviteQueAfond", c.getTime()));
		
		assertEquals(new HotelManageur("Polo", "V250km", "PasPLUSviteQueAfond", c.getTime()), AdministrateurForReservation.CheckByDate(c.getTime()).get(0));
	}
	@Test
	public final void testDelete() {
		HotelManageurADMIN AdministrateurForReservation = new HotelManageurADMIN();
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 24);
		
		AdministrateurForReservation.CreeNewReservation(new HotelManageur("strongo", "V69", "AfondLaFOrmeDECATHLON", c.getTime()));
		
		AdministrateurForReservation.SupprimerReservation(new HotelManageur("", "V69", "", c.getTime()));
		
		ArrayList<HotelManageur> b = AdministrateurForReservation.CheckByDate(c.getTime());
		assertTrue(b.isEmpty());
	}
	
	

}