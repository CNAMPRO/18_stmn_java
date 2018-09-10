                                                                                 import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFifo {

	@Test
	void test() {
		Fifo f = new Fifo();
		f.tab = new int[5000];
		f.size = 0;
		
		for(int i = 0;i<=1000;i++)
		{
			Fifo.push(f,i);
		}
		
		for(int i = 1;i<=100;++i)
		{
			System.out.println(Fifo.pop(f));
		}
	}

}
