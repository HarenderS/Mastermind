package Mastermind.Mastermind;

import java.util.HashMap;
import java.util.Map;

import Mastermind.Mastermind.controllers.Controller;
import Mastermind.Mastermind.controllers.PlayController;
import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.controllers.StartController;
import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.StateValue;

public class Mastermind {

	private Session session;
	private Map<StateValue, Controller> controllers;
	
	public Mastermind() {
		this.session = new Session();
		this.controllers = new HashMap<StateValue, Controller>();
	    this.controllers.put(StateValue.STARTED, new StartController(this.session));
	    this.controllers.put(StateValue.PLAYED, new PlayController(this.session));
	    this.controllers.put(StateValue.FINISHED, new ResumeController(this.session));
	    this.controllers.put(StateValue.EXIT, null);
	}

	protected void play() {
		Controller controller;
		do {
            controller = this.controllers.get(this.session.getValueState());
            if (controller != null) {
            	controller.control();
            }
		} while (controller != null);
    }
	
	public static void main(String[] args) {
		new Mastermind().play();
	}

}