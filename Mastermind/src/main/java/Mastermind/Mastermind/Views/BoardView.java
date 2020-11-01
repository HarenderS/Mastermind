package Mastermind.Mastermind.Views;

import Mastermind.utils.Console;

public class BoardView {

	public void wiriteln() {
		Console.instance().writeln();
	}

	public void writeAttemped(int intent) {
		Message.ATTEMPED.writeln(intent);
		
	}
}
