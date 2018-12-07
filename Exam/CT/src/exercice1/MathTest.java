package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void test() {
    	// Création de la matrice d'exemple
        int[][] matrice = new int[5][5];
        for(int i = 0; i < matrice.length; i++){
               for(int j = 0; j < matrice[i].length; j++){
                 matrice[i][j] = 0;
               }
            }
        matrice[2][2] = 360;
        
        // Affichage
        for (int k = 0; k < matrice.length; k++) {
        	System.out.print("[");
            for (int l = 0; l < matrice[k].length; l++) {
                System.out.print(matrice[k][l]+ ",");
            }
            System.out.print("]");
            System.out.println("");
         }
        	System.out.println("");
        	
        // Transformation	
         int[][] matrice_transform = Math.transform(matrice);
         for (int k = 0; k < matrice_transform.length; k++) {
        	 System.out.print("[");
             for (int l = 0; l < matrice_transform[k].length; l++) {
                 System.out.print(matrice_transform[k][l]+ ",");
             }
             System.out.print("]");
             System.out.println("");
          }
	}

}
