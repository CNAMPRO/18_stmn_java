package exercice1;

public class Math {

    public static final int[][] transform(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] b = new int[n][m];
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if ((i > 0) && (i < n - 2) && (j > 0) && (j < m - 2)) {
                    b[i][j] = (a[i-1][j-1] + a[i-1][j+1] + a[i][j] + a[i+1][j-1] + a[i+1][j+1]) / 5;
                } else {
                    b[i][j] = a[i][j];
                }
            }
        }
        
        return b;
        
    }
}
