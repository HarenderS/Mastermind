package Mastermind.Mastermind;

import Mastermind.utils.Console;
import Mastermind.utils.Message;

public class Board {

	private final static int MAXINTENTS = 10;
	private Result[] results;
	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombination;
	private int actualIntent;

	public Board() {
		this.secretCombination = new SecretCombination();
		this.proposedCombination = new ProposedCombination[MAXINTENTS];
		this.results = new Result[MAXINTENTS];
		actualIntent = 0;
	}

	public boolean isFinished() {
		return this.isWinner() || this.isLoser();
	}

	public boolean isWinner() {
		return this.results[this.actualIntent - 1].isWinner();
	}

	private boolean isLoser() {
		return this.actualIntent == Board.MAXINTENTS;
	}

	public void writeln() {
		for (int i = 0; i < this.actualIntent; i++) {
			this.proposedCombination[i].write();
			this.results[i].writeln();
		}
		Console.instance().writeln();
		Console.instance().writeln("Actual intent is: "+this.actualIntent);
	}

	public void writeFinalCombination() {
		Console.instance().writeln("Secret id: "+this.secretCombination.toString() 
				+" -> your's: "+this.proposedCombination[actualIntent-1].combination.toString());
		
		Console.instance().writeln();
	}
	
	public SecretCombination getSecretCombination() {
		return secretCombination;
	}

	public ProposedCombination getProposedCombination() {
		return proposedCombination[actualIntent];
	}

	public void setProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombination[actualIntent] = proposedCombination;
	}

	public Result getResults() {
		return results[actualIntent];
	}

	public void setResult(Result results) {
		this.results[actualIntent] = results;
	}

	public int getActualIntent() {
		return actualIntent;
	}

	public void setActualIntent(int actualIntent) {
		this.actualIntent = actualIntent;
	}
	
}
