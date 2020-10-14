package Mastermind.Mastermind.models;

public class Result {

	private int black;
	private int white;
	
	public Result(int black, int white) {
		this.black = black;
		this.white = white;
	}
	
	public boolean isWinner() {
		return this.black == 4;
	}

	public int getBlack() {
		return black;
	}

	public int getWhite() {
		return white;
	}

}
