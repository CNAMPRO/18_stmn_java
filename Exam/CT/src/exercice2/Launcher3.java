package exercice2;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Launcher3 {

	public static void main(String[] args) throws Exception {
		int img[][] = Util.getBoatBuffer();
		IImageBuffer maskimg = new MaskedImage(img);
		((MaskedImage)maskimg).transform();
		BufferedImage bImg = ImageFactory.getImage(maskimg);
		JFrame affichage = new ImageViewer(bImg);
		affichage.setVisible(true);
	}
}
