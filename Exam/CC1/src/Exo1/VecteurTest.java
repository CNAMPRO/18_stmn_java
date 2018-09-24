package Exo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VecteurTest {
	
	@Test
    public final void testSuccess() throws Exception {
        double[] v1 = {1, 0, 0};
        double[] v2 = {0, 1, 0};
        double[] actual = vecteur.crossProduct(v1, v2);
        double[] resultAttendu = {0, 0, 1};

        assertArrayEquals(resultAttendu, actual);

    }
	
	@Test
    public final void testSuccess1() throws Exception {
        double[] v1 = {0, 0, 1};
        double[] v2 = {1, 0, 0};
        double[] actual = vecteur.crossProduct(v1, v2);
        double[] resultAttendu = {0, 1, 0};

        assertArrayEquals(resultAttendu, actual);

    }
	
	@Test
    public final void testSuccess2() throws Exception {
        double[] v1 = {0, 1, 0};
        double[] v2 = {0, 0, 1};
        double[] actual = vecteur.crossProduct(v1, v2);
        double[] resultAttendu = {1, 0, 0};

        assertArrayEquals(resultAttendu, actual);

    }

	@Test
    public final void Mistake() throws Exception 
	{
		assertThrows(Exception.class, () ->
		{
			double[] v1 = {};
	        double[] v2 = {0, 0, 1};
	        double[] actual = vecteur.crossProduct(v1, v2);
		});
	}
	

}

//X = (1, 0, 0) par Y = (0, 1, 0) est égal à Z = (0, 0, 1).
// Z = (0, 0, 1) par X = (1, 0, 0) est égal à Y = (0, 1, 0).
 //Y = (0, 1, 0) par Z = (0, 0, 1) est égal à X = (1, 0, 0)