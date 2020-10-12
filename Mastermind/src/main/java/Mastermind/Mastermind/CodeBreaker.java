package Mastermind.Mastermind;

public class CodeBreaker extends Player{

private ProposedCombination proposedCombination;
	
	public CodeBreaker(Board board) {
		super(board);
		this.proposedCombination = board.getProposedCombination();
	}

	public ProposedCombination getProposedCombination() {
		return proposedCombination;
	}
}
