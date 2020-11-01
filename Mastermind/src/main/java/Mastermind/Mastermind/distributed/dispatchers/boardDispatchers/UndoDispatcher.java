package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

	public UndoDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		((BoardController)this.acceptController).undo();
	}

}
