
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
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraphicsProgramSample extends GraphicsProgram implements ComponentListener{

	private int SIZE = 8;

	private static int WIDTH = 800;
	private static int HEIGHT = 800;
	
	private int curWidth;
	private int curHeight;

	private ArrayList<GLine> horLines;
	private ArrayList<GLine> vertLines;

	
	public void init() {
		
		setSize(WIDTH, HEIGHT);
		
		curWidth = WIDTH;
		curHeight = HEIGHT;
		
		horLines = new ArrayList<GLine>();
		vertLines = new ArrayList<GLine>();
		
		for(int i=0;i<SIZE+1;i++) {
			GLine horLine = new GLine(0, 0, 0, 0);
			GLine vertLine = new GLine(0, 0, 0, 0);
			add(horLine);
			add(vertLine);
			horLines.add(horLine);
			vertLines.add(vertLine);
		}
		update(curWidth, curHeight);
		addComponentListener(this);
	}
	
	public void run() {
		
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

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		update(getWidth(), getHeight());
		curWidth = getWidth();
		curHeight = getHeight();	
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
