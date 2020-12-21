
/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraphicsProgramSample extends GraphicsProgram {

	private int SIZE = 8;

	private int curWidth;
	private int curHeight;

	private ArrayList<GLine> horLines;
	private ArrayList<GLine> vertLines;

	
	public void init() {
		
		setSize(800, 800);
		
		curWidth = 800;
		curHeight = 800;
		
		horLines = new ArrayList<GLine>();
		vertLines = new ArrayList<GLine>();
		
		drawGrid();
	}
	
	public void run() {
		while (true) {
			int w = getWidth();
			int h = getHeight();
			if(w != curWidth || h != curHeight) {
				update(w, h);
				curWidth = w;
				curHeight = h;
			}
		}

	}

	private void update(int w, int h) {
		
		int stepW = w / SIZE;
		int stepH = h / SIZE;
		
		updateVerticals(w, h, stepW);
		
		updateHorizontals(w, h, stepH);
	}

	private void updateVerticals(int w, int h, int stepW) {
		for(int i = 0; i < vertLines.size(); i++) {
			int x = i * stepW;
			vertLines.get(i).setStartPoint(x, 0);
			vertLines.get(i).setEndPoint(x, h);
		}
	}
	
	private void updateHorizontals(int w, int h, int stepH) {
		for(int i = 0; i < horLines.size(); i++) {
			int y = i * stepH;
			horLines.get(i).setStartPoint(0, y);
			horLines.get(i).setEndPoint(w, y);
		}
	}

	private void drawGrid() {
		int w = getWidth();
		int h = getHeight();

		int stepW = w / SIZE;
		int stepH = h / SIZE;

		drawVerticalLines(h, w, stepW);
		drawHorizontalLines(h, w, stepH);
	}

	private void drawVerticalLines(int h, int w, int stepW) {
		for (int x = 0; x < w; x += stepW) {
			GLine vertLine = new GLine(x, 0, x, h);
			vertLines.add(vertLine);
			add(vertLine);
		}
	}

	private void drawHorizontalLines(int h, int w, int stepH) {
		for (int y = 0; y < h; y += stepH) {
			GLine horLine = new GLine(0, y, w, y);
			horLines.add(horLine);
			add(horLine);
		}
	}

}
