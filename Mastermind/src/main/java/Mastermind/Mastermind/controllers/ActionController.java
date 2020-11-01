package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.SessionImplementation;

public class ActionController extends Controller {

	private SessionImplementation sessionImplementation;
	
	public ActionController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void addAndProcess(ProposedCombination proposedCombination) {
		this.sessionImplementation.addAndProcess(proposedCombination);
		if (isFinished()) 
			this.sessionImplementation.nextState();
	}

	public boolean isFinished() {
		return this.sessionImplementation.isFinished();
	}

	public boolean isWinner() {
		return this.sessionImplementation.isWinner();
	}

	public boolean isLoser() {
		return this.sessionImplementation.isLoser();
	}

	public SecretCombination getSecretCombination() {
		return this.sessionImplementation.getSecretCombination();
	}

	public int getActualIntent() {
		return this.sessionImplementation.getActualIntent();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.sessionImplementation.getProposedCombination(i);
	}
	
	public Result getResult(int i) {
		return this.sessionImplementation.getResult(i);
	}
}
