package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.utils.Menu;

public class PlayMenu extends Menu{

	public PlayMenu(BoardController boardController) {
	    this.addCommand(new PlayCommand(boardController));
	    this.addCommand(new UndoCommand(boardController));
	    this.addCommand(new RedoCommand(boardController));
	  }
}
