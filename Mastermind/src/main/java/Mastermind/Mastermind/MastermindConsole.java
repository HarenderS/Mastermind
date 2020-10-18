package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.console.MastermindView;

public class MastermindConsole extends Mastermind{

	@Override
	protected MastermindView createView() {
		return new MastermindView();
	}
	
	public static void main(String[] args) {
		new MastermindConsole().play();
	}

}
