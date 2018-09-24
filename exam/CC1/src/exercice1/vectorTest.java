package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class vectorTest {

	@Test
	public final void test() throws Exception{
		double[]v1 = {1,0,0};
		double[]v2= {0,1,0};
		double[]result = vector.crossProduct(v1,v2);
		double[]resultWait = {0,0,1};
		assertArrayEquals(resultWait,result);
		//	assertThrows(Exception.class, () -> {
		//	});
	}
	
	public final void test2() throws Exception{
		double[]v1 = {0,0,1};
		double[]v2= {1,0,0};
		double[]result = vector.crossProduct(v1,v2);
		double[]resultWait = {0,1,0};
		assertArrayEquals(resultWait,result);
		//	assertThrows(Exception.class, () -> {
		//	});
	}
	
	public final void test3() throws Exception{
		double[]v1 = {0,1,0};
		double[]v2= {0,0,1};
		double[]result = vector.crossProduct(v1,v2);
		double[]resultWait = {1,0,0};
		assertArrayEquals(resultWait,result);
		//	assertThrows(Exception.class, () -> {
		//	});
	}
	

}

