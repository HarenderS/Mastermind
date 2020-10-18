package Mastermind.Mastermind.Views.graphics;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Mastermind.Mastermind.Views.ColorView;
import Mastermind.Mastermind.Views.ErrorView;
import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.models.Color;
import Mastermind.Mastermind.models.Error;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

@SuppressWarnings("serial")
public class ProposedCombinationView extends JFrame implements ActionListener, KeyListener  {

	private ProposedCombination proposedCombination;
	private final JLabel label;
	private final JTextField textField;
	private final JButton button;
	private static final String SUBMIT = "Submit";

	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
		this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.label = new JLabel("Mastermind");
		this.button = new JButton(ProposedCombinationView.SUBMIT);
		this.textField = new JTextField(10);
		this.add(label, new Constraints(0, 0, 1, 1));
		this.add(textField, new Constraints(0, 1, 1, 1));
		this.add(button, new Constraints(0, 2, 1, 1));
		this.setVisible(true);
		
	}
	
	public void readCombination() {
		
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			error = this.checkError(Console.instance().readString());
			JOptionPane.showMessageDialog(null, ErrorView.ERRORMESSAGE[error.ordinal() - 1], "ERROR",
					JOptionPane.WARNING_MESSAGE);
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

	public void write() {
		for (Color color : this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	public void keyPressed(KeyEvent arg0) {
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

	public void actionPerformed(ActionEvent e) {
		String usersInsertedText = this.textField.getText();
		
	}
}
