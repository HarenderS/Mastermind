package Mastermind.Mastermind.distributed.dispatchers;

import Mastermind.Mastermind.controllers.AcceptController;
import Mastermind.Mastermind.distributed.utils.TCPIP;

public abstract class Dispatcher {

	protected AcceptController acceptController;

	protected TCPIP tcpip;

	public Dispatcher(AcceptController acceptController) {
		this.acceptController = acceptController;
	}

	public abstract void dispatch();

	public void associate(TCPIP tcpip) {
		this.tcpip = tcpip;
	}
}
