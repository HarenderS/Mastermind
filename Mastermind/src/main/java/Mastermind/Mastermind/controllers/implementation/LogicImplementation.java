package Mastermind.Mastermind.controllers.implementation;

import Mastermind.Mastermind.controllers.Logic;
import Mastermind.Mastermind.models.SessionImplementation;
import Mastermind.Mastermind.models.StateValue;

public class LogicImplementation extends Logic {

	protected StartControllerImplementation startControllerImplementation;
	protected BoardControllerImplementation boardControllerImplementation;
	protected ResumeControllerImplementation resumeControllerImplementation;

	public LogicImplementation() {
		this.session = new SessionImplementation();
		this.startControllerImplementation = new StartControllerImplementation(this.session);
		this.boardControllerImplementation = new BoardControllerImplementation(this.session);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
		this.controllers.put(StateValue.STARTED, this.startControllerImplementation);
		this.controllers.put(StateValue.PLAYED, this.boardControllerImplementation);
		this.controllers.put(StateValue.FINISHED, this.resumeControllerImplementation);
		this.controllers.put(StateValue.EXIT, null);
	}
}
