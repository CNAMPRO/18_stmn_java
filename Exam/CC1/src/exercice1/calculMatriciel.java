package exercice1;

public class calculMatriciel {
	public static double[] crossProduct(double[] v1, double[] v2) throws Exception{
		double[] u = new double[3];
		u[0] = (v1[1] * v2[2]) - (v1[2] * v2[1]);
		u[1] = (v1[2] * v2[0]) - (v1[0] * v2[2]);
		u[2] = (v1[0] * v2[1]) - (v1[1] * v2[0]);
		return u;
		
	}

}
