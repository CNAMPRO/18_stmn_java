package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestVectorUtil {
	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	void test() throws Exception {
		final double[] X = new double[] {1,0,0};
		final double[] Y = new double[] {0,1,0};
		final double[] Z = new double[] {0,0,1};
		assertArrayEquals(Z, VectorUtil.crossProduct(X, Y));
		assertArrayEquals(Y, VectorUtil.crossProduct(Z, X));
		assertArrayEquals(X, VectorUtil.crossProduct(Y, Z));
	}
	
	@Test
	void testInvalidSize() {
		assertThrows(Exception.class, () -> {VectorUtil.crossProduct(new double[] {}, new double[] {0,1,0});});
		assertThrows(Exception.class, () -> {VectorUtil.crossProduct(new double[] {0,1,0}, new double[] {});});
	}

}
