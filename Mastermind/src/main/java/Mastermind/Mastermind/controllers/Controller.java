package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Board;

public abstract class Controller {

	protected Board board;
	
	public Controller(Board board) {
		this.board = board;
	}
}
