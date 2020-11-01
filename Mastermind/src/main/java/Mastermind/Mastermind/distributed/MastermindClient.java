package Mastermind.Mastermind.distributed;

import Mastermind.Mastermind.Mastermind;

public class MastermindClient extends Mastermind{

	@Override
	protected boolean isStandalone() {
		return false;
	}

	public static void main(String[] args) {
		new MastermindClient().play();
	}
}
