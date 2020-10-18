package Mastermind.Mastermind.Views.graphics;

import Mastermind.Mastermind.controllers.MainController;

public class MastermindView extends Mastermind.Mastermind.Views.MastermindView{

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;
	
	
	public MastermindView(MainController mainController) {
		this.startView = new StartView();
//		this.boardView = new BoardView(this.boardController);
	}

	@Override
	protected void start() {
		this.startView.start();
	}

	@Override
	protected void play() {
//		this.startView.setVisible(false);
//		do {
////			this.boardView.play();
//		} while (!this.board.isFinished());
	}

	@Override
	protected boolean resume() {
		if (new ResumeView().isResumedGame()) {
//			this.board.reStartBoard();
			return true;
		}
//		this.boardView.setVisible(false);
		System.exit(0);
		return false;
	}

}
