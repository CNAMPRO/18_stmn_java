package exercice1;

public class VectorUtil {
	public static double[] crossProduct(double[] u, double[] v) throws Exception {
		if (u.length != 3 || v.length != 3 ) {
			throw new Exception("Invalid input vector size. Vector size must be 3. Got "+u.length+","+v.length);
		}
		double[] output = new double[3];
		output[0] = u[1]*v[2] - u[2]*v[1];
		output[1] = u[2]*v[0] - u[0]*v[2];
		output[2] = u[0]*v[1] - u[1]*v[0];
		return output;
	}
}
