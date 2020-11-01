package Mastermind.Mastermind.distributed;

import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.distributed.utils.FrameType;
import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Session;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void resume(boolean isResume) {
		this.tcpip.send(FrameType.NEW_GAME.name());
		this.tcpip.send(isResume);	
	}

}
