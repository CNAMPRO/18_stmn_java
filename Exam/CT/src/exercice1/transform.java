package exercice1;
public class transform {

public static final int[][] transform(int[][] a) {
//création de la classe
	int[][] matrice = {{0,0,0,0,0},{0, 0 ,0 ,0 ,0},{0, 0 ,360, 0 ,0},{0, 0 ,0 ,0 ,0},{0, 0 ,0 ,0, 0}};
	
	int[][] result = null;
	//double boucle pour matrice
	for (int i = 0; i< matrice.length;i++) 
	{
		for (int j = 0; j<matrice[0].length;j++) 
		{
			if(i>=1&&i<=matrice[0].length-2 && j>=1 && j<=matrice.length-2) 
			{
				//formule ligne haut
				result[i][j] = (matrice[i-1][j] + matrice[i][j-1] + matrice[i][j] + matrice[i][j+1] + matrice[i+1][j])/5;
			}
			else 
			{
				//sinon
				result[i][j] = matrice[i][j];
			}
				
		}
	}
	return result;
	}
}
