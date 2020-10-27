package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.utils.Console;

public class BoardView {

	public BoardView() {
	}

	public void play(BoardController boardController) {
		new PlayMenu(boardController).execute();

		Console.instance().writeln();
		for (int i = 0; i < boardController.getActualIntent(); i++) {
			Message.ATTEMPED.writeln(i + 1);
			new ProposedCombinationView(boardController.getProposedCombination(i)).write();
			new ResultView(boardController.getResult(i)).writeln();
		}
		
		Console.instance().writeln();
		if (boardController.isWinner()) {
			Message.WINNER.writeln(boardController.getSecretCombination().toString(),
					boardController.getProposedCombination(boardController.getActualIntent()-1).toString());
			return;
		}

		if (boardController.isLoser()) {
			Message.LOOSER.writeln(boardController.getSecretCombination().toString(),
					boardController.getProposedCombination(boardController.getActualIntent()-1).toString());
			return;
		}

	}

}
