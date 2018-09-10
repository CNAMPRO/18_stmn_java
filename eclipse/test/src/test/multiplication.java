package test;

public class multiplication {
	static public void main(String argv[]){
		System.out.println("Hello func matrice");
		int m1[][]= {{1,2},{3,4}}; 		
		int m2[][]= {{1,1},{1,1}}; 
		System.out.println("M1");
		afficheM(m1);
		System.out.print("\n");
		System.out.println("M2");
		afficheM(m2);
		System.out.print("\n");
		System.out.println("Multiplication");
		int[][] result= scalaire(m1,m2);
		afficheM(result);
	}
	
	public static int[][] scalaire(int[][] matrice1 ,int[][] matrice2){
		int[][] produit;
		int l1=matrice1.length;
		int l2=matrice2.length;
		int c1=matrice1[0].length;
		int c2=matrice2[0].length;
		int lr,cr;
		int multi;
		//matrice1.length = ligne
		//matrice1[x].length = colone
		// n = l2 et c1
		// o = c2
		// m = l1
		lr=l2;
		cr=c2;
		produit= new int[lr][cr];
		lr=0; // compteur ligne
		for(int m=0;m<l1;m++) {
			cr=0; //compteur colone
			for (int o=0;o<c2;o++) {
				multi=0;
				for (int n=0;n<l2;n++) {
					multi=multi+matrice1[m][n]*matrice2[n][o];
				}
				produit[lr][cr] = multi;
				cr++;
			}
			lr++;
		}
		return produit;	
	}
	
	public static void afficheM(int[][] matrice) {
		int l = matrice.length;
		for(int i = 0 ; i < l; i++ ){
			for(int j = 0; j< matrice[i].length; j++){	 
				System.out.print(" "+matrice[i][j]);
		    }
			System.out.print("\n");
		}	
	}
}
