package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class StateDispatcher extends Dispatcher {

	public StateDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(this.acceptController.getValueState().ordinal());
	}

}
