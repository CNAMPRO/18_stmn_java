package exo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedContainerTest {

	@Test
	void test1() {
	int[] liste = {3,2,6,5,4,9,7,8,1};
	SortedContainer container =new SortedContainer(liste);
	container.sort(liste, liste.length);
	int[] liste1=container.elements();
	int[] liste2= {1,2,3,4,5,6,7,8,9};
	assertArrayEquals(liste2, liste1);
	}
	@Test
	void test2() {
	int[] liste = {3,2,6,5,4,9,7,8,1};
	SortedContainer container =new SortedContainer(liste);
	container.sort(liste, liste.length);
	container.add(4);
	int[] liste1=container.elements();
	int[] liste2= {1,2,3,4,4,5,6,7,8,9};
	assertArrayEquals(liste2, liste1);
	}
}
