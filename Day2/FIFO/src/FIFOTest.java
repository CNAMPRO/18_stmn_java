import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FIFOTest {

	Thread add = new Thread();
	Thread pop = new Thread();
	
	@Test
	void test() {
		FIFO f = new FIFO(5000);
		
		
		for (int i = 1; i <= 1000; i++) {
			f.push(i);
		}
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(f.pop());
		}
	}

}
