package exercice1;

public class prodVect {
	public static double[] crossProduct(double[] u, double[] v) throws Exception {
		double r1,r2,r3;	
		r1 = u[1]*v[2]-u[2]*v[1];
		r2 = u[2]*v[0]-u[0]*v[2];
		r3 = u[0]*v[1]-u[1]*v[0];
		
		double[] result = {0,0,0};
		result[0] = r1;
		result[1] = r2;
		result[2] = r3;
		
		return result;
    }
}
