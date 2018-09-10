// one class needs to have a main() method
public class Multiply
{
    public static void main(String[] args)
    {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{4,3},{2,1}};
        int[][] c = multiply(a,b);
        afficher(c);
    }
    public static int[][] multiply(int[][] a, int[][] b){
        if(a[0].length != b.length){
            return null;
        }
        int ligne = (a.length * a[0].length < b.length * b[0].length)?b.length:a.length;
        int col = (a.length * a[0].length < b.length * b[0].length)?b[0].length:a[0].length;
        int[][] result =  new int[ligne][col];
        ligne = 0;
        for (int i = 0;i < a.length;i++){ 
            col = 0;
            for (int j = 0;j< b[0].length;j++){ 
                int calcul= 0;
                for (int k = 0;k < b.length;k++){  
                    calcul += a[i][k] * b[k][j];
                }
                result[ligne][col] = calcul;
                col++;
            }
            ligne++;
        }
        return result;
    }
    
    public static void afficher(int [][]a){

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
