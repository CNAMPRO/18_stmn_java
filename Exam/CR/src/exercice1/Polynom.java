package exercice1;

public class Polynom {
	
	private int taille;
	private double[] coeffs;
	
	public Polynom(double[] coeffs) {
		//constructeur
		this.taille = coeffs.length;
		this.coeffs = coeffs;
	}
	
	public double eval(double x) {
		double result = 0;
		for(int i= 0; i <= taille - 1; i++) {
			if(i == 0)
				result = coeffs[i] + result;
			else
				result = coeffs[i] * Math.pow(x, i) + result; 
		}
		return result;
	}
	
	public Polynom primitive() {
		int i = 0;
		double[] coeffPolyTest = {0,0,1};
		double[] coeffCreer = new double[coeffPolyTest.length + 1];
		coeffCreer[0] = 0;
		for(i = 0; i<coeffPolyTest.length; ++i) {
				coeffCreer[i+1] = coeffPolyTest[i] / (i + 1);
		} 
		Polynom polynom = new Polynom(coeffCreer);
		return polynom;
	}
	
	public int getTaille() {
		return coeffs.length;
	}
	
	public double[] getValue() {
		return this.coeffs;
	}
}