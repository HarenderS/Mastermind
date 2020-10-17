package Mastermind.Mastermind.Views.console;

import Mastermind.utils.Console;
import Mastermind.Mastermind.models.Error;

public class ErrorView extends Mastermind.Mastermind.Views.ErrorView{
	
	ErrorView(Error error) {
		super(error);
	}
	
	public void writeln() {
		if (!error.isNull()){
			Console.instance().writeln(ErrorView.ERRORMESSAGE[this.error.ordinal()]);
		}
	}

}
