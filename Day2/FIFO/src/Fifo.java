
public class Fifo {
	
	private int[] tab;
	private int capacity;
	private int size;
	Fifo(int capacity)
	{
		tab = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	public int pop()
	{
		int head = tab[0];
		for(int i=1;i<size;i++)
			tab[i-1]=tab[i];
		size = size -1;
		return head;
	}
	public void add(int value)
	{
		tab[size] = value;
		size++;
	}

}
