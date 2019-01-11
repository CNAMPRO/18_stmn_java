package exercice1;

public class vector {


public static double[] crossProduct(double[] v1, double [] v2) throws Exception
{
double[] v= new double[3];
v[0]=((v1[1]*v2[2])-(v1[2]*v2[1]));
v[1]=((v1[2]*v2[0])-(v1[0]*v2[2]));
v[2]=((v1[0]*v2[1])-(v1[1]*v2[0]));

return v;

}
}


