
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

public class GraphicsProgramSample extends GraphicsProgram{


	private static int WIDTH = 800;
	private static int HEIGHT = 800;

	private JTextField xField;
	private JTextField yField;
	
	private JButton add;
	private JButton remove;
	
	private ArrayList <GPoint> points;
	private ArrayList <GLine> lines;
	
	public void init() {
		
		xField = new JTextField(10);
		yField = new JTextField(10);
		
		add = new JButton("Add");
		remove = new JButton("Remove");
		
		points = new ArrayList <GPoint>();
		lines = new ArrayList <GLine>();
		
		add(xField, SOUTH);
		add(yField, SOUTH);
		add(add, SOUTH);
		add(remove, SOUTH);
		
		addActionListeners();

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Add")) {
			
			String xstr = xField.getText();
			String ystr = yField.getText();
			
			if(xstr.equals("") || ystr.equals("")) {
				return;
			}
			
			int x = Integer.parseInt(xstr);
			int y = Integer.parseInt(ystr);
			
			if(x < 0 || x > getWidth() || y < 0 || y > getHeight()) {
				return;
			}
			
			addPoint(x, y);
			
		}else {
			String xstr = xField.getText();
			String ystr = yField.getText();
			
			if(xstr.equals("") || ystr.equals("")) {
				return;
			}
			
			int x = Integer.parseInt(xstr);
			int y = Integer.parseInt(ystr);
			
			if(x < 0 || x > getWidth() || y < 0 || y > getHeight()) {
				return;
			}
			for(int i=0;i<points.size();i++) {
				GPoint p = points.get(i);
				if(p.getX() == x && p.getY() == y) {
					connectNeighbours(i);
					deleteLines(i);
				}
				
			}
		}
	}
	
	
	private void deleteLines(int i) {
		
		GLine line2 = lines.get(i);
		if(i > 0) {
			GLine line1 = lines.get(i-1);
			line1.setEndPoint(line2.getEndPoint().getX(), line2.getEndPoint().getY());
			line2.setVisible(false);
		}
		lines.remove(i);
	}

	private void connectNeighbours(int i) {
		if(i == 0 || i == points.size()-1) {
			return;
		}
		GPoint last = points.get(i-1);
		GPoint next = points.get(i+1);
		GLine newLine = new GLine(last.getX(), last.getY(), next.getX(), next.getY());
		add(newLine);
		points.remove(i);
	}

	private void addPoint(int x, int y) {
		GPoint newPoint = new GPoint(x, y);
		if(points.size() != 0) {
			GPoint lastPoint = points.get(points.size()-1);
			GLine newLine = new GLine(lastPoint.getX(), lastPoint.getY(), x, y);
			add(newLine);
			
			lines.add(newLine);
		}
		points.add(newPoint);
		
	}


}
