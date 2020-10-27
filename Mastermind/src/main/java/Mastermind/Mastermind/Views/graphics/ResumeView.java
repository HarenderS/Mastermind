package Mastermind.Mastermind.Views.graphics;

import javax.swing.JOptionPane;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.controllers.ResumeController;

public class ResumeView {

	private boolean newGame;

	public ResumeView() {
		this.newGame = (JOptionPane.showConfirmDialog(null, Message.RESUME.getMessage(),
				Message.TITLE.getMessage(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
	}

	public boolean isResumedGame(ResumeController resumeController) {
		resumeController.resume(this.newGame);
		return this.newGame;
	}
}
