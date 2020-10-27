package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;

public class ResumeController extends Controller implements AcceptController {

	public ResumeController(Session session) {
		super(session);
	}

	public void resume(boolean isResume) {
		if (isResume) {
			this.session.reset();
		}else {
			session.nextState();
		}
	}

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
