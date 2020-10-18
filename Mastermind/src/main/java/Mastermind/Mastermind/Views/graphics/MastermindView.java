package Mastermind.Mastermind.Views.graphics;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.Controller;
import Mastermind.Mastermind.controllers.ResumeController;

public class MastermindView extends Mastermind.Mastermind.Views.MastermindView{

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;
	
	
	public MastermindView() {
		this.startView = new StartView();
//		this.boardView = new BoardView(this.boardController);
	}


	@Override
	public void interact(Controller controller) {
		if (controller instanceof BoardController) {
			this.startView.start();
			this.boardView.play((BoardController) controller);
		} else {
			this.resumeView.isResumedGame((ResumeController) controller);
		}
	}

	
}
