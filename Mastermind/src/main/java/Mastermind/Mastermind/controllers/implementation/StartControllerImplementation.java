package Mastermind.Mastermind.controllers.implementation;

import Mastermind.Mastermind.controllers.StartController;
import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController{

	private SessionImplementation sessionImplementation;
	
	public StartControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	@Override
	public void start() {
		this.sessionImplementation.nextState();		
	}

}
