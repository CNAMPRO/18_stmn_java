

public class threadfifo implements Runnable{
	int[] elements;
	int capacity;
	int size;
	private Thread thread;
	public void JobExecuter() {
		thread=new Thread(this);
		thread.start();
	}

	
	public static void init(threadfifo f, int capacity) {
		f.elements = new int[capacity];
		f.capacity = capacity;
	}
	
	public static int pop(threadfifo f) {
		int head = f.elements[0];
		for (int i=1;i<f.size; i++) {
			f.elements[i-1] = f.elements[i];
		}
		f.size = f.size -1;
		return head;
	}
	
	public static void push(threadfifo f, int value) {
		f.elements[f.size] = value;
		f.size = f.size + 1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
