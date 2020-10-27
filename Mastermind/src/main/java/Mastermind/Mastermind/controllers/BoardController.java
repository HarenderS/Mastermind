package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;

public class BoardController extends Controller implements AcceptController{

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public BoardController(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}
	
	public void addAndProcess(ProposedCombination proposedCombination) {
		this.actionController.addAndProcess(proposedCombination);
	}

	public boolean isFinished() {
		return this.actionController.isFinished();
	}

	public boolean isWinner() {
		return this.actionController.isWinner();
	}

	public boolean isLoser() {
		return this.actionController.isLoser();
	}

	public SecretCombination getSecretCombination() {
		return this.actionController.getSecretCombination();
	}

	public int getActualIntent() {
		return this.actionController.getActualIntent();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.actionController.getProposedCombination(i);
	}
	
	public Result getResult(int i) {
		return this.actionController.getResult(i);
	}

	public void undo() {
		this.undoController.undo();
	}

	public boolean undoable() {
		return this.undoController.undoable();
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean redoable() {
		return this.redoController.redoable();
	}
	
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
