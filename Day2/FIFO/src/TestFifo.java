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
	
	@Test
	void testComplete() {
		Fifo f = new Fifo(5000);
		
		for (int i=1; i<=1000;++i) {
			f.push(i);
		}
		
		for (int i=0; i<100;++i) {
			System.out.println(f.pop());
		}

	}

}
