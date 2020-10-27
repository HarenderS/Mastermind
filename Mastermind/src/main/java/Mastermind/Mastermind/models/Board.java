package Mastermind.Mastermind.models;

public class Board {

	private final static int MAXINTENTS = 10;
	private Result[] results;
	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombination;
	private int actualIntent;

	public Board() {
		this.reStartBoard();
	}
	
	public Board(Board board) {
		this();
		assert board != null;
		
		this.secretCombination = board.secretCombination;
		this.proposedCombination = board.proposedCombination;
		this.results = board.results;
		this.actualIntent = board.actualIntent;
	}
	
	public void reStartBoard() {
		this.secretCombination = new SecretCombination();
		this.proposedCombination = new ProposedCombination[MAXINTENTS];
		this.results = new Result[MAXINTENTS];
		this.actualIntent = 0;
	}

	public void addAndProcess(ProposedCombination proposedCombination) {
		this.proposedCombination[actualIntent] = proposedCombination;
		this.results[actualIntent] = this.secretCombination.getResult(proposedCombination);
		this.actualIntent++;
	}
	
	public boolean isFinished() {
		return this.isWinner() || this.isLoser();
	}

	public boolean isWinner() {
		return this.results[this.actualIntent - 1].isWinner();
	}

	public boolean isLoser() {
		return this.actualIntent == Board.MAXINTENTS;
	}

	public SecretCombination getSecretCombination() {
		return this.secretCombination;
	}

	public int getActualIntent() {
		return this.actualIntent;
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.proposedCombination[i];
	}
	
	public Result getResult(int i) {
		return this.results[i];
	}

	public Board copy() {
		return new Board(this);
	}

	public void set(Board board) {
		assert board != null;
		
		this.secretCombination = board.secretCombination;
		this.proposedCombination = board.proposedCombination;
		this.results = board.results;
		this.actualIntent = board.actualIntent;		
	}
	
}
