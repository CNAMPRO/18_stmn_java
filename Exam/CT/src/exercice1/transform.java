package exercice1;

public class transform {

    public static void main(String[] args) {
        int[][] matrice = new int[5][5];
        for(int i = 0; i < matrice.length; i++){
               for(int j = 0; j < matrice[i].length; j++){
                 matrice[i][j] = 0;
               }
            }
        matrice[2][2]=360;
        affiche_matrice(matrice);
        int[][] matrice_transform;
        matrice_transform = transform(matrice);
        affiche_matrice(matrice_transform);
    }

    
    public static void affiche_matrice(int[][] a) {
        for(int i = 0; i < a.length; i++){
               for(int j = 0; j < a[i].length; j++){
                   System.out.print(a[i][j]+ ",");
               }
               System.out.println("");
            }
        System.out.println("");
    }
    
    public static final int[][] transform(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                if((i > 0) && (i < a.length-2) && (j > 0) && (j < a[i].length-2)) {
                    b[i][j] = (a[i-1][j-1]+a[i-1][j+1]+a[i][j]+a[i+1][j-1]+a[i+1][j+1])/5;
                } else {
                    b[i][j]  = a[i][j];
                }
            }
        }
        
        return b;
        
    }
}