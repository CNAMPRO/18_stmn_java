
public class FIFO {
	private int [] elements;
	private int capacity;
	private int size;
	
	Thread add = new add Thread();
	add.start();
	Thread pop = new pop Thread();
	pop.start();
	
	Fifo(int capacity){
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	public static int pop () {
		int head = elements[0];
		synchronize(elements){
		for(int i = 1; i < f.size; i++) {
			elements[i - 1] = elements[i]		
		}
		size--;
		return head;
		}
	}
	
	public static void push (int valeur) {
		elements[size] = valeur;
		size++;
	}
}


