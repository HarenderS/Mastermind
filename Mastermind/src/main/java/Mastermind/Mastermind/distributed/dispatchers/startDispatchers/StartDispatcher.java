package Mastermind.Mastermind.distributed.dispatchers.startDispatchers;

import Mastermind.Mastermind.controllers.StartController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;

public class StartDispatcher extends Dispatcher {

	public StartDispatcher(StartController startController) {
		super(startController);
	}

	@Override
	public void dispatch() {
		((StartController) this.acceptController).start();
	}

}
