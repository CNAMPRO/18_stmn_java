package exercice2;

import java.awt.image.*;
import javax.swing.*;

public class Launcher {

		public static void main(String[]args)throws Exception
		
		{
			//on charge lenna
			int Lenna[][] = Util.getLennaGreenBuffer();
			//on utilise notre fonction qui a deja de probleme de code
			IImageBuffer masking = new MaskedImage(Lenna);
			//on fait mais limage dans le buffeur 
			BufferedImage BufLenna = ImageFactory.getImage(masking);
			
			JFrame affiche = new ImageViewer(BufLenna);
			affiche.setVisible(true);
			
		}
}
