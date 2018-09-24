package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReservationManagerTest {

	@Test
	void testGet0() {
		ReservationManager m = new ReservationManager();
		assertEquals(null, m.getReservation(0));
	}
	
	@Test
	void testCreateOk() throws Exception {
		ReservationManager m = new ReservationManager();
		Reservation a = m.createReservation(1,"14/05/2018");
		assertEquals(a, m.getReservation(1));
	}

}
