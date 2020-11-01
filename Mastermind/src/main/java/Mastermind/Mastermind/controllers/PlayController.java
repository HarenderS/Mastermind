package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.Views.BoardView;
import Mastermind.Mastermind.Views.ColorView;
import Mastermind.Mastermind.Views.ErrorView;
import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.Views.ProposedCombinationView;
import Mastermind.Mastermind.Views.ResultView;
import Mastermind.Mastermind.models.Color;
import Mastermind.Mastermind.models.Error;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.Session;
import Mastermind.utils.Console;

public class PlayController extends Controller {

	private BoardController boardController;
	private ProposedCombination proposedCombination;

	public PlayController(Session session) {
		super(session);
		this.boardController = new BoardController(this.session);
	}

	@Override
	public void control() {
		BoardView boardView = new BoardView();
		this.proposedCombination = new ProposedCombination();

		boardView.wiriteln();
		boardView.writeAttemped(this.boardController.getActualIntent() + 1);

		this.readCombination();
		this.boardController.addAndProcess(this.proposedCombination);
		if (this.boardController.isFinished()) {
			this.session.nextState();
		} else {
			for (int i = 0; i < this.boardController.getActualIntent(); i++) {
				new ProposedCombinationView().write(this.boardController.getProposedCombination(i).getColors());
				Result result = this.boardController.getResult(i);
				new ResultView().writeln(result.getBlack(), result.getWhite());
			}
		}

		if (boardController.isWinner()) {
			Message.WINNER.writeln(this.boardController.getSecretCombination().toString(),
					this.proposedCombination.toString());
			return;
		}

		if (boardController.isLoser()) {
			Message.LOOSER.writeln(this.boardController.getSecretCombination().toString(),
					this.proposedCombination.toString());
			return;
		}

	}

	public void readCombination() {
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			error = this.checkError(Console.instance().readString());
			new ErrorView(error).writeln();
			if (!error.isNull()) {
				this.proposedCombination.getColors().clear();
			}
		} while (!error.isNull());
	}

	private Error checkError(String characters) {
		if (characters.length() != 4) {
			return Error.WRONG_LENGTH;
		}
		for (int i = 0; i < characters.length(); i++) {
			Color color = ColorView.getInstance(characters.charAt(i));
			if (color.isNull()) {
				return Error.WRONG_CHARACTERS;
			}
			if (this.proposedCombination.getColors().contains(color)) {
				return Error.DUPLICATED;
			}
			this.proposedCombination.getColors().add(color);
		}
		return Error.NULL_ERROR;
	}
}
