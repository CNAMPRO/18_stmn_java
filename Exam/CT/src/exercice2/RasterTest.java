package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RasterTest {

	@Test
	void test() {
		
		int[][] pixels = {{2, 2, 2}, {4, 4, 4}, {6, 6, 6}};
		boolean[][] exclusionMask = {{true, false, false}, {false, true, false}, {false, false, true}};
		
		MaskedRaster meh = new MaskedRaster(pixels);
		meh.setExclusionMask(exclusionMask);
		int[][] res = meh.getBits();
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j< res[0].length; j++) {
				System.out.print(res[i][j] + " " );
			}
			System.out.println("");
		}
		int[][] expected = {{0,2,2},{4,0,4},{6,6,0}};
		assertArrayEquals(res, expected);
	}

}
