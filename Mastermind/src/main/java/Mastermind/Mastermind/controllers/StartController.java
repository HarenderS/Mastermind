package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;

public class StartController extends Controller implements AcceptController {

	public StartController(Session session) {
		super(session);
	}

	public void nextState() {
		this.session.nextState();
	}
	
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
