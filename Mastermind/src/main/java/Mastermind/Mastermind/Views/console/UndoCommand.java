package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.BoardController;

public class UndoCommand extends Command{

	protected UndoCommand(BoardController boardController) {
		super(Message.UNDO_COMMAND.getMessage(), boardController);
	}

	@Override
	protected void execute() {
		this.boardController.undo();
	}

	@Override
	protected boolean isActive() {
		return this.boardController.undoable();
	}

}
