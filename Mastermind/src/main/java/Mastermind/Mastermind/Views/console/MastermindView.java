package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.models.Board;

public class MastermindView extends Mastermind.Mastermind.Views.MastermindView{

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;
	
	public MastermindView(Board board) {
		super(board);
		this.startView = new StartView();
		this.boardView = new BoardView(this.board);
		this.resumeView = new ResumeView(this.board);
	}
	
	@Override
	protected void play() {
		do {
			this.boardView.play();;
		} while (!this.board.isFinished());
	}

	@Override
	protected void start() {
		this.startView.start();
	}

	@Override
	protected boolean resume() {
		return this.resumeView.resume();
	}
	
}
