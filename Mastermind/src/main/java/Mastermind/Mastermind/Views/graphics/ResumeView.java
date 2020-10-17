package Mastermind.Mastermind.Views.graphics;

import javax.swing.JOptionPane;

import Mastermind.Mastermind.Views.Message;

public class ResumeView {

	private boolean newGame;

	public ResumeView() {
		this.newGame = (JOptionPane.showConfirmDialog(null, Message.RESUME.getMessage(),
				Message.TITLE.getMessage(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
	}

	public boolean isResumedGame() {
		return this.newGame;
	}
}
