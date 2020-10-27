package Mastermind.Mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

	private List<Board> mementos;
	private Board board;
	private int firstPrevious;

	public GameRegistry(Board board) {
		this.board = board;
		this.mementos = new ArrayList<Board>();
		this.firstPrevious = 0;
		this.mementos.add(this.firstPrevious, this.board.copy());
	}

	public void register() {
		for (int i = 0; i < this.firstPrevious; i++) {
			this.mementos.remove(0);
			this.firstPrevious--;
		}
		this.mementos.add(this.firstPrevious, this.board.copy());
	}

	public void undo() {
		this.firstPrevious++;
		this.board.set(this.mementos.get(this.firstPrevious));
	}

	public void redo() {
		this.firstPrevious--;
		this.board.set(this.mementos.get(this.firstPrevious));
	}

	public boolean isUndoable() {
		return this.firstPrevious < this.mementos.size() - 1;
	}

	public boolean isRedoable() {
		return this.firstPrevious >= 1;
	}
}
