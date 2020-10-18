package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.ResumeController;
import Mastermind.utils.YesNoDialog;

public class ResumeView extends SubView{

	private ResumeController resumeController;
	
	public ResumeView(ResumeController resumeController) {
		super(resumeController);
		this.resumeController = resumeController;
	}
	
	public boolean resume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume) {
			this.resumeController.resume();;
		}
		return resume;
	}
	
}
