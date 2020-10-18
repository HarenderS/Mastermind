package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.controllers.Controller;

public class SubView {

	protected Controller controller;

	SubView(Controller controller) {
		assert controller != null;
		
		this.controller = controller;
  }
}
