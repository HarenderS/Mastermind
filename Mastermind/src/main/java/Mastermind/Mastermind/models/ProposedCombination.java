package Mastermind.Mastermind.models;

import java.util.List;

import Mastermind.utils.Color;

public class ProposedCombination extends Combination{

	public boolean equals(Color color, int position) {
		return this.combination.get(position) == color;
	}
	
	public boolean contains(Color color) {
		return this.combination.contains(color);
	}
	
	public String toString() {
		return this.combination.toString();
		
	}
	
	public List<Color> getColors(){
		return this.combination;
	}
}
