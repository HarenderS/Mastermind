package Mastermind.Mastermind.controllers;

public interface ControllerVisitor {

	void visit(StartController startController);
	void visit(BoardController boardController);
	void visit(ResumeController resumeController);
}
