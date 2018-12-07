package exercice3.model;

import java.util.Observable;

public class Box extends Observable {
	public boolean isBomb;
	public int nbOfNeiboringBomb;
	public int gridx;
	public int gridy;
	private BoxState state = BoxState.UNTRIGGERED;
	
	private Box(int gridx, int gridy) {
		this.gridx = gridx;
		this.gridy = gridy;
		nbOfNeiboringBomb = 0;
	}
	
	public Box(int gridx, int gridy, boolean isBomb) {
		this(gridx, gridy);
		this.isBomb = isBomb;
	}
	
	public Box(int gridx, int gridy, int nbOfNeiboringBomb) {
		this(gridx, gridy);
		this.isBomb = false;
		this.nbOfNeiboringBomb = nbOfNeiboringBomb;
	}
	
	public BoxState getState() {
		return state;
	}
	
	public void trigger() {
		state = BoxState.TRIGGERED;
		setChanged();
		notifyObservers(isBomb);
	}
}
