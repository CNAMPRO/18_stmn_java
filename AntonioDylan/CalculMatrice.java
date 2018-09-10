public class CalculMatrice
{
    public static void main(String[] args)
    {
        int[][] a = {{58,8,9},{25,3,7}};
        int[][] b = {{67,12,74},{95,17,15}};
        int[][] c = multiplication(a,b);
        affichage(c);
    }
    public static int[][] multiplication(int[][] a, int[][] b){
        if(a[0].length != b.length){
            return null;
        }
        int ligne = (a.length  a[0].length  b.length  b[0].length)b.lengtha.length;
        int col = (a.length  a[0].length  b.length  b[0].length)b[0].lengtha[0].length;
        int[][] result =  new int[ligne][col];
        ligne = 0;
        for (int i = 0;i  a.length;i++){ 
            col = 0;
            for (int j = 0;j b[0].length;j++){ 
                int calcul= 0;
                for (int k = 0;k  b.length;k++){  
                    calcul += a[i][k]  b[k][j];
                }
                result[ligne][col] = calcul;
                col++;
            }
            ligne++;
        }
        return result;
    }
    
    public static void affichage(int [][]a){

        for (int i = 0;i  a.length;i++)
        {
            for (int j = 0;j  a[0].length ;j++)
            {
                System.out.printf(%2d ,a[i][j] );
            }
            System.out.println();
        }
        System.out.println();
    }
}