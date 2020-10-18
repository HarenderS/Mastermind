package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.MastermindView;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.Mastermind.models.Board;

public abstract class Mastermind {

	private Board board;
    private BoardController boardController;
    private ResumeController resumeController;
	private MastermindView mastermindView;

	protected Mastermind() {
		this.board = new Board();
		this.boardController = new BoardController(this.board);
		this.resumeController = new ResumeController(this.board);
		this.mastermindView = this.createView(this.boardController, this.resumeController);
	}

	protected abstract MastermindView createView(BoardController boardController, ResumeController resumeController);

	protected void play() {
		this.mastermindView.interact();
	}

}