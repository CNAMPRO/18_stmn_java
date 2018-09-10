import static org.junit.jupiter.api.Assertions.*;


import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestMatrix {
	
	@Rule
	public final ExpectedException expected = ExpectedException.none();

	@Test
	void testMultiplication() {
		double[][] a = {{1,2},{0,3}};
		double[][] b = {{1,2,3},{4,5,6}};
		
		double[][] c = Multiply.multiplicar(a, b);
		double[][] expectedC = {{9,12,15},{12,15,18}};
		
		assertArrayEquals(c, expectedC);
		
	}
	
	@Test
	void testMultiplication_empty() {
		double[][] a = {};
		double[][] b = {{1,2,3},{4,5,6}};
		
		expected.expect(IndexOutOfBoundsException.class);
		Multiply.multiplicar(a, b);
		 
	}

}
