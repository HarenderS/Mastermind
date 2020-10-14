package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.MastermindView;
import Mastermind.Mastermind.models.Board;

public class Mastermind {

	private Board board;
	private MastermindView mastermindView;

	private Mastermind() {
		this.board = new Board();
		this.mastermindView = new MastermindView(this.board);
	}

	private void play() {
		this.mastermindView.play();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
