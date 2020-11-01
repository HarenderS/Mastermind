package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;

public abstract class Controller {

	protected Session session;
	
	public Controller(Session session) {
		this.session = session;
	}
	
	public void nextState() {
		this.session.nextState();
	}
	
	public abstract void control();
}
