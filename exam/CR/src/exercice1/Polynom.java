package exercice1;

public class Polynom {
	

	
	double[] coeffs;

	public Polynom(double[] coeffs) {
		
		coeffs[0] = 2;
		coeffs[1] = -3;
		coeffs[2] = 1;
	}
	
	public double eval(double x) {
		double p = 0;
		for(int i=0; i<coeffs.length;i++)
			
		{
		p = p + coeffs[i]*Math.pow(x, i);
		}
		
		return p;
		
	}
	
	public Polynom primitive()
	{
		return null;
		
	}
	
	
}
