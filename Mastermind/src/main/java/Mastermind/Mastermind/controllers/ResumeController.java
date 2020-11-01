package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.distributed.utils.FrameType;
import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Session;

public class ResumeController extends AcceptController {

	public ResumeController(Session session, TCPIP tcpip) {
		super(session,tcpip);
	}

	public void resume(boolean isResume) {
		if (this.tcpip == null) {
			if (isResume) {
				this.session.reset();
			} else {
				this.session.nextState();
			}
		} else {
			this.tcpip.send(FrameType.NEW_GAME.name());
			this.tcpip.send(isResume);
		}
	}

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
