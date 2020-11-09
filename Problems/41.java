
/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GraphicsProgramSample extends GraphicsProgram {
	
	private final int RADIUS = 5;
	private Color color = Color.GREEN;
	
	public void run() {
		
		 addMouseListeners();
	}

	public void mouseMoved(MouseEvent e) {	
		
		drawCircle(e.getX() - RADIUS, e.getY() - RADIUS);

		
	}

	private void drawCircle(int x, int y) {
		GOval circle = new GOval(x, y, RADIUS, RADIUS);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	
	
}
