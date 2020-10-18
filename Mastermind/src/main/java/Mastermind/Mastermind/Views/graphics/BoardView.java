package Mastermind.Mastermind.Views.graphics;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Mastermind.Mastermind.Views.Message;
import Mastermind.Mastermind.Views.console.ProposedCombinationView;
import Mastermind.Mastermind.Views.console.ResultView;
import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.controllers.MainController;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.utils.Console;

@SuppressWarnings("serial")
public class BoardView extends JFrame {
	
	private MainController mainController;
	private final JLabel label;
	private final JButton button;
	private static final String SUBMIT = "Submit";

	
	public BoardView() {
		this.mainController = mainController;
		this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.label = new JLabel("Mastermind");
		this.button = new JButton(BoardView.SUBMIT);
	}
	
	public void play(BoardController boardController) {
		ProposedCombination proposedCombination = new ProposedCombination();
		this.setVisible(true);
		Message.ATTEMPED.writeln(boardController.getActualIntent()+1);
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.readCombination();
		boardController.addAndProcess(proposedCombination);	
		for (int i = 0; i < boardController.getActualIntent(); i++) {
			new ProposedCombinationView(boardController.getProposedCombination(i)).write();
			new ResultView(boardController.getResult(i)).writeln();
		}
		Console.instance().writeln();
	
		if (boardController.isWinner()) {
			this.getContentPane().add(new JLabel(Message.WINNER.write(boardController.getSecretCombination().toString(), proposedCombination.toString())),
					new Constraints(0, 1, 4, 1));
			return;
		}
		
		if (boardController.isLoser()) {
			this.getContentPane().add(new JLabel(Message.WINNER.write(boardController.getSecretCombination().toString(), proposedCombination.toString())),
					new Constraints(0, 1, 4, 1));
			return;
		}
		
		
	}

}
