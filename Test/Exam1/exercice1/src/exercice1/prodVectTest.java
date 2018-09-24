package exercice1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prodVectTest {

	@Test
	void verif1() throws Exception {
		double[] Z;
		double[] u = {1,0,0};
		double[] v = {0,1,0};
		Z = prodVect.crossProduct(u, v);

		double[] resultAttendue = {0,0,1};
		assertArrayEquals(Z, resultAttendue);
	}
	
	@Test
	void verif2() throws Exception {
		double[] Y;
		double[] u = {0,0,1};
		double[] v = {1,0,0};
		Y = prodVect.crossProduct(u, v);

		double[] resultAttendue = {0,1,0};
		assertArrayEquals(Y, resultAttendue);
	}
	
	@Test
	void verif3() throws Exception {
		double[] X;
		double[] u = {0,1,0};
		double[] v = {0,0,1};
		X = prodVect.crossProduct(u, v);

		double[] resultAttendue = {1,0,0};
		assertArrayEquals(X, resultAttendue);
	}
}
