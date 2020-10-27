package Mastermind.Mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.StateValue;

public class MainController {

	private Session session;
	private Map<StateValue, AcceptController> controllers;
	
	public MainController() {
		this.session = new Session();
		this.controllers = new HashMap<StateValue, AcceptController>();
	    this.controllers.put(StateValue.STARTED, new StartController(this.session));
	    this.controllers.put(StateValue.PLAYED, new BoardController(this.session));
	    this.controllers.put(StateValue.FINISHED, new ResumeController(this.session));
	    this.controllers.put(StateValue.EXIT, null);
	}
	
	public AcceptController getController() {
	    return this.controllers.get(this.session.getValueState());
	  }

}

