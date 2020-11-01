package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

	public RedoableDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((BoardController)this.acceptController).redoable());
	}

}
