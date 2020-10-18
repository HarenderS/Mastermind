package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Board;

public class ResumeController extends Controller {

	public ResumeController(Board board) {
		super(board);
	}

	public void resume() {
		this.board.reStartBoard();
	}

}
