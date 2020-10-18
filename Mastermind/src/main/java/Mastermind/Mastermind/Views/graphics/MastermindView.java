package Mastermind.Mastermind.Views.graphics;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.Controller;
import Mastermind.Mastermind.controllers.ControllerVisitor;
import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.controllers.StartController;

public class MastermindView extends Mastermind.Mastermind.Views.MastermindView implements ControllerVisitor{

	private StartView startView;
	private BoardView boardView;
	private ResumeView resumeView;
	
	
	public MastermindView() {
		this.startView = new StartView();
//		this.boardView = new BoardView(this.boardController);
	}


	@Override
	public void interact(Controller controller) {
		controller.accept(this);
	}


	public void visit(StartController startController) {
		this.startView.start();
	}


	public void visit(BoardController boardController) {
		this.boardView.play(boardController);
	}


	public void visit(ResumeController resumeController) {
		this.resumeView.isResumedGame(resumeController);
	}

	
}
