package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;

public class MainController {

	private Board board;
	private BoardController boardController;
	private ResumeController resumeController;	
	
	public MainController() {
		this.board = new Board();
		this.boardController = new BoardController(this.board);
		this.resumeController = new ResumeController(this.board);
	}
	
	public void addAndProcess(ProposedCombination proposedCombination) {
		this.boardController.addAndProcess(proposedCombination);
	}
	
	public boolean isFinished() {
		return this.boardController.isFinished();
	}

	public boolean isWinner() {
		return this.boardController.isWinner();
	}

	public boolean isLoser() {
		return this.boardController.isLoser();
	}

	public SecretCombination getSecretCombination() {
		return this.boardController.getSecretCombination();
	}

	public int getActualIntent() {
		return this.boardController.getActualIntent();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.boardController.getProposedCombination(i);
	}
	
	public Result getResult(int i) {
		return this.boardController.getResult(i);
	}
	
	public void resume() {
		this.resumeController.resume();;
	}

}

