package Exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVector {

	@Test
	void test() throws Exception {
		double[] a = {1,0,0};
		double[] b = {0,1,0};
		double[] z = {0,0,1};
		assertArrayEquals(VectorProduct.crossProduct(a, b), z);
	}

}
