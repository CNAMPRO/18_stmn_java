import static org.junit.jupiter.api.Assertions.*;

class testmodel {
	
	modelclass  michel;
	void init() {
		michel = new modelclass(36);
	}
	
	@Test
	void testGetAge() {
		michel.getAge();
		assertEquals(36d, michel.getAge());
	}
}
