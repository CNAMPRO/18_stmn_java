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

	public void computeNeighboringBomb()
	{
		int bomb = 0;
		for(int i = 0; i<this.nbColumns;i++)
		{
			for(int j = 0;j<this.nbRows;j++)
			{
				bomb = 0;
				ArrayList<Cell> cellulVoisine = getNeighboringCells(i,j);
				for(int chiffre = 0; chiffre<cellulVoisine.size();chiffre++)
				{
					Cell Adjac = cellulVoisine.get(chiffre);
					if(Adjac.isBomb)bomb++;
				}
				if(!cells[j][i].isBomb)	cells[j][i].nbOfNeiboringBomb = bomb;
			}
		}
		
	}
	@Override
	public void update(Observable o, Object arg) {
		Cell c = (Cell) o;
		//TODO: Implement ASAP
	}

}
