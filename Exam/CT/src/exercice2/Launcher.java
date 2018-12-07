package exercice2;


public class Launcher {
	
	public static void main(String[] args) throws Exception {
		int[][] buffer = Util.getLennaGreenBuffer();
		int height = buffer.length;
		int width = buffer[0].length;
		MaskedImage matrix = new MaskedImage(buffer);		
		for (int row=height/2; row<height;++row) {
			for (int col=0; col<width/2;++col) {
				matrix.inclusionMask[row][col] = false;
			}
		}
		ImageBufferAdapter band = new ImageBufferAdapter(matrix);
		ImageViewer viewer = new ImageViewer(ImageFactory.getImage(band));
		viewer.pack();
		viewer.setVisible(true);
	}

}
