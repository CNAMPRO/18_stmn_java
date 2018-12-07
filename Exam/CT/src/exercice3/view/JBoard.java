package exercice3.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import exercice3.model.Box;
import exercice3.model.Board;

public class JBoard extends JFrame {
	
	public JBoard(Board model) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		setTitle("MineSweeper");
		
		GridBagConstraints c = new GridBagConstraints();
		JBox cw;
		
		for (int i=0; i<model.nbRows; ++i) {
			for (int j=0; j<model.nbColumns; ++j) {
				cw = new JBox(model.cells[i][j]);
				c.gridx = j;
				c.gridy = i;		
				add(cw, c);
			}
		}
	}

}
