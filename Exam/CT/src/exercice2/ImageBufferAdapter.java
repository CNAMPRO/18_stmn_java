package exercice2;

public class ImageBufferAdapter implements IImageBuffer {

	private final MaskedImage adaptee;
	
	public ImageBufferAdapter(MaskedImage input) {
		adaptee = input;
	}
	
	@Override
	public int[][] getValues() {
		return adaptee.getPixels();
	}

	@Override
	public int getWidth() {
		return adaptee.getPixels()[0].length;
	}

	@Override
	public int getHeight() {
		return adaptee.getPixels().length;
	}

}
