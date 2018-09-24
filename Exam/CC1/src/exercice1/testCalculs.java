package exercice1;



import static org.junit.jupiter.api.Assertions.*;import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class testCalculs {

	
	
	@Test
	public final void testSucces() throws Exception {
		double[] v1 = {1, 0, 0};
		double[] v2 = {0, 1, 0};
		double[] actual = calculs.crossProduct(v1, v2);
		double[] resultAttendu = {0, 0, 1};
		
		assertArrayEquals(resultAttendu, actual);
		
	}
	
	@Test
	public final void testSuccess() throws Exception {
		double[] v1 = {0, 0, 1};
		double[] v2 = {1, 0, 0};
		double[] actual = calculs.crossProduct(v1, v2);
		double[] resultAttendu = {0, 1, 0};
		
		assertArrayEquals(resultAttendu, actual);
		
	}
	
	@Test
	public final void testSuccesss() throws Exception {
		double[] v1 = {0, 1, 0};
		double[] v2 = {0, 0, 1};
		double[] actual = calculs.crossProduct(v1, v2);
		double[] resultAttendu = {1, 0, 0};
		
		assertArrayEquals(resultAttendu, actual);
		
	}
	
	@Test
	public final void test() throws Exception {
	
	assertThrows(Exception.class, () -> {
		double[] v1 = {0, 1, 0};
		double[] v2 = {0};
		double[] actual = calculs.crossProduct(v1, v2);
		
	});

	}
	
	@Test
	public final void test2() throws Exception {
	
	assertThrows(Exception.class, () -> {
		double[] v1 = {0, 1, 0};
		double[] v2 = {0,1,2,6,4,5,7,8};
		double[] actual = calculs.crossProduct(v1, v2);
		
	});

	}
	
	
	
	

}
