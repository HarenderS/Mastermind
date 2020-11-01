package Mastermind.Mastermind.controllers;

import Mastermind.Mastermind.Views.ResumeView;
import Mastermind.Mastermind.models.Session;

public class ResumeController extends Controller {

	public ResumeController(Session session) {
		super(session);
	}

	public void resume(boolean resume) {
		if (resume) {
			this.session.reset();
		}else {
			this.session.nextState();
		}
	}

	@Override
	public void control() {
		this.resume(new ResumeView().read());
	}

}
