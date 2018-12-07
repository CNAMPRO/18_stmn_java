package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathTest {

	
	
	@Test
	void test() {
		int[][] matrice = {{0,0,0,0,0},{0,0,0,0,0},{0,0,360,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int[][] result = math.transform(matrice);
		int[][] expected = {{0,0,0,0,0},{0,72,0,72,0},{0,0,72,0,0},{0,72,0,72,0},{0,0,0,0,0}};
		assertArrayEquals(result, expected);
	}

}
