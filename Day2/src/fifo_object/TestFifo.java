package fifo_object;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFifo {

	@Test
	void testPop() {
		Fifo f = new Fifo(5000);
		f.push(18);
		assertEquals(18, f.pop());
	}
	
	@Test
	void testPush() {
		Fifo f = new Fifo(5000);
		f.push(18);
		assertEquals(18, f.getElement(0));
	}

}
