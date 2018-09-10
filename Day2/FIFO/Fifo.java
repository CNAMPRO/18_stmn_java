
public class Fifo {
	
	int[]tab;
	int capacity;
	int size;
	
	public static void main(String[] args)
	{
		
	}
	public static int pop(Fifo f)
	{
		int head = f.tab[0];
		for(int i=1;i<f.size;i++)
			f.tab[i-1]=f.tab[i];
		f.size = f.size -1;
		return head;
	}
	public static void add(Fifo f,int value)
	{
		f.tab[f.size] = value;
		f.size++;
	}

}
