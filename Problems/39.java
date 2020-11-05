
/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class GraphicsProgramSample extends GraphicsProgram {

	private final int WIDTH = 500;
	private final int HEIGHT = 750;
	private final int BALL_RADIUS = 25;
	private final int DX = 5;
	private final int DY = 0;
	private final int PAUSE_MS = 20;

	public void run() {
//		setSize(WIDTH, HEIGHT);
		double startX = 0.0;
		double startY = (double) getHeight() / 2 - (double) BALL_RADIUS;
		GOval ball = drawBall(startX, startY);
		ballMoving(ball);
		
	}

	private void ballMoving(GOval ball) {
		while (validBall(ball)) {
			ball.move(DX, DY);
			pause(PAUSE_MS);
		}
	}
	
	private boolean validBall(GOval ball) {
		return ball.getX() < getWidth() - 2 * BALL_RADIUS;
	}

	private GOval drawBall(double startX, double startY) {
		GOval ball = new GOval(startX, startY, 2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setColor(Color.YELLOW);
		ball.setFilled(true);
		add(ball);
		return ball;
	}

}
