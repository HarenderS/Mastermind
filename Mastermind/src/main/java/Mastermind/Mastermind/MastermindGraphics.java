package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.graphics.MastermindView;
import Mastermind.Mastermind.controllers.MainController;

public class MastermindGraphics extends Mastermind{

	@Override
	protected MastermindView createView(MainController mainController) {
		return new MastermindView(mainController);
	}

	public static void main(String[] args) {
		new MastermindGraphics().play();
	}


}
