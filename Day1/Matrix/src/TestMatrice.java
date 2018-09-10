import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestMatrice {

	@Rule
	public final ExpectedException expected = ExpectedException.none();
	
	@Test
	void testMultiplicationMatrice() {
		double[][] a ={
				{1, 2},
				{0, 3}
		};
		double[][] b ={
				{1, 2,3},
				{4, 5, 6}
		};
		double[][] c ={
				{9, 12, 15},
				{12, 15, 18}
		};
		double[][] cCalculer = Multiply.multiplicar(a, b);
		assertArrayEquals(c, cCalculer);		
	
	}
	
	@Test
	public void testTableauVide(){
		double[][] a ={};
		double[][] b ={
				{1, 2,3},
				{4, 5, 6}
		};
		expected.expect(IndexOutOfBoundsException.class);
		 Multiply.multiplicar(a, b);		
	}

}
