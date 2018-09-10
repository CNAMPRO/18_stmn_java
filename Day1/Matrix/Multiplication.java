public class Multiplication
{
    public static void main(String[] args)
    {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{4,3},{2,1}};
        int[][] c = multiplication(a,b);
        afficheTab(c);
    }

// Fonction de multiplication
    public static int[][] multiplication(int[][] a, int[][] b){
        if(a[0].length != b.length){
            return null;
        }
        int lignes = (a.length * a[0].length < b.length * b[0].length)?b.length:a.length;
        int colonne = (a.length * a[0].length < b.length * b[0].length)?b[0].length:a[0].length;
        int[][] result =  new int[lignes][colonne];
        lignes = 0;
        for (int i = 0;i < a.length;i++){ 
            colonne = 0;
            for (int j = 0;j< b[0].length;j++){ 
                int calcul= 0;
                for (int k = 0;k < b.length;k++){  
                    calcul += a[i][k] * b[k][j];
                }
                result[lignes][colonne] = calcul;
                colonne++;
            }
            lignes++;
        }
        return result;
    }

// Fonction d'affichage    
    public static void afficheTab(int [][]a){

        for (int i = 0;i < a.length;i++)
        {
            for (int j = 0;j < a[0].length ;j++)
            {
                System.out.printf("%2d ",a[i][j] );
            }
            System.out.println();
        }
        System.out.println();
    }
}