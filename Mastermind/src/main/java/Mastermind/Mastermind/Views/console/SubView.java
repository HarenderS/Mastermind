package Mastermind.Mastermind.Views.console;

import Mastermind.Mastermind.models.Board;

public class SubView {

	protected Board board;

	SubView(Board board) {
		assert board != null;
		
		this.board = board;
  }
}
