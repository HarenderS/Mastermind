package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.graphics.MastermindView;

public class MastermindGraphics extends Mastermind{

	@Override
	protected MastermindView createView() {
		return new MastermindView();
	}

	public static void main(String[] args) {
		new MastermindGraphics().play();
	}


}
