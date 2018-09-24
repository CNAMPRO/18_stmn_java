package exercice2;

public class SortedContainer {
	int[] elements = new int[5000];
	private int size;
	
	// Création de l'objet
	public SortedContainer(int[] list) {
		sort(list, list.length);
		size = list.length;
	}
	
	// Ajout d'un élément
	public void add(int value) {
		int i = size;
		elements[i] = value;
		sort(elements, elements.length);
	}
	
	public int[] elements() {
		return elements;	
	}
	
	// Tri de l'objet
	public void sort(int[] list, int listSize) {
		int i, j, cle;
		for (i = 1; i < listSize; i++) {
			cle = list[i];
			j = i;
			while ((j >= 1) && (list[j - 1] > cle)) {
				list[j]  = list[j - 1] ;
				j = j - 1;
			}
			list[j] = cle;
		}
		elements = list;
	}
	
	// Affichage de elements (debugage)
	public void afficher() {
		int []tableau = elements;
		for (int valeur : tableau) System.out.print(valeur + " ");
		System.out.println();
	}
}
