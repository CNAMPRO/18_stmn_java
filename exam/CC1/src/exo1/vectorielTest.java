package exo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class vectorielTest {

	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	@Test
	void testMatrixMultiply_nominal1() throws Exception {
		double[] X = {1,0,0};
		double[] Y = {0,1,0};
		double[] result =  vectoriel.crossProduct(X,Y);
		double[] expected = {0,0,1};	
		assertArrayEquals(result, expected);
	}
	@Test
	void testMatrixMultiply_nominal2() throws Exception {
		double[] X = {0,0,1};
		double[] Y = {1,0,0};
		double[] result =  vectoriel.crossProduct(X,Y);
		double[] expected = {0,1,0};
		assertArrayEquals(result, expected);
	}
	@Test
	void testMatrixMultiply_nominal3() throws Exception {
		double[] X = {0,1,0};
		double[] Y = {0,0,1};
		double[] result =  vectoriel.crossProduct(X,Y);
		double[] expected = {1,0,0};
		assertArrayEquals(result, expected);
	}
	
	@Test
	void testMatrixMultiply_none() throws Exception {
		double[] x = {};
		double[] y = {0,1,2};	
		assertThrows(Exception.class, ()-> {
			vectoriel.crossProduct(x,y);
		});
	}
	@Test
	void testMatrixMultiply_more() throws Exception {
		double[] x = {0,1,2,3};
		double[] y = {0,1,2};	
		assertThrows(Exception.class, ()-> {
			vectoriel.crossProduct(x,y);
		});
	}

}

