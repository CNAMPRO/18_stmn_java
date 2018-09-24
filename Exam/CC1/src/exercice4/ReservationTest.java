package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservationTest {

	
	Reservation a;
	
	@BeforeEach
    void init() throws ParseException {
		a = new Reservation(1,"14/05/2018");
    }
	@Test
	void testModif() throws ParseException {
		a.setReservation(2,"25/05/2018");
		assertEquals(2, a.getNum());
	}
	
	

}
