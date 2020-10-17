package Mastermind.Mastermind.Views.graphics;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Mastermind.Mastermind.Views.Message;


@SuppressWarnings("serial")
public class StartView extends JFrame implements ActionListener{

	private final JLabel label;
	private final JButton button;
	private static final String START = "Start";

    public StartView() {
    	super(Message.TITLE.getMessage());
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.label = new JLabel("Mastermind");
		this.button = new JButton(StartView.START);
        this.setVisible(true);
    }
    
    public void start() {
    	this.setVisible(true);
		this.add(label, new Constraints(0, 0, 1, 1));
		this.add(button, new Constraints(0, 1, 1, 1));
		this.button.addActionListener(this);
		while(!this.button.hasFocus());
    }

	public void actionPerformed(ActionEvent event) {
		
	}

}
