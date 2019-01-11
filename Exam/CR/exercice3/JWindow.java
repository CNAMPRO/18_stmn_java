package exercice3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import exercice3.model.Board;
import exercice3.view.JBox;
import exercice3.view.JBoard;

public class JWindow extends JFrame {

	private static final Dimension PREFERED_SIZE = new Dimension(24,  24);
	private static Image SMILEY;
	
	private Board model;
	
	public JWindow(Board model) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MineSweeper");

		this.model = model;
		
		JPanel buttonBar = new JPanel();
		JButton smiley = new JButton(new ImageIcon(SMILEY));
		smiley.setMargin(new Insets(2, 2, 2, 2));
		smiley.addActionListener(e -> model.reset()); //System.out.println("Implement me!"));
		buttonBar.add(smiley);
		
		JBoard grid = new JBoard(model);
		
		add(buttonBar, BorderLayout.NORTH);
		add(grid, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		Board model = new Board(4, 4);
		// Initializing manually the grid
		// Laying bombs

		/*model.cells[0][1].isBomb = true;
		model.cells[1][1].isBomb = true;
		model.cells[2][1].isBomb = true;
		model.cells[2][0].isBomb = true;*/
		model.LayBomb();
		
		// Initializing neighbors
		model.computeNeighboringBomb();
		
		JWindow main = new JWindow(model);
		
		main.pack();
		main.setVisible(true);
	}
	
	static {
		try {
			BufferedImage buffImg = ImageIO.read(JWindow.class.getClassLoader().getResource("exercice3/smiley.png"));
			SMILEY = buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
