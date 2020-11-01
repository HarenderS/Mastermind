package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class ProposelCombinationDispatcher extends Dispatcher{

	public ProposelCombinationDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		int i = this.tcpip.receiveInt();
		this.tcpip.send(((BoardController)this.acceptController).getProposedCombination(i).combination.toString());
	}

	
}
