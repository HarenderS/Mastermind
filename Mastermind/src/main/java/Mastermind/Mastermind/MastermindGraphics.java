package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.graphics.MastermindView;
import Mastermind.Mastermind.models.Board;

public class MastermindGraphics extends Mastermind{

	@Override
	protected MastermindView createView(Board board) {
		return new MastermindView(board);
	}

	public static void main(String[] args) {
		new MastermindGraphics().play();
	}

}
