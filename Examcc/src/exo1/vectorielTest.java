package exo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class vectorielTest {

	@Test
	void testvectoriel1() throws Exception {
		double[] A = {1,0,0};
		double[] B = {0,1,0};
		
		double[] C = vectoriel.crossProduct(A,B);
		
		double[] res = {0,0,1};
		assertArrayEquals(res,C);
		
		
	}
	
	@Test
	void testvectoriel2() throws Exception {
		double[] A = {0,0,1};
		double[] B = {1,0,0};
		
		double[] C = vectoriel.crossProduct(A,B);
		
		double[] res = {0,1,0};
		assertArrayEquals(res,C);
		
	}
	
	@Test
	void testvectoriel3() throws Exception {
		double[] A = {0,1,0};
		double[] B = {0,0,1};
		
		double[] C = vectoriel.crossProduct(A,B);
		
		double[] res = {1,0,0};
		assertArrayEquals(res,C);
		
	}
	
	@Test
	void testErreurVecto() throws Exception {
		double[] A = {};
		double[] B = {0,0,1};
		
		double[] C;
		
		double[] res = {1,0,0};
		assertThrows(Exception.class, () -> {vectoriel.crossProduct(A,B);});
		
	}
	
	
}
