package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.console.MastermindView;
import Mastermind.Mastermind.models.Board;

public class MastermindConsole extends Mastermind{

	@Override
	protected MastermindView createView(Board board) {
		return new MastermindView(board);
	}
	
	public static void main(String[] args) {
		new MastermindConsole().play();
	}


}
