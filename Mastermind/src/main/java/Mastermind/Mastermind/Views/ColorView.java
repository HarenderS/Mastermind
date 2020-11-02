package Mastermind.Mastermind.Views;

import Mastermind.utils.Color;
import Mastermind.utils.Console;

public class ColorView {

	private static char[] COLORMESSAGE = {
		'r', 
		'b', 
		'y', 
		'g', 
		'o', 
		'p',
	};
	
	public Color color;
	
	public ColorView(Color color) {
		this.color = color;
	}

	public void write() {
		new Console().write(ColorView.COLORMESSAGE[color.ordinal()]);
	}
	
	public static Color getInstance(char colorAt) {
		for (int i = 0; i < COLORMESSAGE.length; i++) {
			if (COLORMESSAGE[i] == colorAt) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}
	
	public static String getInitials() {
		String result = "";
		for(int i = 0; i < COLORMESSAGE.length; i++) {
			result += COLORMESSAGE[i];
		}
		return result;
	}
	
}
