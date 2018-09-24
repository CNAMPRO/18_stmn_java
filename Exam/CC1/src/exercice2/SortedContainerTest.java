package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedContainerTest {

	@Test
	public final void test() throws Exception {
		
		int[] list = new int[] { 3, 2, 6, 5, 4, 9, 7, 8, 1 } ;		
		SortedContainer sortedContainer = new SortedContainer(list);
		int[] listTrier =  new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };		
		int[] listTrierAdd =  new int[] { 1,1, 2, 3, 4,4, 5, 6, 7, 8,8, 9,15 };
		int[] listTrierAdd2 =  new int[] { 1, 2, 3, 4,4, 5, 6, 7, 8, 9 };
		
	
		assertArrayEquals(sortedContainer.elements(),listTrier);
		
		sortedContainer.add(4);		
		sortedContainer.add(8);
		sortedContainer.add(15);
		sortedContainer.add(1);
		
		assertArrayEquals(sortedContainer.elements(),listTrierAdd);

		
		  
	
	}

}
