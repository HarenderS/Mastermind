package Mastermind.Mastermind.Views;

public class StartView {

	public StartView() {
	}
	
	public void start() {
		Message.TITLE.writeln();
		new SecretCombinationView().writeCoded();
	}
}
