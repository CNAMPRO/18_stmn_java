public class FIFO {
	int[] elements;
	int capacity;
	int size;
	
	public static void init(FIFO f, int capacity) {
		f.elements = new int[capacity];
		f.capacity = capacity;
	}
	
	public static int pop(FIFO f) {
		int head = f.elements[0];
		for (int i=1;i<f.size; i++) {
			f.elements[i-1] = f.elements[i];
		}
		f.size = f.size -1;
		return head;
	}
	
	public static void push(FIFO f, int value) {
		f.elements[f.size] = value;
		f.size = f.size + 1;
	}
}