package exercice1;

public class calculs {
	
	public static double[] crossProduct(double[] v1, double[] v2) throws Exception
	{
		if(v1.length != 3 || v2.length != 3)
			throw new Exception("v1 or v2 shall have the same size");
			
		double[] result = new double[3];
		
		result[0] = v1[1]*v2[2]-v1[2]*v2[1];
		result[1] = v1[2]*v2[0]-v1[0]*v2[2];
		result[2] = v1[0]*v2[1]-v1[1]*v2[0];
		return result;
	}

}
