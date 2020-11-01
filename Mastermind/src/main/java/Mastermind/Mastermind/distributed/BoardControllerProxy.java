package Mastermind.Mastermind.distributed;

import java.util.ArrayList;
import java.util.List;

import Mastermind.Mastermind.controllers.BoardController;
import Mastermind.Mastermind.distributed.utils.FrameType;
import Mastermind.Mastermind.distributed.utils.TCPIP;
import Mastermind.Mastermind.models.Color;
import Mastermind.Mastermind.models.ProposedCombination;
import Mastermind.Mastermind.models.Result;
import Mastermind.Mastermind.models.SecretCombination;
import Mastermind.Mastermind.models.Session;

public class BoardControllerProxy extends BoardController {

	private TCPIP tcpip;

	public BoardControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void addAndProcess(ProposedCombination proposedCombination) {
		String colors = "";
		for (Color color : proposedCombination.getColors()) {
			colors += color.ordinal();
		}
		this.tcpip.send(FrameType.PUT.name());
		this.tcpip.send(colors);
	}

	@Override
	public boolean isFinished() {
		this.tcpip.send(FrameType.FINISHED.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean isWinner() {
		this.tcpip.send(FrameType.WINNER.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean isLoser() {
		this.tcpip.send(FrameType.LOSER.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public SecretCombination getSecretCombination() {
		this.tcpip.send(FrameType.SECRETCOMBINATION.name());
		String colors = this.tcpip.receiveLine();
		SecretCombination secretCombination = new SecretCombination();
		secretCombination.getColors().clear();
		secretCombination.getColors().addAll(getColorList(colors));
		return secretCombination;
	}

	@Override
	public int getActualIntent() {
		this.tcpip.send(FrameType.INTENT.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public ProposedCombination getProposedCombination(int i) {
		this.tcpip.send(FrameType.PROPOSELCOMBINATION.name());
		this.tcpip.send(i);
		String colors = this.tcpip.receiveLine();
		ProposedCombination proposedCombination = new ProposedCombination();
		proposedCombination.getColors().addAll(getColorList(colors));
		return proposedCombination;
	}

	@Override
	public Result getResult(int i) {
		this.tcpip.send(FrameType.RESULT.name());
		this.tcpip.send(i);
		int b = this.tcpip.receiveInt();
		int w = this.tcpip.receiveInt();
		return  new Result(b,w);
	}

	@Override
	public void undo() {
		this.tcpip.send(FrameType.UNDO.name());
	}

	@Override
	public boolean undoable() {
		this.tcpip.send(FrameType.UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public void redo() {
		this.tcpip.send(FrameType.REDO.name());
	}

	@Override
	public boolean redoable() {
		this.tcpip.send(FrameType.REDOABLE.name());
		return this.tcpip.receiveBoolean();
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
