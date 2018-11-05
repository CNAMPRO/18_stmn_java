package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortedContainer {

	@Test
	void testInit() {
		int[] list = new int[] {3,2,6,5,4,9,7,8,1};
		SortedContainer container = new SortedContainer(list);
		int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(expected, container.elements());
	}

	@Test
	void testAdd() {
		int[] list = new int[] {3,2,6,5,4,9,7,8,1};
		SortedContainer container = new SortedContainer(list);
		container.add(4);
		int[] expected = new int[] {1,2,3,4,4,5,6,7,8,9};
		assertArrayEquals(expected, container.elements());
	}
	
}
