package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculMatricielTest {

	@Test
	public final void test() throws Exception{
				
		double[] PB = {1,0};
		
		double[] X = {1,0,0};
		double[] Y = {0,1,0};
		double[] Z = {0,0,1};		
		
		
		assertThrows(Exception.class,() ->{
			assertArrayEquals(calculMatriciel.crossProduct(PB,Y),Z);
		});
		
	
		assertArrayEquals(calculMatriciel.crossProduct(X,Y),Z);
		assertArrayEquals(calculMatriciel.crossProduct(Z,X),Y);
		assertArrayEquals(calculMatriciel.crossProduct(Y,Z),X);
		
		
	}

}
