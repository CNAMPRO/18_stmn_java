package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercice1.Calcul;

class SortedContainerTest {

	@Test
	void test() {
		int[] maListe = {3,2,6,5,4,9,7,8,1};
		int[] expected = {1,2,3,4,5,6,7,8,9};
		SortedContainer sortedListe = new SortedContainer(maListe);
		assertArrayEquals(sortedListe.elements(), expected);
	}
	@Test
	void testAdd() {
		int[] maListe = {3,2,6,5,4,9,7,8,1};
		int[] expected = {1,2,3,4,4,5,6,7,8,9};
		SortedContainer sortedListe = new SortedContainer(maListe);
		sortedListe.add(4);
		assertArrayEquals(sortedListe.elements(), expected);
	}
	

}
