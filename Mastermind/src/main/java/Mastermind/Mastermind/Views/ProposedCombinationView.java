package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Color;
import Mastermind.Mastermind.models.Error;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

public class ProposedCombinationView {

	private ProposedCombination proposedCombination;

	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}
	
	public void readCombination() {
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			error = this.checkError(Console.instance().readString());
			new ErrorView(error).writeln();
			if (!error.isNull()) {
				this.proposedCombination.getColors().clear();
			}
		} while (!error.isNull());
	}

	private Error checkError(String characters) {
		if (characters.length() != 4) {
			return Error.WRONG_LENGTH;
		}
		for (int i = 0; i < characters.length(); i++) {
			Color color = Color.getInstance(characters.charAt(i));
			if (color.isNull()) {
				return Error.WRONG_CHARACTERS;
			}
			if (this.proposedCombination.getColors().contains(color)) {
				return Error.DUPLICATED;
			}
			this.proposedCombination.getColors().add(color);
		}
		return Error.NULL_ERROR;
	}

	public void write() {
		for (Color color : this.proposedCombination.getColors()) {
			color.write();
		}
	}
}
