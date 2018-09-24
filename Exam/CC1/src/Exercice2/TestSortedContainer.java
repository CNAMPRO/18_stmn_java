package Exercice2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortedContainer {

	@Test
	void test() {
		
		int[] SortedBasic  = {1,2,3,4,5,6,7,8,9};
		int[] list = {3,2,6,5,4,9,7,8,1};
		SortedContainer sc = new SortedContainer(list);
		sc.sort(list, list.length);		
		assertArrayEquals(SortedBasic, sc.elements());
		System.out.println("length 1 = " + sc.elements().length);

		sc.add(4);
		for (int i = 0; i < sc.elements().length; i++) {
			System.out.println(sc.elements()[i]);
		}
		System.out.println("length 2 = " + sc.elements().length);
	}

}
