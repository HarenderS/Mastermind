package Mastermind.Mastermind.models;

public class Session {

	private Board board;
	private GameRegistry registry;
	private State state;

	public Session() {
		this.board = new Board();
		this.registry = new GameRegistry(this.board);
		this.state = new State();
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public void nextState() {
		this.state.next();
	}

	public void reset() {
		this.board.reStartBoard();
		this.registry = new GameRegistry(board);
		this.state.reset();
	}

	public void addAndProcess(ProposedCombination proposedCombination) {
		this.board.addAndProcess(proposedCombination);
		this.registry.register();
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

	public void redo() {
		this.registry.redo();
	}

	public boolean redoable() {
		return this.registry.isRedoable();
	}

	public void undo() {
		this.registry.undo();
	}

	public boolean undoable() {
		return this.registry.isUndoable();
	}
}
