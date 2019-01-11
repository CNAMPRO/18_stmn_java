import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exercice1Test {

	@Test
	public final void test() throws Exception {
		double[] v1 = {1,0,0};
		double[] v2 = {0,1,0};
		double[] verification = {0,0,1};
		double[] sortie = exercice1.crossProduct(v1,v2);
		assertArrayEquals(verification, sortie);		
	}
	
	@Test
	public final void test2() throws Exception {
		double[] v1 = {0,0,1};
		double[] v2 = {1,0,0};
		double[] verification = {0,1,0};
		double[] sortie = exercice1.crossProduct(v1,v2);
		assertArrayEquals(verification, sortie);
	}
	
	@Test
	public final void test3() throws Exception {
		double[] v1 = {0,1,0};
		double[] v2 = {0,0,1};
		double[] verification = {1,0,0};
		double[] sortie = exercice1.crossProduct(v1,v2);
		assertArrayEquals(verification, sortie);
	}
	
	@Test
	public final void test4() throws Exception {
		assertThrows(Exception.class, () -> {
			double[] v1 = {0,1,0,0};
			double[] v2 = {0,0,1};
			double[] verification = {1,0,0};
			double[] sortie = exercice1.crossProduct(v1,v2);
		});
	}
}
