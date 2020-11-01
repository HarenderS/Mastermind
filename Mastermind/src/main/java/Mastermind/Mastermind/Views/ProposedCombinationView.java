package Mastermind.Mastermind.Views;

import java.util.List;

import Mastermind.Mastermind.models.Color;

public class ProposedCombinationView {

	public void write(List<Color> colors) {
		for (Color color : colors) {
			new ColorView(color).write();
		}
	}
}
