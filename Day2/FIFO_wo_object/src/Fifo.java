public class Fifo {

	int[] tab;
	int cpt = 0;
	int size = 0;
		
	static public int pop(Fifo f)
	{
		
		int head = f.tab[0];
		
		for(int i = 1; i < f.size;i++)
			f.tab[i-1] = f.tab[i];
		f.size--;
		return head;
	}
	
	static public void push(Fifo f,int value)
	{
		f.tab[f.size] = value;
		f.size++;
	}
}
