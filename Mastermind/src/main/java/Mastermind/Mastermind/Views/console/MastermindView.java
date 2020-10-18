package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.Controller;
import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.controllers.StartController;

public class MastermindView extends Mastermind.Mastermind.Views.MastermindView {

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;

	public MastermindView() {
		this.startView = new StartView();
		this.boardView = new BoardView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(Controller controller) {
		if (controller instanceof StartController) {
			this.startView.start((StartController) controller);
		} else if (controller instanceof BoardController) {
			this.boardView.play((BoardController) controller);
			} else {
				this.resumeView.resume((ResumeController) controller);
			}
	}
}
