package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;

public class BoardController extends Controller{

	public BoardController(Board board) {
		super(board);
	}
	
	public void addAndProcess(ProposedCombination proposedCombination) {
		this.board.addAndProcess(proposedCombination);
	}
	
	public boolean isFinished() {
		return this.board.isFinished();
	}

	public boolean isWinner() {
		return this.board.isWinner();
	}

	public boolean isLoser() {
		return this.board.isLoser();
	}

	public SecretCombination getSecretCombination() {
		return this.board.getSecretCombination();
	}

	public int getActualIntent() {
		return this.board.getActualIntent();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.board.getProposedCombination(i);
	}
	
	public Result getResult(int i) {
		return this.board.getResult(i);
	}

}
