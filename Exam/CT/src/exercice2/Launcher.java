package exercice2;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;


public class Launcher {
	public static void main(String[] args) throws Exception {
		int[][] img = Util.getLennaGreenBuffer();
		IRasterBuffer mask = new MaskedRaster(img);
		BufferedImage  bImg = RasterFactory.getImage(mask);
		JFrame frame = new RasterViewer(bImg);
		frame.setVisible(true);
	}
}
