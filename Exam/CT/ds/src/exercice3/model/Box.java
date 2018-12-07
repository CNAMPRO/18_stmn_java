package exercice3.model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import exercice2.Util;

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

	public void flag() {
		// TODO Auto-generated method stub
		if (state == BoxState.TRIGGERED) {
			state = BoxState.UNTRIGGERED;
		} else {
			state = BoxState.TRIGGERED;
		}
	}


	
	
}
