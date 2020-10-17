package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.graphics.MastermindView;
import Mastermind.Mastermind.models.Board;

public class MastermindGraphics {

	private Board board;
	private MastermindView mastermindView;

	private MastermindGraphics() {
		this.board = new Board();
		this.mastermindView = new MastermindView(board);
	}

	private void play() {
		this.mastermindView.interact();
	}

	public static void main(String[] args) {
		new MastermindGraphics().play();
	}
}
