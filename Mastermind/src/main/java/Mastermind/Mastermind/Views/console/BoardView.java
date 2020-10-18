package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

public class BoardView {

	public BoardView() {
	}

	public void play(BoardController boardController) {
		ProposedCombination proposedCombination;
		proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		Console.instance().writeln();
		Message.ATTEMPED.writeln(boardController.getActualIntent() + 1);
		proposedCombinationView.readCombination();
		boardController.addAndProcess(proposedCombination);
		if (boardController.isFinished()) {
			boardController.nextState();
		} else {
			for (int i = 0; i < boardController.getActualIntent(); i++) {
				new ProposedCombinationView(boardController.getProposedCombination(i)).write();
				new ResultView(boardController.getResult(i)).writeln();
			}
		}

		if (boardController.isWinner()) {
			Message.WINNER.writeln(boardController.getSecretCombination().toString(), proposedCombination.toString());
			return;
		}

		if (boardController.isLoser()) {
			Message.WINNER.writeln(boardController.getSecretCombination().toString(), proposedCombination.toString());
			return;
		}

	}

}
