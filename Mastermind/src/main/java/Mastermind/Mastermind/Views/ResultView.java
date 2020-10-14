package Mastermind.Mastermind.Views;

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
