import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

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

	private ArrayList<GLabel> labels;

	public void init() {

		this.setSize(WIDTH, HEIGHT);

		textField = new JTextField(10);
		send = new JButton("Send");

		labels = new ArrayList<GLabel>();

		add(send, SOUTH);
		add(textField, SOUTH);

		addActionListeners();
	}

	public void actionPerformed(ActionEvent event) {

		String newText = textField.getText();
		GLabel newLabel = new GLabel(newText, START_X, nextY);
		
		// if there is no space for new glabel
		if (nextY + newLabel.getHeight() > HEIGHT) {
			reconstructLabels(newText);
		} else {		
			// add new glabel object to canvas
			labels.add(newLabel);
			add(newLabel);
			nextY += OFFSET_Y + newLabel.getHeight();
		}

	}

	private void reconstructLabels(String newText) {

		
		// change all labels' text with next's text
		for (int i = 0; i < labels.size() - 1; i++) {

			String prevStr = labels.get(i + 1).getLabel();			
			labels.get(i).setLabel(prevStr);

		}
		
		// change last label by new entry
		labels.get(labels.size() - 1).setLabel(newText);
			
	}

}