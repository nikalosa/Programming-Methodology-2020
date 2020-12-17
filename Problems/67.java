
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

import javax.swing.JTextField;

public class GraphicsProgramSample extends GraphicsProgram {

	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	
	private JTextField imgField;
	
	private GImage image;
	
	public void init() {
		
		this.setSize(WIDTH, HEIGHT);
		
		imgField = new JTextField(10);
		imgField.addActionListener(this);
		imgField.setActionCommand("Go");
		add(imgField, SOUTH);
		
		image = new GImage("");
		addActionListeners();
		
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Go")) {
			String imgPath = imgField.getText();
			image.setImage(imgPath);
			image.setSize(WIDTH, HEIGHT);
			add(image);
		}
	}

}
