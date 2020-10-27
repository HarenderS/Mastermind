package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.controllers.BoardController;

public abstract class Command extends Mastermind.utils.Command{

	protected BoardController boardController;

	  protected Command(String title, BoardController boardController) {
	    super(title);
	    this.boardController = boardController;
	  }
}
