package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.State;

public abstract class Controller {

	protected Board board;
	protected State state;
	
	public Controller(Board board, State state) {
		this.board = board;
		this.state = state;
	}
	
	public void nextState() {
		this.state.next();
	}
}
