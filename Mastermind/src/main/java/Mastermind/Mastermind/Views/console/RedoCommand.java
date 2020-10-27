package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.BoardController;

public class RedoCommand extends Command {

	protected RedoCommand(BoardController boardController) {
		super(Message.REDO_COMMAND.getMessage(), boardController);
	}

	@Override
	protected void execute() {
		this.boardController.redo();
	}

	@Override
	protected boolean isActive() {
		return this.boardController.redoable();
	}

}
