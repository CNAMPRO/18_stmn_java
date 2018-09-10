import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFifo {

	@Test
	void testFifo() {
		Fifo f = new Fifo();
		f.elements = new int[100];
		f.size = 0;
		
		for (int i=1; i<=1000;++i) {
			f.size = 5;
			Fifo.push(f, i);
		}
		
		for (int i=1; i<=100;++i) {
			System.out.println(Fifo.pop(f));
		}
	}

}