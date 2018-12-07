package exercice1;

public class transform {
	
	public static void main(String[] args){
		int[][] matrice = {{0,0,0,0,0},{0,0,0,0,0},{0,0,360,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int[][] test = transform(matrice);
		for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                System.out.print(test[i][j]+ " , ");
            }
            System.out.println("");
         }
	}

	public static int[][] transform(int[][] matrice){
        int [][] result = new int[matrice.length][matrice[0].length];
        for (int i =1; i < matrice.length -2;i++) {
            for (int j =1; j < matrice[0].length -2;j++) {
            	result[i][j] = (matrice[i-1][j] + matrice[i][j-1] + matrice[i][j] + matrice[i][j+1] + matrice[i+1][j]) /5;
            }
        }
        return result;
    }
}
