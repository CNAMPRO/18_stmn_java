package exercice1;

public class math {
	
	public static int[][] transform(int[][] matrice)
	{
		int height = matrice.length;
		int width = matrice[0].length;
		int[][] result = new int[height][width];
		for (int i = 0; i< matrice.length;i++) {
			for (int j = 0; j<matrice[0].length;j++) {
				if(i>=1 && i<=matrice[0].length-2 && j>=1 && j<=matrice.length-2) {
					result[i][j] = (matrice[i-1][j-1] + matrice[i+1][j-1] + matrice[i][j] + matrice[i+1][j+1] + matrice[i-1][j+1])/5;
				}
				else {
					result[i][j] = matrice[i][j];
				}
					
			}
		
		}
		return result;
	}
	}

