package Mastermind.Mastermind.Views;

import Mastermind.utils.Console;

public enum Message {

	TITLE("--- Mastermind ---"),
	RESUME("Do you want to continue"), 
	WINNER("You've won!!! \n Secret id: #secrets -> your's: #proposel \n"), 
	LOOSER("You've lost!!! \n Secret id: #secrets -> your's: #proposel \n"), 
	SECRET("****"), 
	ATTEMPED("Actual intent is: #attempts"),
	RESULT(" --> #blacks blacks and #whites whites"), 
	PROPOSED_COMBINATION("Please enter your proposel (ej: for (red,blue,yellow,green) put 'rbyg': ");
	
	private String message;

	private Message() {

	}

	private Message(String message) {
		this.message = message;
	}

	public void write() {
		Console.instance().write(this.message);
	}
	
	public void writeln(int attempts) {
		assert this == Message.ATTEMPED;
		Console.instance().writeln(this.message.replaceFirst("#attempts", ""+attempts));
	}

	public void writeln(String secrets, String proposel) {
		assert this == WINNER || this == LOOSER;
		Console.instance().writeln(this.message.replaceFirst("#secrets", secrets).replaceFirst("#proposel", proposel));
	}
	
	public void writeln(int blacks, int whites) {
		assert this == Message.RESULT;
		Console.instance().writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}

	public String write(String secrets, String proposel) {
		assert this == WINNER || this == LOOSER;
		return this.message.replaceFirst("#secrets", secrets).replaceFirst("#proposel", proposel);
	}
	
	public void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
