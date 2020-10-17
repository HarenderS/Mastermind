package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.MastermindView;
import Mastermind.Mastermind.models.Board;

public abstract class Mastermind {

	private Board board;
	private MastermindView mastermindView;

	protected Mastermind() {
		this.board = new Board();
		this.mastermindView = this.createView(board);
	}

	protected abstract MastermindView createView(Board board);

	protected void play() {
		this.mastermindView.interact();
	}

}