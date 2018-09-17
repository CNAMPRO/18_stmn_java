import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAccountManager {

	@Test
	void testGetUnknown() {
		AccountManager m = new AccountManager();
		assertEquals(null, m.getAccount("Unknown"));
	}
	
	@Test
	void testCreateOk() {
		AccountManager m = new AccountManager();
		try {
			Account a = m.createAccount("myAccount");
			assertEquals(a, m.getAccount("myAccount"));
		} catch (Exception ex) {
			fail("This test should not fail");
		}
	}
	
	@Test
	void testCreateAlreadyExisting() {
		AccountManager m = new AccountManager();
		try {
			m.createAccount("myAccount");
		} catch (Exception ex) {
			fail("This test should not fail here");
		}
		Throwable exception = assertThrows(Exception.class, () -> {m.createAccount("myAccount");});
		assertEquals("An account for id myAccount already exists", exception.getMessage());
	}
	
	@Test
	void testCloseOk() {
		AccountManager m = new AccountManager();
		try {
			m.createAccount("myAccount");
			m.closeAccount("myAccount");
			assertEquals(null, m.getAccount("myAccount"));
		} catch (Exception ex) {
			fail("This test should not fail here");
			ex.printStackTrace();
		}
	}
	
	@Test
	void testCloseUnknown() {
		AccountManager m = new AccountManager();
		Throwable exception = assertThrows(Exception.class, () -> {m.closeAccount("unknown");});
		assertEquals("Account with id unknown does not exist", exception.getMessage());
	}

}
