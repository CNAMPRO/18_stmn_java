package exercice2;

public class SortedContainer implements iSortable  {
int[] elements;
int sizeTab;

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
	this.elements=list;
	sizeTab=list.length;
	sort(this.elements,this.elements.length);
}

public void add(int value) {
	this.elements[this.elements.length]=value;
	sort(this.elements,this.elements.length);
}

public int[] elements() {    
    int[] newElement = new int[sizeTab];                       
    for(int i = 0; i < sizeTab; i++ ) {                
        newElement[i] = this.elements[i];                    
    }        

    return newElement;
}

}
