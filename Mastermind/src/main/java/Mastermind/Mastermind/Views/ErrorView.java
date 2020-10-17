package Mastermind.Mastermind.Views;

import Mastermind.Mastermind.models.Error;

public class ErrorView {

	public final static String[] ERRORMESSAGE = {
		"Repeated colors",
		"Wrong colors, they must be: " + ColorView.getInitials(),
		"Wrong proposed combination length"
	};
	
	protected Error error;
	
	public ErrorView(Error error) {
		this.error = error;
	}
	
	
}
