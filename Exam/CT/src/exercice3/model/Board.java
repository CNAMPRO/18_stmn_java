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
	
	public void computeNeighboringBomb()
	{
		int bombes = 0;
		for(int x = 0;x<this.nbColumns;x++)
		{
			for(int y = 0;y<this.nbRows;y++)
			{
				bombes = 0;
				ArrayList<Box> c = getNeighboringCells(y,x);
				for(int voisin = 0; voisin<c.size();voisin++)
				{
					Box temp = c.get(voisin);
					if(temp.isBomb)
						bombes++;
				}
				if(!cells[y][x].isBomb)
					cells[y][x].nbOfNeiboringBomb = bombes;
			}
		}
		
	}
	
	public void chaine(int x, int y)
	{
		ArrayList<Box> c = getNeighboringCells(y,x);
		for(int voisin = 0; voisin<c.size();voisin++)
		{
			Box temp = c.get(voisin);
			System.out.println(temp.nbOfNeiboringBomb);
			if(temp.nbOfNeiboringBomb==0 && !temp.isBomb && temp.getState() == BoxState.UNTRIGGERED)
			{
				temp.trigger();
			}
		}
		
	}

	@Override
	public void update(Observable o, Object arg) {
		Box c = (Box) o;
		chaine(c.gridx,c.gridy);
	}

}
