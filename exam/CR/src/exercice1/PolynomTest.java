package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolynomTest {
	
	double [] coeffs;

	@Test
	void testZero() {
		// Résultat attendu : 2
		double pattendu  = 2;
		double p = 0;
		double x = 0;
		coeffs[0] = 2;
		coeffs[1] = -3;
		coeffs[2] = 1;
		
		for(int i=0; i<coeffs.length;i++)
			
		{
		p = p + coeffs[i]*Math.pow(x, i);
		}
	
		if (pattendu.compareTo(p) == 0) {
		     
	        }
	        else {
		    fail("Mauvais résultat");
	        }
	}
	
	void testOne() {
		// Résultat attendu : 0
		double pattendu  = 0;
		double p = 0;
		double x = 1;
		coeffs[0] = 2;
		coeffs[1] = -3;
		coeffs[2] = 1;
		
		for(int i=0; i<coeffs.length;i++)
			
		{
		
		p = p + coeffs[i]*Math.pow(x, i);
		}
	
		if (pattendu.compareTo(p) == 0) {
		     
	        }
	        else {
		    fail("Mauvais résultat");
	        }
	}
	
	void testTwo() {
		// Résultat attendu : 0
		double pattendu  = 0;
		double p = 0;
		double x = 1;
		coeffs[0] = 2;
		coeffs[1] = -3;
		coeffs[2] = 1;
		
		for(int i=0; i<coeffs.length;i++)
			
		{
		p = p + coeffs[i]*Math.pow(x, i);
		}
	
		if (pattendu.compareTo(p) == 0) {
		     
	        }
	        else {
		    fail("Mauvais résultat");
	        }
	}

}
