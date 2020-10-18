package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

public class BoardView extends SubView {

	private BoardController boardController;

	public BoardView(BoardController boardController) {
		super(boardController);
		this.boardController = boardController;
	}

	public void play() {
		ProposedCombination proposedCombination;
		do {
			proposedCombination = new ProposedCombination();
			ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
			Console.instance().writeln();
			Message.ATTEMPED.writeln(this.boardController.getActualIntent() + 1);
			proposedCombinationView.readCombination();
			this.boardController.addAndProcess(proposedCombination);
			for (int i = 0; i < this.boardController.getActualIntent(); i++) {
				new ProposedCombinationView(this.boardController.getProposedCombination(i)).write();
				new ResultView(this.boardController.getResult(i)).writeln();
			}
		} while (!this.boardController.isFinished());

		if (this.boardController.isWinner()) {
			Message.WINNER.writeln(this.boardController.getSecretCombination().toString(),
					proposedCombination.toString());
			return;
		}

		if (this.boardController.isLoser()) {
			Message.WINNER.writeln(this.boardController.getSecretCombination().toString(),
					proposedCombination.toString());
			return;
		}

	}

}
