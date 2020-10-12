package Mastermind.utils;

public enum Message {

	TITLE("--- Mastermind ---"),
	RESUME("Do you want to continue"), 
	WINNER("You've won!!!"), 
	LOOSER("You've lost!!!"), 
	SECRET("****"), 
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

	public void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
	}
}
