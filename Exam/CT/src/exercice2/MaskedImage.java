package exercice2;

public class MaskedImage {
	private int[][] pixels;
	boolean[][] inclusionMask = new boolean[3][3];
	public MaskedImage(int[][] input) {
		this.pixels = input;
		this.initMask();
	}
	
	private void initMask() {
		for (int i = 0; i< this.pixels.length;i++) {
			for (int j = 0; j<this.pixels[0].length;j++) {
				this.inclusionMask[i][j] = true;
			}
		}
	}
	
	public void setInclusionMask(boolean[][] mask) {
		this.inclusionMask = mask;
	}
	
	public int[][] getPixels(){
		int result[][] = new int[this.pixels.length][this.pixels[0].length];
		for (int i = 0; i< this.pixels.length;i++) {
			for (int j = 0; j<this.pixels[0].length;j++) {
				result[i][j] = (this.inclusionMask[i][j])?this.pixels[i][j]:0;
			}
		}
		return result;
	}
}
