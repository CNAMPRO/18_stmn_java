package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestVecProduct 
{
	public final void test0() throws Exception
	{
		 assertThrows(Exception.class, () -> 
		 {
	            double[] v1 = {0,1,0};
	            double[] v2 = {0,0,1};
	            double[] test = {1,0,0};
	            double[] retour = exercice1.VecProduct.crossProduct(v1,v2);
		 });
	}
	
	@Test
	public final void test1() throws Exception
	{
		double[]v1 = {1,0,0};
		double[]v2 = {0,1,0};
		double[] test = {0,0,1};
		double[] retour = exercice1.VecProduct.crossProduct(v1, v2);
		assertArrayEquals(test, retour);
		

	}
	
	@Test
	public final void test2() throws Exception
	{
		double[]v1 = {0,0,1};
		double[]v2 = {1,0,0};
		double[] test = {0,1,0};
		double[] retour = exercice1.VecProduct.crossProduct(v1, v2);
		assertArrayEquals(test, retour);

	}
	
	@Test
	public final void test3() throws Exception
	{
		double[]v1 = {0,1,0};
		double[]v2 = {0,0,1};
		double[] test = {1,0,0};
		double[] retour = exercice1.VecProduct.crossProduct(v1, v2);
		assertArrayEquals(test, retour);

	}
}
