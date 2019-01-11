package exercice3.model;

import java.util.Observable;

public class Cell extends Observable {
	public boolean isBomb;
	public int nbOfNeiboringBomb;
	public int gridx;
	public int gridy;
	private CellState state = CellState.UNTRIGGERED;
	
	private Cell(int gridx, int gridy) {
		this.gridx = gridx;
		this.gridy = gridy;
		nbOfNeiboringBomb = 0;
	}
	
	public Cell(int gridx, int gridy, boolean isBomb) {
		this(gridx, gridy);
		this.isBomb = isBomb;
	}
	
	public Cell(int gridx, int gridy, int nbOfNeiboringBomb) {
		this(gridx, gridy);
		this.isBomb = false;
		this.nbOfNeiboringBomb = nbOfNeiboringBomb;
	}
	
	public CellState getState() {
		return state;
	}
	
	public void trigger() {
		state = CellState.TRIGGERED;
		setChanged();
		notifyObservers(isBomb);
	}
}
