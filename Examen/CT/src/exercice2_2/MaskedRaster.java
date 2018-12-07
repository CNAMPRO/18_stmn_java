package exercice2_2;

public class MaskedRaster {
	public int[][] bits;
	public boolean[][] executionMask;
		
	public MaskedRaster(int[][] input) {
		super();
		// TODO Auto-generated constructor stub
		executionMask = new boolean[input.length][input[0].length];
		
		for (int i = 0; i < executionMask.length;i++) {
            for (int j =0; j < executionMask[0].length;j++) {
            	executionMask[i][j]= false;
            }
        }
	}
	
	private void initMask() {
		int[][] result = new int [bits.length][bits[0].length];
		for (int i = 0; i < result.length;i++) {
            for (int j =0; j < result[0].length;j++) {
            	if(executionMask[i][j] == false) {
            		result[i][j] = bits[i][j];
            	} else if(executionMask[i][j] == true){
            		result[i][j] = 0; 
            	}
            }
        }
	}
	
	public int[][] getBits(){
		return this.bits;
	}
}
