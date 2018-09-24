package Exercice1;

/**
 * @author Davvm
 */
public class VectorProduct {
	
	/**
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double[] crossProduct(double[] u, double[] v) throws Exception {
		
	    double[] C= new double[u.length];
	    try {
		    C[0] = u[1] * v[2] - u[2] * v[1];
		    C[1] = u[2] * v[0] - u[0] * v[2];
		    C[2] = u[0] * v[1] - u[1] * v[0];
		    return C;
	    }catch (Exception e) {
			return null;
		}
	}

}
