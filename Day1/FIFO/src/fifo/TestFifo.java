package fifo;
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
		
		int[] expected = new int[100];
		for (int i=0; i<100;++i) {
			expected[i] = i+1;
		}
		int[] buffer = new int[100];
		int index=0;
		for (int i=0; i<100;++i) {
			buffer[index++] = f.pop();
		}
		assertArrayEquals(expected, buffer);

	}

}
