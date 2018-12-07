package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;



class CalculTest {

	@Test
	void test() {
		int [][] a = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,360,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
						
		};
		///	System.out.println(Arrays.deepToString(a));
	//	System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(Calcul.transform(a)));
	}
	

}
