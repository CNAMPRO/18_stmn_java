package exercice1;

public class main {
	
	public static void main(String[] args) {
		double result;
		double[] coeff = {15,-8,1};
		
		Polynom polynom = new Polynom(coeff);
		result = polynom.eval(0);
		System.out.println("Le résultat au point : 0 est : " + result);
		result = polynom.eval(3);
		System.out.println("Le résultat au point : 3 est : " + result);
		result = polynom.eval(4);
		System.out.println("Le résultat au point : 4 est : " + result);
		
		double[] coeffPrim = {};	
		Polynom polynomPrim = new Polynom(coeffPrim);
		polynomPrim = polynomPrim.primitive();
		System.out.println(polynomPrim.getTaille());
		double[] coeffRetour = polynomPrim.getValue();
		for(int i = 0; i<polynomPrim.getTaille(); ++i)
			System.out.println(coeffRetour[i] + " ");
		
	}
}
