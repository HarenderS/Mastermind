package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.models.Result;

public class ResultView {

	private Result result;
	
	public ResultView(Result result) {
		this.result = result;
	}
	
	public void writeln() {
		Message.RESULT.writeln(this.result.getBlack(),this.result.getWhite());
	}
	
	
}
