package Mastermind.Mastermind.Views.graphics;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.Views.console.ProposedCombinationView;
import Mastermind.Mastermind.Views.console.ResultView;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.models.Board;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

@SuppressWarnings("serial")
public class BoardView extends JFrame {
	
	private BoardController boardController;
	private final JLabel label;
	private final JButton button;
	private static final String SUBMIT = "Submit";

	
	public BoardView(BoardController boardController) {
		this.boardController = boardController;
		this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.label = new JLabel("Mastermind");
		this.button = new JButton(BoardView.SUBMIT);
	}
	
	public void play() {
		ProposedCombination proposedCombination = new ProposedCombination();
//		this.setVisible(true);
		Message.ATTEMPED.writeln(this.boardController.getActualIntent()+1);
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.readCombination();
		this.boardController.addAndProcess(proposedCombination);	
		for (int i = 0; i < this.boardController.getActualIntent(); i++) {
			new ProposedCombinationView(this.boardController.getProposedCombination(i)).write();
			new ResultView(this.boardController.getResult(i)).writeln();
		}
		Console.instance().writeln();
	
		if (this.boardController.isWinner()) {
			this.getContentPane().add(new JLabel(Message.WINNER.write(this.boardController.getSecretCombination().toString(), proposedCombination.toString())),
					new Constraints(0, 1, 4, 1));
			return;
		}
		
		if (this.boardController.isLoser()) {
			this.getContentPane().add(new JLabel(Message.WINNER.write(this.boardController.getSecretCombination().toString(), proposedCombination.toString())),
					new Constraints(0, 1, 4, 1));
			return;
		}
		
		
	}

}
