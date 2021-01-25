
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
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraphicsProgramSample extends GraphicsProgram{

	private static final double DIRECTION_TIMER = 3;
	private static final double SPEED = 9.0;
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;
	private static final double SQUARE_LENGTH = 50;
	private static final double YELLOW_MOVE = 3;
	private static final int PAUSE = 20;
	
	private GRect blue;
	private GRect yellow;
	
	private JButton left;
	private JButton right;
	
	private double vx = 3;
	private double vy = 0;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void init() {
		
		setSize(WIDTH, HEIGHT);
		
		blue = new GRect(SQUARE_LENGTH, SQUARE_LENGTH);
		yellow = new GRect((getWidth()-SQUARE_LENGTH)/2, (getHeight()-SQUARE_LENGTH)/2, SQUARE_LENGTH, SQUARE_LENGTH);
		blue.setFilled(true);
		blue.setColor(Color.BLUE);
		yellow.setFilled(true);
		yellow.setColor(Color.YELLOW);
		
		
		left = new JButton("Left");
		right = new JButton("Right");
		
		
		add(left, SOUTH);
		add(right, SOUTH);
		add(blue);
		add(yellow);
		
		addActionListeners();

	}
	
	public void actionPerformed(ActionEvent e) {
		double yellow_vx = YELLOW_MOVE;
		if(e.getActionCommand().equals("Left")) {
			yellow_vx = -yellow_vx;
		}
		// დამატებით შევამოწმოთ ყვითლელი ცდება თუარა საზღვრებს (პირობაში არაა ნახსენები)
		if(yellow.getX() + yellow_vx >= 0 && yellow.getX() + yellow.getWidth() + yellow_vx < getWidth() ) {
			yellow.move(yellow_vx, 0);
		}
	}
	
	public void run() {
		int counter = 0;
		while(true) {
			// დამატებით შევამოწმოთ საზღვრებს თუ ცდება (პირობაში არაა ნახსენები)
			if(blue.getX() + vx >= 0 && blue.getX() + blue.getWidth() + vx < getWidth() && blue.getY() + vy >= 0 && blue.getY() + blue.getHeight() + vy < getHeight()) {
				blue.move(vx, vy);
			}
			pause(PAUSE);
			counter ++;
			if(counter == DIRECTION_TIMER * 1000 / PAUSE) {
				vx = rgen.nextDouble(-Math.sqrt(SPEED), Math.sqrt(SPEED));
				vy = Math.sqrt(SPEED - vx*vx);
				if(rgen.nextBoolean()) {
					vy = -vy;
				}
				counter = 0;
			}
		}
	}



}
