package Mastermind.Mastermind.controllers.implementation;

import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController{

	private SessionImplementation sessionImplementation;
	
	public ResumeControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	@Override
	public void resume(boolean isResume) {
		if (isResume) {
			this.sessionImplementation.reset();
		} else {
			this.sessionImplementation.nextState();
		}
	}

}
