import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class testFifo {

	@Test  
	void testPop() {
		
	Fifo f = new Fifo(5000);
	f.push(18);
	
	assertEquals(18,f.pop());
	}
	
	@Test
	void testComplete() {
		Fifo f = new Fifo(5000);
		
		for(int i = 0;i<=1000;i++)
		{
			f.push(i);
		}
		
		for(int i = 0;i<100;++i)
		{
			System.out.println(f.pop());
		}
	}
	
	@Test
	void testThread(){
		
		ArrayList al = new ArrayList();
		
		Fifo f = new Fifo(5000);
	    
		Thread threadPop1 = new Thread()
		{
			public void run() {
				for(int i = 0;i<1000;i++)
				{
					al.add(f.pop());
				}
			}
		};
		
		Thread threadPop2 = new Thread()
		{
			public void run() {
				for(int i = 0;i<1000;i++)
				{
					al.add(f.pop());
				}
			}
		};
		
		Thread threadAdd = new Thread()
		{
			public void run(){
				for(int i =0;i<2000;i++)
				{
					f.push(i);	
				}
			}
		};
		
		threadAdd.start();
		threadPop1.start();          
		threadPop2.start();  
		
		try {
			threadAdd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			threadPop1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			threadPop2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < al.size(); i++)
	    {
	      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
	    }  
		
	}

}
