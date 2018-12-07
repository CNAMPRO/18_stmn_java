package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProduitVectorTest {

	@Test
	void test1() throws Exception {
		double[] u = {1,0,0};
		double[] v = {0,1,0};
		double[] result = Calcul.produitVector(u, v);
		double[] expected = {0,0,1};
		assertArrayEquals(result, expected);
	}
	
	@Test
	void test2() throws Exception {
		double[] u = {0,0,1};
		double[] v = {1,0,0};
		double[] result = Calcul.produitVector(u, v);
		double[] expected = {0,1,0};
		assertArrayEquals(result, expected);
	}
	
	@Test
	void test3() throws Exception {
		double[] u = {0,1,0};
		double[] v = {0,0,1};
		double[] result = Calcul.produitVector(u, v);
		double[] expected = {1,0,0};
		assertArrayEquals(result, expected);
	}
	
	@Test
	void testNull() {
		double[] u = {0,1,0};
		double[] v = null;
		Throwable exception = assertThrows(Exception.class, () -> {Calcul.produitVector(u, v);});
		assertEquals("vecteur null", exception.getMessage());
	}
	
	@Test
	void testTaille() {
		double[] u = {0,1};
		double[] v = {0,1,0,1};
		Throwable exception = assertThrows(Exception.class, () -> {Calcul.produitVector(u, v);});
		assertEquals("problème taille vecteur", exception.getMessage());
	}

}
