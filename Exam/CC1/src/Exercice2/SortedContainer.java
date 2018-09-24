package Exercice2;

public class SortedContainer implements ISortable {

	private int[] elements;
	private int size;

	
	@Override
	/**
	 * Bubble sort
	 */
	public void sort(int[] list, int listSize) {  
		int temp = 0;  
	    for(int i=0; i < listSize; i++){  
	    	for(int j=1; j < (listSize-i); j++){  
	    		if(list[j-1] > list[j]){  
	    			temp = list[j-1];  
	    			list[j-1] = list[j];  
	    			list[j] = temp;  
	    		}  
	    	}  
	    }  
	}
	
	/**
	 * Constructeur
	 * @param list
	 */
	SortedContainer(int[] list){
		this.elements = list;
	}
	/**
	 * @param value
	 */
	void add(int val) {
		 int i;
	      for(i=0;i<elements().length;i++){
	        if(elements()[i]>val)
	          break;
	      }
	      for(int k=elements().length-2; k>=i; k--){
	    	  elements[k+1]=elements[k];            
	      }
	      elements[i]=val;
	      size++;
	}

	
	void meh(int val) {
	}
	
	/**
	 * @return a copy of elements
	 */
	public int[] elements() {
		int elementsSize = this.elements.length;
		int[] result = new int[elementsSize];
		for (int i = 0; i < result.length; i++) {
			result[i] = elements[i];
		}
		return result;
	}
	
	public int getSize() {
		return elements.length;
	}

	public void setSize(int size) {
		this.size = size;
	}



}
