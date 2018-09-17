public class SynchronizedFifo {
	private int[] elements;
	private int capacity;
	private int size;
	
	SynchronizedFifo(int capacity) {
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	public  int pop() throws InterruptedException {
		synchronized (elements) {
			elements.wait();
			int head = elements[0];
			for (int i=1;i<size; i++) {
				elements[i-1] = elements[i];
			}
			size = size -1;
			return head;

		}
	}
	
	public synchronized void push(int value) {
		synchronized (elements) {
			elements[size] = value;
			size = size + 1;
			elements.notifyAll();
		}
		
	}
	
	int getSize() {
		return this.size;
	}
	
	int getElement(int i) {
		return elements[i];
	}
}
