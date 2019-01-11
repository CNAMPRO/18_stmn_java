package exercice1;

public class transform{
    public static final int[][] transform(int[][] a){
        int[][]b = new int[a.length][a[0].length];
        for (int i = 0 ; i< b.length ; i++) {
            for (int j=0 ; j<b[i].length ; j++)  {
                if(0 < j && j<=a.length-2 && 0 < i && i<=a[0].length-2)
                    b[i][j] = (a[i-1][j]+a[i][j-1]+a[i][j]+a[i][j+1]+a[i+1][j])/5;
                else b[i][j] = a[i][j];
            }
        }
        return b;
    }

public static void main(String [ ] args){
    int [][]matrice = new int[5][5];
    for(int i = 0; i < matrice.length; i++){
       for(int j = 0; j < matrice[i].length; j++){
         matrice[i][j] = 0;
       }
    }
    
    matrice[2][2]=360;
    matrice=transform(matrice);
    
    for (int i = 0 ; i< matrice.length ; i++){
        for (int j=0 ; j<matrice[i].length ; j++){
             System.out.print(matrice[i][j]+ " ");
        }
        System.out.println("");
    }
}

}