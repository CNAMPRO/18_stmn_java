package exercice2;

import exercice1.Calcul;

public class MaskedImage implements IImageBuffer {

	private int[][] pixels;
	private boolean[][] inclusionMask;
	
	public MaskedImage ( int[][] input) {
		this.pixels = input;		
		initMask();
	}

	private void initMask() {
		
		inclusionMask = new boolean[this.pixels.length][this.pixels[0].length];
		for (int i =0; i < this.pixels.length; i++) {
			for (int j =0; j < this.pixels[0].length; j++) {
				this.inclusionMask[i][j] = true;
			}
		}
		//TEST IMPLEMENTATION
		this.inclusionMask[0][1]= false;
		this.inclusionMask[0][2]= false;
		this.inclusionMask[1][0]= false;
		this.inclusionMask[1][2]= false;
		this.inclusionMask[2][0]= false;
		this.inclusionMask[2][1]= false;
	}
	
	public int[][] getPixels(){
		int[][] result = new int[this.pixels.length][this.pixels[0].length];
		for (int i =0; i < this.pixels.length; i++) {
			for (int j =0; j < this.pixels[0].length; j++) {
				if(this.inclusionMask[i][j] == true) {
					result[i][j] = this.pixels[i][j];
				}else {
					result[i][j] = 0;
				}
			}
		}	
		return result;
	}

	@Override
	public int[][] getValues() {
		
		return getPixels();
	}

	@Override
	public int getWidth() {
		int[][] img = getPixels();
		
		return img.length;
		}

	@Override
	public int getHeight() {
		int[][] img = getPixels();		
		return img[0].length;
		
	}
	
	
	public void transform(){
		this.pixels = Calcul.transform(this.pixels);
	}

	
}
