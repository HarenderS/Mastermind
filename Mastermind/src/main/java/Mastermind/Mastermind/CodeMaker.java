package Mastermind.Mastermind;

public class CodeMaker extends Player{
	
	private ProposedCombination proposedCombination;
	
	public CodeMaker(Board board) {
		super(board);
		this.proposedCombination = board.getProposedCombination();
	}
}
