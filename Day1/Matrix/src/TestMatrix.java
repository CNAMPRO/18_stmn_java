import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestMatrix {

	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	void testMulti() {
		double[][] a = {
				{1,2},
				{0,3}
		};
		double[][] b = {
				{1,2,3},
				{4,5,6}
		};
		double [][] c = {
				{9,12,15},
				{12,15,18}
		};
		double [][] cCalcul = Multiply.multiplicar(a,b);
		assertArrayEquals(c, cCalcul);
	}
	
	@Test
	void testMultiEmpty() {
		double[][] a = {
		};
		double[][] b = {
				{1,2,3},
				{4,5,6}
		};
		expected.expect(
	}
	

}

