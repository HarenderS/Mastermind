package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;

public class BoardController{

	private Session session;
	public BoardController(Session session) {
		this.session = session;
	}
	
	public void addAndProcess(ProposedCombination proposedCombination) {
		this.session.addAndProcess(proposedCombination);
	}
	
	public boolean isFinished() {
		return this.session.isFinished();
	}

	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLoser() {
		return this.session.isLoser();
	}

	public SecretCombination getSecretCombination() {
		return this.session.getSecretCombination();
	}

	public int getActualIntent() {
		return this.session.getActualIntent();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.session.getProposedCombination(i);
	}
	
	public Result getResult(int i) {
		return this.session.getResult(i);
	}

}
