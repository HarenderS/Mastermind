package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Color;
import Mastermind.utils.Console;
import Mastermind.Mastermind.models.Error;

public class ErrorView {

	private final static String[] ErrorMessage = {
		"Repeated colors",
		"Wrong colors, they must be: " + Color.getInitials(),
		"Wrong proposed combination length"
	};
	
	private Error error;
	
	ErrorView(Error error) {
		this.error = error;
	}
	
	public void writeln() {
		if (!this.error.isNull()){
			Console.instance().writeln(ErrorView.ErrorMessage[this.error.ordinal()]);
		}
	}
	

	
}
