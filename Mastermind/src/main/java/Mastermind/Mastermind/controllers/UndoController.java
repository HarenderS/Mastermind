package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.models.Session;
import Mastermind.Mastermind.models.SessionImplementation;

public class UndoController extends Controller {

	private SessionImplementation sessionImplementation;
	
	public UndoController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void undo() {
		this.sessionImplementation.undo();
	}

	public boolean undoable() {
		return this.sessionImplementation.undoable();
	}
}
