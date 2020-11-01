package Mastermind.Mastermind.controllers.implementation;

import Mastermind.Mastermind.controllers.ActionController;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.RedoController;
import Mastermind.Mastermind.controllers.UndoController;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;

public class BoardControllerImplementation extends BoardController {

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;

	public BoardControllerImplementation(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}

	@Override
	public void addAndProcess(ProposedCombination proposedCombination) {
		this.actionController.addAndProcess(proposedCombination);
	}

	@Override
	public boolean isFinished() {
		return this.actionController.isFinished();
	}

	@Override
	public boolean isWinner() {
		return this.actionController.isWinner();
	}

	@Override
	public boolean isLoser() {
		return this.actionController.isLoser();
	}

	@Override
	public SecretCombination getSecretCombination() {
		return this.actionController.getSecretCombination();
	}

	@Override
	public int getActualIntent() {
		return this.actionController.getActualIntent();
	}

	@Override
	public ProposedCombination getProposedCombination(int i) {
		return this.actionController.getProposedCombination(i);
	}

	@Override
	public Result getResult(int i) {
		return this.actionController.getResult(i);
	}

	@Override
	public void undo() {
		this.undoController.undo();
	}

	@Override
	public boolean undoable() {
		return this.undoController.undoable();
	}

	@Override
	public void redo() {
		this.redoController.redo();
	}

	@Override
	public boolean redoable() {
		return this.redoController.redoable();
	}

}
