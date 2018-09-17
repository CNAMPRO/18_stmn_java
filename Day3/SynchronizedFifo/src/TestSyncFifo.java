import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSyncFifo {

	@Test
	public final void test() {
		final Fifo l = new Fifo(5000);

		Thread t1 =new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(l.pop());
			}
		});
		Thread t2 =new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(l.pop());
			}
		});
		Thread t3 =new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(l.pop());
			}
		});
		
		Thread u =new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				l.push(1);
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		u.start();
		
		
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
