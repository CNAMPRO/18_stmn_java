package fifo_object;

public class Fifo {
	private int[] elements;
	private int capacity;
	private int size;
	
	Fifo(int capacity) {
		this.elements = new int[capacity];
		this.capacity = capacity;
	}
	
	public int pop() {
		int head = elements[0];
		for (int i=1;i<size; i++) {
			elements[i-1] = elements[i];
		}
		size = size -1;
		return head;
	}
	
	public void push(int value) {
		elements[size] = value;
		size = size + 1;
	}
	
	public int getElement(int i) {
		return elements[i];
	}
}
