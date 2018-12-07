package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaskedRasterTest {
	 @Test
	    void test() {

	int[][] pixels = {{2, 2, 2}, {4, 4, 4}, {6, 6, 6}};
  	 boolean[][] exclusionMask = {{true, false, false}, {false, true, false}, {false, false, true}};
  	 
  	 
  	 MaskedRaster m = new MaskedRaster(pixels);

  	m.setExclusionMask(exclusionMask);
	int[][] result = m.getBits();
	int[][] expected = {{0,2,2},{4,0,4},{6,6,0}};
	
	assertArrayEquals(result, expected);
	 }


}
