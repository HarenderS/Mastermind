package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.MastermindView;
import Mastermind.Mastermind.controllers.Controller;
import Mastermind.Mastermind.controllers.MainController;

public abstract class Mastermind {

	private MainController mainController;
	private MastermindView mastermindView;

	protected Mastermind() {
		this.mainController = new MainController();
		this.mastermindView = this.createView();
	}

	protected abstract MastermindView createView();

	protected void play() {
		Controller controller;
		do {
            controller = this.mainController.getController();
            if (controller != null) {
                this.mastermindView.interact(controller);
            }
		} while (controller != null);
    }

}