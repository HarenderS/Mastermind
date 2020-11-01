package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;

public abstract class StartController extends AcceptController {

	public StartController(Session session) {
		super(session);
	}

	public abstract void start();
	
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
