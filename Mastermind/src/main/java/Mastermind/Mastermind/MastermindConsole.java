package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.console.MastermindView;
import Mastermind.Mastermind.models.Board;

public class MastermindConsole {

	private Board board;
	private MastermindView mastermindView;

	private MastermindConsole() {
		this.board = new Board();
		this.mastermindView = new MastermindView(this.board);
	}

	private void play() {
		this.mastermindView.interact();
	}

	public static void main(String[] args) {
		new MastermindConsole().play();
	}

}
