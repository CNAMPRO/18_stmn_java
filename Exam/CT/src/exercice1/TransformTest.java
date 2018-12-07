package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransformTest {

	@Test
	void test() {
		int[][] a = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,360,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
				};
		int[][] expected = {
				{0,0,0,0,0},
				{0,40,40,40,0},
				{0,40,40,40,0},
				{0,40,40,40,0},
				{0,0,0,0,0}
				};
		int[][] b = Transform.transform(a);
		assertArrayEquals(expected, b);
	}

}
