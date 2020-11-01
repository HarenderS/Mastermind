package Mastermind.Mastermind.distributed;

import Mastermind.Mastermind.controllers.Logic;
import Mastermind.Mastermind.distributed.dispatchers.DispatcherPrototype;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.FinishDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.IntentDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.LoserDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.ProposelCombinationDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.PutDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.RedoDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.RedoableDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.ResultDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.SecretCombinationDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.StateDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.UndoDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.UndoableDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.boardDispatchers.WinnerDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.resumeDispatchers.ResumeDispatcher;
import Mastermind.Mastermind.distributed.dispatchers.startDispatchers.StartDispatcher;
import Mastermind.Mastermind.distributed.utils.FrameType;

public class LogicServer extends Logic{

	public LogicServer(Boolean isStandalone) {
		super(isStandalone);
	}
	
	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.FINISHED, new FinishDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.LOSER, new LoserDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.SECRETCOMBINATION, new SecretCombinationDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.INTENT, new IntentDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.PROPOSELCOMBINATION, new ProposelCombinationDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.RESULT, new ResultDispatcher(this.boardController));
		dispatcherPrototype.add(FrameType.PUT, new PutDispatcher(this.boardController));
//		dispatcherPrototype.add(FrameType.CONTINUE_STATE, new ContinueStateDispatcher(this.resumeController));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeController));
	}
}
