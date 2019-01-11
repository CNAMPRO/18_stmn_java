package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedContainerTest {

	@Test
	public final void test() throws Exception{
		int [] elements = new int[] {3,2,6,5,4,9,7,8,1};
		int [] elementstrie = new int[] {1,2,3,4,5,6,7,8,9};
		SortedContainer sortedContainer = new SortedContainer(elements);
		
		assertArrayEquals(sortedContainer.elements(),elementstrie);
	}

}
