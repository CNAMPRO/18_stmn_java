package exercice2;

public class MaskedRaster {
	public static int[][] bits;
	public static boolean[][] exclusionMask;
	
	private MaskedRaster(int[][] input) {
		bits = input;
		initMask();
	}
	
	private void initMask() {
		//exclusionMask = ;
	}
	
	public int[][] getBits() {
		int n = exclusionMask.length;
        int m = exclusionMask[0].length;
        int [][] result = null;
        
		for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
            	if (exclusionMask[i][j] == false) {
        			result[i][j] = bits[i][j];
        		} else {
        			result[i][j] = 0;
        		}
            }
        }

		return result;
	}
}
