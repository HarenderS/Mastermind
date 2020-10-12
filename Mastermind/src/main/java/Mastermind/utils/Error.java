package Mastermind.utils;

public enum Error {

	DUPLICATED("Repeated colors"),
	WRONG_CHARACTERS("Wrong colors, they must be: " + Color.getInitials()),
	WRONG_LENGTH("Wrong proposed combination length"),
	NULL_ERROR;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}

	public void writeln() {
		if (this != Error.NULL_ERROR){
			Console.instance().writeln(this.message);
		}
	}
	
	public boolean isNull() {
		return this == Error.NULL_ERROR;
	}
}
