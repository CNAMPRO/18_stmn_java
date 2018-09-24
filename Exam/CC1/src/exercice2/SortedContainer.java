package exercice2;

public class SortedContainer extends ISortable{
	private int[] elements;
	private int size;
	
	public int[] elements()
	{
		int[] returnInt = new int[size];
		for(int i =0;i<size;i++)
			returnInt[i]=elements[i];
		return returnInt;
	}
	
	public void add(int value) {
		elements[size] = value;
		size++;
		super.sort(elements, size);
		
	}
	
	public SortedContainer(int[] list) {
		elements = new int[5000];
		size = list.length;		
		for(int i =0;i<size;i++)
			elements[i]=list[i];
		super.sort(elements, size);
		
	}
	
	


}
