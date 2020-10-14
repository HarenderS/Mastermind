package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Board;

public class MastermindView {

	private Board board;
	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;
	
	public MastermindView(Board board) {
		this.board = board;
		this.startView = new StartView();
		this.boardView = new BoardView(this.board);
		this.resumeView = new ResumeView();
	}
	
	public void play() {
		do {
			this.board.reStartBoard();
			this.startView.start();
			do {
				this.boardView.play();;
			} while (!this.board.isFinished());
		}while(this.resumeView.resume());
	}
	
}
