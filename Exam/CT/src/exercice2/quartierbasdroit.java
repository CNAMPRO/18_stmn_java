package exercice2;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class quartierbasdroit {
	
	public static void main (String[] args) throws Exception{
			
			int[][] img = Util.getLennaRedBuffer();
			boolean[][] mask = new boolean[img.length][img[0].length];
			
			for(int i = 0; i<img.length;i++)
			{
				for(int j =0;j<img[0].length;j++)
				{
					if(i>img.length/2 && j>img[0].length/2)
						mask[i][j] = false;
					else 
						mask[i][j] = true;
				}
			}
			MaskedRaster IRB = new MaskedRaster(img);
			IRB.setExclusionMask(mask);
			BufferedImage imgB = RasterFactory.getImage(IRB);
			
			RasterViewer view = new RasterViewer(imgB);
			view.setVisible(true);
		
			view.setExtendedState(JFrame.MAXIMIZED_BOTH);
			view.setUndecorated(true); 
		
		}
	}
	
