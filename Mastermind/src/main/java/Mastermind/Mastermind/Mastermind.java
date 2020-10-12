package Mastermind.Mastermind;

import Mastermind.utils.Message;
import Mastermind.utils.YesNoDialog;

public class Mastermind {
	private Board board;
	private Turn turn;
	
	private void play() {
		do {
			this.playGame();
		}while(this.isResumedGame());
	}
	
	private void playGame() {
		Message.TITLE.writeln();
		Message.SECRET.writeln();
		this.board = new Board();
		this.turn = new Turn(this.board);
		do {
			this.board.writeln();
			this.turn.play();
		} while (!this.board.isFinished());
		Message finalMessage = Message.LOOSER;
		if (this.board.isWinner()) {
			finalMessage = Message.WINNER;
		}
		
		finalMessage.writeln();
		this.board.writeFinalCombination();
	}

	private boolean isResumedGame() {
		return new YesNoDialog().read(Message.RESUME.toString());
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}


	
}
