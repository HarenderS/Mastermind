package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Board;

public abstract class MastermindView {

	protected Board board;
	
	public MastermindView(Board board) {
		this.board = board;
	}
	
	public void interact() {
		do {
			this.start();
			this.play();
		} while (this.resume());
	}

	protected abstract void start();
	protected abstract void play();
	protected abstract boolean resume();
}
