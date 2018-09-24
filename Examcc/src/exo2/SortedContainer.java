package exo2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedContainer implements ISortable {
	
	int[] element;
	int listSize;
	
	public SortedContainer(int[] list){
		element = list;
		this.listSize = list.length;
	}
	
	public void sort(int[] list,int listSize) {
		element = list;
		Arrays.sort(list);
	}
	
	public int[] elements() {
		return element;
	}
	public void add(int value) {
		int [] newelem;
		newelem=new int[(element.length)+1];
		for (int i=0;i<(element.length); i++) {
			newelem[i] = element[i];
		}
		newelem[newelem.length-1]=value;
		sort(newelem,newelem.length);
	}
}


