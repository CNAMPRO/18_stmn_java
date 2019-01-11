package exercice3.model;

import java.util.ArrayList;
import java.util.Arrays;
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

	public void computeNeighboringBomb() {
		for (int i=0; i<nbRows;++i) {
			for (int j=0; j< nbColumns; ++j) {
				ArrayList<Cell> neighbors = getNeighboringCells(i, j);
				cells[i][j].nbOfNeiboringBomb = (int) neighbors.stream().filter(x -> x.isBomb ).count();
			}
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Cell c = (Cell) o;
		if (c.getState() == CellState.TRIGGERED) {
			// TODO
			if (c.isBomb) {	
				iseedeadpeople(); //outre la ref de sixieme sens c'est aussi le code pour révéler la map sur warcraft III
			}
			if (!c.isBomb && c.nbOfNeiboringBomb == 0) {
				ArrayList<Cell> neighbors = getNeighboringCells(c.gridy, c.gridx);
				for (Cell neighbor : neighbors) {
					if (neighbor.getState() == CellState.UNTRIGGERED)
						neighbor.setState(CellState.TRIGGERED);
				}
			}
		}

	}
	
	public void iseedeadpeople() {
		for (int i=0; i<4;++i) {
			for (int j=0; j< 4; ++j) {
				if(cells[i][j].getState() == CellState.UNTRIGGERED)
						cells[i][j].setState(CellState.TRIGGERED);
			}
		}
	}
	
	public void reset() {
		for (int i=0; i<4;++i) {
			for (int j=0; j< 4; ++j) {
				cells[i][j].setState(CellState.UNTRIGGERED);
			}
		}
		for (int i=0; i<4;++i) {
			for (int j=0; j< 4; ++j) {
					cells[i][j].isBomb = false;
			}
		}
		int b = 8;
		// Random
		for(int i = 0; i<b; ++i)
		{
			int ligne = 0 + (int)(Math.random() * ((3 - 0) + 1));
			int colone = 0 + (int)(Math.random() * ((3 - 0) + 1));
			cells[ligne][colone].isBomb = true;
		}
		computeNeighboringBomb();
	}

}
