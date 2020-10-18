package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.MainController;
import Mastermind.utils.YesNoDialog;

public class ResumeView extends SubView{

	
	public ResumeView(MainController mainController) {
		super(mainController);
	}
	
	public boolean resume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume) {
			this.mainController.resume();;
		}
		return resume;
	}
	
}
