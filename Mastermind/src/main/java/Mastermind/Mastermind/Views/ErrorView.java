package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Error;
import Mastermind.utils.Console;

public class ErrorView {

	private final static String[] ErrorMessage = {
		"Repeated colors",
		"Wrong colors, they must be: " + ColorView.getInitials(),
		"Wrong proposed combination length"
	};
	
	private Error error;
	
	public ErrorView(Error error) {
		this.error = error;
	}
	
	public void writeln() {
		if (!this.error.isNull()){
			Console.instance().writeln(ErrorView.ErrorMessage[this.error.ordinal()]);
		}
	}
	

	
}
