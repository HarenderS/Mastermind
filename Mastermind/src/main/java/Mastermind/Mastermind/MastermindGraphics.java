package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.graphics.MastermindView;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.ResumeController;

public class MastermindGraphics extends Mastermind{

	@Override
	protected MastermindView createView(BoardController boardController, ResumeController resumeController) {
		return new MastermindView(boardController, resumeController);
	}

	public static void main(String[] args) {
		new MastermindGraphics().play();
	}

}
