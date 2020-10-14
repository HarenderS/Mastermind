package Mastermind.Mastermind.models;

import Mastermind.utils.Console;

public enum Color {

	RED('r'), 
	BLUE('b'), 
	YELLOW('y'), 
	GREEN('g'), 
	ORANGE('o'), 
	PURPLE('p'),
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

	public void write() {
		new Console().write(this.color);
	}
	
	public static String getInitials() {
		String result = "";
		for(int i=0; i<Color.length(); i++) {
			result += Color.get(i).color;
		}
		return result;
	}
	
	public static int length() {
		return Color.values().length-1;
	}
	
	public boolean isNull(){
		return this == Color.NULL_COLOR;
	}

	public static Color getInstance(char colorAt) {
		for (int i = 0; i < Color.length(); i++) {
			if (Color.get(i).color == colorAt) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}
}
