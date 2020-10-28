package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.models.ProposedCombination;

public class PlayCommand extends Command {

	protected PlayCommand(BoardController boardController) {
		super(Message.ACTION_COMMAND.getMessage(), boardController);
	}

	@Override
	protected void execute() {
		ProposedCombination proposedCombination;
		proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		Message.ATTEMPED.writeln(boardController.getActualIntent() + 1);
		proposedCombinationView.readCombination();
		this.boardController.addAndProcess(proposedCombination);

	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
