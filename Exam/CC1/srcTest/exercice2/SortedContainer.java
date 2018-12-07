package exercice2;

public class SortedContainer implements ISortable{
	private int[] elements;
	private int capacity;
	
	public SortedContainer(int[] list) {
		sort(list,list.length);
		this.elements = list;
		this.capacity = list.length;
	}
	@Override
	public void sort(int[] list, int listSize) {
		for (int i = 1; i < listSize; i++) {
			int x = list[i];
			int j = i;
			while ((j >= 1) && (list[j - 1] > x)) {
				list[j]  = list[j - 1] ;
				j = j - 1;
			}
			list[j] = x;
		}
		
	}
	
	public void add(int value) {
		int[] temp = new int[capacity + 1];
	    for (int i = 0; i < capacity; i++){
	        temp[i] = elements[i];
	    }
	    temp[temp.length - 1] = value;
	    sort(temp,temp.length);
	    
	    this.elements = temp;
	    this.capacity++;
	}
	
	public int[] elements() {
		return this.elements;
	}
	

}
