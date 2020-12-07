import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GraphicsProgramSample extends GraphicsProgram {
	
	public void run() {

		drawBody();
		drawRoof();
		drawDoor();
		
	}
	
	private void drawBody() {
		GRect body = new GRect(150, 220, 320, 180);
		add(body);
	}
	
	private void drawRoof() {
		drawFirstEdge();
		GLine line2 = new GLine(130, 220, 310, 120);
		add(line2);
		GLine line3 = new GLine(310, 120, 490, 220);
		add(line3);
	}
	
	private void drawFirstEdge() {
		GLine line1 = new GLine(130, 220, 490, 220);
		add(line1);
	}
	
	private void drawDoor() {
		GRect door = new GRect(375, 300, 40, 100);
		add(door);
	}
	

}
