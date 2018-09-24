package Exo1;

public class vecteur {
	
	public static double[] crossProduct(double[] v1, double[] v2) throws Exception {
	
	
		if (v1.length != 3 || v2.length != 3) {
			throw new Exception("v1 or v2 diffent de 3");
		}
		
		double[] ligne = new double[3];
		
		ligne[0] = (v1[1]*v2[2]) - (v1[2]*v2[1]);
		ligne[1] = (v1[2]*v2[0]) - (v1[0]*v2[2]);
		ligne[2] = (v1[0]*v2[1]) - (v1[1]*v2[0]);
		
		return ligne;
	}
	
}
