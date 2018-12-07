package exercice2;

public class Launcher2 {
	public static void main(String[] args) throws Exception {
		int[][] buffer = Util.getBoatBuffer();
		MaskedImage matrix = new MaskedImage(buffer);
		ImageBufferAdapter band = new ImageBufferAdapter(matrix);
		ImageViewer viewer = new ImageViewer(ImageFactory.getImage(band));
		viewer.pack();
		viewer.setVisible(true);
	}
}
