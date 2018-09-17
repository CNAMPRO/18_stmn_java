import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ExecutionException;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class testMatrix {
	@Rule
	 public final ExpectedException exception = ExpectedException.none();
	
	@Test
	void testMultiply() {
		double[][] a = {{1,2},{0,3}};
		double[][] b = {{1,2,3},{4,5,6}};
		double[][] c = Multiply.multiplicar(a, b);
		double[][] R = {{9,12,15},{12,15,18}};
		System.out.println(R);
		System.out.println(c);
		assertArrayEquals(R,c);
		
	}
	
	@Test
	void testmultiplicar_empty() {
		double[][] a = {};
		double[][] b = {{1,2,3},{4,5,6}};
		exception.expect(IndexOutOfBoundsException.class);
		double[][] c = Multiply.multiplicar(a, b);
	}
}
