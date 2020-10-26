
/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;

public class GraphicsProgramSample extends GraphicsProgram {

	private static final int CIRCLE_NUMB = 10;
	private RandomGenerator rand = RandomGenerator.getInstance();

	public void run() {
		int width = getWidth();
		int height = getHeight();
		double maxRadius = (double) getMin(width, height) / 2;
		for (int i = 0; i < CIRCLE_NUMB; i++) {
			double radius = rand.nextDouble(0.0, maxRadius);
			double startX = rand.nextDouble(0, width - 2 * radius);
			double startY = rand.nextDouble(0, height - 2 * radius);
			Color color = rand.nextColor();
			drawCircle(startX, startY, radius, color);
		}

	}
	
	private void drawCircle(double startX, double startY, double radius, Color color) {
		GOval circle = new GOval(startX, startY, 2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle);
	}

	private int getMin(int width, int height) {
		if (width < height) {
			return width;
		}
		return height;
	}

}
