package exo2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedContainer implements ISortable{
	private int[] elements ;
	private int listSize;
	public SortedContainer(int[] list) {
		sort(list,list.length);
	}
	@Override
	public void sort(int[] list, int listSize) {
		// TODO Auto-generated method stub
		elements=list;
		this.listSize=listSize;
		Arrays.sort(list);
	}
	public void add(int value) {
		int [] copyelem;
		copyelem=new int[(elements.length)+1];
		for (int i=0;i<(elements.length); i++) {
			copyelem[i] = elements[i];
		}
		copyelem[copyelem.length-1]=value;
		sort(copyelem,copyelem.length);
	}
	
	public int[] elements() {
		return elements;
	}
}




          

     