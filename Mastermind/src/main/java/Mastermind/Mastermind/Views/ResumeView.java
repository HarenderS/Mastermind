package Mastermind.Mastermind.Views;

import Mastermind.utils.YesNoDialog;

public class ResumeView {

	public ResumeView() {
	}
	
	public boolean resume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		return resume;
	}
	
}
