package Mastermind.Mastermind.distributed.dispatchers.resumeDispatchers;

import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class ResumeDispatcher extends Dispatcher {

	public ResumeDispatcher(ResumeController resumeController) {
		super(resumeController);
	}

	@Override
	public void dispatch() {
		boolean newGame = this.tcpip.receiveBoolean();
		((ResumeController)this.acceptController).resume(newGame);
	}

}
