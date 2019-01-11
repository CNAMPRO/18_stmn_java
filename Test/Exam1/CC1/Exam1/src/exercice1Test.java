import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exercice1Test {
			
			@Test
			public final void Verification1() throws Exception {
			double[] u = {1,0,0};
			double[] v = {0,1,0};
			double[] resultat = exercice1.crossProduct(u,v);
			double[] resultAttendu = {0,0,1};
			assertArrayEquals(resultAttendu,resultat);
			}
			
			@Test
			public final void Verification2() throws Exception {
			double[] u = {0,0,1};
			double[] v = {1,0,0};
			double[] resultat = exercice1.crossProduct(u, v);
			double[] resultAttendu = {0,1,0};
			assertArrayEquals(resultAttendu,resultat);
			}
			
			@Test
			public final void Verification3() throws Exception {
			double[] u = {0,1,0};
			double[] v = {0,0,1};
			double[] resultat = exercice1.crossProduct(u, v);
			double[] resultAttendu = {1,0,0};
			assertArrayEquals(resultAttendu,resultat);
			}
}
