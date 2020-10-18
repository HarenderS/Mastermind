package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.State;

public class ResumeController extends Controller {

	public ResumeController(Board board, State state) {
		super(board, state);
	}

	public void resume() {
		this.board.reStartBoard();
		this.state.reset();
	}

}
