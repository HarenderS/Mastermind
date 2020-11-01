package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.Views.SecretCombinationView;
import Mastermind.Mastermind.Views.StartView;
import Mastermind.Mastermind.models.Session;

public class StartController extends Controller {

	public StartController(Session session) {
		super(session);
	}

	@Override
	public void control() {
		new StartView().start();
		new SecretCombinationView().writeCoded();
		this.session.nextState();
	}


}
