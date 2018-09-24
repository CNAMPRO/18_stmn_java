package exercice2;

public class SortedContainer implements ISortable {

	int[] elements = new int[15];
	int tailleTableau =0;


	@Override
	public void sort(int[] list, int listSize) {
		int longueur = listSize;
		int tampon = 0;
		boolean permut;

		do {
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				if (elements[i] > elements[i + 1]) {
					tampon = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);

	}

	public SortedContainer(int[] list) {
		this.tailleTableau = list.length;
		
		for(int i =0; i<15; i++) {
			this.elements[i] = 9999;
		}
		
		
		for(int i =0; i<list.length; i++) {
			this.elements[i] = list[i];
		}
		sort(this.elements, this.elements.length);
	
		     
	
	}

	public void add(int value) {
		this.elements[tailleTableau] = value;
		sort(this.elements, this.elements.length);
		this.tailleTableau++;
	}
	
	public int[] elements() {	
		int[] newElement = new int[tailleTableau];			   		
		for(int i = 0; i < tailleTableau; i++ ) {				
			newElement[i] = this.elements[i];					
		}		
 
		return newElement;
	}

}
