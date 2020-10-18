package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.MastermindView;
import Mastermind.Mastermind.controllers.MainController;

public abstract class Mastermind {

	private MainController mainController;
	private MastermindView mastermindView;

	protected Mastermind() {
		this.mainController = new MainController();
		this.mastermindView = this.createView(this.mainController);
	}

	protected abstract MastermindView createView(MainController mainController);

	protected void play() {
		this.mastermindView.interact();
	}

}