import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GraphicsProgramSample extends GraphicsProgram {

	public void run() {
		
		int n = 3;
		int m = 5;
		
		drawHorizontalLines(n);
		drawVerticalLines(m);
	}

	private void drawHorizontalLines(int div) {

		double jump = (double) getHeight() / div;
		for (double y = 0; y <= getHeight(); y += jump) {
			GLine horLine = new GLine(0, y, getWidth(), y);
			add(horLine);
		}

	}

	private void drawVerticalLines(int div) {
		double jump = (double) getWidth() / div;
		for (double x = 0; x <= getWidth(); x += jump) {
			GLine vertLine = new GLine(x, 0, x, getHeight());
			add(vertLine);
		}
	}

}
