package exercice2;


import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BandedSampleModel;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ImageFactory {
	
	public static BufferedImage getImage(IImageBuffer img) throws Exception {
		int[][] raster = img.getValues();
		if (raster.length==0) {
			throw new Exception("Invalid raster");
		}
		int h = raster.length;
		int w = raster[0].length;
		
		int[] ints = Arrays.stream(raster).flatMapToInt(x->IntStream.range(0, x.length).map(y->x[y])).toArray();
		
		DataBuffer buff = new DataBufferInt(ints, w*h);
		BandedSampleModel m = new BandedSampleModel(DataBuffer.TYPE_BYTE, w, h, 1);
		WritableRaster r = Raster.createWritableRaster(m, buff, null);
		
		return new BufferedImage(new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY), false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE), r, false, null);
	}

}
