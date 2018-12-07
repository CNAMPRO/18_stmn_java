package exercice1;

public class Calcul {

	public static final int[][] transform(int[][] a){
		int [][] b = new int[a.length][a[0].length];
		for (int i =1; i <= a.length -2;i++) {
			for (int j =1; j <= a[0].length -2;j++) {
				b[i][j] = (a[i-1][j] + a[i][j-1] + a[i][j] + a[i][j+1] + a[i+1][j]) /5;
			}
		}

		return b;
	}
}
