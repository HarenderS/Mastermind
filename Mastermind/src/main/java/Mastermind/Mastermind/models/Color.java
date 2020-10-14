package Mastermind.Mastermind.models;

public enum Color {

	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE,
	PURPLE,
	NULL_COLOR;
	
	private char color;
	
	private Color() {
	}
	
	private Color(char color) {
		this.color = color;
	}
	
	public static Color get(int index){
		return Color.values()[index];
	}

	public static int length() {
		return Color.values().length-1;
	}
	
	public boolean isNull(){
		return this == Color.NULL_COLOR;
	}

	
}
