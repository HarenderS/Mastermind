package Mastermind.Mastermind;

import Mastermind.Mastermind.controllers.Logic;
import Mastermind.Mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind{

	@Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}

	public static void main(String[] args) {
		new MastermindStandalone().play();
	}

}
