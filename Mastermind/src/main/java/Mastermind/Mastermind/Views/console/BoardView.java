package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.MainController;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

public class BoardView extends SubView {

	public BoardView(MainController mainController) {
		super(mainController);
	}

	public void play() {
		ProposedCombination proposedCombination;
		do {
			proposedCombination = new ProposedCombination();
			ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
			Console.instance().writeln();
			Message.ATTEMPED.writeln(this.mainController.getActualIntent() + 1);
			proposedCombinationView.readCombination();
			this.mainController.addAndProcess(proposedCombination);
			for (int i = 0; i < this.mainController.getActualIntent(); i++) {
				new ProposedCombinationView(this.mainController.getProposedCombination(i)).write();
				new ResultView(this.mainController.getResult(i)).writeln();
			}
		} while (!this.mainController.isFinished());

		if (this.mainController.isWinner()) {
			Message.WINNER.writeln(this.mainController.getSecretCombination().toString(),
					proposedCombination.toString());
			return;
		}

		if (this.mainController.isLoser()) {
			Message.WINNER.writeln(this.mainController.getSecretCombination().toString(),
					proposedCombination.toString());
			return;
		}

	}

}
