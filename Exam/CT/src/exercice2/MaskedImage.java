package exercice2;

import exercice1.Transform;

public class MaskedImage {
	private int[][] pixels;
	public boolean[][] inclusionMask;
	
	/*
	 * Construct a MaskedImage object.
	 * This constructor initializes:
	 * - pixels with the given input
	 * - inclusionMask by calling initMask
	 * @param input original image buffer used to initialize pixels
	 */
	public MaskedImage(int[][] input) {
		pixels = input;
		initMask();
	}
	
	/*
	 * Initialize inclusionMask as an array of the same size
	 * as pixels and set all value to true.
	 */
	private void initMask() {
		inclusionMask = new boolean[pixels.length][pixels[0].length];
		for (int row=0; row<pixels.length;++row) {
			for (int col=0; col<pixels[0].length;++col) {
				inclusionMask[row][col] = true;
			}
		}
	}
	
	/*
	 * Compute pixel values by applying inclusionMask to pixels.
	 * Critical notice: this method does NOT modify attribute pixels.
	 * Let result the returned value. Then:
	 * - result[i][j] = pixels[i][j], if inclusionMask[i][j]=true
	 * - result[i][j] = 0, if inclusionMask[i][j]=false
	 * @return an array of the same size as pixels whose value is computed
	 * as described above.
	 */
	public int[][] getPixels() {
		int[][] outcome = new int[pixels.length][pixels[0].length];
		for (int row=0; row<pixels.length;++row) {
			for (int col=0; col<pixels[0].length;++col) {
				if (!inclusionMask[row][col]) {
					outcome[row][col] = 0;
				}
				else {
					outcome[row][col] = pixels[row][col];
				}
			}
		}
		return outcome;
	}
	
	public void transform() {
		pixels = Transform.transform(pixels);
	}
}
