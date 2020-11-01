package Mastermind.Mastermind.models;

public class Session {
	private Board board;
	private State state;

	public Session() {
		this.board = new Board();
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
		this.state.reset();
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
