package exercice3.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Grid implements Observer {

	public final int nbRows;
	public final int nbColumns;
	public final Cell[][] cells;
	
	public Grid(int nbRows, int nbColumns) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
		
		cells = new Cell[nbRows][nbColumns];
		for (int i=0; i<nbRows; ++i) {
			for (int j=0; j<nbColumns; ++j) {
				cells[i][j] = new Cell(j,i,0);
				cells[i][j].addObserver(this);
			}
		}
	}
	
	public ArrayList<Cell> getNeighboringCells(int row, int col) {
		ArrayList<Cell> c = new ArrayList<>();
		if (row > 0) {
			if (col > 0)
				c.add(cells[row - 1][col - 1]);
			c.add(cells[row - 1][col]);
			if (col < nbColumns - 1)
				c.add(cells[row - 1][col + 1]);
		}

		if (col > 0)
			c.add(cells[row][col - 1]);
		if (col < nbColumns - 1)
			c.add(cells[row][col + 1]);

		if (row < nbRows - 1) {
			if (col > 0) c.add(cells[row + 1][col - 1]);
			c.add(cells[row + 1][col]);
			if (col < nbColumns - 1) c.add(cells[row + 1][col + 1]);
		}
		return c;
	}
	
	public void computeNeightboringBomb(Cell c) {
		int nbBomb = 0;
		ArrayList<Cell> cells = this.getNeighboringCells(c.gridx,c.gridy);
		for(Cell oneCell : cells) {
			if(oneCell.isBomb) {
				nbBomb++;
			}
		}
		c.nbOfNeiboringBomb = nbBomb;
		// GESTION DECLENCHEMENT EN CHAINE
		if(nbBomb == 0) {
			for(Cell oneCell : cells) {
				oneCell.trigger();
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		Cell c = (Cell) o;
		computeNeightboringBomb(c);
	}

}
