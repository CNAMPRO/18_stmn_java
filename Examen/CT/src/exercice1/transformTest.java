package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class transformTest {
	@Test
	 void testtransform(){
		int[][] matrice = {{0,0,0,0,0},{0,0,0,0,0},{0,0,360,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int[][] test = transform(matrice);
		for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                System.out.print(test[i][j]+ ", ");
            }
            System.out.println("");
         }
 }
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
