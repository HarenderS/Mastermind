package Mastermind.Mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.State;
import Mastermind.Mastermind.models.StateValue;

public class MainController {

	private Board board;
	private State state;
	private Map<StateValue, Controller> controllers;
	
	public MainController() {
		this.board = new Board();
		this.state = new State();
		this.controllers = new HashMap<StateValue, Controller>();
	    this.controllers.put(StateValue.INITIAL, new StartController(this.board, this.state));
	    this.controllers.put(StateValue.STARTGAME, new BoardController(this.board, this.state));
	    this.controllers.put(StateValue.RESUME, new ResumeController(this.board, this.state));
	    this.controllers.put(StateValue.EXIT, null);
	}
	
	public Controller getController() {
	    return this.controllers.get(this.state.getValueState());
	  }

}

