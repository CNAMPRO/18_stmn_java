import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMatrix {

	@Test
	void test() {
		
		
		//fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
		
		//Double[][] A = {{1.00, 2.00},{3.00, 4.00}};
		double[][] A = {{1.00, 2.00},{0.00, 3.00}};
		double[][] B = {{1.00, 2.00, 3.00},{4.00, 5.00, 6.00}};
		double[][] C = Multiply.multiplicar(A, B);

		double[][] R = {{9.00, 12.00, 15.00},{12.00, 15.00, 18.00}};

		assertArrayEquals(R, C);

		
		
		
		
	}
}