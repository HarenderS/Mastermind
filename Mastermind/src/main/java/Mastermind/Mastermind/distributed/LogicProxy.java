package Mastermind.Mastermind.distributed;

import Mastermind.Mastermind.controllers.Logic;
import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.StateValue;

public class LogicProxy extends Logic{

	private TCPIP tcpip;
	
	public LogicProxy() {
		this.tcpip = TCPIP.createClientSocket();
		this.session = new SessionProxy(this.tcpip);
		this.controllers.put(StateValue.STARTED, new StartControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValue.PLAYED, new BoardControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValue.FINISHED, new ResumeControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValue.EXIT, null);
	}

	public void close() {
		this.tcpip.close();
	}
	
}
