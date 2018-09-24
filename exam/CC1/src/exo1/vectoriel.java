package exo1;

public class vectoriel {
	public static double[] crossProduct(double[] v1, double[] v2) throws Exception {
		int l1 = v1.length;
		int l2 = v2.length;	
		if(v1 == null || v2 == null){
			throw new Exception("L'une des deux matrices est à null");
		}
		if(l1!=3 || l2!=3){
			throw new Exception("Le produit vectoriel n'est pas possible l'un n'est pas un vecteur x,y,z");
		}
		
		double[] vect = new double[l1];	
		vect[0]=(v1[1]*v2[2])-(v1[2]*v2[1]);
		vect[1]=(v1[2]*v2[0])-(v1[0]*v2[2]);
		vect[2]=(v1[0]*v2[1])-(v1[1]*v2[0]);
		int l = vect.length;
		//for(int i = 0 ; i < l; i++ ){
		//		System.out.print(" "+vect[i]);
		//	System.out.print("\n");
		//}	
		return vect;
	}
	
}
