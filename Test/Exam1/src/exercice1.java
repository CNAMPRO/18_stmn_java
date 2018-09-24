
public class exercice1 {

	public static double[] crossProduct(double[] v1, double[] v2) throws Exception {
		double[] sortie = {0,0,0};
		
		if (v1.length != v2.length) {
			throw new Exception("erreur de taille");
		}
		
		sortie[0] = (v1[1]*v2[2])-(v1[2]*v2[1]);
		sortie[1] = (v1[2]*v2[0])-(v1[0]*v2[2]);
		sortie[2] = (v1[0]*v2[1])-(v1[1]*v2[0]);
		
		return sortie;
	}
	
}
