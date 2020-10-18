package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.utils.YesNoDialog;

public class ResumeView{

	
	public ResumeView() {
	}
	
	public boolean resume(ResumeController resumeController) {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume) {
			resumeController.resume();
		}else {
			resumeController.nextState();
		}
		return resume;
	}
	
}
