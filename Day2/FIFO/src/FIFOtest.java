import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FIFOtest {

	@Test
	void Threadtest() {
		
		int[] liste = new int[2000];
		int taille = 0;
		
		Fifo f = new Fifo(5000);
		
		Thread ThreadPop = new Thread() {
			public void run() {
				for(int i = 0; i<1000; i++) {
					liste[taille] = f.pop;
					taille++;	
				}
			}
		};
		
		Thread ThreadPop1 = new Thread() {
			public void run() {
				for(int i = 0; i<1000; i++) {
					liste[taille] = f.pop;
					taille++;	
				}
			}
		};
		
		Thread ThreadAdd = new Thread() {
			public void run() {
				for(int i = 0; i<2000; i++) {
					f.push();
				}
			}
		};
		
		ThreadPop.start();
		ThreadPop1.start();
		ThreadAdd.start();
		
	}

}
