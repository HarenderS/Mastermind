package Mastermind.Mastermind;

public class Turn {

	private Board board;
	private final int NUMBER_OF_PLAYERS = 2;
	private Player[] players;
	
	public Turn(Board board) {
		this.board = board;
		this.players = new Player[this.NUMBER_OF_PLAYERS];
		for (int i = 0; i < this.NUMBER_OF_PLAYERS; i++) {
			if (i < this.NUMBER_OF_PLAYERS) {
				this.players[i] = new CodeBreaker(board);
			} else {
				this.players[i] = new CodeMaker(board);
			}
		}
	}

	public void play() {
		ProposedCombination proposedCombination = this.players[0].getProposels();
		SecretCombination secretCombination = this.board.getSecretCombination();
		Result result = secretCombination.getResult(proposedCombination);
		this.board.setProposedCombination(proposedCombination);
		this.board.setResult(result);
		this.board.setActualIntent(this.board.getActualIntent()+1);
	}
}
