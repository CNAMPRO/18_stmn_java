package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercice1.Util;

class MaskedImageTest {

	@Test
	void test() {
		int[][] img = {{2,2,2},{4,4,4},{6,6,6}};
		MaskedImage maskimg = new MaskedImage(img);
		boolean[][] mask = {{true,false,false},{false,true,false},{false,false,true}};
		maskimg.setInclusionMask(mask);
		int[][] result = maskimg.getPixels();
		int[][] expected = {{2,0,0},{0,4,0},{0,0,6}};
		assertArrayEquals(result, expected);
	}

}
