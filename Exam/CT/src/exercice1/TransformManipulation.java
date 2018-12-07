package exercice1;

public class TransformManipulation {

	
/**
 * 
 * @param a
 * @return
 */
	public static int[][] transform(int[][] a)
    {
		
        int[][] result = new int[a.length][a[0].length]; // Gnegne David comment vous faites pour initialiser un matrice au tableau ? je me souvieeeeeeeens
        for (int i = 0; i< a.length;i++) {
            for (int j = 0; j<a[0].length;j++) {
                if(i>=1&&i<=a[0].length-2 && j>=1 && j<=a.length-2) {
                    result[i][j] = (a[i-1][j-1] + a[i+1][j-1] + a[i][j] + a[i+1][j+1] + a[i-1][j+1])/5;
                }
                else {
                    result[i][j] = a[i][j];
                }
            }
        }
        return result;
    }


}
