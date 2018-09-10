import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FIFOTest {

	@Test
	public void testInsert() {
		FIFO unFifo = new FIFO();
		unFifo.enfile(unFifo.getListe(),888);

		assertEquals(Integer.valueOf(888), unFifo.getListe().get(0));			
	}
	
	@Test
	public void testDrop() {
		FIFO unFifo = new FIFO();
		unFifo.enfile(unFifo.getListe(),888);

		assertEquals(Integer.valueOf(888), unFifo.getListe().get(0));			
	}


}
