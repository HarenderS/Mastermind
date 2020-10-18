package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.ResumeController;

public class MastermindView extends Mastermind.Mastermind.Views.MastermindView {

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;

	public MastermindView(BoardController boardController, ResumeController resumeController) {
		this.startView = new StartView();
		this.boardView = new BoardView(boardController);
		this.resumeView = new ResumeView(resumeController);
	}

	@Override
	protected void play() {
		this.boardView.play();
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
