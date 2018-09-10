import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestUnit {
	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	@Test
	void testMatrixMultiply_nominal() {
		double[][] a = {{1,2},{0,3}};
		double[][] b = {{1,2,3},{4,5,6}};
		double[][] result = Multiply.multiplicar(a,b);
		double[][] expected = {{9,12,15},{12,15,18}};
		assertArrayEquals(result, expected);
	}
	
	
	
	@Test
	void testMatrixMultiply_empty() {
		double[][] a = {};
		double[][] b = {{1,2,3},{4,5,6}};
		exception.expect(IndexOutOfBoundsException.class);
		Multiply.multiplicar(a,b);
	}

}
