import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GraphicsProgramSample extends GraphicsProgram {

	private final int CIRCLE_D = 50;
	private final int DELAY = 150;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject obj;

	public void run() {
		addMouseListeners();
		checkColor();
	}

	private void checkColor() {

		while (true) {
			if (this.obj == null) {
				continue;
			}
			while (this.obj.getColor() != Color.GREEN) {
				Color newCol = getColor();
				this.obj.setColor(newCol);
				pause(DELAY);
			}
		}
	}

	public Color getColor() {
		int rInt = rgen.nextInt() % 5;
		if (rInt == 0) {
			return Color.GREEN;
		} else if (rInt == 1) {
			return Color.RED;
		} else if (rInt == 2) {
			return Color.BLUE;
		} else if (rInt == 3) {
			return Color.BLACK;
		}
		return Color.YELLOW;

	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.obj = getElementAt(x, y);
		if (this.obj == null) {
			GOval circle = new GOval(x - CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);

		}
	}

}
