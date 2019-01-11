package exercice3.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import exercice3.model.Box;
import exercice3.model.Board;

public class JBoard extends JPanel {
	
	public JBoard(Board model) {
		setLayout(new GridBagLayout());
		
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
