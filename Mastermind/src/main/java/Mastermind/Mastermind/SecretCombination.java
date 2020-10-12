package Mastermind.Mastermind;

import java.util.Random;

import Mastermind.utils.Color;
import Mastermind.utils.Console;

public class SecretCombination extends Combination{

	public SecretCombination() {
		Random random = new Random();
		do {
			int x = random.nextInt(Color.length());
			if (!this.combination.contains(Color.get(x))) {
				this.combination.add(Color.get(x));
			}
		} while (this.combination.size() < 4);
	}
	
	public Result getResult(ProposedCombination proposedCombination) {
		int blacks = 0;
		for (int i = 0; i < this.combination.size(); i++) {
			if (proposedCombination.equals(this.combination.get(i), i)) {
				blacks++;
			}
		}
		int whites = 0;
		for (Color color : this.combination) {
			if (proposedCombination.contains(color)) {
				whites++;
			}
		}
		return new Result(blacks, whites - blacks);
	}
	
	public String toString() {
		return this.combination.toString();
		
	}
	
	public void writeln() {
		for (Color color : this.combination) {
			color.write();
		}
		Console.instance().writeln();
	}
}
