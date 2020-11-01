package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;

public abstract class BoardController extends AcceptController {

	public BoardController(Session session) {
		super(session);
	}

	public abstract void addAndProcess(ProposedCombination proposedCombination);

	public abstract boolean isFinished();

	public abstract boolean isWinner();

	public abstract boolean isLoser();

	public abstract SecretCombination getSecretCombination();

	public abstract int getActualIntent();

	public abstract ProposedCombination getProposedCombination(int i);

	public abstract Result getResult(int i);

	public abstract void undo();

	public abstract boolean undoable();

	public abstract void redo();

	public abstract boolean redoable();
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
	
}
