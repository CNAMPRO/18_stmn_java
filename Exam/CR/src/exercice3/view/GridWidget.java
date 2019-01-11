package exercice3.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import exercice3.model.Cell;
import exercice3.model.Grid;

public class GridWidget extends JPanel {
	
	public GridWidget(Grid model) {
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		CellWidget cw;
		
		for (int i=0; i<model.nbRows; ++i) {
			for (int j=0; j<model.nbColumns; ++j) {
				cw = new CellWidget(model.cells[i][j]);
				c.gridx = j;
				c.gridy = i;		
				add(cw, c);
			}
		}
	}

}
