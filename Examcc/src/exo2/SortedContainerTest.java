package exo2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedContainerTest {

	@Test
	void testsort() {
		int [] list = {3,2,6,5,4,9,7,8,1};
		int [] res = {1,2,3,4,5,6,7,8,9};
		SortedContainer C = new SortedContainer(list);
		C.sort(list, 8);
		int [] list2 = C.elements();
		assertArrayEquals(res,list2);
	}
	
	@Test
	void add() {
		int [] list = {3,2,6,5,4,9,7,8,1};
		int [] res = {1,2,3,4,4,5,6,7,8,9};
		SortedContainer C2 = new SortedContainer(list);
		C2.add(4);
		int [] list2 = C2.elements();
		assertArrayEquals(res,list2);
	}
	

}
