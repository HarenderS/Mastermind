package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.StartController;

public class StartView {

	public StartView() {
	}
	
	public void start(StartController startController) {
		Message.TITLE.writeln();
		new SecretCombinationView().writeCoded();
		startController.nextState();
	}
}
