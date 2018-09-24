package exo2;

public class SortedContainer  extends ISortable{

	public int[] element;
	private int size;
	
    public SortedContainer(int[] list) {
        element = new int[5000];
        size = list.length;
        for(int i =0;i<size;i++)
            element[i]=list[i];
        super.sort(element, size);

    }
	

    public void add(int value) {
        element[size] = value;
        size++;
        super.sort(element, size);

    }
	
   public int[] element()
    {
        int[] returnInt = new int[size];
        for(int i =0;i<size;i++)
            returnInt[i]=element[i];
        return returnInt;
    }

	
}
