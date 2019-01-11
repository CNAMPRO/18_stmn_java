package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class transformTest {

	int[][] matriceTest = new int[5][5];
	 for(int i = 0; i < matrice.length; i++){
	       for(int j = 0; j < matriceTest[i].length; j++){
	         matriceTest[i][j] = 0;
	       }


        int [][]matriceAttendue = new int[5][5];
        matriceAttendue[1][2]=72;
        matriceAttendue[2][1]=72;
        matriceAttendue[2][2]=72;
        matriceAttendue[2][3]=72;
        matriceAttendue[3][2]=72;
        if (matriceAttendue.compareTo(matriceTest) == 0) {
	     return true;
        }
        else {
	     return false;
        }

}
