package Mastermind.Mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.StateValue;

public class Logic {

	private Session session;
	private Map<StateValue, AcceptController> controllers;
	
	protected StartController startController;

	protected BoardController boardController;

	protected ResumeController resumeController;
	
	private TCPIP tcpip;

	public Logic(boolean isStandalone) {
		if (isStandalone) {
			this.tcpip = null;
		} else {
			this.tcpip = TCPIP.createClientSocket();
		}
		this.session = new Session(this.tcpip);
		this.controllers = new HashMap<StateValue, AcceptController>();
		this.startController = new StartController(this.session, this.tcpip);
		this.boardController= new BoardController(this.session, this.tcpip);
		this.resumeController = new ResumeController(this.session, this.tcpip);

		this.controllers.put(StateValue.STARTED, this.startController);
		this.controllers.put(StateValue.PLAYED, this.boardController);
		this.controllers.put(StateValue.FINISHED, this.resumeController);
		this.controllers.put(StateValue.EXIT, null);
	}
	
	public AcceptController getController() {
	    return this.controllers.get(this.session.getValueState());
	  }

	public void close() {
		this.tcpip.close();
	}
	
}

