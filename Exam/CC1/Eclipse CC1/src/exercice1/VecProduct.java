package exercice1;

public class VecProduct
{
	public static double[] crossProduct(double[] v1, double[] v2) throws Exception
	{
		if(v1.length != v2.length)
		{
            throw new Exception("Erreur de taille");
        }
		double[] result = new double [3];
		result[0] = (v1[1]*v2[2])-(v1[2]*v2[1]);
		result[1] = (v1[2]*v2[0])-(v1[0]*v2[2]);
		result[2] = (v1[0]*v2[1])-(v1[1]*v2[0]);
		return result;
	}
}