package Mastermind.Mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.StateValue;

public class Logic {

	protected Session session;
	protected Map<StateValue, AcceptController> controllers;

	public Logic() {
		this.controllers = new HashMap<StateValue, AcceptController>();
	}

	public AcceptController getController() {
		return this.controllers.get(this.session.getValueState());
	}

}
