package exo1;

public class vectoriel {
	double[] u;
	double[] v;
	
	public static double [] crossProduct(double[] u, double[] v) throws Exception {
		int size1 = u.length;
		int size2 = v.length;
		if (size1 != size2) throw new Exception("Cannot vectoriel cause list size different");
		double[] res = new double[size1];
		res[0] = (u[1]*v[2])-(u[2]*v[1]);
		res[1] = (u[2]*v[0])-(u[0]*v[2]);
		res[2] = (u[0]*v[1])-(u[1]*v[0]);
		
		return res;
	}
}
