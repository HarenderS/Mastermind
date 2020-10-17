package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

public class BoardView extends SubView{

	public BoardView(Board board) {
		super(board);
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
			Message.WINNER.writeln(this.board.getSecretCombination().toString(), proposedCombination.toString());
			return;
		}
		
		if (this.board.isLoser()) {
			Message.WINNER.writeln(this.board.getSecretCombination().toString(), proposedCombination.toString());
			return;
		}
		
		
	}

}
