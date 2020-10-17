package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.models.Board;
import Mastermind.utils.YesNoDialog;

public class ResumeView extends SubView{

	public ResumeView(Board board) {
		super(board);
	}
	
	public boolean resume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume) {
			this.board.reStartBoard();
		}
		return resume;
	}
	
}
