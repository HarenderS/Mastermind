package Mastermind.Mastermind.Views;

public abstract class MastermindView {

	public void interact() {
		do {
			this.start();
			this.play();
		} while (this.resume());
	}

	protected abstract void start();
	protected abstract void play();
	protected abstract boolean resume();
}
