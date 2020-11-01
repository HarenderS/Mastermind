package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.distributed.utils.FrameType;
import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Session;

public class StartController extends AcceptController {

	public StartController(Session session, TCPIP tcpip) {
		super(session, tcpip);
	}

	public void start() {
		if (this.tcpip == null) {
			this.session.nextState();	
		} else {
			this.tcpip.send(FrameType.START.name());
		}
	}
	
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
