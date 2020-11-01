package Mastermind.Mastermind.Views;

import Mastermind.utils.YesNoDialog;

public class ResumeView{

	public boolean read() {
		return new YesNoDialog().read(Message.RESUME.toString());
		
	}
	
}
