package Mastermind.Mastermind;

import java.util.ArrayList;

import Mastermind.utils.Color;
import Mastermind.utils.Console;
import Mastermind.utils.Message;
import Mastermind.utils.Error;

public class ProposedCombination extends Combination{

	public void readCombination() {
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			error = this.checkError(Console.instance().readString());
			error.writeln();
			if (!error.isNull()) {
				this.combination = new ArrayList<Color>();
			}
		} while (!error.isNull());
	}
	
	private Error checkError(String characters){
		if (characters.length() != 4) {
			return Error.WRONG_LENGTH;
		}
		for (int i = 0; i < characters.length(); i++) {
				Color color = Color.getInstance(characters.charAt(i));
				if (color.isNull()) {
					return Error.WRONG_CHARACTERS;
				}
				for(int j=0; j<i; j++){
					if (this.combination.get(j) == color) {
						return Error.DUPLICATED;
					}
				}
				this.combination.add(color);
		}
		return Error.NULL_ERROR;
	}
	
	public boolean equals(Color color, int position) {
		return this.combination.get(position) == color;
	}
	
	public boolean contains(Color color) {
		return this.combination.contains(color);
	}
	
	public void write() {
		for (Color color : this.combination) {
			color.write();
		}
	}
}
