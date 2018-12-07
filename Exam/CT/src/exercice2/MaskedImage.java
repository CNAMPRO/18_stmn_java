package exercice2;

public class MaskedImage implements IImageBuffer{
	private int[][] pixels;
	boolean[][] inclusionMask;
	public MaskedImage(int[][] input) {
		this.pixels = input;
		this.initMask();
	}
	
	private void initMask() {
		inclusionMask =  new boolean[this.pixels.length][this.pixels[0].length];
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
	
	public void transform(){
		for (int i = 0; i< this.pixels.length;i++) {
			for (int j = 0; j<this.pixels[0].length;j++) {
				if(i>=1&&i<=this.pixels.length-2 && j>=1 && j<=this.pixels[0].length-2) {
					this.pixels[i][j] = (this.pixels[i-1][j] + this.pixels[i][j-1] + this.pixels[i][j] + this.pixels[i][j+1] + this.pixels[i+1][j])/5;
				}
				else {
					this.pixels[i][j] = this.pixels[i][j];
				}
					
			}
		}
	}

	@Override
	public int[][] getValues() {
		return getPixels();
	}

	@Override
	public int getWidth() {
		return this.pixels.length;
	}

	@Override
	public int getHeight() {
		return this.pixels[0].length;
	}
}
