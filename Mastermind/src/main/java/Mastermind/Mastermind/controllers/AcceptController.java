package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;

public abstract class AcceptController extends Controller{

    public AcceptController(Session session) {
		super(session);
	}
	
    public abstract void accept(ControllerVisitor controllerVisitor);

}
