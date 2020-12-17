import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

public class GraphicsProgramSample extends GraphicsProgram {

	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	
	
	private final int START_X = 10;
	private final int OFFSET_Y = 5;
	
	
	private int nextY = 15;
	
	private JTextField textField;
	private JButton send;
	
//	private GLabel lastLabel;
	
	
	public void init() {
		
		this.setSize(WIDTH, HEIGHT);
		
		textField = new JTextField(10);
		send = new JButton("Send");
		
		add(send, SOUTH);
		add(textField, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent event) {
		
		
		String newText = textField.getText();
		
		GLabel newLabel = new GLabel(newText, START_X, nextY);
		add(newLabel);
		
		nextY += OFFSET_Y + newLabel.getHeight();
		
	}

}
