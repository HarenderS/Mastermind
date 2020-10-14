package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

public class BoardView {

	private Board board;
	private SecretCombinationView secretCombinationView;
	
	public BoardView(Board board) {
		this.board = board;
		this.secretCombinationView = new SecretCombinationView();
	}
	
	public void play() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.readCombination();
		this.board.addAndProcess(proposedCombination);	
		for (int i = 0; i < this.board.getActualIntent(); i++) {
			new ProposedCombinationView(this.board.getProposedCombination(i)).write();
			new ResultView(this.board.getResult(i)).writeln();
		}
		Console.instance().writeln();
		Message.ATTEMPED.writeln(this.board.getActualIntent()+1);
	
		if (this.board.isWinner()) {
			Message.WINNER.writeln(this.board.getSecretCombination().toString(), proposedCombination.getColors().toString());
			return;
		}
		
		if (this.board.isLoser()) {
			Message.WINNER.writeln(this.board.getSecretCombination().toString(), proposedCombination.getColors().toString());
			return;
		}
		
		
	}

	public void writeln() {
		
	}
	
	

}
