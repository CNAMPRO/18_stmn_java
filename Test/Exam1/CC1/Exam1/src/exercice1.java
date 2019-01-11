public class exercice1 {
	public static double[] crossProduct(double[] u, double[] v) throws Exception {
		double resultat[] = new double[3];
		
		if(u.length != v.length) {
			throw new Exception("Erreur taille");
		}
		
		resultat[0] = (u[1]*v[2]) - (u[2]*v[1]);
		resultat[1] = (u[2]*v[0]) - (u[0]*v[2]);
		resultat[2] = (u[0]*v[1]) - (u[1]*v[0]);
			
		return resultat;
	}
}
