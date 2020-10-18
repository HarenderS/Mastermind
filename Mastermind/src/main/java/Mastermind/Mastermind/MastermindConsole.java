package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.console.MastermindView;
import Mastermind.Mastermind.controllers.MainController;

public class MastermindConsole extends Mastermind{

	@Override
	protected MastermindView createView(MainController mainController) {
		return new MastermindView(mainController);
	}
	
	public static void main(String[] args) {
		new MastermindConsole().play();
	}

}
