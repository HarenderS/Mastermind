package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.StateValue;

public abstract class Controller {

	protected Session session;
	
	public Controller(Session session) {
		this.session = session;
	}

	public StateValue getValueState() {
		return this.session.getValueState();
	}
}

