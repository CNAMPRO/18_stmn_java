package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMask {

	 @Test
	    void testpixel() {
		   	 
		int[][] img = {{2,2,2},{4,4,4},{6,6,6}};
		MaskedImage maskimg = new MaskedImage(img);
		boolean[][] mask = {{true,false,false},{false,true,false},{false,false,true}};
		maskimg.setInclusionMask(mask);
		int[][] result = maskimg.getPixels();
		int[][] expected = {{2,0,0},{0,4,0},{0,0,6}};
		
		assertArrayEquals(result, expected);
	 }
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
