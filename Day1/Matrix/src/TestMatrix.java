import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


class TestMatrix {
	@Rule
	public final ExpectedException expected = ExpectedException.none();
	
	@Test
	void test() {
		
		//fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
		
		double[][] A = {{1.00, 2.00},{0.00, 3.00}};
		double[][] B = {{1.00, 2.00, 3.00},{4.00, 5.00, 6.00}};
		
		double[][] C = Multiply.multiplicar(A, B);
		double[][] R = {{9.00, 12.00, 15.00},{12.00, 15.00, 18.00}};
		assertArrayEquals(R, C);
		
	}
	
	@Test
	void testMultiplyArrayEmpty(){
		double[][] A = {};
		double[][] B = {{1.00, 2.00, 3.00},{4.00, 5.00, 6.00}};

		expected.expect(IndexOutOfBoundsException.class);
		Multiply.multiplicar(A, B);
	}

}
