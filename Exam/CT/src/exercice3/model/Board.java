package exercice3.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Board implements Observer {

	public final int nbRows;
	public final int nbColumns;
	public final Box[][] cells;
	
	public Board(int nbRows, int nbColumns) {
		this.nbRows = nbRows;
		this.nbColumns = nbColumns;
		
		cells = new Box[nbRows][nbColumns];
		for (int i=0; i<nbRows; ++i) {
			for (int j=0; j<nbColumns; ++j) {
				cells[i][j] = new Box(j,i,0);
				cells[i][j].addObserver(this);
			}
		}
	}
	
	public ArrayList<Box> getNeighboringCells(int row, int col) {
		ArrayList<Box> c = new ArrayList<>();
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
	
	public int computeNeighboringBomb(int row, int col) {
		int c = 0;
		if (row > 0) {
			if (col > 0)
				if(cells[row - 1][col - 1].isBomb == true) {
					c = c + 1;
				}
			if(cells[row - 1][col].isBomb == true) {
				c = c +1;
			}
			if (col < nbColumns - 1)
				if(cells[row - 1][col + 1].isBomb == true) {
					c = c + 1;
				}
		}
		if (col > 0)
			if(cells[row][col - 1].isBomb == true) {
				c = c + 1 ;
			}
		if (col < nbColumns - 1)
			if(cells[row][col + 1].isBomb == true) {
				c = c + 1;
			}

		if (row < nbRows - 1) {
			if (col > 0) {
				if(cells[row + 1][col - 1].isBomb == true) {
					c = c + 1;
				}
			}
			if(cells[row + 1][col].isBomb == true) {
				c = c + 1;
			}
			if (col < nbColumns - 1) {
				if(cells[row + 1][col + 1].isBomb == true) {
					c = c+1;
				}
			}
		}
		return c;
	}

	@Override
	public void update(Observable o, Object arg) {
		Box c = (Box) o;
		//TODO: Implement ASAP
	}

}