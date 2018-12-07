package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import exercice1.Calcul;

class MaskedImageTest {

	@Test
	void test() {
		
		int[][] pixels = {{2,2,2},{4,4,4},{6,6,6}};
		MaskedImage uneImage = new MaskedImage(pixels);
		System.out.println(Arrays.deepToString(uneImage.getPixels()));
	}

}
