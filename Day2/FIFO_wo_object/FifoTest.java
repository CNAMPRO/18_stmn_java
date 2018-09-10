import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFifo {

	@Test
	void testFifo() {
		Fifo f = new Fifo();
		f.size = 0;
		for(int i = 0; i<=1000;i++)
			Fifo.add(f,i);
		for(int i = 0; i<=1000;i++)
			System.out.println(Fifo.pop(f));
	}

}
