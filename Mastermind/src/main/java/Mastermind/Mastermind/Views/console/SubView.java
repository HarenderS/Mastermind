package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.controllers.MainController;

public class SubView {

	protected MainController mainController;

	SubView(MainController mainController) {
		assert mainController != null;
		
		this.mainController = mainController;
  }
}
