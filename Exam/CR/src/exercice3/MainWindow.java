package exercice3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import exercice3.model.Grid;
import exercice3.view.CellWidget;
import exercice3.view.GridWidget;

public class MainWindow extends JFrame {

	private static final Dimension PREFERED_SIZE = new Dimension(24,  24);
	private static Image SMILEY;
	
	private Grid model;
	
	public MainWindow(Grid model) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MineSweeper");
		
		this.model = model;
		
		JPanel buttonBar = new JPanel();
		JButton smiley = new JButton(new ImageIcon(SMILEY));
		smiley.setMargin(new Insets(2, 2, 2, 2));
		smiley.addActionListener(e -> model.reset());
		buttonBar.add(smiley);
		
		GridWidget grid = new GridWidget(model);
		
		add(buttonBar, BorderLayout.NORTH);
		add(grid, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		Grid model = new Grid(4, 4);
		int b = 8;
		// Random
		for(int i = 0; i<b; ++i)
		{
			int ligne = 0 + (int)(Math.random() * ((3 - 0) + 1));
			int colone = 0 + (int)(Math.random() * ((3 - 0) + 1));
			model.cells[ligne][colone].isBomb = true;
		}
		model.computeNeighboringBomb();
		
		MainWindow main = new MainWindow(model);
		
		main.pack();
		main.setVisible(true);
	}
	
	static {
		try {
			BufferedImage buffImg = ImageIO.read(MainWindow.class.getClassLoader().getResource("exercice3/smiley.png"));
			SMILEY = buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
