package Mastermind.Mastermind;

public class Player {

	protected Board board;
	
	public Player(Board board) {
		this.board = board;
	}
	
	public ProposedCombination getProposels() {
		ProposedCombination proposedCombination = new ProposedCombination();
		proposedCombination.readCombination();
		return proposedCombination;
	}
}
