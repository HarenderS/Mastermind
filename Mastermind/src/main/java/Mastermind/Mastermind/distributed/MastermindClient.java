package Mastermind.Mastermind.distributed;

import Mastermind.Mastermind.Mastermind;
import Mastermind.Mastermind.controllers.Logic;

public class MastermindClient extends Mastermind{

	private LogicProxy logicProxy;
	
	@Override
	protected void play() {
		super.play();
		this.logicProxy.close();
	}
	
	@Override
	protected Logic createLogic() {
		this.logicProxy = new LogicProxy();
		return this.logicProxy;
	}

	public static void main(String[] args) {
		new MastermindClient().play();
	}

}
