package Mastermind.Mastermind.distributed.utils;

public enum FrameType {
	START,
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE,
	CLOSE,
	FINISHED,
	WINNER,
	LOSER,
	SECRETCOMBINATION,
	INTENT,
	PROPOSELCOMBINATION,
	RESULT,
	ERRORS_PUT,
	PUT,
	NEW_GAME;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
