package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;
import Mastermind.Mastermind.models.Result;

public class ResultDispatcher extends Dispatcher{

	public ResultDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		int i = this.tcpip.receiveInt();
		Result result = ((BoardController)this.acceptController).getResult(i);
		this.tcpip.send(result.getBlack());
		this.tcpip.send(result.getWhite());
	}

	
}
