package exercice1;

public class Util {
	
	public static final int[][] transform(int matrice[][]){
		int result[][] = new int[5][5];
		for (int i = 0; i< matrice.length;i++) {
			for (int j = 0; j<matrice[0].length;j++) {
				if(i>=1&&i<=matrice[0].length-2 && j>=1 && j<=matrice.length-2) {
					result[i][j] = (matrice[i-1][j] + matrice[i][j-1] + matrice[i][j] + matrice[i][j+1] + matrice[i+1][j])/5;
				}
				else {
					result[i][j] = matrice[i][j];
				}
					
			}
		}
		return result;
	}
	
}
