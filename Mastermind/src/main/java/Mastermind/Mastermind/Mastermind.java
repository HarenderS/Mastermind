package Mastermind.Mastermind;

import Mastermind.Mastermind.Views.console.MastermindView;
import Mastermind.Mastermind.controllers.AcceptController;
import Mastermind.Mastermind.controllers.Logic;

public abstract class Mastermind {

	private Logic logic;
	private MastermindView mastermindView;

	protected Mastermind() {
		this.logic = createLogic();
		this.mastermindView = new MastermindView();
	}

	protected abstract Logic createLogic();

	protected void play() {
		AcceptController controller;
		do {
            controller = this.logic.getController();
            if (controller != null) {
                this.mastermindView.interact(controller);
            }
		} while (controller != null);
    }

}