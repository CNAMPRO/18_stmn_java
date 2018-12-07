package exercice3;

import exercice3.model.Board;
import exercice3.view.JBoard;

public class Launcher {
	public static void main(String[] args) {
		Board model = new Board(4, 4);
		// Initializing manually the grid
		// Laying bombs
		model.cells[0][1].isBomb = true;
		model.cells[1][1].isBomb = true;
		model.cells[2][1].isBomb = true;
		model.cells[2][0].isBomb = true;
		// Initializing neighbors
		model.cells[0][0].nbOfNeiboringBomb = 2;
		model.cells[1][0].nbOfNeiboringBomb = 4;
		model.cells[0][2].nbOfNeiboringBomb = 2;
		model.cells[1][2].nbOfNeiboringBomb = 3;
		model.cells[2][2].nbOfNeiboringBomb = 2;
		model.cells[3][0].nbOfNeiboringBomb = 2;
		model.cells[3][1].nbOfNeiboringBomb = 2;
		model.cells[3][2].nbOfNeiboringBomb = 1;
		
		JBoard main = new JBoard(model);
		
		main.pack();
		main.setVisible(true);
	}
}
