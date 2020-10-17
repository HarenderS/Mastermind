package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.Views.Message;

public class StartView {

	public StartView() {
	}
	
	public void start() {
		Message.TITLE.writeln();
		new SecretCombinationView().writeCoded();
	}
}
