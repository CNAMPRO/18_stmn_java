package exercice1;
import org.junit.jupiter.api.Test;
class TestTransform {

	@Test
	void test() {
		
		
		int[][] a = {{0,0,0,0,0},{0, 0 ,0 ,0 ,0},{0, 0 ,360, 0 ,0},{0, 0 ,0 ,0 ,0},{0, 0 ,0 ,0, 0}};
		TransformManipulation.transform(a);
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println("");
		}
		
	}

}
