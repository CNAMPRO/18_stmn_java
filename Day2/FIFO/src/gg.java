import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFifo {

	@Test
	void testFifoPop() {
		Fifo f = new Fifo(5000);
		f.add(18);
		assertEquals(18,f.pop());
	}

	@Test
	void testFifoAdd() {
		Fifo f = new Fifo(5000);
		
		for(int i = 0; i<=1000;i++)
			f.add(i);
		for(int i = 0; i<=1000;i++)
			System.out.println(f.pop());
	}

}
