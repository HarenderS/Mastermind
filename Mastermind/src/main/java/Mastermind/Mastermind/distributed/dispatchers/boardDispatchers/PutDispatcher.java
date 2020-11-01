package Mastermind.Mastermind.distributed.dispatchers.boardDispatchers;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.dispatchers.Dispatcher;
import Mastermind.Mastermind.models.Color;
import Mastermind.Mastermind.models.ProposedCombination;

public class PutDispatcher extends Dispatcher{

	public PutDispatcher(BoardController boardController) {
		super(boardController);
	}

	@Override
	public void dispatch() {
		String characters = this.tcpip.receiveLine();
		ProposedCombination proposedCombination = new ProposedCombination();
		for (int i = 0; i < characters.length(); i++) {
			proposedCombination.getColors().add(Color.get(Character.getNumericValue(characters.charAt(i))));
		}
		((BoardController)this.acceptController).addAndProcess(proposedCombination);
	}

	
}
