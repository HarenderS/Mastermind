package Mastermind.Mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static int MAXWIDTH = 4;
	public List<Color> combination;
	
	public Combination() {
		this.combination = new ArrayList<Color>();
	}
	
	public int getMaxWidth() {
		return MAXWIDTH;
	}
}
