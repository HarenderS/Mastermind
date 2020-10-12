package Mastermind.Mastermind;

import Mastermind.utils.Console;

public class Result {

	private int black;
	private int white;
	
	public Result(int black, int white) {
		this.black = black;
		this.white = white;
	}
	
	public boolean isWinner() {
		return this.black == 4;
	}

	public void writeln() {
		Console.instance().writeln(" - "+this.black+" blacks and "+this.white+" whites");
	}
}
