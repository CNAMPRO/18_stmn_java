package exercice2;

public class Launcher3 {
	public static void main(String[] args) throws Exception {
		int[][] buffer = Util.getBoatBuffer();
		MaskedImage matrix = new MaskedImage(buffer);
		for (int i=0; i< 2;++i) matrix.transform();
		ImageBufferAdapter band = new ImageBufferAdapter(matrix);
		ImageViewer viewer = new ImageViewer(ImageFactory.getImage(band));
		viewer.pack();
		viewer.setVisible(true);
	}
}
