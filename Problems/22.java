import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GraphicsProgramSample extends GraphicsProgram {

	private static final int ROWS = 10;
	private static final int COLS = 15;

	public void run() {

		double jumpVert = (double) getHeight() / ROWS;
		double jumpHor = (double) getWidth() / COLS;

		for (int row = 0; row < ROWS; row++) {
			drawRow(row, jumpVert, jumpHor);
		}

	}
	
	private void drawRow(int row, double jumpVert, double jumpHor) {
		for (int col = 0; col < COLS; col++) {
			drawRect(col, row, jumpHor, jumpVert);
		}	
	}
	
	
	private void drawRect(int col, int row, double jumpHor, double jumpVert) {
		double rectX = col * jumpHor;
		double rectY = row * jumpVert;
		GRect rect = new GRect(rectX, rectY, jumpHor, jumpVert);
		rect.setFilled((row + col) % 2 == 1);
		add(rect);
	}
}
