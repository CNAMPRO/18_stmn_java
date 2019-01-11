package exercice1;

public class Polynom 
{
	double[] coeffs;
	Polynom(double[] coeffs) 
	{
		
	}
	double eval(double x)
	{
		double result = 0;
		for (int i=0; i < coeffs.length; i++)
		{
			result+=x*Math.pow(coeffs[i], i);
		}
		return result;
	}
	
	Polynom primitive()
	{
		double result = 0;
		return null;
	}
}