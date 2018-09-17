import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAccount {

	Account a;
	
	@BeforeEach
    void init() {
		a = new Account("myAccount");
    }
	
	@Test
	void testInit() {
		assertEquals(0d, a.getBalance());
	}
	
	@Test
	void testDeposit() {
		a.deposit(50);
		assertEquals(50d, a.getBalance());
	}
	
	@Test
	void testDrawOk() {
		Account a = new Account("1");
		a.deposit(50);
		try {
			a.draw(25);
		} catch (Exception ex) {
			fail("This test should not fail on draw");
		}
		assertEquals(25d, a.getBalance());
	}
	
	@Test
	void testDrawKo() {
		Account a = new Account("1");
		a.deposit(50);
		Throwable exception = assertThrows(Exception.class, () -> {a.draw(75);});
		assertEquals("Cannot draw more than current balance", exception.getMessage());
	}

}
