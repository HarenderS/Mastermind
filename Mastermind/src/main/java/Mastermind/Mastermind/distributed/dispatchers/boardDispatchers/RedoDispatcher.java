package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

	public RedoDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		((BoardController)this.acceptController).redo();
	}

}
