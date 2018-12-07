package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class transformtest {
	@Test
	void testsa() {
		int[][] matrice = {{0,0,0,0,0},{0,0,0,0,0},{0,0,360,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int[][] result = transform.transform(matrice);
		int[][] resultatAttendu = {{0,0,0,0,0},{0,0,72,0,0},{0,72,72,72,0},{0,0,72,0,0},{0,0,0,0,0}};
		assertArrayEquals(result, resultatAttendu);
		for(int i=0 ; i<result.length;i++)
		{
			for(int j=0 ; j<result.length;j++)
			{
				System.out.print(result[i][j] + " | ");
			}
			System.out.println("");
		}
	}

}
