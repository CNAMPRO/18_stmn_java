
public class Fifo {
	private int[] elements;
	private int capacity;
	private int size;
	
	Fifo(int capacity) {
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	public synchronized int pop() {
		while (size==0) {
			try {
				System.out.println("Waiting");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int head = elements[0];
		for (int i = 1; i < size; i++) {
			elements[i - 1] = elements[i];
		}
		size = size - 1;
		return head;
	}
	
	public synchronized void push(int value) {
		elements[size] = value;
		size = size + 1;
		notifyAll();
	}
	
	int getElement(int i) {
		return elements[i];
	}
}