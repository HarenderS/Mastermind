package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;

public abstract class ResumeController extends AcceptController {

	public ResumeController(Session session) {
		super(session);
	}

	public abstract void resume(boolean isResume);

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
