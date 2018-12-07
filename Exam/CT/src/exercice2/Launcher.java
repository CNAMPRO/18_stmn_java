package exercice2;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Launcher {

	public static void main(String[] args) throws Exception {
		int img[][] = Util.getLennaGreenBuffer();
		IImageBuffer maskimg = new MaskedImage(img);
		// CREATION DU MASK
		boolean inclusionMask[][] =  new boolean[img.length][img[0].length];
		for (int i = 0; i<img.length;i++) {
			for (int j = 0; j<img[0].length;j++) {
				if(i<(img.length/2) || j>(img[0].length/2)) {
					inclusionMask[i][j] = true;
				}
				else{
					inclusionMask[i][j] = false;
				}
			}
		}
		//
		((MaskedImage)maskimg).setInclusionMask(inclusionMask);
		BufferedImage bImg = ImageFactory.getImage(maskimg);
		JFrame affichage = new ImageViewer(bImg);
		affichage.setVisible(true);
	}

}
