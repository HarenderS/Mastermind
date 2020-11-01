package Mastermind.Mastermind.controllers;

import java.util.ArrayList;
import java.util.List;

import Mastermind.Mastermind.distributed.utils.FrameType;
import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Color;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;

public class BoardController extends AcceptController {

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;

	public BoardController(Session session, TCPIP tcpip) {
		super(session, tcpip);
		if (tcpip == null) {
			this.actionController = new ActionController(session);
			this.undoController = new UndoController(session);
			this.redoController = new RedoController(session);
		}
	}

	public void addAndProcess(ProposedCombination proposedCombination) {
		if (this.tcpip == null) {
			this.actionController.addAndProcess(proposedCombination);
		}else {
			String colors = "";
			for (Color color : proposedCombination.getColors()) {
				colors += color.ordinal();
			}
			this.tcpip.send(FrameType.PUT.name());
			this.tcpip.send(colors);
		}
	}

	public boolean isFinished() {
		if (this.tcpip == null) {
			return this.actionController.isFinished();
		}
		this.tcpip.send(FrameType.FINISHED.name());
		return this.tcpip.receiveBoolean();
	}

	public boolean isWinner() {
		if (this.tcpip == null) {
			return this.actionController.isWinner();
		}
		this.tcpip.send(FrameType.WINNER.name());
		return this.tcpip.receiveBoolean();
	}

	public boolean isLoser() {
		if (this.tcpip == null) {
			return this.actionController.isLoser();
		}
		this.tcpip.send(FrameType.LOSER.name());
		return this.tcpip.receiveBoolean();
	}

	public SecretCombination getSecretCombination() {
		if (this.tcpip == null) {
			
			
			return this.actionController.getSecretCombination();
		}
		this.tcpip.send(FrameType.SECRETCOMBINATION.name());
		String colors = this.tcpip.receiveLine();
		SecretCombination secretCombination = new SecretCombination();
		secretCombination.getColors().clear();
		secretCombination.getColors().addAll(getColorList(colors));
		return secretCombination;
	}

	public int getActualIntent() {
		if (this.tcpip == null) {
			return this.actionController.getActualIntent();
		}
		this.tcpip.send(FrameType.INTENT.name());
		return this.tcpip.receiveInt();
	}

	public ProposedCombination getProposedCombination(int i) {
		if (this.tcpip == null) {
			return this.actionController.getProposedCombination(i);
		}
		this.tcpip.send(FrameType.PROPOSELCOMBINATION.name());
		this.tcpip.send(i);
		String colors = this.tcpip.receiveLine();
		ProposedCombination proposedCombination = new ProposedCombination();
		proposedCombination.getColors().addAll(getColorList(colors));
		return proposedCombination;
	}

	public Result getResult(int i) {
		if (this.tcpip == null) {
			return this.actionController.getResult(i);
		}
		this.tcpip.send(FrameType.RESULT.name());
		this.tcpip.send(i);
		int b = this.tcpip.receiveInt();
		int w = this.tcpip.receiveInt();
		return  new Result(b,w);
	}

	public void undo() {
		if (this.tcpip == null) {
			this.undoController.undo();
		} else {
			this.tcpip.send(FrameType.UNDO.name());
		}
	}

	public boolean undoable() {
		if (this.tcpip == null) {
			return this.undoController.undoable();
		}
		this.tcpip.send(FrameType.UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	public void redo() {
		if (this.tcpip == null) {
			this.redoController.redo();
		} else {
			this.tcpip.send(FrameType.REDO.name());
		}
	}

	public boolean redoable() {
		if (this.tcpip == null) {
			return this.redoController.redoable();
		}
		this.tcpip.send(FrameType.REDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
	
	private List<Color> getColorList(String colors){
		colors = colors.substring(1, colors.length()-1);
		colors = colors.replaceAll(" ", "");
		String[] color = colors.split(",");
		List<Color> cAux = new ArrayList<Color>();
		for (String c : color) {
			cAux.add(Color.valueOf(c));
		}

		return cAux;
	}

}
