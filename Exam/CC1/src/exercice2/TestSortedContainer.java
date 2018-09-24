package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortedContainer {

	@Test
	void test() {
		int[] liste = {3,2,6,5,4,9,7,8,1};
		SortedContainer SC = new SortedContainer(liste);
		int[] listeTriee = SC.elements();
		int[] resultatAttendu = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(resultatAttendu,listeTriee);
	}
	
	@Test
	void test2() {
		int[] liste = {3,2,6,5,4,9,7,8,1};
		SortedContainer SC = new SortedContainer(liste);
		SC.add(4);
		int[] listeTriee = SC.elements();
		int[] resultatAttendu = {1,2,3,4,4,5,6,7,8,9};
		assertArrayEquals(resultatAttendu,listeTriee);
	}

}
