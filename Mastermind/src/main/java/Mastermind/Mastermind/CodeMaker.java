package Mastermind.Mastermind;

public class CodeMaker extends Player{
	
	private SecretCombination secretCoombination;
	
	public CodeMaker(Board board) {
		super(board);
		this.secretCoombination = board.getSecretCombination();
	}

	public SecretCombination getSecretCoombination() {
		return secretCoombination;
	}
	
}
