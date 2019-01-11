
public class FIFO {
	private int [] elements;
	private int capacity;
	private int size;

	Fifo(int capacity){
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	 synchronized public int pop () {
		int head = elements[0];
		for(int i = 1; i < f.size; i++) {
			elements[i - 1] = elements[i]		
		}
		size--;
		return head;
	}
	
	 synchronized public void push (int valeur) {
		elements[size] = valeur;
		size++;
	}
}
