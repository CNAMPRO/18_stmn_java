package tata;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestMatrix {
	 @Rule
	  public final ExpectedException expected = ExpectedException.none();

	@Test
	void testMultiplytrue(){
		
		//double[][] A = {{1.00, 2.00},{3.00, 4.00}};
		double[][] A = {{1.00, 2.00},{0.00, 3.00}};
		double[][] B = {{1.00, 2.00, 3.00},{4.00, 5.00, 6.00}};
		double[][] C = null;
		try {
			C = multiplication.scalaire(A, B);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double[][] R = {{9.00, 12.00, 15.00},{12.00, 15.00, 18.00}};
		multiplication.afficheM(C);
		System.out.println("\n");
		multiplication.afficheM(R);
		assertArrayEquals(R, C);		
	}
	
	@Test
	void testMultiply_empty() {

		double[][] A = {};
		double[][] B = {{1.00, 2.00, 3.00},{4.00, 5.00, 6.00}};
		expected.expect(IndexOutOfBoundsException.class);
		double[][] C = multiplication.scalaire(A, B);
		
	}
	
	
}