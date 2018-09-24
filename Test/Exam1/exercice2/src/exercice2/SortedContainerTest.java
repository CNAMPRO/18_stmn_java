package exercice2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedContainerTest {

	@Test
	void tri() throws Exception {
		int[] list = {3,2,6,5,4,9,7,8,1};
		SortedContainer sc = new SortedContainer(list);
		sc.afficher();
		
		int[] listTri = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(sc.elements(), listTri);
	}
	
	@Test
	void ajout() throws Exception {
		int[] list = {1,2,3,4,5,6,7,8,9};
		SortedContainer sc = new SortedContainer(list);
		int a = 4;
		sc.add(a);
		//sc.afficher();
		//sc.afficher();
		int[] listTri = {1,2,3,4,4,5,6,7,8,9};
		//assertArrayEquals(sc.elements(), listTri);
	}

}
