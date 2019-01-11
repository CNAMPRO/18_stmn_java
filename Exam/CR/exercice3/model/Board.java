package exercice3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import exercice3.view.JBox;

public class Board implements Observer 
{

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

	public void computeNeighboringBomb() {
		for (int i=0; i<nbRows;++i) {
			for (int j=0; j< nbColumns; ++j) {
				ArrayList<Box> neighbors = getNeighboringCells(i, j);
				cells[i][j].nbOfNeiboringBomb = (int) neighbors.stream().filter(x -> x.isBomb ).count();
			}
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Box c = (Box) o;
		if (c.getState() == BoxState.TRIGGERED) {
			// TODO
			if (c.isBomb) 
			{		
				for (int i=0; i<nbRows; i++) 
				{
		            for (int j=0; j< nbColumns; j++) 
		            {
		            	ArrayList<Box> neighbors = getNeighboringCells(i, j);
		            	for (Box neighbor : neighbors) 
		            	{
		            		if(neighbor.isBomb && neighbor.getState()==BoxState.UNTRIGGERED)
		            		{
		            			neighbor.setState(BoxState.TRIGGERED);
		            		}
		            		else if(!neighbor.isBomb)
		            			neighbor.setState(BoxState.TRIGGERED);
		            	}
		            }
				}
			}
			if (!c.isBomb && c.nbOfNeiboringBomb == 0) {
				ArrayList<Box> neighbors = getNeighboringCells(c.gridy, c.gridx);
				for (Box neighbor : neighbors) {
					if (neighbor.getState() == BoxState.UNTRIGGERED)
						neighbor.setState(BoxState.TRIGGERED);
				}
			}
		}

	}
	
	public void reset() 
	{
		for (int i=0; i<nbRows; i++) 
		{
            for (int j=0; j< nbColumns; j++) 
            {
            	ArrayList<Box> neighbors = getNeighboringCells(i, j);
            	for (Box neighbor : neighbors) 
            	{
            		if(neighbor.getState()==BoxState.TRIGGERED)
            			neighbor.setState(BoxState.UNTRIGGERED);
            	}
            }
		}
		for (int i=0; i<nbRows; i++) 
		{
			
            for (int j=0; j< nbColumns; j++) 
            {
            	cells[i][j].isBomb = false;
            }
		}
		LayBomb();
	}
	
	public void LayBomb()
	{
		int b = 5;
		int n = 4;
		int m = 4;
		for(int i=0; i<b;i++)
		{
			int k = new Random().nextInt(n);
			int l = new Random().nextInt(m);
			cells[k][l].isBomb = true;
		}
	}

}
