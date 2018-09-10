public class Fifo {
	private int[] elements;
	private int size;
	private int capacity;
	
	Fifo(int capacity){
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	public int pop()
	{		
		int head = elements[0];
		
		for(int i = 1; i < size;i++)
			elements[i-1] = elements[i];
		size--;
		return head;
	}
	
	public void push(int value)
	{
		elements[size] = value;
		size++;
	}
}
