package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Session;

public abstract class AcceptController extends Controller{

	protected TCPIP tcpip;
    
    public AcceptController(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}
	public abstract void accept(ControllerVisitor controllerVisitor);

}
