package Mastermind.Mastermind;

public class CodeBreaker extends Player{

	private SecretCombination secretCoombination;
	
	public CodeBreaker(Board board) {
		super(board);
		this.secretCoombination = board.getSecretCombination();
	}
}
