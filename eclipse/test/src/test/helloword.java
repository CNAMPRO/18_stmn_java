package test;

public class helloword {
	static public void main(String argv[]) {
		System.out.println("Hello Word la moyenne est !");
		int tab[]= {1,2,3,4};
		double moyenne=funcmoyenne(tab);
		System.out.println(moyenne);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static double funcmoyenne(int[] tab) {
		int total =0;
		int moyenne =0 ; 
		int taille = 0;
		taille=tab.length;
		for(int i=0;i<taille;i++) 
		{
			total= tab[i]+total;
			
		}
		moyenne=total/taille;
		return moyenne;
	}
}
