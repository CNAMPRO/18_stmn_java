package exercice2;

public class MaskedRaster implements IRasterBuffer{
	private int[][] bits;
	private boolean[][] exclusionMask;

	/**
	 * Construit lobjet maskedRaster
	 * init bits avec l'input
	 * init exclusionMask avec initMaas
	 * @param input
	 */
	public MaskedRaster(int[][] input) {
		this.bits = input;
		this.initMask();
		
	}
	
	public void setExclusionMask(boolean[][] mask) {
		this.exclusionMask = mask;
		
	}
	private void initMask() { 	
		this.exclusionMask = new boolean[this.bits.length][this.bits[0].length]; 
		for (int i = 0; i < this.bits.length; i++) {
			for (int j = 0; j < this.bits[0].length; j++) {
				this.exclusionMask[i][j] = false;		
			}
		}
	}
	public int[][] getBits(){
        int[][] result = new int[this.bits.length][this.bits[0].length]; // Gnegne David comment vous faites pour initialiser un matrice au tableau ? je me souvieeeeeeeens
		for (int i = 0; i < this.bits.length; i++) {
			for (int j = 0; j < this.bits.length; j++) {
				if(this.exclusionMask[i][j] == false) {
					result[i][j] = 	this.bits[i][j];
				} else result[i][j] = 0;
				
			}
		}
		return result;
	}

	@Override
	public int[][] getValues() {
		return this.getBits();
	}

	@Override
	public int getWidth() {
		return this.getBits()[0] != null ? this.getBits()[0].length : 0 ;
	}

	@Override
	public int getHeight() {
		return this.getBits() != null ? this.getBits().length : 0 ;
	}
	
}
