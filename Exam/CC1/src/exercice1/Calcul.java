package exercice1;

public class Calcul {
	public static double[] produitVector(double[] u, double[] v) throws Exception {
		if (u == null || v == null ) throw new Exception("vecteur null");
		if (u.length != 3 || v.length != 3) throw new Exception("problème taille vecteur");
		double[] result = new double[3];
		result[0] = (u[1]*v[2]) - (u[2]*v[1]);
		result[1] = (u[2]*v[0]) - (u[0]*v[2]);
		result[2] = (u[0]*v[1]) - (u[1]*v[0]);
		return result;
	}
}
