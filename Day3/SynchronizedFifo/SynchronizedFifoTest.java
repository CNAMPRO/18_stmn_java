import static org.junit.jupiter.api.Assertions.*;

//nextInt is normally exclusive of the top value,
//so add 1 to make it inclusive
class SynchronizedFifoTest {
	int randomNum = ThreadLocalRandom.current().nextInt(0, 99 + 1);

	@Test
	void test() {
		SynchronizedFifo fifo = new SynchronizedFifo(100);

		Runnable producteur = new Runnable() {
			@Override
			public void run() {
				fifo.push(randomNum);
				System.out.println("Producteur produit => " + fifo.getElement(0));
				System.out.println(fifo.getSize());

			}
		};
		
		Runnable consommateur = new Runnable() {
			@Override
			public void run() {
				int popped;
					try {
						popped = fifo.pop();
						//assertEquals(randomNum, popped);
						System.out.println("Consommateur consomme => " + popped);
						System.out.println(fifo.getSize());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

		
			}
		};
	
		for(int i = 0; i<10; i++) {
			Thread th = new Thread(producteur);
			th.start();
			th = new Thread(consommateur);
			th.start();
		}
		
		for(int i = 0; i<20; i++) {
			Thread th = new Thread(consommateur);
			th.start();
		}

		
	
	}


}

