package Mastermind.Mastermind.distributed;

import Mastermind.Mastermind.controllers.implementation.LogicImplementation;
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

public class LogicImplementationServer extends LogicImplementation{

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.FINISHED, new FinishDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.LOSER, new LoserDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.SECRETCOMBINATION, new SecretCombinationDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.INTENT, new IntentDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.PROPOSELCOMBINATION, new ProposelCombinationDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.RESULT, new ResultDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.PUT, new PutDispatcher(this.boardControllerImplementation));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
	}
}
