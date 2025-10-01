
package studio4;

import java.awt.Font;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(205,127,50);
		StdDraw.filledSquare(0.5,0.5,0.5);
		StdDraw.setPenColor(255,172,28);
		StdDraw.filledCircle(0.5,0.5,0.2);
		StdDraw.setPenColor(69,75,27);
		StdDraw.filledRectangle(0.5, 0.75,0.02,0.05);
		StdDraw.setPenColor(128,0,32);
		Font font = new Font("Times New Roman", Font.BOLD,60);
		StdDraw.setFont(font);
		StdDraw.text(0.5,0.2, "Happy Fall!");


	}
}